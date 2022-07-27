package VirtualPetAmok;

public abstract class OrganicPets extends VirtualPets {
    protected int cage;
    protected int boredom;
    protected int thirst;


    public OrganicPets(String name, int health, int cage, int boredom, int thirst) {
        super(name, health);
        this.cage = cage;
        this.boredom = boredom;
        this.thirst = thirst;
    }

    public int getCage() {
        return cage;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getThirst() {
        return thirst;
    }
    public void cageCleanliness(){
        cage--;
    }

    public void lowerBoredomLevel(){
        boredom--;
    }
    public void lowerThirstLevel(){
        thirst--;
    }

    public void tick(){
        cage++;
        boredom++;
        thirst++;
        health++;
    }
}
