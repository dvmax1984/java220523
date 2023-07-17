package Homework.Homework_006;

public class cat {
    private String nickname ;
    private int age;
    private String color;

    public cat(String nickname , int age, String color) {
        this.nickname  = nickname ;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        this.nickname = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow() {
        System.out.println(nickname  + " Мяукнул: Мяу, дай молока!");
    }

    public void sleep() {
        System.out.println(nickname  + " ушел спать.");
    }

    public void print() {
        System.out.println("Клича : " + nickname );
        System.out.println("Возраст: " + age);
        System.out.println("Окрас: " + color);
    }
}