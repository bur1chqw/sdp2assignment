public class OffRoadMotor implements Motor {

    @Override
    public void start() {
        System.out.println("OffRoad motor starts with high torque.");
    }

    @Override
    public int getPower() {
        return 350;
    }
}