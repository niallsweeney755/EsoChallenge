package eso.challenge.tasks;

import eso.challenge.tasks.dao.TasksDao;
import eso.challenge.tasks.entity.TaskFrequency;
import eso.challenge.tasks.entity.Tasks;
import eso.challenge.tasks.service.TasksService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@SpringBootTest
class TasksApplicationTests {

	@Autowired
	TasksService tasksService;

	@MockBean
	private TasksDao tasksDao;

	@Test
	public void getTasks() {
		when(tasksDao.findAll()).thenReturn(Stream.of(
				new Tasks("Sweep Floor", false, new TaskFrequency(1)),
				new Tasks("Empty Trash", false, new TaskFrequency(2)),
				new Tasks("Wash Fire Engine", true, new TaskFrequency(7))

		).collect(Collectors.toList()));
		assertEquals(3, tasksService.getAllTasks().size());
	}

}
