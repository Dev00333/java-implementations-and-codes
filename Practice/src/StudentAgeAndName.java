import java.util.Scanner;
public abstract class StudentAgeAndName {
    private String name;
    private int age;
    public StudentAgeAndName(String name, int age) {
        this.name = name;
        this.age = age;
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
    public void setAge(int age){
        this.age=age;
    }
    public abstract void greetings();
}

class RunStudentAgeAndName extends StudentAgeAndName {
    public RunStudentAgeAndName(String name, int age) {
        super(name, age);
    }
    @Override
    public void greetings() {
        System.out.println("If this block is called it means abstract works fine");
        System.out.println("Hello "+getName()+" i told your age is "+getAge());
    }
}
class MainRunner1{
    static void main() {
        Scanner scanner=new Scanner(System.in);
        boolean stoppingPoint=true;
        while (stoppingPoint){
            System.out.print("enter your name: ");
            String name=scanner.next();
            System.out.print("enter your age: ");
            int age=scanner.nextInt();
            RunStudentAgeAndName test1=new RunStudentAgeAndName(name,age);
            test1.greetings();
            System.out.print("do you want to continue: ");
            stoppingPoint=scanner.nextBoolean();
        }
    }
}