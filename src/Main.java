import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Students students [] = new Students[3];
        String group [] = new String[2];
        group[0] = "group1";
        group[1] = "group2";

        Group group1 = new Group();
        Group group2 = new Group();


        Students student = new Students("Ruslan",19,1);
        Students student1 = new Students("Rustam",29,2);
        Students student2 = new Students("Ru",20,3);
        Students student3 = new Students("Bob",40,4);


      /*  group1.addStudent(student);
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);*/

        System.out.println("_________________________________________");

       /* group2.addStudent(student);
        group2.addStudent(student1);
        group2.addStudent(student2);
        group2.addStudent(student3);
*/

        Group.aboutGroup("group2");

        System.out.println("_________________________________________");

        System.out.println("список студентов определенной группы! ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        group1.searchGroup(group1);

        System.out.println("_________________________________________");

        System.out.println("информация про группу: ");
        group1.aboutGroup("group1");


    }
}