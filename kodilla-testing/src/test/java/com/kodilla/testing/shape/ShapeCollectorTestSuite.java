package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(new Square());

        //Then
        Assert.assertEquals(1, collector.getShapesQuantity());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square();
        collector.addFigure(square);

        //When
        boolean result = collector.removeFigure(square);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.getShapesQuantity());
    }
    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square();

        //When
        boolean result = collector.removeFigure(square);

        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square();
        collector.addFigure(square);
        //When
        Shape result = collector.getFigure(0);
        //Then
        Assert.assertEquals(square, result);
    }
    @Test
    public void testGetFigureMinusIndex() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square();
        collector.addFigure(square);
        //When
        Shape result = collector.getFigure(-1);
        //Then
        Assert.assertNull(result);
    }
    @Test
    public void testGetFigureOutOfBounds() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square();
        collector.addFigure(square);
        //When
        Shape result = collector.getFigure(collector.getShapesQuantity() + 1);
        //Then
        Assert.assertNull(result);
    }
    //Not sure what ShowFigures is supposed to do / return
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square();
        collector.addFigure(square);
        //When
        Shape result = collector.getFigure(0);
        //Then
        Assert.assertEquals(square.toString(), result.toString());
    }
}
