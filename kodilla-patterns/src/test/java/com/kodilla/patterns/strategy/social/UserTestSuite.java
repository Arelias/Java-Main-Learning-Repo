package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultPlatform() {
        //Given
        User firstUser = new Millenials("User One");
        User seondUser = new YGeneration("User Two");
        User thirdUser = new ZGeneration("User Three");

        //When
        String firstUserplatform = firstUser.sharePost();
        System.out.println("First platform: " + firstUserplatform);
        String secondUserplatform = seondUser.sharePost();
        System.out.println("Second platform: " + secondUserplatform);
        String thirdUserplatform = thirdUser.sharePost();
        System.out.println("Third platform: " + thirdUserplatform);

        //Then
        Assert.assertEquals("Facebook", firstUserplatform);
        Assert.assertEquals("Twitter", secondUserplatform);
        Assert.assertEquals("Snapchat", thirdUserplatform);
    }

    @Test
    public void testIndividualPlatform() {
        //Given
        User pickyUser = new Millenials("Hispter");


        //When
        String hipsterPlatform = pickyUser.sharePost();
        System.out.println("Normie platform:  " + hipsterPlatform);
        pickyUser.setSocialPublisher(new SnapchatPublisher());
        hipsterPlatform = pickyUser.sharePost();
        System.out.println("Hipster platform:  " + hipsterPlatform);

        //Then
        Assert.assertEquals("Snapchat", hipsterPlatform);
    }
}
