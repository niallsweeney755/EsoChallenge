package eso.challenge.tasks.api;

import eso.challenge.tasks.entity.Tasks;
import eso.challenge.tasks.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    TasksService tasksService;

    @PostMapping
    public List<Tasks> getTasksOnSpecificDate(@RequestBody Map<String, String> dateObject){
        List<Tasks> tasksOnSpecificDate;
        return tasksService.getTaskOnSpecificDate(dateObject.get("date"));

    }

    @GetMapping
    public List<Tasks> getAllTasks(){
        List<Tasks> allTasks;
        return allTasks = tasksService.getAllTasks();
    }

}
