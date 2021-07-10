package Service.impl;

import Service.Booking;
import constants.SeatStatus;
import model.Address;
import model.Auditorium;
import model.Movie;
import model.Seat;
public class BookingService implements Booking {
    Movie movie=null;
    Seat seat=null;
    Auditorium auditorium=null;
    @Override
    public void book() {


    }



    public void bookMovie() {
       /*TODO -check movie is present in the list or not*/






        }
        public void bookSeat(){

            int numberOfSeats=0;
            numberOfSeats=seat.getNumberOfAvailableSeats();
            while(numberOfSeats!=0){

                numberOfSeats-=1;


                seat.setSeatStatus(SeatStatus.BOOKED);
                auditorium.getAudiId();





        }

    }


}
