import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
        System.out.println("Введите имя пользователя " + i + ":");
        String name = in.nextLine();
        System.out.println("Введите возраст пользователя " + i + ":");
        int age = Integer.parseInt(in.nextLine());
        users.add(new User(name, age));
    }

    Collections.sort(users, new Comparator<User>() {
        @Override
        public int compare(User us1, User us2) {
            return us1.getAge().compareTo(us2.getAge());
        }
    });

    System.out.println("Отсортированный список пользователей:");
    for (User user : users) {
        System.out.println(user.toString());
    }
}