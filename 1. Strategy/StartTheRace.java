import algorithms.*;
import racers.*;

public class StartTheRace {
    StreetRacer streetRacer = new StreetRacer();
    FormulaOne formulaOne = new FormulaOne();
    Helicopter helicopter = new Helicopter();
    Jet jet = new Jet();

    streetRacer.go();
    formulaOne.go();
    helicopter.go();
    jet.go();
}