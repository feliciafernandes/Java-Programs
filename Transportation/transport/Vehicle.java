package transport;

public abstract class Vehicle {
    protected String id;

    public Vehicle(String id) {
        this.id = id;
        System.out.println("Vehicle() constructor called");
    }

    public abstract void deliver(String item, String place);
}
