package edu.penzgtu;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод пользователем пути к директории
        System.out.print("Введите путь к директории для поиска: ");
        String directoryPath = scanner.nextLine();
        Path directory = Paths.get(directoryPath);

        // Ввод пользователем имени файла для поиска
        System.out.print("Введите имя файла для поиска (или оставьте пустым, чтобы игнорировать имя): ");
        String fileName = scanner.nextLine();

        // Ввод пользователем текста для поиска в содержимом файлов
        System.out.print("Введите текст для поиска в содержимом файлов (или оставьте пустым, чтобы игнорировать текст): ");
        String searchText = scanner.nextLine();

        try {
            // Найти все файлы, соответствующие имени и/или содержимому
            List<Path> foundFiles = FileSearcher.searchFiles(directory, fileName, searchText);
            
            if (foundFiles.isEmpty()) {
                System.out.println("Файлы не найдены.");
            } else {
                System.out.println("Найденные файлы:");
                for (Path path : foundFiles) {
                    System.out.println("Файл: " + path);
                    // Для каждого найденного файла выводим строки, содержащие искомый текст
                    FileSearcher.printFileContentWithSearchText(path, searchText);
                }
            }
        } catch (IOException error) {
            System.out.println("Произошла ошибка: " + error.getMessage());
            error.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}