package eso.challenge.tasks.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CrewRota {

    //set up primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RotaId")
    private Integer rotaId;

    //add date column
    @Temporal(TemporalType.DATE)
    @Column(name = "Date")
    private Date date;

    //set up CrewId column as foreign key
    @ManyToOne
    @JoinColumn(name="CrewId")
    private Crew crew;

    //set up TaskId column as foreign key
    @ManyToOne
    @JoinColumn(name="TaskId")
    private Tasks tasks;

    //set up FireEngineId column as foreign key
    @ManyToOne
    @JoinColumn(name="FireEngineId")
    private FireEngines fireEngines;

    public CrewRota() {
    }

    public Integer getRotaId() {
        return rotaId;
    }

    public void setRotaId(Integer rotaId) {
        this.rotaId = rotaId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    public FireEngines getFireEngines() {
        return fireEngines;
    }

    public void setFireEngines(FireEngines fireEngines) {
        this.fireEngines = fireEngines;
    }
}
