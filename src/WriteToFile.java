import java.io.*;

public class WriteToFile {

    public void write(Person a, GeoTree gt) {
        if (a.gender.equals("мужской")) {
            try (java.io.FileWriter writer = new java.io.FileWriter("Text.txt", false)) {
                writer.write(a.fullName + " " + a.age + " " + a.gender + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.parent) + "родители" + a.fullName + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.wife) + "жена" + a.fullName + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.brother) + "брат" + a.fullName + '\n');
                writer.flush();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        } else {
            try (java.io.FileWriter writer = new java.io.FileWriter("Text.txt", false)) {
                writer.write(a.fullName + " " + a.age + " " + a.gender + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.parent) + "родители" + a.fullName + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.wife) + "жена" + a.fullName + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.sister) + "сестра" + a.fullName + '\n');
                writer.flush();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }

    }
}
