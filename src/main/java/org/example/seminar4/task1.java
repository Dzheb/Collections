package org.example.seminar4;


import java.util.*;

//Создайте коллекцию мужских и женских имен с помощью интерфейса List
//        Отсортируйте коллекцию в алфавитном порядке
//        Отсортируйте коллекцию по количеству букв в слове
//        Разверните коллекцию
//Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
//        Получите уникальный список Set на основании List
//        Определите наименьший элемент (алфавитный порядок)
//        Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
//        Удалите все элементы содержащие букву ‘A’

public class task1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("A","Anna", "Vanya", "Yura", "Anna", "Vladimir", "Semen",
                "Vanya", "Vladimir", "An"));
        Collections.sort(names);
        System.out.println(names);
        Collections.reverse((List<?>) names);
        System.out.println(names);
//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//
//            }
//        });
        System.out.println("---------------------------------------------------------------------");
        System.out.println(names);
        Set<String> newNames = new HashSet<>(names);
        System.out.println(newNames);
        names.sort(new Comparator<String>() {
            //            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//
//            }
//        });
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();

            }
        });
        System.out.println(names.stream().min(Comparator.naturalOrder()).get());

        System.out.println(names.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        }).findFirst().get());

            names.removeIf(element -> element.toLowerCase().contains("a"));
//            names.removeIf(element -> element.compareToIgnoreCase("a") != 0);
        System.out.println(names);

    }
}