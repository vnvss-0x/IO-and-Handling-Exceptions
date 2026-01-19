package IO.exercise1;

import java.io.File;
import java.util.Scanner;

public class LSSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = scanner.nextLine();
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    StringBuilder info = new StringBuilder();
                    info.append(file.getAbsolutePath()).append(" ");
                    if (file.isDirectory()) info.append("<DIR> ");
                    else info.append("<FILE> ");
                    if (file.canRead()) info.append("r");
                    if (file.canWrite()) info.append("w");
                    if (file.isHidden()) info.append("h");
                    System.out.println(info.toString());
                }
            }
        }
    }
}
