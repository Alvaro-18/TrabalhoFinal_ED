package main.entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Session> sessions;

    public Cinema() {
        sessions = new ArrayList<>();
    }

    public void openSession(Integer sessionNumber) {
        sessions.get(sessionNumber).setOpen(true);
    }

    public void createSession(String title, Integer minutes, LocalDateTime time, String nationality, String audio,
            Boolean threeDimensions, Double price, Integer roomNumber) {
        for (Session session : sessions) {
            if (Duration.between(time, session.getTime()).toMillis() > 1200000) {
                System.out.println("Não é possível criar um sessão nesse horário");
            } else if (session.getRoomNumber() == roomNumber) {
                System.out.println("A sala informada já está ocupada, favor escolher uma nova sala");
            } else {
                sessions.add(new Session(title, minutes, time, nationality, audio, threeDimensions, price, roomNumber));
                System.out.println("A sessão foi registrada com sucesso!");
            }
        }
    }

    public void RegistarVenda() {

    }
}
