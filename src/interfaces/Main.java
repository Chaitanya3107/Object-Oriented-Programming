package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.acc();
        car.start();
        car.stop();
        Media mediaCar = new Car();
        mediaCar.start();
        mediaCar.stop();
//        PetrolEngine petrolEngine = new PetrolEngine();
//        petrolEngine.start();
//        petrolEngine.acc();
        ElectricEngine electricEngine = new ElectricEngine();
        electricEngine.start();
        electricEngine.stop();
        CDPlayer player = new CDPlayer();
        player.start();
        player.stop();
        PowerBrake brake = new PowerBrake();
        brake.brake();
        Engine petrolEngine = new PetrolEngine();
        Engine electricalEngine = new ElectricEngine();
        Media cdPlayer = new CDPlayer();
        MyCar myCar = new MyCar(petrolEngine,cdPlayer);
        myCar.start();
        myCar.start();
        myCar.startMusic();
        myCar.stopMusic();
        myCar.upgradeEngine(electricalEngine);
        myCar.start();

    }
}
