package oopSeminar3;


import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Petr", "Petrov", 20);
        User user2 = new User("Vasya", "Ivanov", 55);
        User user3 = new User("Anna", "Anina", 22);
        User user4 = new User("Nik", "Nikkin", 23);
        User user5 = new User("Anna", "Anina", 40);
//        System.out.println(user1);

        Personal personal = new Personal(List.of(user1, user2, user3, user4, user5));
//        for (User user : personal) {
//            System.out.println(user);
//        }

        List<User> users = personal.toList();
        Collections.sort(users);
//        for (User user : users) {
//            System.out.println(user);
//        }

        User boss = new User("Will", "Smth", 50);
        User cto = new User("Bill", "Will", 36);
        User ceo = new User("Joe", "Black", 39);
        User manager1 = new User("Jane", "Rane", 25);
        User manager2 = new User("Bell", "Green", 35);
        User manager3 = new User("Alex", "White", 20);
        Personal managers1 = new Personal(List.of(manager1, manager2));
        Personal managers2 = new Personal(List.of(manager3));
        Personal chiefs = new Personal(List.of(cto,ceo));
        boss.setPersonal(chiefs);
        cto.setPersonal(managers1);
        ceo.setPersonal(managers2);

        Company company = new Company(boss);
        for (User user: company) {
            System.out.println(user);
        }
    }
}
