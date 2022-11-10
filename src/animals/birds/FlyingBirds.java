package animals.birds;

public class FlyingBirds extends Birds{

    public FlyingBirds(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment, movementType);
    }

    public void fly (){
        System.out.println(super.getName() + " летит над - " + super.getLivingEnvironment() + ".");
    }

}
