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
        if(sessions.get(sessionNumber) != null) {
            if(!sessions.get(sessionNumber).isOpen()) {
                sessions.get(sessionNumber).setOpen(true);
            }
            else {
                System.err.println("Sessão já aberta!");
            }
         }
    }

    public void createSession(String title, Integer minutes, LocalDateTime time, String nationality, String audio,
            Boolean threeDimensions, Double price, Integer roomNumber) {
        for (Session session : sessions) {
            if (Duration.between(time, session.getTime()).toMillis() > 1200000) {
                System.out.println("Não é possível criar um sessão nesse horário");
                break;
            } else if (session.getRoomNumber() == roomNumber) {
                System.out.println("A sala informada já está ocupada, favor escolher uma nova sala");
                break;
            } else {
                sessions.add(new Session(title, minutes, time, nationality, audio, threeDimensions, price, roomNumber));
                System.out.println("A sessão foi registrada com sucesso!");
                break;
            }
        }
    }

    public Session readSession(Integer index) {
        if (sessions.get(index) != null) {
            return sessions.get(index);
        }
        else {
            System.err.println("Sessão não encontrada!");
            return null;
        }
    }

    public void changeSession(Integer index, Session updatedSession) {
        if (sessions.get(index) != null) {
            if (!sessions.get(index).isOpen()) {
                for (Session session : sessions) {
                    if (!(Duration.between(updatedSession.getTime(), session.getTime()).toMillis() > 1200000)) {
                        sessions.set(index, updatedSession);
                    } else {
                        System.err.println("Não é possível atualizar uma sessão nesse período!");
                        break;
                    }
                }
            } else {
                System.err.println("Não é possível alterar uma sessão aberta!");
            }
        } else {
            System.err.print("Sala não encontrada!");
        }
    }

    public void deleteSession(Integer index) {
        if (sessions.get(index) != null){
            if (!sessions.get(index).isOpen()) {
                sessions.remove(index);
            } 
            else {
                System.err.println("Não é possível deletar uma sessão aberta!!");
            }
        } 
        else {
            System.err.println("Sala não encontrada!");
        }
    }

    public void recordTicketSale(Viewer viewer, Integer sessionNumber){
        if(viewer.getSeatNumber() >= 1 && viewer.getSeatNumber() <= 200){
            if(sessions.get(sessionNumber) != null){
                List<Viewer> viewers = sessions.get(sessionNumber).getViewers();
                if (!viewers.contains(viewer)){
                    sessions.get(sessionNumber).addViewer(viewer);
                } 
                else {
                    System.err.println("Poltrona já ocupada!");
                }
            }
            else {
                System.err.println("Sessão não encontrada!");
            }
        }
    }

    public String seeSchedule() {
        if (!sessions.isEmpty()) {
            String retorno = "";
            for (Session session : sessions) {
                retorno += session;
            }
            return retorno;
        }
        else {
            System.err.println("Programação vazia!Volte mais tarde"); 
            return null;
        }
    }
}
