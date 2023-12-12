package ru.mirea.task28;

import java.util.HashMap;
import java.util.Map;

public class NameMap {

    public static void main(String[] args) {
        Map<String, String> nameMap = createMap();
        int sameFirstNameCount = getSameFirstNameCount(nameMap);
        int sameLastNameCount = getSameLastNameCount(nameMap);

        // Ваши требования не включают вывод результатов, поэтому просто выполним расчеты.
        // Результаты могут быть использованы по вашему усмотрению.
    }

    public static Map<String, String> createMap() {
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("Иванов", "Иван");
        nameMap.put("Петров", "Петр");
        nameMap.put("Сидоров", "Иван");
        nameMap.put("Козлов", "Алексей");
        nameMap.put("Смирнова", "Екатерина");
        nameMap.put("Попов", "Ирина");
        nameMap.put("Иванова", "Мария");
        nameMap.put("Сидорова", "Ирина");
        nameMap.put("Петрова", "Анна");
        nameMap.put("Смирнов", "Александр");
        return nameMap;
    }

    public static int getSameFirstNameCount(Map<String, String> nameMap) {
        Map<String, Integer> firstNameCountMap = new HashMap<>();
        for (String firstName : nameMap.values()) {
            firstNameCountMap.put(firstName, firstNameCountMap.getOrDefault(firstName, 0) + 1);
        }

        int count = 0;
        for (int firstNameCount : firstNameCountMap.values()) {
            if (firstNameCount > 1) {
                count += firstNameCount - 1; // Исключаем одиночные имена
            }
        }

        return count;
    }

    public static int getSameLastNameCount(Map<String, String> nameMap) {
        Map<String, Integer> lastNameCountMap = new HashMap<>();
        for (String lastName : nameMap.keySet()) {
            lastNameCountMap.put(lastName, lastNameCountMap.getOrDefault(lastName, 0) + 1);
        }

        int count = 0;
        for (int lastNameCount : lastNameCountMap.values()) {
            if (lastNameCount > 1) {
                count += lastNameCount - 1; // Исключаем одиночные фамилии
            }
        }

        return count;
    }
}