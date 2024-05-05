import java.util.Scanner;

public class Patient extends Doctor{

    protected String illness;

    //NEW PATIENTS NAME

    public String newName(String NAME) {

        Scanner myNC = new Scanner (System.in);

        System.out.print("Please enter patient's full name:\n> ");

        NAME = myNC.nextLine();

        return NAME;

    }

    public void setName(String x) {

        name = newName(x);

    }

    //NEW PATIENT'S ILLNESS

    public String newillness (String Ill){

        Scanner myIll = new Scanner (System.in);

        System.out.print("Please enter your problem:\n> ");

        Ill = myIll.nextLine();

        return Ill;

    }

    //SETTING THE ILLNESS OF THE PERSON

    public void setIllness(String x){

        illness = newillness(x);

    }

    //SAVE AND REMOVE (WIP)
    public void save (){

        Files Patient = new Files();

        Patient.save("Patient",name);

        Patient.save("Patient",nationalCode);

        Patient.save("Patient",illness);

    }
    void delete (){

        Files Patient = new Files();

        Patient.delete("Patient",3);


    }

}