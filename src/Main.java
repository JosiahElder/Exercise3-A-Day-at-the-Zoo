// Exercise 3: A Day at the Zoo - "Ready for marking"

public class Main
{
    public static void main(String[] args)
    {
        Animal A1 = new Animal();
        System.out.println("Default Constructor: \n"
                + A1.toString());

        System.out.println();

        Animal A2 = new Animal("tiger", 390, "Jungle", true);
        System.out.println("Parameterized Constructor: \n"
                + A2.toString());

        System.out.println();

        Animal A3 = new Animal();
        A3.setHabitat("Ocean");
        A3.setMaxWeight(2000);
        A3.setIsEndangered(true);
        A3.setSpecies("White Shark");
        System.out.println("Parameterized Constructor: \n"
                + A3.toString());
    }
}