public class DerivedClass1 extends BaseClass implements Printable {
    private String name;

    public DerivedClass1(int id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("DerivedClass1 - ID: " + getId() + ", Name: " + name);
    }
}