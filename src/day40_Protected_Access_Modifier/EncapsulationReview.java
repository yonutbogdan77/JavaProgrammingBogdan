package day40_Protected_Access_Modifier;

import day04_Variables.Square;
import day34_GarbageCollection_AccessModifiers.Circle;

public class EncapsulationReview {
    private Circle circle;
    private Square square;

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public Circle getCircle(){
        return circle;
    }
    public void setCircle(Circle circle){

        this.circle=circle;
    }
}
