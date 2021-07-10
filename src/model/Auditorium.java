package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Auditorium {

    private int audiId;
    List<Movie> moviesList=new ArrayList<>();
    Date startTime=null;
    Date endTime=null;
    List<Seat> seatList=new ArrayList<>();

    public Auditorium(int audiId){

        this.audiId=audiId;

    }

    public void addMovies(Movie movie){
         moviesList.add(movie);

    }
    public void addSeats(Seat seat){
        seatList.add(seat);
    }

    public int getAudiId(){
        return audiId;
    }
    public void setAudiId(int audiId){
        this.audiId=audiId;
    }
    public List<Movie> getMovie(){
        return moviesList;
    }
    public void setMovies(List<Movie> movies){
        this.moviesList=movies;
    }
    public Date getStartTime(){
        return startTime;
    }
    public void setStartTime(Date startTime ){
        this.startTime=startTime;
    }
    public Date getEndTime(){
        return endTime;
    }
    public void setEndTime(Date endTime){
        this.endTime=endTime;
    }
    public List<Seat>  getSeats(){
        return seatList;
    }
    public void setSeats(List<Seat> seats){
        this.seatList=seats;
    }










}
