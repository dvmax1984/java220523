package Homework.Homework_006;

/* Задание
Реализуйте класс Cat, включающий в себя от трех полей и от двух методов, 
определяющих базовый функционал класса
(за основу можно взять наработки с семинара). 
Создать два экземпляра класса Cat и вывести информацию о них на экран. */

public class program {
    public static void main(String[] args) {
        cat cat1 = new cat("Гусик", 10, "Черный");
        cat cat2 = new cat("_", 0, "_");

        cat2.setName("Персик");
        cat2.setAge(7);
        cat2.setColor("Рыжий");


        cat1.print();
        cat1.meow();
        cat1.run();
        cat1.sleep();

        System.out.println();

        cat2.print();
        cat2.meow();
        cat2.run();
        cat2.sleep();
    }
}