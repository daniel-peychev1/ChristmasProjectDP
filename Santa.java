public class Santa {

    private static final Santa instance = new Santa();
    private static final OperationExecutor operationExecutor =
            new OperationExecutor();

    private Santa() {}

    public static Santa getInstance() {
        return instance;
    }

    public void speak(String word, MagicBoard board) {
        if(word.equalsIgnoreCase("Bicycle"))
            operationExecutor.executeOperation(new INeedBicycle(board));
        else if(word.equalsIgnoreCase("Puppet"))
            operationExecutor.executeOperation(new INeedPuppet(board));
    }
}
