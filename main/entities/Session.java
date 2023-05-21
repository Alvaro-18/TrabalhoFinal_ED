package main.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import main.enums.AudioType;
import main.enums.Nationality;

public class Session{
    private String title;
    private Integer minutes;
    private Integer roomNumber;
    private LocalDateTime time;
    private Boolean threeDimensions;
    private Double price;
    private List<Viewer> viewers;
    private Nationality nationality;
    private AudioType audio;


    public Session(String title, Integer minutes, LocalDateTime time, String nationality, String audio,
            Boolean threeDimensions, Double price, Integer roomNumber, Integer capacity) {
        this.title = title;
        this.minutes = minutes;
        this.time = time;
        this.nationality = Enum.valueOf(Nationality.class, nationality);
        this.audio = Enum.valueOf(AudioType.class, audio);
        this.threeDimensions = threeDimensions;
        this.price = price;
        this.roomNumber = roomNumber;
        viewers = new ArrayList<>(capacity);
    }

    public void ticketValue(Viewer viewer){
        if (threeDimensions && viewer.isHalfPrice()){
            viewer.setPaymentPrice((price*0.25)/2);
        }
        else if(threeDimensions && !viewer.isHalfPrice()){
            viewer.setPaymentPrice((price*0.25));
        }
        else if(!threeDimensions && viewer.isHalfPrice()){
            viewer.setPaymentPrice(price/2);
        }
        else {
            viewer.setPaymentPrice(price);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getThreeDimensions() {
        return threeDimensions;
    }

    public void setThreeDimensions(Boolean threeDimensions) {
        this.threeDimensions = threeDimensions;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Viewer> getViewers() {
        return viewers;
    }

    public void setViewers(List<Viewer> viewers) {
        this.viewers = viewers;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public AudioType getAudio() {
        return audio;
    }

    public void setAudio(AudioType audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "Session [title=" + title + ", minutes=" + minutes + ", roomNumber=" + roomNumber + ", time=" + time
                + ", threeDimensions=" + threeDimensions + ", price=" + price + ", viewers=" + viewers
                + ", nationality=" + nationality + ", audio=" + audio + "]";
    }
}