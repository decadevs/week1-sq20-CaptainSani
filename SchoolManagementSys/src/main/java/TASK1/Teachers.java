package TASK1;

public class Teachers extends Staff{

    public Teachers(String name, int age, int id) {
        super(name, age, id);
    }
    public void teachCourse(){
        System.out.println(" Teacher teach students based on class");
    }

}
