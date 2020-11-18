package eso.challenge.tasks.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FireFighters {

    //set up primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FireFighterId")
    private Integer id;

    //add name column
    @Column(name = "Name")
    private String name;

    //set up CrewId column as foreign key
    @ManyToOne
    @JoinColumn(name="CrewId")
    private Crew crew;

    //provide mapping for FireFighterId from individual_rota table
    @OneToMany(mappedBy = "fireFighters", cascade = CascadeType.ALL)
    private List<IndividualRota> individualRotaList = new ArrayList<>();

    public FireFighters(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }
}


