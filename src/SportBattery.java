public class SportBattery implements Battery {

    @Override
    public void supplyPower() {
        System.out.println("Sport battery supplies high-performance power.");
    }

    @Override
    public int getCapacity() {
        return 90;
    }
}