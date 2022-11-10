package animals;

public abstract class Animals {
    private String name = "не указано";
    private int age = 0;
    private String livingEnvironment = "не указано";

    public Animals(String name, int age, String livingEnvironment) {
        if (checkInputString(name)) this.name = name;
        if (checkInputNumber(age)) this.age = age;
        if (checkInputString(livingEnvironment)) this.livingEnvironment = livingEnvironment;
    }

    public static boolean checkInputString(String string) {
        return string.length() > 0 && string != null && !string.isEmpty() && !string.isBlank();
    }

    public static boolean checkInputNumber (int number) {
        return number > 0;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

    @Override
    public String toString() {
        return  "возраст - " + age + " лет," +
                " среда обитания - " + livingEnvironment;

    }
}
