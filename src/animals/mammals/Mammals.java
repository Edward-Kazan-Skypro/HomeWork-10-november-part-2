package animals.mammals;

public abstract class Mammals extends animals.Animals {
    public int travelSpeed = 0;
    private String typeOfFood = "не указано";

    public Mammals(String name, int age, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment);
        if (checkInputNumber(travelSpeed)) this.travelSpeed = travelSpeed;
        if (checkInputString(typeOfFood)) this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(int travelSpeed) {
        if (checkInputNumber(travelSpeed)) this.travelSpeed = travelSpeed;
    }

    public void viewResultAllMethods() {
        this.eat();
        this.move();
        this.walk();
        this.sleep();
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " ест свою любимую еду - " + getTypeOfFood() + ".");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " спит.");
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " куда-то движется.");
    }

    public void walk() {
        System.out.println(super.getName() + " гуляет.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", скорость перемещения: " + travelSpeed +
                ", предпочитаемый тип пищи: " + typeOfFood + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;

        return !getLivingEnvironment().equals(mammals.getLivingEnvironment()) &&
               !getTypeOfFood().equals(mammals.getTypeOfFood()) &&
                !getName().equals(mammals.getName()) &&
                getAge() != mammals.getAge();
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 29 * super.getName().length()
                + 29 * super.getLivingEnvironment().length()
                + 29 * getTypeOfFood().length()
                + super.getAge() + getTravelSpeed();
        return result;

    }
}
