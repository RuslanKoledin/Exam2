import java.util.Arrays;

public class Students  {
    private String name;
    private int age;
    private int personalNumber;
    String students [] = new String[5];


    public Students(String name, int age,int personalNumber) {
        this.name = name;
        this.age = age;
        this.personalNumber = personalNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", students=" + Arrays.toString(students) +
                '}';
    }


    /*Group studeent1 = new Students(1,"Ruslan",);*/
}
