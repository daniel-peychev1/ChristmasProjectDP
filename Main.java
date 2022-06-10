public class Main {

    private static final String PuppetWord  = "Puppet";
    private static final String BicycleWord = "Bicycle";

    public static void main(String[] args) {

        // Factory method inside
        ToyFactory factory = new ToyFactory();

        // Part of observer pattern
        Subject subject = new Subject();

        // Command pattern
        MagicBoard magicBoard = new MagicBoard(subject);
        Santa santa = Santa.getInstance();

        factory.hireDwarf(new Dwarf("Galiggs Halfpint  ", subject));
        factory.hireDwarf(new Dwarf("Gernis  Baffleface", subject));
        factory.hireDwarf(new Dwarf("Gruzzon Shortpants", subject));

        santa.speak(PuppetWord, magicBoard);
        santa.speak(BicycleWord, magicBoard);

    }
}
