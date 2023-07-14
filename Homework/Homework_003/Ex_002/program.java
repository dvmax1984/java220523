package Homework.Homework_003.Ex_002;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class program {

    // Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.
    public static void main(String[] args) {
        
        List<String> planet = new ArrayList<>();
        planet.add("Меркурий");
        planet.add("Венера");
        planet.add("Земля");
        planet.add("Марс");
        planet.add("Юпитер");
        planet.add("Сатурн");
        planet.add("Уран");
        planet.add("Нептун");
        planet.add("Плутон");
        planet.add("Меркурий");
        planet.add("Венера");
        
        Set<String> uniqueElements = new HashSet<>(planet);
        planet.clear();
        planet.addAll(uniqueElements);
        
        System.out.println("Список без дубликатов: " + planet);
    }
}
