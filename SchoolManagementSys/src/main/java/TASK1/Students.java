package TASK1;

public class Students extends  Courses implements School{
    @Override
    public String nameOfSchool() {
        return null;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isStubborn() {
        return stubborn;
    }

    public void setStubborn(boolean stubborn) {
        this.stubborn = stubborn;
    }

    public boolean isMischievious() {
        return mischievious;
    }

    public void setMischievious(boolean mischievious) {
        this.mischievious = mischievious;
    }

    private  String studentName;
private  boolean stubborn;
private  boolean mischievious;

    public Students(String studentName, boolean stubborn, boolean mischievious) {
        this.studentName = studentName;
        this.stubborn = stubborn;
        this.mischievious = mischievious;
    }

    public  void takeCourse(){
        System.out.println(" Students takes course");
    }

    @Override
    String courseName() {
        return null;
    }
}
