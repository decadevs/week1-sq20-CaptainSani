package TASK1;

public class TestMain {
    public static void main(String[] args) {
        //Creating Objects for Staff and calling its method
        Staff staff = new Staff("ojay",30,001);
        Principal principal = new Principal("Goodstime",34,01);

        //Creating Objects for Students and calling its method
        Students students = new Students("sani",true,true);
        students.setMischievious(true);
        students.isMischievious();
        principal.expelStudent(students);

        //Creating Objects for Applicants and calling its method
        Applicants applicants = new Applicants("Habib", 27);
        applicants.getAge();
        principal.admitStudents(applicants);

        //Creating Objects for Non Academic staff and calling its method
        Non_Academic_Staffs nonAcademicStaffs = new Non_Academic_Staffs("Abba", 27,70);
        nonAcademicStaffs.role();

        //Creating Objects for Teachers and calling its method
        Teachers teachers = new Teachers("Eva Emma", 23, 9);
        teachers.teachCourse();


        //Creating Objects for Class and calling its method
        Classes classes = new Classes("primary 1A");
        classes.setClassName("Primary 4");
        System.out.println(classes.getClassName());



    }
}
