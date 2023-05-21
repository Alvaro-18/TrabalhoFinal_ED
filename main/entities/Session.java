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
    
}