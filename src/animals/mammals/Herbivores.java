package animals.mammals;

public class Herbivores extends Mammals {
    public Herbivores(String name, int age, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, travelSpeed, typeOfFood);
    }

    public static boolean checkInputString(String string) {
        return string.length() > 0 && string != null && !string.isEmpty() && !string.isBlank();
    }

    public void graze() {
        System.out.println(super.getName() + " пасется по территории - " + super.getLivingEnvironment() + ".");
    }

    public void viewResultAllMethods() {
        super.viewResultAllMethods();
        this.graze();
    }

    @Override
    public String toString() {
        return "Травоядное - " + super.getName() + ":\n" +
                super.toString();
    }
}
