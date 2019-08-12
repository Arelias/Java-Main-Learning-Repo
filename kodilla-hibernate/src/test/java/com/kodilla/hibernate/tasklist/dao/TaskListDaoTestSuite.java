package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;
    String listName = "TASKLIST1";
    String description = "EXAMPLE DESCRIPTION";
    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(listName, description);
        taskListDao.save(taskList);
        String name = taskList.getListNAme();

        //When
        List<TaskList> readTaskList = taskListDao.findByListNAme(listName);


        //Then
        Assert.assertEquals(1, readTaskList.size());

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
