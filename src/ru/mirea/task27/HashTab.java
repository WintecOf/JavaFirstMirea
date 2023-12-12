package ru.mirea.task27;

public class HashTab {
    public static void main(String[] args) {
        HashTable hashtable = new HashTable();

        // Example usage
        hashtable.hashtabAdd("key1", "value1");
        hashtable.hashtabAdd("key2", "value2");
        hashtable.hashtabAdd("key3", "value3");
        hashtable.hashtabAdd("key4", "value4");
        hashtable.hashtabAdd("key5", "value5");
        hashtable.hashtabAdd("key6", "value6");
        hashtable.hashtabAdd("key7", "value7");
        hashtable.hashtabAdd("key8", "value8");
        hashtable.hashtabAdd("key9", "value9");
        hashtable.hashtabAdd("key10", "value10");

        System.out.println("Поиск по key1: " + hashtable.hashtabLookup("key1"));
        System.out.println("Поиск по key2: " + hashtable.hashtabLookup("key2"));
        System.out.println("Поиск по key11: " + hashtable.hashtabLookup("key11"));

        hashtable.hashtabDelete("key2");

        System.out.println("Поиск по key2 после удаления: " + hashtable.hashtabLookup("key2"));
    }
}
