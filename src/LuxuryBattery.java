public class LuxuryBattery implements Battery {

    @Override
    public void supplyPower() {
        System.out.println("Luxury battery supplies premium stable power.");
    }

    @Override
    public int getCapacity() {
        return 110;
    }
}