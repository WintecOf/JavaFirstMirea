package ru.mirea.task27;
import java.util.LinkedList;

class HashTable {
    private static final int TABLE_SIZE = 10;
    private final LinkedList[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return key.hashCode() % TABLE_SIZE;
    }

    public void hashtabInit() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i].clear();
        }
    }

    public void hashtabAdd(String key, String value) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        // Проверка на существование
        for (Entry entry : list) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        // Добавление новой пары
        list.add(new Entry(key, value));
    }

    public String hashtabLookup(String key) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        // Поиск по ключу
        for (Entry entry : list) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null;
    }

    public void hashtabDelete(String key) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        // Найти и удалить
        for (Entry entry : list) {
            if (entry.key.equals(key)) {
                list.remove(entry);
                return;
            }
        }
    }
}
