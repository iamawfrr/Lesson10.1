import javax.security.auth.Subject;
import java.util.Arrays;
import java.util.Scanner;

public class Teacher extends User {
    Scanner scanner = new Scanner(System.in);
    String nickName;
    String status; //// например: Professor, Lecturer, Tutor, Assistant.
    String subjects[] = new String[10]; //// Предметы которые он ведет, максимум 10
    int sizeOfSubjects = 0;

    public Teacher(int id, String login, String password, String nickName, String status, String[] subjects, int sizeOfSubjects) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public Teacher() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setSizeOfSubjects(int sizeOfSubjects) {
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public String getUserData() {
        return "Teacher{" +
                "nickName='" + nickName + '\'' +
                ", status='" + status + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                ", sizeOfSubjects=" + sizeOfSubjects +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    protected void addSubject(String subject) {
        String subject1 = scanner.next();
        subjects[sizeOfSubjects] = new String(subject1);
//        sizeOfSubjects++;
    }
}