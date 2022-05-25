package virtual_pet;

public class VirtualPet {
    // instance variables
    private String name;
    private int hungerlevel;
    private int thirstlevel;
    private int boredomlevel;

    // constructor
    public VirtualPet(String name, int hungerlevel, int thirstlevel,
                      int boredomlevel) {
        this.name = name;
        this.hungerlevel = hungerlevel;
        this.thirstlevel = thirstlevel;
        this.boredomlevel = boredomlevel;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerlevel;
    }

    public int getThirstLevel() {
        return thirstlevel;
    }

    public int getBoredomLevel() {
        return boredomlevel;
    }
    public void feed(int num){
        hungerlevel -= num;
    }
    public void entertainment(int level){
        boredomlevel -= level;

    }
    public void drink(int cup){
        thirstlevel -= cup;
    }
    public void tick(){
        hungerlevel++;
        thirstlevel++;
        boredomlevel++;

    }
}
