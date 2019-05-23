package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Test
    public void testPostQuantityZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statCalculator = new StatisticsCalculator(statisticsMock);
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("1");
        usersList.add("2");
        usersList.add("3");
        usersList.add("4");
        int postCount = 0, commentsCount = 10;
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        statCalculator.showStatistics();
        Assert.assertEquals(postCount, statCalculator.getPostPerUser(), 0.1);
        Assert.assertEquals(postCount, statCalculator.getCommentPerPost(), 0.1);
        Assert.assertEquals((double)commentsCount/usersList.size(), statCalculator.getCommentPerUser(), 0.1);
    }
    @Test
    public void testPostQuantityThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statCalculator = new StatisticsCalculator(statisticsMock);
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("1");
        usersList.add("2");
        usersList.add("3");
        usersList.add("4");
        int postCount = 1000, commentsCount = 10;
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        statCalculator.showStatistics();
        Assert.assertEquals((double)postCount/usersList.size(), statCalculator.getPostPerUser(), 0.1);
        Assert.assertEquals((double)commentsCount/postCount, statCalculator.getCommentPerPost(), 0.1);
        Assert.assertEquals((double)commentsCount/usersList.size(), statCalculator.getCommentPerUser(), 0.1);
    }
    @Test
    public void testCommentsQuantityZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statCalculator = new StatisticsCalculator(statisticsMock);
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("1");
        usersList.add("2");
        usersList.add("3");
        usersList.add("4");
        int postCount = 10, commentsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        statCalculator.showStatistics();
        Assert.assertEquals((double)postCount/usersList.size(), statCalculator.getPostPerUser(), 0.1);
        Assert.assertEquals(commentsCount, statCalculator.getCommentPerPost(), 0.01);
        Assert.assertEquals(commentsCount, statCalculator.getCommentPerUser(), 0.01);

    }
    @Test
    public void testCommentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statCalculator = new StatisticsCalculator(statisticsMock);
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("1");
        usersList.add("2");
        usersList.add("3");
        usersList.add("4");
        int postCount = 1000, commentsCount = 10;
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        statCalculator.showStatistics();
        Assert.assertEquals((double)postCount/usersList.size(), statCalculator.getPostPerUser(), 0.1);
        Assert.assertEquals((double)commentsCount/postCount, statCalculator.getCommentPerPost(), 0.1);
        Assert.assertEquals((double)commentsCount/usersList.size(), statCalculator.getCommentPerUser(), 0.1);
    }
    @Test
    public void testCommentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statCalculator = new StatisticsCalculator(statisticsMock);
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("1");
        usersList.add("2");
        usersList.add("3");
        usersList.add("4");
        int postCount = 10, commentsCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        statCalculator.showStatistics();
        Assert.assertEquals((double)postCount/usersList.size(), statCalculator.getPostPerUser(), 0.1);
        Assert.assertEquals((double)commentsCount/postCount, statCalculator.getCommentPerPost(), 0.1);
        Assert.assertEquals((double)commentsCount/usersList.size(), statCalculator.getCommentPerUser(), 0.1);
    }
    @Test
    public void testUserQuantityZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statCalculator = new StatisticsCalculator(statisticsMock);
        ArrayList<String> usersList = new ArrayList<>();
        int postCount = 10, commentsCount = 10;
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        statCalculator.showStatistics();
        Assert.assertEquals(usersList.size(), statCalculator.getPostPerUser(), 0.1);
        Assert.assertEquals((double)commentsCount/postCount, statCalculator.getCommentPerPost(), 0.1);
        Assert.assertEquals(usersList.size(), statCalculator.getCommentPerUser(), 0.1);
    }
    @Test
    public void testUserQuantityHundred() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statCalculator = new StatisticsCalculator(statisticsMock);
        ArrayList<String> usersList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            usersList.add(Integer.toString(i));
        }
        int postCount = 10, commentsCount = 10;
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        statCalculator.showStatistics();
        Assert.assertEquals((double)postCount/usersList.size(), statCalculator.getPostPerUser(), 0.1);
        Assert.assertEquals((double)commentsCount/postCount, statCalculator.getCommentPerPost(), 0.1);
        Assert.assertEquals((double)commentsCount/usersList.size(), statCalculator.getCommentPerUser(), 0.1);
    }
}
//Przetestuj poprawność obliczeń wartości średnich dla różnych przypadków:
//
//gdy liczba postów = 0,
//gdy liczba postów = 1000,
//gdy liczba komentarzy = 0,
//gdy liczba komentarzy < liczba postów,
//gdy liczba komentarzy > liczba postów,
//gdy liczba użytkowników = 0,
//gdy liczba użytkowników = 100.