package animals.amphibians;


public class Amphibians extends animals.Animals {

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public void hunt() {
        System.out.println(super.getName() + " на кого-то охотится.");
    }

    public void viewResultAllMethods() {
        this.eat();
        this.move();
        this.walk();
        this.sleep();
        this.hunt();
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " ест.");
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
        return "Земноводное - " + super.getName() + ":\n" +
                super.toString();
    }



    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians amph = (Amphibians) o;

        return !getLivingEnvironment().equals(amph.getLivingEnvironment()) &&
                !getName().equals(amph.getName()) &&
                getAge() != amph.getAge();
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 29 * super.getName().length()
                + 29 * super.getLivingEnvironment().length()
                + super.getAge();
        return result;
    }*/

}
