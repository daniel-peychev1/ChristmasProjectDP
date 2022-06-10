public class Dwarf extends Observer {

    private final String name;
    private ToyFactory factory;

    public Dwarf(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.printf("%s created toy: %s\n", name,
                factory.create(subject.getCurrentToy()).toyType());
    }

    public void setFactory(ToyFactory factory) {
        this.factory = factory;
    }

}
