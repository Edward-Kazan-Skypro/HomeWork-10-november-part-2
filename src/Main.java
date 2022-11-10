import animals.amphibians.Amphibians;
import animals.birds.Flightless;
import animals.birds.FlyingBirds;
import animals.mammals.Herbivores;
import animals.mammals.Predators;

public class Main {
    public static void main(String[] args) {
        //Объекты класса Травоядные (Herbivores)
        Herbivores жираф = new Herbivores("Жираф Каланча", 15, "африканская саванна", 55,"листья деревьев");
        System.out.println(жираф);
        жираф.viewResultAllMethods();
        System.out.println();
        Herbivores газель = new Herbivores("Газель Мамзель", 10, "индийские джунгли", 35,"листья кустарников");
        System.out.println(газель);
        газель.viewResultAllMethods();
        System.out.println();
        Herbivores лошадь = new Herbivores("Лошадь Сивка-Бурка", 30, "монгольские степи", 15,"сено");
        System.out.println(лошадь);
        лошадь.viewResultAllMethods();
        System.out.println("----------------------------------------------------------------------------");
        //Объекты класса Хищники (Predators)
        Predators гиена = new Predators("Гиена Хохлатка", 5, "национальный парк Серенгети", 10, "мясо павших животных");
        System.out.println(гиена);
        гиена.viewResultAllMethods();
        System.out.println();
        Predators тигр = new Predators("Тигр Полосатик", 12, "индийские джунгли", 20, "свежее мясо");
        System.out.println(тигр);
        тигр.viewResultAllMethods();
        System.out.println();
        Predators медведь = new Predators("Медведь МишкаКосолапый", 28, "сибирская тайга", 17, "всеядный");
        System.out.println(медведь);
        медведь.viewResultAllMethods();
        System.out.println("----------------------------------------------------------------------------");
        //Объекты класса Амфибии (Amphibians)
        Amphibians лягушка = new Amphibians("Квакша обыкновенная", 2,"озера средней полосы России");
        System.out.println(лягушка);
        лягушка.viewResultAllMethods();
        System.out.println();
        Amphibians ужПресноводный = new Amphibians("Уж пресноводный", 3,"реки и озера евпропейской части России");
        System.out.println(ужПресноводный);
        ужПресноводный.viewResultAllMethods();
        System.out.println("----------------------------------------------------------------------------");
        //Объекты класса Птицы
        //нелетающие
        Flightless павлин = new Flightless("Павлин Паша", 7,"центральная часть Индии", "нелетающий");
        System.out.println(павлин);
        павлин.viewResultAllMethods();
        System.out.println();
        Flightless пингвин = new Flightless("Пингвин ЛоЛо", 4,"побережье Антарктиды", "нелетающий");
        System.out.println(пингвин);
        пингвин.viewResultAllMethods();
        System.out.println();
        Flightless птицаДодо = new Flightless("Маврикийски Дронт", 4,"вымер (ранее обитал на о.Маврикий)", "нелетающий");
        System.out.println(птицаДодо);
        птицаДодо.viewResultAllMethods();
        System.out.println();
        //летающие
        FlyingBirds чайка = new FlyingBirds("Полярная чайка", 5,"арктические районы Канады", "летающий");
        System.out.println(чайка);
        чайка.viewResultAllMethods();
        System.out.println();
        FlyingBirds альбатрос = new FlyingBirds("Королевский альбатрос", 45,"острова в южной части Тихого океана", "летающий");
        System.out.println(альбатрос);
        альбатрос.viewResultAllMethods();
        System.out.println();
        FlyingBirds сокол = new FlyingBirds("Черный сокол", 11,"материковая часть Австралии", "летающий");
        System.out.println(сокол);
        сокол.viewResultAllMethods();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("проверка работы методов equals() и hashCode()");
        FlyingBirds сокол_2 = new FlyingBirds("Черный сокол", 11,"материковая часть Австралии", "летающий");
        FlyingBirds сокол_3 = new FlyingBirds("Черный сокол", 11,"материковая часть Австралии", "летающий");
        System.out.println();
        System.out.println("сокол_2.equals(сокол_3)? - " + (сокол_2.equals(сокол_3)));
        System.out.println("сокол_2.hashCode() = " + сокол_2.hashCode());
        System.out.println("сокол_3.hashCode() = " + сокол_3.hashCode());
    }
}