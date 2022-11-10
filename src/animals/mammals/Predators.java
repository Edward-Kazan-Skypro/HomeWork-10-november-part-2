package animals.mammals;

public class Predators extends Mammals {

    public Predators(String name, int age, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, travelSpeed, typeOfFood);
    }

    public void hunt (){
        System.out.println(super.getName() + " вышел на охоту.");
    }
    public void viewResultAllMethods() {
        super.viewResultAllMethods();
        this.hunt();
    }

    @Override
    public String toString() {
        return "Хищник - " + super.getName() + ":\n" +
                super.toString();
    }


}
