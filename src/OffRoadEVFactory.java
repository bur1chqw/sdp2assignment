public class OffRoadEVFactory implements EVComponentFactory {

    @Override
    public Battery createBattery() {
        return new OffRoadBattery();
    }

    @Override
    public Motor createMotor() {
        return new OffRoadMotor();
    }

    @Override
    public ChargingSystem createChargingSystem() {
        return new OffRoadChargingSystem();
    }
}