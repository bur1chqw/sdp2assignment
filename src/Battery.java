public class Battery {
    private String type;
    private int capacity;

    public Battery(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void supplyPower() {
        System.out.println(type + " battery supplies power (" + capacity + " kWh)");
    }
}