package TASK1;

public class TestMain {
    public static void main(String[] args) {

        Teachers teachers = new Teachers();
        Students students = new Students("sani",true,true);
        Staff staff = new Staff("ojay",30,001);
        Principal principal = new Principal("Goodstime",34,01);
        Non_Academic_Staffs nonAcademicStaffs = new Non_Academic_Staffs("Abba", 27,70);
        Classes classes = new Classes("primary 1A");
        Applicants applicants = new Applicants("Habib", 27);


    }
}
