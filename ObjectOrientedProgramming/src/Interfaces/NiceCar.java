package Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player=new CDPlayer();

    public NiceCar(){
        this.engine=new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine=engine;
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

    public void upgradingEnging(){
        this.engine=new ElectricEngine();
        System.out.println("Engine has been upgraded to "+engine.getClass().getName());
    }
}
