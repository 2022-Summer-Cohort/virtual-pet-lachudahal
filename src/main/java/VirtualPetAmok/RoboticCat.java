package VirtualPetAmok;

public class RoboticCat extends RoboticPets implements walkPets{


    public RoboticCat(String name, int health, int oilLevel, int maintenance, int chargeLevel) {
        super(name, health, oilLevel, maintenance, chargeLevel);
    }

    @Override
    public void walk() {
        oilLevel++;
        maintenance++;
        chargeLevel--;
    }

}
