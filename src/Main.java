import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 1:");
        System.out.printf("Введите возраст человека: ");
        int age = in.nextInt();
        if (age <= 17) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        }

        System.out.println("Задание 2:");
        System.out.printf("Какая температура на улице? ");
        int temperature = in.nextInt();
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку!");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки!");
        }
        System.out.println("Задание 3:");
        System.out.printf("С какой скоростью ты ехал? ");
        int speed = in.nextInt();
        if (speed > 60) {
            System.out.println("Ну ты и гонщик, пора платить штраф и налоги!");
        } else {
            System.out.println("Можно ездить спокойно!");
        }

        System.out.println("Задание 4:");
        System.out.printf("Сколько тебе лет? ");
        int age1 = in.nextInt();
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("в детский сад!");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("в школу!");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("в университет!");
        }
        if (age1 >= 25) {
            System.out.println("Грустно, но пора работать!");
        }

        System.out.println("Задание 5: Аттракцион");
        System.out.printf("Сколько тебе лет? ");
        int age2 = in.nextInt();
        if (age2 < 5) {
            System.out.println("Ты не можешь кататься на аттракционе!");
        }
        if (age2 >= 5 && age2 <= 14) {
            System.out.println("Ты можешь кататься только в сопровождении взрослого!");
        }
        if (age2 > 14) {
            System.out.println("Ты можешь кататься без сопровождения взрослого");
        }

        System.out.println("Задание 6: Поезд");
        System.out.printf("Сколько в вагоне людей? ");
        int mest = in.nextInt();
        int m1 = 102 - mest;
        int m2 =  m1 - 42;

        if (mest >= 0 && mest <= 59) {
            System.out.println("В вагоне " +m1+ " мест  из них " +m2+ " сидячих места и 42 стоячих места");
        }

        if (mest >= 60 && mest <= 101 ) {
            System.out.println("В вагоне только " +m1+ " стоячих мест");
        }

        else if(mest >= 102) {
            System.out.println("Все места заняты!");
        }

        System.out.println("Задание 7: 3 числа");
        System.out.printf("Введите три числа: ");
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();

        if (one >= two && one >= three) {
            System.out.println(one);
        }
        if (two >= one && two >= three) {
            System.out.println(two);
        }
        if (three >= one && three >= two) {
            System.out.println(three);
        }
    }
}
