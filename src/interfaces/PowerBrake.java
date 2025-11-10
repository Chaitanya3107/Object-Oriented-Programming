package interfaces;

public class PowerBrake implements Brake{
    @Override
    public void brake() {
        System.out.println("I brake this car");
    }
}
