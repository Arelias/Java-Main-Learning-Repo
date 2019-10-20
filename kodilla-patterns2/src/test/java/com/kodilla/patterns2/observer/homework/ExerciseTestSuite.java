package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseTestSuite {
    @Test
    public void testUpdate(){
        //Given
        HomeworkExercise exceptions = new JanuaryGroupExercise("Rasputin");
        HomeworkExercise loops = new FebruaryGroupExercise("Bin Laden");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor pabloEscobar = new Mentor("Pablo Escobar");
        Mentor peterParker = new Mentor("Peter Parker");
        exceptions.registerObserver(johnSmith);
        exceptions.registerObserver(peterParker);
        loops.registerObserver(pabloEscobar);
        loops.registerObserver(peterParker);
        //When
        exceptions.addExercise("InvalidMessageException");
        exceptions.addExercise("StupidQuestionException");
        exceptions.addExercise("NoTimeException");
        loops.addExercise("First First First First First First");
        loops.addExercise("Empty loop");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, pabloEscobar.getUpdateCount());
        assertEquals(5, peterParker.getUpdateCount());
    }
}
