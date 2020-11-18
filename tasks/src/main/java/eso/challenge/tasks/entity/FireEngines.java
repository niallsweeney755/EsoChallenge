package eso.challenge.tasks.entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FireEngines {

    //set up primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FireEngineId")
    private Integer fireEngineId;

    @Column(name = "FireEngineName")
    private String fireEngineName;

    //provide mapping for FireEngineId from Crew_Rota table
    @OneToMany(mappedBy = "fireEngines", cascade = CascadeType.ALL)
    private List<CrewRota> crewRotaList = new ArrayList<>();

    public FireEngines() {
    }

    public Integer getFireEngineId() {
        return fireEngineId;
    }

    public void setFireEngineId(Integer fireEngineId) {
        this.fireEngineId = fireEngineId;
    }

    public String getFireEngineName() {
        return fireEngineName;
    }

    public void setFireEngineName(String fireEngineName) {
        this.fireEngineName = fireEngineName;
    }
}

