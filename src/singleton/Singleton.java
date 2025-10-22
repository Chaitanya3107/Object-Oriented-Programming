package singleton;

public class Singleton {
    // to protect it fromm creating multiple objects, now only able to create one object
    private Singleton(){

    }
// made its static because its object is not necessary to be created
    private static Singleton instance;
    // only creates object once, and send instance of the same object again and again when getInstance is called
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
