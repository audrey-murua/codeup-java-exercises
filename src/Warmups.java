import java.sql.SQLOutput;
import java.util.Scanner;

public class Warmups {

//      1-04-22
    public static String startDay() {
        return "Brain loading... Done!";
    }

    //        1-06-22
    public static class Penguin {
        private String name;
        private int weight;
        private String species;
        private char sex;

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public String getSpecies() {
            return species;
        }

        public char getSex() {
            return sex;
        }

        public void setName(String name) {
            this.name = name;

        }

        public void setWeight(int weight) {
            this.weight = weight;

        }

        public void setSpecies(String species) {
            this.species = species;

        }

        public void setSex(char sex) {
            this.sex = sex;

        }


    public Penguin(String name, int weight, String species, char sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;

    }

        public Penguin(String name) {
            this.name = name;
        }

        public boolean canFly() {
            return false;
        }

        public boolean areEvil() {
            return true;
        }
    }

    public static void main(String[] args) {
//        12-15-21
        System.out.println("Java is statically typed, while Javascript is dynamically typed.");

//        12-16-21
        Scanner scanner = new Scanner(System.in);
        System.out.println("What did you eat for breakfast today?");
        String userBreakfast = scanner.nextLine();

        System.out.printf("%s. But why?", userBreakfast);

//        1-04-22

            System.out.println(startDay());

//        1-06-22

        Penguin harley = new Penguin("Harley", 65, "non-flying", 'm');
        System.out.println(harley.getName());
        System.out.println(harley.getWeight());
        System.out.println(harley.getSpecies());
        System.out.println(harley.getSex());









    }
};