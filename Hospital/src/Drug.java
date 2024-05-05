import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Drug implements Save {

    protected String name;

    protected String company;

    protected String illness;

    protected String makeDate;

    protected String expireDate;

    protected String description;

    //NEW DRUG'S NAME

    public String newName (String Name){

        Scanner drugName = new Scanner (System.in);

        System.out.print("Please enter drug's name:\n> ");

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

        System.out.print("Please enter the related company:\n> ");

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

        description = newDescription(x);

    }

    //SAVE AND REMOVE (WIP)
    public void save (){

        Files Drug = new Files();

        Drug.save("Drug",name);

        Drug.save("Drug",company);

        Drug.save("Drug",illness);

        Drug.save("Drug",makeDate);

        Drug.save("Drug",expireDate);

        Drug.save("Drug",description);

    }
    void delete() {

        Files Drug = new Files();

        Drug.delete("Drug",6);


    }

}