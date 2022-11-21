import java.util.Arrays;
import java.util.Scanner;

public class Group {
    private int id;
    private String name;
    private final Integer groupSiza = 3;
    Students students[] = new Students[3];

    static Group group1 = new Group();
    static Group group2 = new Group();


    public Group() {
    }

    public Group(int idl, String name, Students[] students) {
        this.id = idl;
        this.name = name;
        this.students = students;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }


    public void addStudent(Students students) {

        if (students.getPersonalNumber() < groupSiza) {
            this.students[students.getPersonalNumber()] = students;
            System.out.println("студент " + students.getName() + " подключился к группе");
        } else {
            System.out.println("группа переполненна студент " + students.getName() + " не может начать обучение в этой группе!");
        }


        /*for (int i = 0; i < students.length; i++){
            if (students[i] != null){
                students[i] =
            }
        }*/

    }

    public void searchGroup(Group scanner) {

        Group group1 = this.group1;
        Group group2 = this.group2;

        System.out.println("введите название группы, чтоб узнать ,какие студенты в ней обучаются! ");


        if (scanner.equals(group1.name)) {
            System.out.println(group1.students);
        } else if (scanner.equals(group2.name)) {
            System.out.println(group2.students);
        }else {
            System.out.println("введите название группу (group1,group2) иначе , программа не заработает! ");
        }

        /*for (int i = 0; i < group1.groupSiza; i++) {
            if (group1.getName().equals(name)){
                System.out.println(group1.getName());
            }else {
                System.out.println(group2);
            }
        }*/
}

    public static void aboutGroup (String name){
        System.out.println("введите название группы (чтоб узнать информацию о группе!)");
        Scanner sc = new Scanner(System.in);
        if (sc.equals(group1.name)) {
            System.out.println(group1);
        } else if (sc.equals(group2.name)) {
            System.out.println(group2);
        }else {
            System.out.println("введите название группы (group1,group2) иначе программа не заработает! ");
        }
    }



    @Override
    public String toString() {
        return "Group " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ' ';
    }
}
