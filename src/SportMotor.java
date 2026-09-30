public class SportMotor implements Motor {

    @Override
    public void start() {
        System.out.println("Sport motor starts in performance mode.");
    }

    @Override
    public int getPower() {
        return 400;
    }
}