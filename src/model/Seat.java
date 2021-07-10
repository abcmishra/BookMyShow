package model;

import constants.SeatStatus;
import constants.SeatType;

public class Seat {
    private int seatId;
    SeatType seatType=null;
    SeatStatus seatStatus=null;
    private double seatPrice=0;
    private int numberOfAvailableSeats=0;
    private int totalNumberOfSeats=0;

    public Seat(int seatId,double seatPrice,int numberOfAvailableSeats,int totalNumberOfSeats){
        this.seatId=seatId;
        this.seatPrice=seatPrice;
        this.numberOfAvailableSeats=numberOfAvailableSeats;
        this.totalNumberOfSeats=totalNumberOfSeats;
    }
    public int getSeatId(){
        return seatId;
    }
    public void setSeatId(int seatId){
        this.seatId=seatId;
    }
    public SeatType getSeatType(){
        return seatType;
    }
    public void setSeatType(SeatType seatType){
        this.seatType=seatType;
    }
    public SeatStatus getSeatStatus(){
        return seatStatus;

    }
    public void setSeatStatus(SeatStatus seatStatus){
        this.seatStatus=seatStatus;
    }
    public int getNumberOfAvailableSeats(){
        return numberOfAvailableSeats;
    }
    public void setNumberOfAvailableSeats(int numberOfAvailableSeats){
        this.numberOfAvailableSeats=numberOfAvailableSeats;
    }
    public int getTotalNumberOfSeats(){
        return totalNumberOfSeats;
    }
    public void setTotalNumberOfSeats(int totalNumberOfSeats){
        this.totalNumberOfSeats=totalNumberOfSeats;
    }






    
}
