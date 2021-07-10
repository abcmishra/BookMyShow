package model;

public class Address {
    private String name=null;
    private String city=null;
    private String state=null;
    private int zipCode;
    public Address(String name,String city,String state,int zipCode){
        this.name=name;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCity(){
        return city;
    }
    public void setCity(){
        this.state=state;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state=state;
    }
    public int getZipCode(){
        return zipCode;
    }
    public void setZipCode(int zipCode){
        this.zipCode=zipCode;
    }
}
