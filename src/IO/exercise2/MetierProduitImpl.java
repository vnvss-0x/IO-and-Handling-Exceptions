package IO.exercise2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IProduitMetier {
    private List<Product> products = new ArrayList<>();
    private String fileName;

    public MetierProduitImpl(String fileName) {
        this.fileName = fileName;
        loadFromFile();
    }

    @Override
    public void add(Product p) {
        products.add(p);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Product p = findById(id);
        if (p != null) products.remove(p);
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Error saving products: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadFromFile() {
        File file = new File(fileName);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
                products = (List<Product>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                products = new ArrayList<>();
            }
        }
    }
}