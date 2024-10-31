package edu.penzgtu;

import java.util.*;

public class LatinEnglishDict {
    private final Map<String, List<String>> latinToEnglish = new TreeMap<>();

    // Метод для добавления записи из строки формата "english - latin1, latin2, ..."
    public void addEntry(String line) {
        String[] parts = line.split(" - ");
        String englishWord = parts[0];
        String[] latinWords = parts[1].split(", ");

        for (String latinWord : latinWords) {
            latinToEnglish
                .computeIfAbsent(latinWord, k -> new ArrayList<>())
                .add(englishWord);
        }
    }

    // Метод для получения количества уникальных латинских слов
    public int getLatinWordCount() {
        return latinToEnglish.size();
    }

    // Метод для формирования строки с латинско-английским словарем
    public String getLatinEnglishDictionary() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : latinToEnglish.entrySet()) {
            List<String> englishWords = entry.getValue();
            Collections.sort(englishWords);
            result.append(entry.getKey())
                    .append(" - ")
                    .append(String.join(", ", englishWords))
                    .append("\n");
        }
        return result.toString().trim();
    }
}
