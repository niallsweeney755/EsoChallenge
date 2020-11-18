package eso.challenge.tasks.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class IndividualRota {

    //set up primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RotaId")
    private Integer rotaId;

    //add date column
    @Temporal(TemporalType.DATE)
    @Column(name = "Date")
    private Date date;

    //set up FireFighterId column as foreign key
    @ManyToOne
    @JoinColumn(name="FireFighterId")
    private FireFighters fireFighters;

    //set up FireFighterId column as foreign key
    @ManyToOne
    @JoinColumn(name="TaskId")
    private Tasks tasks;

    public IndividualRota() {
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

    public FireFighters getFireFighters() {
        return fireFighters;
    }

    public void setFireFighters(FireFighters fireFighters) {
        this.fireFighters = fireFighters;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }
}
