import java.util.ArrayList;
import java.util.List;

public class Subject {

    private ToyType santaWord;
    private final List<Observer> observers = new ArrayList<>();

    public ToyType getCurrentToy() {
        return santaWord;
    }

    public void setCurrentToy(String word) {
        switch (word) {
            case "Puppet":
                santaWord = ToyType.Puppet;
                break;
            case "Bicycle":
                santaWord = ToyType.Bicycle;
                break;
        }
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers)
            observer.update();
    }

}
