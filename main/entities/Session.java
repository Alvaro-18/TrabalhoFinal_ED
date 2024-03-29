package main.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import main.enums.AudioType;
import main.enums.Nationality;

public class Session {
    private String title;
    private Integer minutes;
    private Integer roomNumber;
    private LocalDateTime time;
    private Boolean threeDimensions;
    private Double price;
    private Boolean open;
    private List<Viewer> viewers;
    private Nationality nationality;
    private AudioType audio;

    public Session(String title, Integer minutes, LocalDateTime time, String nationality, String audio,
            Boolean threeDimensions, Double price, Integer roomNumber) {
        this.title = title;
        this.minutes = minutes;
        this.time = time;
        this.nationality = Enum.valueOf(Nationality.class, nationality);
        this.audio = Enum.valueOf(AudioType.class, audio);
        this.threeDimensions = threeDimensions;
        this.price = price;
        this.roomNumber = roomNumber;
        viewers = new ArrayList<>(200);
        open = false;
    }

    public void ticketValue(Viewer viewer) {
        if (threeDimensions && viewer.isHalfPrice()) {
            viewer.setPaymentPrice((price * 0.25) / 2);
        } else if (threeDimensions && !viewer.isHalfPrice()) {
            viewer.setPaymentPrice((price * 0.25));
        } else if (!threeDimensions && viewer.isHalfPrice()) {
            viewer.setPaymentPrice(price / 2);
        } else {
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

    public void addViewer(Viewer viewer) {
        viewers.add(viewer);
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

    public Boolean isOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    @Override
    public String toString() {
        return "Session [title=" + title + ", roomNumber=" + roomNumber + ", nationality="
                + nationality.toString().toLowerCase() + ", audio=" + audio.toString().toLowerCase() + 
                ", duração="+time.format(DateTimeFormatter.ofPattern("DD/MM HH:mm"))+"]";
    }
}