import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ERPSystem manage = new ERPSystem();
        Student student = new Student();
        Teacher teacher = new Teacher();
        while (true) {
            System.out.println(
                    "      PRESS [1] TO ADD USER\n" +
                    "\n" +
                    "              PRESS [1] TO ADD STUDENT\n" +
                    "\n" +
                    "                    Login:\n" +
                    "                    Password:\n" +
                    "                    Name:\n" +
                    "                    Surname:\n" +
                    "                    Group:\n" +
                    "                    GPA:\n" +
                    "\n" +
                    "              PRESS [2] TO ADD TEACHER\n" +
                    "\n" +
                    "                    Login:\n" +
                    "                    Password:\n" +
                    "                    Nick Name:\n" +
                    "                    Status:\n" +
                    "\n" +
                    "                    PRESS [1] TO ADD SUBJECT\n" +
                    "\n" +
                    "                          Subject:\n" +
                    "\n" +
                    "                    PRESS [0] TO FINISH ADDING SUBJECT\n" +
                    "\n" +
                    "        PRESS [2] TO LIST USERS\n" +
                    "\n" +
                    "              PRESS [1] TO LIST STUDENTS\n" +
                    "\n" +
                    "              PRESS [2] TO LIST TEACHERS\n" +
                    "\n" +
                    "        PRESS [3] TO LIST USER BY INDEX\n" +
                    "\n" +
                    "              ENTER INDEX: \n" +
                    "\n" +
                    "        PRESS [0] TO EXIT");
            int choice = scanner.nextInt();
            if (choice == 1) {
                //PRESS [1] TO ADD USER
                int choice1 = scanner.nextInt();
                if (choice1 == 1) {
                    manage.addUser(student);
                    //PRESS [1] TO ADD STUDENT
                } else if (choice1 == 2) {
                    //PRESS [2] TO ADD TEACHER
                    manage.addUser(teacher);
                    int choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        //PRESS [1] TO ADD SUBJECT
                        String subs = scanner.next();
                        Teacher sub = new Teacher();
                        sub.addSubject(subs);
                    } else if (choice2 == 0) {
                        //PRESS [0] TO FINISH ADDING SUBJECT
                        System.exit(0);
                    }
                }
            } else if (choice == 2) {
                //PRESS [2] TO LIST USERS
                int choice1 = scanner.nextInt();
                if (choice1 == 1) {
                    //PRESS [1] TO LIST STUDENTS
                    manage.printAllUsers();
                } else if (choice1 == 2) {
                    //PRESS [2] TO LIST TEACHERS
                    manage.printAllUsers();
                }
            } else if (choice == 3) {
                //PRESS [3] TO LIST USER BY INDEX
            } else if (choice == 0) {
                //PRESS [0] TO EXIT
                System.exit(0);
            }
        }
    }
}