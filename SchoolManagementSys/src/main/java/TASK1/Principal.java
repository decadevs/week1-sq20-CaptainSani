package TASK1;

public class Principal extends Staff{


    public Principal(String name, int age, int id) {
        super(name, age, id);

    }

    public void admitStudents(Applicants applicants){
        if(applicants.getAge() < 10){
            System.out.println(" You are not eligible to apply");
        }else {
            System.out.println("Congratulation! You have been offered admission." );
        }
    }

    public void expelStudent(Students students){
        if (students.isMischievious() && students.isStubborn()){
            System.out.println("You have been expellled from this school.");
        }else {
            System.out.println("Please,Continue be of good behaviour.");
        }
    }

}

