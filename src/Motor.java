public class Motor {
    private String type;
    private int power;

    public Motor(String type, int power) {
        this.type = type;
        this.power = power;
    }

    public void start() {
        System.out.println(type + " motor starts with " + power + " kW");
    }
}