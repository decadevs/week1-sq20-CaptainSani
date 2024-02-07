package TASK1;


import java.util.List;

public class Classes extends Courses{
    private String className = "primary 3";

    public void setClassName(String className) {
        this.className = className;
    }

    public Classes(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    @Override
    String courseName() {
        return null;
    }
    public void studentClass(){
        System.out.println(" You are in " + className);
    }

}

