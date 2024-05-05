import java.util.Scanner;

public class Doctor implements Save {

    protected String name = new String();

    protected String nationalCode = new String();

    protected String medicalCode = new String();

    //NEW DOCTOR'S NAME

    public String newName(String NAME) {

        Scanner myNC = new Scanner (System.in);

        System.out.print("Please enter Doctor's full name:\n> ");

        NAME = myNC.nextLine();

        return NAME;

    }

    //SETTING THE NAME OF THE DOCTOR DOCTOR

    public void setName(String x) {

        name = newName(x);

    }

    //NEW DOCTOR'S NATIONAL CODE

    public String newNationalCode (String NC){

        Scanner myNC = new Scanner (System.in);

        System.out.print("Please enter the national code:\n> ");

        NC = myNC.nextLine();

        return NC;

    }

    //SETTING THE NATIONAL CODE OF THE DOCTOR
    public void setNationalCode(String x) {

        nationalCode = newNationalCode(x);

    }

    //NEW DOCTOR'S MEDICAL CODE

    public String newMedicalCode (String MC){

        Scanner myMC = new Scanner (System.in);

        System.out.print("Please enter your medical code:\n> ");

        MC = myMC.nextLine();

        return MC;

    }

    //SETTING THE MEDICAL CODE OF THE DOCTOR

    public void setMedicalCode(String x){

        medicalCode = newMedicalCode(x);

    }

    public void save (){

        Files Doctor = new Files();

        Doctor.save("Doctor",name);

        Doctor.save("Doctor",nationalCode);

        Doctor.save("Doctor",medicalCode);

    }
    void delete(){

        Files Doctor = new Files();

        Doctor.delete("Doctor",3);

    }

}