import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit implements Save {

    protected String doctor;

    protected String patient;

    protected String drug;

    protected String date;

    private String getDate (String x){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        LocalDateTime now = LocalDateTime.now();

        return LocalDateTime.now().toString();

    }

    public void visit(){

        Doctor Doctor = new Doctor();

        Doctor.setName("Doctor");

        doctor=Doctor.name;

        Patient Patient = new Patient();

        Patient.setName("Patient");

        patient = Patient.name;

        Drug Drug = new Drug();

        Drug.setName("Drug");

        drug=Drug.name;

        date = getDate("DATE");

    }

    public void save (){

        Files Visit = new Files();

        Visit.save("Visit", date);

        Visit.save("Visit",doctor);

        Visit.save("Visit",patient);

        Visit.save("Visit",drug);


    }
    void delete () {


        Files Visit = new Files();

        Visit.delete("Visit", 4);

    }


} //W