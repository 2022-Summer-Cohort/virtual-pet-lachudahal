package VirtualPetAmok;


public abstract class VirtualPets {
    protected String name;
    protected int health;


    public VirtualPets(String name, int health) {
        this.name = name;
        this.health = health;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void tick() {
        health++;
    }



}
