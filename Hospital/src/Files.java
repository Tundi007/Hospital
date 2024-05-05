import java.io.*;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Files {

    public void save(String Name, String Data) {

        File Hospital = new File("C:\\Hospital");

        boolean bool2 = Hospital.mkdir();

        String Path = "C:\\Hospital\\" + Name + "\\" + Name + ".txt";

        try {

            File file = new File("C:\\Hospital\\" + Name);

            boolean bool = file.mkdir();

            if (bool) {

                System.out.println("A new folder has been created!");

                Thread.sleep(2000);

                System.out.flush();

            }

            File New = new File(Path);

            if (New.createNewFile()) {

                System.out.println("A new file has been created!");

                Thread.sleep(2000);

                System.out.flush();

            }

        } catch (Exception e) {

            System.out.println("There was an error creating new files!\n Error details:" + e.getMessage());

        }

        try {

            FileWriter out = new FileWriter(Path, true);

            out.write(Data);

            out.write("\r\n");

            out.close();

        } catch (Exception e) {

            System.out.println("There was an error opening the file\nError details: " + e.getMessage());

        }

    }

    //Delete

    void delete(String Name, int amount) {

        String Path = "C:\\Hospital\\" + Name + "\\" + Name + ".txt";

        try (BufferedReader find = new BufferedReader(new FileReader(Path))) {

            String line = find.readLine();

            while (line!=null){

                System.out.println(line);

                line = find.readLine();

            }

            find.close();


        } catch (Exception e) {

            System.out.println("There was an error opening the file\nError details: " + e.getMessage());

        }

        try (BufferedReader find = new BufferedReader(new FileReader(Path))){

            File temperory = new File("temp.txt");

            boolean Boolean = temperory.createNewFile();

            BufferedWriter temp = new BufferedWriter(new FileWriter("temp.txt"));

            if(Name.equals("Message")){

                System.out.println("Please select the message's date you wish to remove:\n>");

            } else {
                if (Name.equals("Visit")) {

                    System.out.println("Please select the visit's date you wish to remove:\n>");

                } else {

                    System.out.println("Please select the full name of the " + Name + " you wish to remove:\n>");

                }
            }

            Scanner DeleteInfo = new Scanner (System.in);

            String deleteInfo = DeleteInfo.nextLine();

            String LINE  = find.readLine();

            boolean found = false;

            while (LINE!=null){

                String search = LINE;

                if(search.equals(deleteInfo)){

                    found = true;

                    for (int i=0;i<amount-1;i++){

                        LINE  = find.readLine();

                    }

                }else{

                    temp.write(LINE);

                    temp.write("\r\n");

                }

                LINE  = find.readLine();

                search = LINE;

            }

            temp.close();

            find.close();

            File file = new File(Path);

            if(file.delete()){

                System.out.println("Loading");

                Thread.sleep(500);

            }

            File files = new File(Path);

            BufferedReader Temp = new BufferedReader(new FileReader("temp.txt"));

            BufferedWriter File = new BufferedWriter(new FileWriter(Path));

            String Lines = Temp.readLine();

            while(Lines!=null){

                File.write(Lines);

                File.write("\r\n");

                Lines = Temp.readLine();

            }

            Temp.close();

            File.close();

            File Temps = new File("temp.txt");

            if(Temps.delete()){

                System.out.println("Loading");

                Thread.sleep(500);

            }

            String loading = "Searching, please wait";

            for (int i=0;i<3;i++) {

                System.out.println(loading);

                loading += ".";

                Thread.sleep(200);

                System.out.flush();

            }

            if(found){

                System.out.println("The "+Name+" you chose was removed from the system!");

                System.out.println("Operation complete!");

            }else{

                System.out.println("The "+ Name+ " could not be found!\n End of ");

                Thread.sleep(1000);

            }


        }catch(Exception e){

            System.out.println("There was an error operating on the file\nError details: " + e.getMessage());

        }


    }
}

