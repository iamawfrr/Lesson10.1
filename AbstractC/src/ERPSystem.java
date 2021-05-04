import java.util.Scanner;

public class ERPSystem {
    Scanner scanner = new Scanner(System.in);
    User[] memory = new User[1000]; ////максимум 1000 пользователей
    int sizeOfUsers = 0;

    void addUser(User u) {
        String users[] = new String[500];
        String users1 = scanner.next();
        users[sizeOfUsers] = new String(users1);

    }

    void printAllUsers() {
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.getUserData();
        student.getUserData();
    }

    void printUser(int index) {
    }
}
