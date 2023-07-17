package Homework.Homework_005;

import java.util.*;

public class program {
    public static void main(String[] args) {
        // Создание и заполнение телефонной книги
        Map<String, List<String>> phoneBook = new HashMap<>();
        addContact(phoneBook, "Максим", "+79521680008");
        addContact(phoneBook, "Миша", "2545454545");
        addContact(phoneBook, "Маша", "55555554545555");
        addContact(phoneBook, "Света", "789789");
        addContact(phoneBook, "Даша", "+790894069");
        addContact(phoneBook, "Даша", "+795070745");

        // Сортировка контактов по убыванию числа телефонов
        List<Map.Entry<String, List<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());
        sortedContacts.sort((a, b) -> b.getValue().size() - a.getValue().size());

        for (Map.Entry<String, List<String>> entry : sortedContacts) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers);
        }
    }

    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<String> existingNumbers = phoneBook.get(name);
            existingNumbers.add(phoneNumber);
        } else {
            List<String> newNumbers = new ArrayList<>();
            newNumbers.add(phoneNumber);
            phoneBook.put(name, newNumbers);
        }
    }
}