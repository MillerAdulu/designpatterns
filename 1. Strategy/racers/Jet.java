package racers;

import algorithms.*;

public class Jet extends Vehicle {
    public Jet() {
        setGoAlgorithm(new GoByFlyingFastAlgorithm());
    }
}