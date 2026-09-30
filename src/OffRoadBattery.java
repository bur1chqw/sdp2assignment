public class OffRoadBattery implements Battery {

    @Override
    public void supplyPower() {
        System.out.println("OffRoad battery supplies durable high-capacity power.");
    }

    @Override
    public int getCapacity() {
        return 120;
    }
}