import algorithms.GoByDrivingFastAlgorithm;

public class FormulaOne extends Vehicle {
    public FormulaOne() {
        setGoAlgorithm(new GoByDrivingFastAlgorithm);
    }
}