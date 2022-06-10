public class MagicBoard {

    // Observer pattern
    private final Subject subject;

    public MagicBoard(Subject subject) {
        this.subject = subject;
    }

    public void write(ToyType wishedToy) {
        subject.setCurrentToy(wishedToy.name());
        subject.notifyAllObservers();
    }

}
