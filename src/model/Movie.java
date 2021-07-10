package model;

import constants.MovieGenre;
import constants.MovieLanguage;

import java.sql.Time;
import java.util.Date;

public class Movie {
    private String movieName;
    MovieGenre movieGenre=null;
    private int movieID;
    String actor=null;
    Time duration=null;
    Date releaseDate=null;
    MovieLanguage movieLanguage=null;

    public Movie( String movieName,int movieID,String actor,Date releaseDate){
        this.movieName=movieName;
        this.movieID=movieID;
        this.actor=actor;
        this.releaseDate=releaseDate;
    }
    public MovieGenre getMovieGenre(){
        return movieGenre;
    }
    public void setMovieGenre(MovieGenre movieGenre){
        this.movieGenre=movieGenre;

    }
    public MovieLanguage getMovieLanguage (){
        return movieLanguage;
    }
    public void setMovieLanguage(MovieLanguage movieLanguage){
        this.movieLanguage=movieLanguage;
    }
    public String getMovieName(){
        return movieName;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }







}
