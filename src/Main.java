import java.io.FileWriter;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        Person irina = new Person("Ирина", 32, "женский");
        Person vasya = new Person("Вася", 35, "мужской");
        Person masha = new Person("Маша", 20, "женский");
        Person jane = new Person("Женя", 31, "женский");
        Person ivan = new Person("Ваня", 37, "мужской");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        gt.appMarriage(ivan, irina);
        gt.appMarriage(vasya, jane);
        gt.appBrother(vasya, ivan);
        gt.appSister(irina, masha);

        Person a = irina;
        System.out.println(new Reserch(gt).spend(irina, Relationship.parent));
    }
}