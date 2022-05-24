package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ShapeCollectorTestSuite {

    @Test
    public void shouldAddFigure(){

        //GIVEN - z czym startuje
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();

        //WHEN - co testuje
        shapeCollector.addFigure(circle);

        //THEN - wynik końcowy
        List<Shape> result = shapeCollector.getElements();
        Assertions.assertEquals(1, result.size());
    }

    @Test
    public void shouldRemoveFigure(){
        //GIVEN
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();

        //WHEN
        shapeCollector.removeFigure(circle);

        //THEN
        List<Shape> result = shapeCollector.getElements();
        Assertions.assertEquals(0, result.size());
    }

//    @Test
//    public Shape getFigure(){
//        //GIVEN
//        ShapeCollector shapeCollector = new ShapeCollector();
//        Square square = new Square();
//        //WHEN
//        shapeCollector.addFigure(square);
//        shapeCollector.getFigure(-1);
//        //THEN
//
//
//    }
}
