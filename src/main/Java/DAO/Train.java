package DAO;

import java.sql.Date;
import java.sql.Time;

/**
 * Created by gerar on 16/03/2016.
 */
public class Train {
    private int trainId;
    private String name;
    private String source;
    private String destination;
    private Time departureTime;
    private Time arrivalTime;
    private int totalSeats;
    private int kilometers;
    private int firstClassSeats;
    private int secondClassASeats;
    private int SecondClassBSeats;
    private String route;
    private Date date;

    public int getTrainId() {
        return trainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getFirstClassSeats() {
        return firstClassSeats;
    }

    public void setFirstClassSeats(int firstClassSeats) {
        this.firstClassSeats = firstClassSeats;
    }

    public int getSecondClassASeats() {
        return secondClassASeats;
    }

    public void setSecondClassASeats(int secondClassASeats) {
        this.secondClassASeats = secondClassASeats;
    }

    public int getSecondClassBSeats() {
        return SecondClassBSeats;
    }

    public void setSecondClassBSeats(int secondClassBSeats) {
        SecondClassBSeats = secondClassBSeats;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
