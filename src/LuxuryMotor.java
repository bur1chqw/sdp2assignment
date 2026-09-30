public class LuxuryMotor implements Motor {

    @Override
    public void start() {
        System.out.println("Luxury motor starts smoothly and quietly.");
    }

    @Override
    public int getPower() {
        return 300;
    }
}