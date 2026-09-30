public class CityMotor implements Motor {

    @Override
    public void start() {
        System.out.println("City motor starts in efficiency mode.");
    }

    @Override
    public int getPower() {
        return 100;
    }
}