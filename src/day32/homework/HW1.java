package day32.homework;

public class HW1 {
    public static void main(String[] args) {
        // write java program with method buyItem
        // that accepts argument
        // which lets you buy items from store
        // prints items bought in store
        // ex: I go to store and bought a milk
        // ex: I go to store and bought a water
        // ex: I go to store and bought a sugar


        buyItem("milk");
        buyItem("water");
        buyItem("sugar");

    }

    public static String buyItem(String c) {

        System.out.println("I go to store and bought c " + c);
        return "I go to store and bought c \"+ c";
    }
}