/*
Author: Arman Arjmand
Student code: 993212002
Phone: 09109292997
Prof: prof. Negar Chitgar
Build: Final build
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/*
class Doctor {

        protected String name = new String();

        protected String nationalCode = new String();

        protected String medicalCode = new String();

        //NEW DOCTOR'S NAME

        public String newName(String NAME) {

            Scanner myNC = new Scanner (System.in);

            System.out.print("Please enter your name:\n> ");

            NAME = myNC.nextLine();

            return NAME;

        }

        //SETTING THE NAME OF THE DOCTOR DOCTOR

        public void setName(String x) {

            name = newName(x);

            System.out.println("Your name is: " + name);

        }

        //NEW DOCTOR'S NATIONAL CODE

        public String newNationalCode (String NC){

            Scanner myNC = new Scanner (System.in);

            System.out.print("Please enter your national code:\n> ");

            NC = myNC.nextLine();

            return NC;

        }

        //SETTING THE NATIONAL CODE OF THE DOCTOR
        public void setNationalCode(String x) {

            nationalCode = newNationalCode(x);

            System.out.println("Your national code is: " + nationalCode);

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

            System.out.println("Your meidcal code is: " + medicalCode);

        }

    //CHANGING THE DOCTOR'S NAME

    void getName() {} //WIP

    //CHANGING THE DOCTOR'S NATIONAL CODE

    void getNationalCode(){} //WIP

    //CHANGING THE DOCTOR'S MEDICAL CODE

    void getMedicalCode(){} //WIP

    //SAVE AND REMOVE (WIP)

    void save (){}
    void delete(){}

    }

    //--------------------------

    class Patient extends Doctor{

        protected String illness;

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

        //CHANGING THE PERSON'S NAME

        void getName() {}//WIP

        //CHANGING THE PERSON'S NATIONAL CODE

        void getNationalCode(){}//WIP

        //CHANGING THE PERSON'S ILLNESS

        void getIllness(){}//WIP

        //SAVE AND REMOVE (WIP)
        void save (){}
        void delete (){}

    }

    //--------------------------

    class Message {

        protected String doctor;

        protected String patient;

        protected String subject;

        protected String date;

        protected boolean visited;

        void save (){}
        void delete () {}

    }  //WIP

    //--------------------------

    class Visit {

        protected String doctor;

        protected String patient;

        protected String drug;

        protected String date;

        void save (){
        }
        void delete () {
        }

    } //WIP

    //--------------------------

    class Drug {

        protected String name;

        protected String company;

        protected String illness;

        protected String makeDate;

        protected String expireDate;

        protected String description;

        //NEW DRUG'S NAME

        public String newName (String Name){

            Scanner drugName = new Scanner (System.in);

            System.out.print("Please enter your medical code:\n> ");

            Name = drugName.nextLine();

            return Name;

        }

        //SETTING THE NAME OF THE DRUG

        public void setName(String x){

            name = newName(x);

        }

        //NEW DRUG'S COMPANY

        public String newCompany (String C){

            Scanner drugC = new Scanner (System.in);

            System.out.print("Please enter your medical code:\n> ");

            C = drugC.nextLine();

            return C;

        }

        //SETTING THE COMPANY OF THE DRUG

        public void setCompany(String x){

            company = newCompany(x);

        }

        // NEW DRUG'S REALATED ILLNESS

        public String newillness (String Ill){

            Scanner drugIll = new Scanner (System.in);

            System.out.print("Please enter drug's related illness:\n> ");

            Ill = drugIll.nextLine();

            return Ill;

        }

        //SETTING THE RELATED ILLNESS OF THE DRUG

        public void setIllness(String x){

            illness = newillness(x);

        }

        //NEW DRUG'S PRODUCTION DATE

        public String newMakeDate (String MD){

            Scanner drugMD = new Scanner (System.in);

            System.out.print("Please enter production date:\n> ");

            MD = drugMD.nextLine();

            return MD;

        }

        //SETTING THE PRODUCTION DATE OF THE DRUG

        public void setMakeDate(String x){

            makeDate = newMakeDate(x);

        }

        //NEW DRUG'S EXPIRATION

        public String newExpireDate (String ED){

            Scanner drugED = new Scanner (System.in);

            System.out.print("Please enter expiry date:\n> ");

            ED = drugED.nextLine();

            return ED;

        }

        //SETTING THE EXPIRY DATE OF THE DRUG

        public void setExpireDate(String x){

            expireDate = newExpireDate(x);

        }

        //NEW DRUG'S DESCRIPTION

        public String newDescription (String D){

            Scanner drugD = new Scanner (System.in);

            System.out.print("Please enter the description:\n> ");

            D = drugD.nextLine();

            return D;

        }

        //SETTING THE DESCRIPTION OF THE DRUG

        public void setDescription(String x){

            expireDate = newDescription(x);

        }

        //CHANGING THE DRUG'S NAME

        void getName(){} //WIP

        //CHANGING THE DRUG'S COMPANY

        void getCompany(){} //WIP

        //CHANGING THE DRUG'S RELATED ILLNESS

        void getIllness(){}

        //CHANGING THE DRUG'S PRODUCTION DATE

        void getMakeDate(){} //WIP

        //CHANGING THE DRUG'S EXPIRY DATE

        void getExpireDate(){} //WIP

        //CHANGING THE DRUG'S DESCRIPTION

        void getDescription (){} //WIP


        //SAVE AND REMOVE (WIP)
        void save (){}
        void delete() {}

    }

    //--------------------------

    class Files {

        void save (){
        }
        void delete () {
        }

    } //WIP

    //--------------------------*/

    class Main {

        public static void clscr() {

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        }

        public static void main(String[] args) {

            boolean Continue = true;

            while (Continue) {

                String load = "Loading";

                for (int i = 1; i <= 8; i++) {

                    try {

                        Thread.sleep(300);

                    } catch (Exception e) {

                        System.out.println("An error occurred during loading: " + e.getMessage());

                    }

                    clscr();

                    System.out.print(load);

                    load += ".";

                    if (i % 4 == 0 && i > 0) {

                        load = "Loading";

                    }

                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Something went wrong while loading, Error:" + e.getMessage());
                }


                clscr();

                System.out.print("Please select one from the menu\n1.Doctor\n2.Patient\n3.Drugs\n4.Show messages\n5.Show visits\n6.Show patients\n7.Show doctors\n8.Exit\n> ");

                Scanner answer = new Scanner(System.in);

                int menu = Integer.parseInt(answer.nextLine());

                //Doctor

                if (menu == 1) {

                    clscr();

                    System.out.print("What do you wish to do?\n1.Sign up\n2.Remove contract\n3.Messages\n4.Visits\n> ");

                    Scanner answerDoctor = new Scanner(System.in);

                    int menuDoctor = Integer.parseInt(answerDoctor.nextLine());

                    //Doctor Leave

                    if (menuDoctor == 2) {

                        clscr();

                        Doctor Delete = new Doctor();

                        Delete.delete();

                    }

                    //Doctor Join

                    if (menuDoctor == 1) {

                        clscr();

                        Doctor New = new Doctor();

                        New.setName("Doctor");

                        New.setNationalCode("Doctor");

                        New.setMedicalCode("Doctor");

                        New.save();

                    }

                    //Doctor message

                    if (menuDoctor == 3) {

                        clscr();

                        System.out.print("What do you wish to do?\n1.New message\n2.Remove Message\n> ");

                        Scanner answerDoctorMenu3 = new Scanner(System.in);

                        String ADM3 = answerDoctorMenu3.nextLine();

                        if (ADM3.equals("1")) {

                            clscr();

                            Message doctorMessage = new Message();

                            doctorMessage.Messages("Doctor");

                            doctorMessage.save();

                        }

                        if (ADM3.equals("2")) {

                            clscr();

                            Message deleteMessage = new Message();

                            deleteMessage.delete();

                        }

                    }

                    //Doctor Visit

                    if (menuDoctor == 4) {

                        clscr();

                        System.out.println("What do you wish to do?\n1.Make a visit\n2.Remove a visit\n> ");

                        Scanner answerDoctorMenu4 = new Scanner(System.in);

                        String ADM4 = answerDoctorMenu4.nextLine();

                        if (ADM4.equals("1")) {

                            Visit newVisit = new Visit();

                            newVisit.visit();

                            newVisit.save();

                        }


                        if (ADM4.equals("2")) {

                            Visit deleteVisit = new Visit();

                            deleteVisit.delete();

                        }
                    }

                }

                //Patient

                if (menu == 2) {

                    clscr();

                    System.out.print("What do you wish to do?\n1.Sign up\n2.Message\n3.Visit\n4.I want to leave\n >");

                    Scanner answerPatient = new Scanner(System.in);

                    int menuPatient = Integer.parseInt(answerPatient.nextLine());

                    //New Patient

                    if (menuPatient == 1) {

                        clscr();

                        Patient New = new Patient();

                        New.setName("Patient");

                        New.setNationalCode("Patient");

                        New.setIllness("Patient");

                        New.save();

                    }

                    //Patient Message

                    if (menuPatient == 2) {

                        clscr();

                        System.out.print("What do you wish to do?\n1.New message\n2.Remove Message\n> ");

                        Scanner answerPatientMenu3 = new Scanner(System.in);

                        String APM3 = answerPatientMenu3.nextLine();

                        if (APM3.equals("1")) {

                            clscr();

                            Message patientMessage = new Message();

                            patientMessage.Messages("Patient");

                            patientMessage.save();

                        }

                        if (APM3.equals("2")) {

                            clscr();

                            Message deleteMessage = new Message();

                            deleteMessage.delete();

                        }

                    }

                    if (menuPatient == 3) {

                        clscr();

                        System.out.println("What do you wish to do?\n1.Make a visit\n2.Remove a visit\n> ");

                        Scanner answerPatientMenu3 = new Scanner(System.in);

                        String ADM4 = answerPatientMenu3.nextLine();

                        if (ADM4.equals("1")) {

                            Visit newVisit = new Visit();

                            newVisit.visit();

                            newVisit.save();

                        }


                        if (ADM4.equals("2")) {

                            Visit deleteVisit = new Visit();

                            deleteVisit.delete();

                        }

                    }

                    //Patient Leave

                    if (menuPatient == 4) {

                        Patient patientLeave = new Patient();

                        patientLeave.delete();

                    }

                }

                if (menu == 3) {

                    clscr();

                    System.out.print("What do you wish to do?\n1.Add a drug\n2.Remove a drug\n> ");

                    Scanner answerDrug = new Scanner(System.in);

                    int menuDrug = Integer.parseInt(answerDrug.nextLine());

                    if (menuDrug == 1) {

                        clscr();

                        Drug New = new Drug();

                        New.setName("DRUG");

                        New.setCompany("DRUG");

                        New.setDescription("DRUG");

                        New.setIllness("DRUG");

                        New.setMakeDate("DRUG");

                        New.setExpireDate("DRUG");

                        New.setDescription("DRUG");

                        New.save();

                    }

                    if (menuDrug == 2) {

                        clscr();

                        Drug deleteDrug = new Drug();

                        deleteDrug.delete();

                    }


                }

                //Show Messages

                if (menu == 4) {

                    clscr();

                    try {

                        System.out.println("Loading messages...");

                        Thread.sleep(500);

                        BufferedReader showMessages1 = new BufferedReader(new FileReader("C:\\Hospital\\Message\\Message.txt"));

                        String Show = showMessages1.readLine();

                        while (Show != null) {

                            System.out.println(Show);

                            Show = showMessages1.readLine();

                        }


                    } catch (Exception e) {
                        System.out.println("There was an error: " + e.getMessage());
                    }

                    System.out.println("Enter any key to continue:\n>");

                    Scanner Continue1 = new Scanner(System.in);

                    String X21 = Continue1.nextLine();

                    clscr();

                }
                if (menu == 5) {

                    clscr();

                    try {

                        System.out.println("Loading visits...");

                        Thread.sleep(500);

                        BufferedReader showVisit1 = new BufferedReader(new FileReader("C:\\Hospital\\Visit\\Visit.txt"));

                        String Show = showVisit1.readLine();

                        while (Show != null) {

                            System.out.println(Show);

                            Show = showVisit1.readLine();

                        }


                    } catch (Exception e) {
                        System.out.println("There was an error: " + e.getMessage());
                    }

                    System.out.println("Enter any key to continue:\n>");

                    Scanner Continue1 = new Scanner(System.in);

                    String X21 = Continue1.nextLine();

                    clscr();

                }
                if (menu == 6) {

                    clscr();

                    try {

                        System.out.println("Loading patients...");

                        Thread.sleep(500);

                        BufferedReader showPatient1 = new BufferedReader(new FileReader("C:\\Hospital\\Patient\\Patient.txt"));

                        String Show = showPatient1.readLine();

                        while (Show != null) {

                            System.out.println(Show);

                            Show = showPatient1.readLine();

                        }


                    } catch (Exception e) {
                        System.out.println("There was an error: " + e.getMessage());
                    }

                    System.out.println("Enter any key to continue:\n>");

                    Scanner Continue1 = new Scanner(System.in);

                    String X21 = Continue1.nextLine();

                    clscr();

                }
                if (menu == 7) {

                    clscr();

                    try {

                        System.out.println("Loading doctors...");

                        Thread.sleep(500);

                        BufferedReader showDoctor1 = new BufferedReader(new FileReader("C:\\Hospital\\Doctor\\Doctor.txt"));

                        String Show = showDoctor1.readLine();

                        while (Show != null) {

                            System.out.println(Show);

                            Show = showDoctor1.readLine();

                        }


                    } catch (Exception e) {
                        System.out.println("There was an error: " + e.getMessage());
                    }

                    System.out.println("Enter any key to continue:\n>");

                    Scanner Continue1 = new Scanner(System.in);

                    String X21 = Continue1.nextLine();

                    clscr();

                }
                if (menu == 8) {

                    clscr();

                    Continue = false;

                    clscr();

                }


            }

            System.out.println("Thanks for your cooperation!");


        }//WIP
    }
