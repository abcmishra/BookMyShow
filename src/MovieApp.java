import exception.BadInputException;
import model.Address;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MovieApp {
    private static final int ZIPCODE_MAX = 6;
    private static Address address=null;
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        //Address for the movie hall

           System.out.println("Please enter the State");
           String state= scanner.nextLine();
           if(state!=null){
               address.setState(state);
           }





        System.out.println("Please enter the City");
        String city= scanner.nextLine();
        if(city!=null){
            address.setState(city);
        }
        System.out.println("Please enter Zipcode");
        int zipCode=scanner.nextInt();
        if (zipCode==ZIPCODE_MAX){
            address.setZipCode(zipCode);
        }




    }
}
