package racers;

import algorithms.*;

public class FormulaOne extends Vehicle {
    public FormulaOne() {
        setGoAlgorithm(new GoByDrivingFastAlgorithm());
    }
}