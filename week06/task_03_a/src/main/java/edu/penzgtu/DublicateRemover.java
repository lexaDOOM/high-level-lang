package edu.penzgtu;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class DuplicateRemover {
    public static Integer[] removeDuplicates(Integer[] inputArray) {
        // Очередь для хранения уникальных элементов
        Queue<Integer> queue = new LinkedList<>();

        // Используем Set для удаления дубликатов
        Set<Integer> set = new HashSet<>();

        // Добавляем уникальные элементы в очередь
        for (Integer num : inputArray) {
            if (set.add(num)) { // Если элемент уникален, добавляем его в Set и Queue
                queue.add(num);
            }
        }

        // Преобразуем очередь в массив и возвращаем результат
        return queue.toArray(new Integer[0]);
    }
}