package decorators;

public class CD extends ComponentDecorator {
    Computer computer;

    public CD(Computer c) {
        this.computer = c;
    }

    public String description() {
        return computer.description() + " and a CD";
    }
}