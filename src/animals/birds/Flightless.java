package animals.birds;

public class Flightless extends Birds{

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment, movementType);
    }

    public void walk() {
        System.out.println(super.getName() + " гуляет.");
    }


}
