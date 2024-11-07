public class DerivedClass2 extends BaseClass implements Printable {
    private int level;

    public DerivedClass2(int id, int level) {
        super(id);
        this.level = level;
    }

    @Override
    public void print() {
        System.out.println("DerivedClass2 - ID: " + getId() + ", Level: " + level);
    }
}