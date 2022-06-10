public class INeedBicycle implements Operation {

    private final MagicBoard magicBoard;

    public INeedBicycle(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        System.out.println("I Need Bicycle execution...");
        magicBoard.write(ToyType.Bicycle);
    }
}
