package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelp = new JavaHelpForumTopic();
        ForumTopic javaTools = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser pabloEscobar = new ForumUser("Pablo Escobar");
        ForumUser peterParker = new ForumUser("Peter Parker");
        javaHelp.registerObserver(johnSmith);
        javaHelp.registerObserver(peterParker);
        javaTools.registerObserver(pabloEscobar);
        javaTools.registerObserver(peterParker);
        //When
        javaHelp.addPost("First post, HELP MEEEEEEEEE");
        javaHelp.addPost("Second post, ok I wont use caps");
        javaHelp.addPost("Third post, MY PC IS ON FIREEEEEE");
        javaTools.addPost("First post, FIRST");
        javaTools.addPost("Second post, SECOND");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, pabloEscobar.getUpdateCount());
        assertEquals(5, peterParker.getUpdateCount());
    }
}
