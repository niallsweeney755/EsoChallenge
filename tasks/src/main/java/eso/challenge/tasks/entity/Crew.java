package eso.challenge.tasks.entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Crew {

    //set up primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CrewId")
    private Integer id;

    //add item category name column
    @Column(name = "Name")
    private String name;

    //provide mapping for CrewId from Fire_Fighter table
    @OneToMany(mappedBy = "crew", cascade = CascadeType.ALL)
    private List<FireFighters> fireFightersList = new ArrayList<FireFighters>();

    //provide mapping for CrewId from crew_rota table
    @OneToMany(mappedBy = "crew", cascade = CascadeType.ALL)
    private List<CrewRota> crewRotaList = new ArrayList<>();

    public Crew() {
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
}
