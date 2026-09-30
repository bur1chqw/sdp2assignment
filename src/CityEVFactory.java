public class CityEVFactory implements EVComponentFactory {

    @Override
    public Battery createBattery() {
        return new CityBattery();
    }

    @Override
    public Motor createMotor() {
        return new CityMotor();
    }

    @Override
    public ChargingSystem createChargingSystem() {
        return new CityChargingSystem();
    }
}