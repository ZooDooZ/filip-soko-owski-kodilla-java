package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapeList = new ArrayList<>();


    void addFigure(Shape shape){
        shapeList.add(shape);

    }
    void removeFigure(Shape shape){

    }
    Shape getFigure(int n){
        return null;
    }
    void showFigures(){

    }

    List<Shape> getElements(){
        return shapeList;
    }


}
