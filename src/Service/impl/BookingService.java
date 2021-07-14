package Service.impl;

import Service.Booking;
import constants.SeatStatus;
import constants.SeatType;
import model.Auditorium;
import model.Movie;
import model.Seat;
import model.Ticket;

public class BookingService implements Booking {
    Movie movie = null;
    Seat seat = null;
    Auditorium auditorium = null;
    Booking booking = null;
    Ticket ticket=null;

    @Override
    public void book() {
        while (seat.getNumberOfAvailableSeats() != 0) {
            movie.getMovieName();
            movie.getMovieLanguage();
            movie.getMovieGenre();

            if (seat.getSeatType().equals(SeatType.DIAMOND) || seat.getSeatType().equals(SeatType.PLATINUM)
                    || seat.getSeatType().equals(SeatType.GOLD) || seat.getSeatType().equals(SeatType.SILVER)) {
/*Can we use build pattern here*/
                if (seat.getSeatStatus().equals(SeatStatus.AVAILABLE)) {
                    seat.setSeatStatus(SeatStatus.BOOKED);
                } else {
                    System.out.println("Seat is reserved" + SeatStatus.RESERVED);
                    System.out.println("Please book another Seat");
                }
            }
            System.out.println("Please check your ticket Details");
            if(seat.getSeatStatus().equals(SeatStatus.BOOKED)){
                ticket.printTicket();

            }



            /*public void bookMovie() {
             *//*TODO -check movie is present in the list or not*//*






        }
        public void bookSeat(){

            int numberOfSeats=0;
            numberOfSeats=seat.getNumberOfAvailableSeats();
            while(numberOfSeats!=0){

                numberOfSeats-=1;


                seat.setSeatStatus(SeatStatus.BOOKED);
                auditorium.getAudiId();



*/

        }

    }


}
