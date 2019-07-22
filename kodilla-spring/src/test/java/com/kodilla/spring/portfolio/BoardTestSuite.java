package com.kodilla.spring.portfolio;

import com.kodilla.spring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().tasks.add("Done 1");
        board.getInProgressList().tasks.add("In progress 1");
        board.getToDoList().tasks.add("To do 1");
        //Then
        System.out.println("Tasks done: " + board.getDoneList());
        System.out.println("Tasks in progress: " + board.getInProgressList());
        System.out.println("Tasks to do: " + board.getToDoList());
        Assert.assertTrue(board.getDoneList().tasks.size() > 0);
        Assert.assertTrue(board.getInProgressList().tasks.size() > 0);
        Assert.assertTrue(board.getToDoList().tasks.size() > 0);
    }

}
