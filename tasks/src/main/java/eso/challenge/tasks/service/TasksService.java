package eso.challenge.tasks.service;

import eso.challenge.tasks.dao.CrewRotaDao;
import eso.challenge.tasks.dao.IndividualRotaDao;
import eso.challenge.tasks.dao.TasksDao;
import eso.challenge.tasks.entity.CrewRota;
import eso.challenge.tasks.entity.IndividualRota;
import eso.challenge.tasks.entity.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TasksService {

    @Autowired
    CrewRotaDao crewRotaDao;

    @Autowired
    IndividualRotaDao individualRotaDao;

    @Autowired
    TasksDao tasksDao;


    public List<Tasks> getAllTasks() {
        List<Tasks> allTasksList = new ArrayList<>();
        Iterable<Tasks> allTasksIterable = tasksDao.findAll();
        allTasksIterable.forEach(tasks -> {
            allTasksList.add(tasks);
        });
        return allTasksList;
    }

    public List<Tasks> getTaskOnSpecificDate(String date) {
        List<Tasks> taskList = new ArrayList<>();
        Iterable<CrewRota> crewTasksIterable = crewRotaDao.findAll();
        crewTasksIterable.forEach(crewRota -> {
            if(crewRota.getDate().toString().equalsIgnoreCase(date)){
                taskList.add(crewRota.getTasks());
            }
        });
        Iterable<IndividualRota> individualTasksIterable = individualRotaDao.findAll();
        individualTasksIterable.forEach(individualRota -> {
            if(individualRota.getDate().toString().equalsIgnoreCase(date)){
                taskList.add(individualRota.getTasks());
            }
        });
        return taskList;
    }
}
