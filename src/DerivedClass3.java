public class DerivedClass3 extends BaseClass implements Printable {
    private double rating;

    public DerivedClass3(int id, double rating) {
        super(id);
        this.rating = rating;
    }

    @Override
    public void print() {
        System.out.println("DerivedClass3 - ID: " + getId() + ", Rating: " + rating);
    }
}