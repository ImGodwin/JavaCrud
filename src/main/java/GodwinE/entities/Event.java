package GodwinE.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private LocalDate date;
    private  String description;

    @Enumerated(EnumType.STRING)
    private EventType eventtype;
    private int maxNumOfParticipants;


public Event(){

}
    public Event(String title, LocalDate date, String description, EventType eventtype, int maxNumOfParticipants) {
        this.title = title;
        this.date = LocalDate.now();
        this.description = description;
        this.eventtype = eventtype;
        this.maxNumOfParticipants = maxNumOfParticipants;
    }

    @Override
    public String toString() {
        return "Event{" +
                //"id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", maxNumOfParticipants=" + maxNumOfParticipants +
                '}';
    }

    public UUID getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxNumOfParticipants() {
        return maxNumOfParticipants;
    }

    public void setMaxNumOfParticipants(int maxNumOfParticipants) {
        this.maxNumOfParticipants = maxNumOfParticipants;
    }
}
