import algorithms.GoByFlyingFastAlgorithm;

public class Jet extends Vehicle {
    public Jet() {
        setGoAlgorithm(new GoByFlyingFastAlgorithm);
    }
}