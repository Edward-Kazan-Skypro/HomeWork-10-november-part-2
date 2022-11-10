package animals.birds;

import java.util.Objects;

public abstract class Birds extends animals.Animals{

    private String livingEnvironment = "не указано";
    private String movementType = "не указано";

    public Birds(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        if (checkInputString(movementType)) this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    public abstract void hunt ();

    @Override
    public void eat() {
        System.out.println(super.getName() + " ест свою любимую еду.");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " спит.");
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " куда-то движется.");
    }

    public void viewResultAllMethods() {
        this.eat();
        this.move();
        this.sleep();
        this.hunt();
    }

    @Override
    public String toString() {
        return "Птица - " + super.getName() + ":\n" +
                super.toString() +
                ", способ передвижения - " + getMovementType() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;

        return !getLivingEnvironment().equals(birds.getLivingEnvironment()) &&
        !getMovementType().equals(birds.getMovementType()) &&
        !getName().equals(birds.getName()) &&
        getAge() != birds.getAge();
    }

    @Override
    public int hashCode() {
       return Objects.hash(getLivingEnvironment(), getMovementType(),getName(), getAge());
    }


}
