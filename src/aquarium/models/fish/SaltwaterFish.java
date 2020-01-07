package aquarium.models.fish;

public class SaltwaterFish extends BaseFish {
    private static final int INITIAL_SIZE = 5;


    public SaltwaterFish(String name, String species, double price) {
        super(name, species, price);
        super.setSize(INITIAL_SIZE);
    }
    @Override
    public void eat() {
        this.setSize(this.getSize() + 2);
    }
}
