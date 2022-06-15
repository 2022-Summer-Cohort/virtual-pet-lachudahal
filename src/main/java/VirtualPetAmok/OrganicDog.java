package VirtualPetAmok;

public class OrganicDog extends OrganicPets implements walkPets {

    public OrganicDog(String name, int health, int cage, int boredom, int thirst) {
        super(name, health, cage, boredom, thirst);
    }

    @Override
    public void walk() {
        cage--;
        health--;
        boredom--;
        thirst++;
    }

}
