package eso.challenge.tasks.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TaskId")
    private int taskId;

    @Column(name = "TaskDescription")
    private String taskDescription;

    @Column(name = "CrewRequired")
    private boolean crewRequired;

    //set up TaskFrequencyId column as foreign key
    @ManyToOne
    @JoinColumn(name="TaskFrequencyId")
    private TaskFrequency taskFrequency;

    //provide mapping for TaskId from Individual_Rota table
    @OneToMany(mappedBy = "tasks", cascade = CascadeType.ALL)
    private List<IndividualRota> individualRotaList  = new ArrayList<>();

    //provide mapping for TaskId from Crew_Rota table
    @OneToMany(mappedBy = "tasks", cascade = CascadeType.ALL)
    private List<CrewRota> crewRotaList  = new ArrayList<>();

    public Tasks() {
    }

    public Tasks(String taskDescription, boolean crewRequired, TaskFrequency taskFrequency) {
        this.taskDescription = taskDescription;
        this.crewRequired = crewRequired;
        this.taskFrequency = taskFrequency;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isCrewRequired() {
        return crewRequired;
    }

    public void setCrewRequired(boolean crewRequired) {
        this.crewRequired = crewRequired;
    }

    public TaskFrequency getTaskFrequency() {
        return taskFrequency;
    }

    public void setTaskFrequency(TaskFrequency taskFrequency) {
        this.taskFrequency = taskFrequency;
    }
}
