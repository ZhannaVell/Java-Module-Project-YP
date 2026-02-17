public class Car {
    private static final int RACE_DURATION = 24;
    public final String name;
    public final int speed;
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int calculateDistance (){
        return speed*RACE_DURATION;
    }
}


