public class Animal
{
    private String species;
    private int maxWeight;
    private String Habitat;
    private boolean isEndangered;

    public Animal()
    {
        species = "Lion";
        maxWeight = 420;
        Habitat = "Jungle";
        isEndangered = true;
    }

    public Animal(String species)
    {
        this.species = species;
    }

    public Animal(String species, int maxWeight, String Habitat, boolean isEndangered)
    {
        this.species = species;
        this.maxWeight = maxWeight;
        this.Habitat = Habitat;
        this.isEndangered = isEndangered;
    }

    //Setters
    void setSpecies(String species)
    {
        this.species = species;
    }

    void setMaxWeight(int maxWeight)
    {
        this.maxWeight = maxWeight;
    }

    void setHabitat(String Habitat)
    {
        this.Habitat = Habitat;
    }

    void setIsEndangered(boolean isEndangered)
    {
        this.isEndangered = isEndangered;
    }

    //Getters
    String getSpecies()
    {
        return species;
    }

    String getHabitat()
    {
        return Habitat;
    }

    int getMaxWeight()
    {
        return maxWeight;
    }

    boolean getIsEndangered()
    {
        return isEndangered;
    }

    public String toString()
    {
        return ("I am a "
                + getMaxWeight()
                + "lb "
                + getSpecies()
                + " that lives in the "
                + getHabitat()
                + " I am an "
                + getIsEndangered()
                + " species.");
    }
}
