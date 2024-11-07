package edu.penzgtu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileSearcher {

    // Метод для поиска всех файлов, соответствующих критериям
    public static List<Path> searchFiles(Path directory, String fileName, String searchText) throws IOException {
        try (Stream<Path> files = Files.walk(directory)) {
            return files
                    .filter(Files::isRegularFile) // только файлы (исключаем папки)
                    .filter(path -> path.getFileName().toString().contains(fileName)) // фильтр по имени файла
                    .filter(path -> containsText(path, searchText)) // фильтр по содержимому
                    .collect(Collectors.toList());
        }
    }

    // Метод для проверки содержимого файла на наличие текста
    public static boolean containsText(Path path, String searchText) {
        if (searchText.isEmpty()) return true; // если текст для поиска пустой, ничего не проверяем
        try (Stream<String> lines = Files.lines(path)) {
            return lines.anyMatch(line -> line.contains(searchText));
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + path);
            return false;
        }
    }

    // Метод для вывода строк, содержащих искомый текст
    public static void printFileContentWithSearchText(Path path, String searchText) {
        try (Stream<String> lines = Files.lines(path)) {
            long lineNumber = 1;
            // Перебираем все строки в файле
            for (String line : (Iterable<String>) lines::iterator) {
                if (line.contains(searchText)) {
                    System.out.println("Строка " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + path);
        }
    }
}