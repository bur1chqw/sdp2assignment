public class ChargingSystem {
    private String type;
    private int chargingPower;

    public ChargingSystem(String type, int chargingPower) {
        this.type = type;
        this.chargingPower = chargingPower;
    }

    public void charge() {
        System.out.println(type + " charger charges at " + chargingPower + " kW");
    }
}