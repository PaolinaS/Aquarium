package aquarium.models.aquariums;

public class FreshwaterAquarium extends BaseAquarium {
    private static final int INITIAL_CAPACITY = 50;

    public FreshwaterAquarium(String name) {
        super(name, INITIAL_CAPACITY);
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(String.format("%s (%s):",
//                super.getName(), this.getClass().getSimpleName()))
//                .append(System.lineSeparator())
//                .append(super.getInfo());
//
//
//        return sb.toString().trim();
//    }
}
