package virtual_pet;


public class VirtualPet {
    // instance variables
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    // constructor
    public VirtualPet(String name, int hungerLevel, int thirstLevel,
                      int boredomLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }
    public void feed(){
        hungerLevel ++;
    }
    public void entertainment(int amount){
        boredomLevel += amount;

    }
    public void hydrate(int amount){
        thirstLevel += amount;
    }
    public void petStatus(){
        System.out.println("The current status of " + name + "...");
        System.out.print(" Hunger Level: " + hungerLevel);
        System.out.print(" Thirst Level: " + thirstLevel);
        System.out.println(" Boredom Level: " + boredomLevel);
    }
    
    public void tick(){

        hungerLevel++;
        thirstLevel++;
        boredomLevel++;

    }
}
