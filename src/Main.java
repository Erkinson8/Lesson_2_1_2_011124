// Main.java
public class Main {
    public static void main(String[] args) {
        Printable object1 = createObject("DerivedClass1");
        Printable object2 = createObject("DerivedClass2");
        Printable object3 = createObject("DerivedClass3");

        Printable[] objects = {object1, object2, object3};

        for (Printable object : objects) {
            object.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "DerivedClass1":
                return new DerivedClass1(1, "Name1");
            case "DerivedClass2":
                return new DerivedClass2(2, 10);
            case "DerivedClass3":
                return new DerivedClass3(3, 4.5);
            default:
                return null;
        }
    }
}