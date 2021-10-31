package gb2.lesson4.lesson4dz;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        String[] names = new String[]{"Андрей", "Дима", "Саша", "Диана", "Лёша", "Андрей", "Лёша", "Тёма", "Аня", "Антон",
                                 "Егор", "Андрей", "Антон", "Никита", "Егор", "Катя", "Максим", "Паша", "Никита", "Егор",
                                  "Федя", "Антон", "Саша", "Полина", "Дима", "Паша", "Сергей", "Тёма", "Полина", "Аня"};

        Map<String,Integer> list = new HashMap<>();
        Map<String,Integer> namesList = add(names, list);
        view(namesList);
    }

    public static Map<String,Integer> add(String[] arrayNames, Map <String, Integer> names) {
        for (String arrayName : arrayNames) {
            if (!compare(names, arrayName)) {
                names.put(arrayName, names.get(arrayName) + 1);
            }
            if (compare(names, arrayName)) {
                names.put(arrayName, 1);
            }
        }
        return names;
    }

    public static boolean compare(Map <String, Integer> names, String arrayName){
        boolean check = true;
        for (Map.Entry<String,Integer> pair : names.entrySet()) {
            if (pair.getKey().equals(arrayName)) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void view (Map <String, Integer> names) {
        for (Map.Entry<String,Integer> pair : names.entrySet()) {
            System.out.println("Имя " + pair.getKey() + " повторяется " + pair.getValue() + " раз(а)");
        }
    }
}
