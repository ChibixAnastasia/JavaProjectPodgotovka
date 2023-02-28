package equalsAndHash;

public class Main {
    public static void main(String[] args) {
        Student stud = new Student(1, "Inna", 22, 6);
        Student stud1 = new Student(2, "Irina", 32, 8);
        Student stud2 = new Student(2, "Irina", 32, 8);
        Student stud3 = new Student(2, "Irina", 32, 8);
        Student student = null;
        boolean bol = stud2.equals(null);
        boolean bol1 = stud1.equals(stud3);
        System.out.println(bol);
        System.out.println(bol1);
    }
}
