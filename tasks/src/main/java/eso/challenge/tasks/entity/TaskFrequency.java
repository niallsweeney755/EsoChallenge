package eso.challenge.tasks.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TaskFrequency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FrequencyId")
    private int frequencyId;

    @Column(name = "Days")
    private int days;

    //provide mapping for TaskFrequencyId from Tasks table
    @OneToMany(mappedBy = "taskFrequency", cascade = CascadeType.ALL)
    private List<Tasks> tasksList = new ArrayList<>();

    public TaskFrequency() {
    }

    public TaskFrequency(int days) {
        this.days = days;
    }

    public int getFrequencyId() {
        return frequencyId;
    }

    public void setFrequencyId(int frequencyId) {
        this.frequencyId = frequencyId;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
