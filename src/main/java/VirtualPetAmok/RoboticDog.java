package VirtualPetAmok;

public class RoboticDog extends RoboticPets implements walkPets {


    public RoboticDog(String name, int health, int oilLevel, int maintenance, int chargeLevel) {
        super(name, health, oilLevel, maintenance, chargeLevel);
    }

    @Override
    public void walk() {
        health++;
        oilLevel++;
        maintenance++;
    }

}
