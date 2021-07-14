package model;

import constants.SeatType;

public class Ticket {
     private int ticketId;
    Seat seat=null;
    Auditorium auditorium=null;
    Address address=null;
    Movie movie=null;


    public Ticket(int ticketId){
        this.ticketId=ticketId;

    }
    public void printTicket(){
        System.out.println("Movie Name "+ movie.getMovieName());
        System.out.println("Movie Genre"+ movie.getMovieGenre());
        System.out.println("Movie Language"+ movie.getMovieLanguage());
        System.out.println("Seat status"+ seat.getSeatStatus());
        System.out.println("Seat Type"+ seat.getSeatType());
        System.out.println("Seat allotment"+ seat.getSeatId());
        System.out.println("Please buy Popcorn and enjoy Movie man");


    }
    public int getTicketId(){
        return ticketId;
    }
    public void setTicketId(int ticketId){
        this.ticketId=ticketId;
    }
    public Seat getSeat(){
        return seat;
    }
    public void setSeat(Seat seat){
        this.seat=seat;
    }
    public Auditorium getAuditorium(){
        return auditorium;
    }
    public void setAuditorium(Auditorium auditorium){
        this.auditorium=auditorium;
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address address){
        this.address=address;
    }



}
