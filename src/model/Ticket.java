package model;

import constants.SeatType;

public class Ticket {
     private int ticketId;
    Seat seat=null;
    Auditorium auditorium=null;
    Address address=null;


    public Ticket(int ticketId){
        this.ticketId=ticketId;

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
