package TASK1;

public class Applicants{
    public Applicants(String applicantName, int age) {
        this.applicantName = applicantName;
        this.age = age;
    }

    private  String applicantName;

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private  int age;

    public void apply(){
        System.out.println( "I " + getApplicantName() + "humbly wish to apply into your school");
    }

}
