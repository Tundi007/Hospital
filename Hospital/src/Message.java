import java.text.SimpleDateFormat;
import java.util.Date;
import javax.security.auth.Subject;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Message implements  Save{

    protected String doctor;

    protected String patient;

    protected String subject;

    protected String date;

    String bool;

    protected boolean visited;

    private String getDate (String x){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        LocalDateTime now = LocalDateTime.now();

        return LocalDateTime.now().toString();

    }

    public boolean getVisit(boolean VISIT){

        Scanner answer = new Scanner (System.in);

        System.out.print("Is the visit over? (Pick a number)\n1.Yes\t2.No\n> ");

        String A = answer.nextLine();

        if (A.equals("1")) {VISIT = true;bool = "true";}

        if (A.equals("2")) {VISIT = false;bool = "false";}

        return VISIT;

    }

    public void Messages (String x){

            Patient Patient = new Patient();

            Doctor Doctor = new Doctor();

            Patient.setName("Patient");

            patient = Patient.name;

            Doctor.setName("Doctor");

            doctor = Doctor.name;

            Scanner Subject = new Scanner (System.in);

            System.out.println("Please enter the subject:\n> ");

            subject = Subject.nextLine();

            date = getDate("Date");

            visited = getVisit(true);

    }

    public void save (){

        Files Message = new Files();

        Message.save("Message", date);

        Message.save("Message",doctor);

        Message.save("Message",patient);

        Message.save("Message",subject);

        Message.save("Message", bool );

    }
    void delete () {

        Files Message = new Files();

        Message.delete("Message",5);

    }

}  //WIP