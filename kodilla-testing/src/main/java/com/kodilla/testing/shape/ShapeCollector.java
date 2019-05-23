package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapesList = new ArrayList();

    public int getShapesQuantity(){
        return this.shapesList.size();
    }
    public boolean addFigure(Shape shape) {
        boolean result = false;
        if(!shape.equals(null)){
            shapesList.add(shape);
            result = true;
        }

        return result;
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapesList.contains(shape)){
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if(n >= 0 && n < shapesList.size()){
            return shapesList.get(n);
        }
        return null;
    }

    public String showFigures() {
        String result = "";
        if (shapesList.size() <= 0)
            return null;
        for (Shape shape : shapesList){
            result  += shape.toString();
        }
        return  result;
    }
}
