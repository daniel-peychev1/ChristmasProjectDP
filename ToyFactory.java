
public class ToyFactory {

    public Toy create(ToyType toyType) {
        return switch (toyType) {
            case Puppet -> new Toy() {
                @Override
                public ToyType toyType() {
                    return ToyType.Puppet;
                }
            };
            case Bicycle -> new Toy() {
                @Override
                public ToyType toyType() {
                    return ToyType.Bicycle;
                }
            };
        };
    }

    public void hireDwarf(Dwarf dwarf) {
        dwarf.setFactory(this);
    }

}
