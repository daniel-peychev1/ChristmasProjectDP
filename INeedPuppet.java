public class INeedPuppet implements Operation {

    private final MagicBoard magicBoard;

    public INeedPuppet(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        System.out.println("I Need Puppet execution...");
        magicBoard.write(ToyType.Puppet);
    }
}
