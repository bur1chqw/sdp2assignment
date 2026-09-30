public class CityBattery implements Battery {

    @Override
    public void supplyPower() {
        System.out.println("City battery supplies efficient power.");
    }

    @Override
    public int getCapacity() {
        return 50;
    }
}