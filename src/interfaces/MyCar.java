package interfaces;

public class MyCar {
    private Engine engine;
    private final Media player ;

    public MyCar(Engine engine,Media player) {
        this.engine = engine;
        this.player = player;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}
