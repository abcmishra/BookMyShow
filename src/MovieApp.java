import constants.ModeOfPayment;
import constants.MovieLanguage;
import constants.SeatType;
import exception.BadInputException;
import model.Address;
import model.Movie;
import model.Payment;
import model.Seat;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MovieApp {
    private static final int ZIPCODE_MAX = 6;
    private static Address address=null;
    private static Movie movie=null;
    private static Payment payment=null;
    private static Seat seat=null;
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
        System.out.println("Please enter the name of Theatre");
        String name=scanner.nextLine();
        if(name!=null){
            address.setName(name);
        }
        System.out.println("Please enter the name of movie");
        String movieName=scanner.nextLine();
        if(movieName!=null){
            movie.setMovieName(movieName);
        }
        System.out.println("Please enter the language of movie");

        MovieLanguage movieLang = MovieLanguage.values()[scanner.nextInt()];

        if(movieLang!=null){
            movie.setMovieLanguage(movieLang);
        }
        /*System.out.println("Please enter the payment Details");
      ModeOfPayment modeOfPayment =ModeOfPayment.values()[scanner.nextInt()];

              if(modeOfPayment==ModeOfPayment.UPIPAYMENT || modeOfPayment==ModeOfPayment.CARD||
                      modeOfPayment==ModeOfPayment.CASH){
                  payment.setModeOfPayment(modeOfPayment);
              }
              */
        /*Admin input */
        System.out.println("Please choose seat 1.Silver 2.Platinum 3.Gold 4.Diamond");
        SeatType seatType=SeatType.values()[scanner.nextInt()];
        seat.setSeatType(seatType);



    }
}
