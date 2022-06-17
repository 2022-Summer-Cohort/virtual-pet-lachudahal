package VirtualPetAmok;

import virtual_pet.VirtualPet;

import java.util.ArrayList;

public class VirtualPetAmok {
    private ArrayList<VirtualPets> petsAmok;

    public VirtualPetAmok() {
        petsAmok = new ArrayList<>();
        petsAmok.add(new OrganicDog("dude", 1, 2, 3, 4));
        petsAmok.add(new OrganicCat("luna", 1, 2, 3, 3));
        petsAmok.add(new RoboticDog("echo", 3, 5, 7, 2));
        petsAmok.add(new RoboticCat("Bella", 2, 1, 5, 1));
    }

    public int sizeOfShelter() {
        return petsAmok.size();
    }

    public VirtualPets getOnePetWithIndex(int n) {
        return petsAmok.get(n);
    }

    public boolean checkPet(VirtualPets pets) {
        if (petsAmok.contains(pets)) {
            return true;
        }
        return false;
    }

    public void admitPet(VirtualPets pets) {
        petsAmok.add(pets);
    }

    public void adoptPet(VirtualPets pets) {
        petsAmok.remove(pets);
    }

    public void oilForAllRoboticPets() {
        for (VirtualPets pets : petsAmok) {
            if (pets instanceof RoboticDog || pets instanceof RoboticCat) {
                ((RoboticPets) pets).oilLevelUpdate();
            }
        }
    }

    public void allRoboticPetsMaintenance() {
        for (VirtualPets pets : petsAmok) {
            if (pets instanceof RoboticDog || pets instanceof RoboticCat) {
                ((RoboticPets) pets).maintenanceLevelUpdate();
            }
        }
    }

    public void chargeAllRoboticPets() {
        for (VirtualPets pets : petsAmok) {
            if (pets instanceof RoboticDog || pets instanceof RoboticCat) {
                ((RoboticPets) pets).updateChargeLevel();
            }
        }
    }

    public void cleanAllOrganicPetsCage() {
        for (VirtualPets pets : petsAmok) {
            if (pets instanceof OrganicDog || pets instanceof RoboticCat) {
                ((OrganicPets) pets).cageCleanliness();
            }
        }
    }

    public void hydrateAllOrganicPets() {
        for (VirtualPets pets : petsAmok) {
            if (pets instanceof OrganicDog || pets instanceof RoboticCat) {
                ((OrganicPets) pets).lowerThirstLevel();
            }
        }
    }

    public void entertainAllPets() {
        for (VirtualPets pets : petsAmok) {
            if (pets instanceof OrganicDog || pets instanceof OrganicCat) {
                ((OrganicPets) pets).lowerBoredomLevel();
            }
        }
    }

    public void entertainOneOrganicPet() {
        for (VirtualPets pets : petsAmok) {
            if (pets instanceof OrganicPets) {
                ((OrganicPets) pets).lowerBoredomLevel();
            }
        }
    }

    public void updateTick() {
        for (VirtualPets amokPets : petsAmok) {
            amokPets.tick();
        }
    }

    public void showStatusAll() {
        for (VirtualPets amokPets : petsAmok) {
            if (amokPets instanceof RoboticPets) {
                System.out.println(amokPets.getName() + ": Maintenance: " + ((RoboticPets) amokPets).getMaintenance()
                        + " Health: " + amokPets.getHealth() + " Charge: " + ((RoboticPets) amokPets).getChargeLevel()
                        + " Oil: " + ((RoboticPets) amokPets).getOilLevel());
            } else if (amokPets instanceof OrganicPets) {
                System.out.println(amokPets.getName() + ": Boredom: " + ((OrganicPets) amokPets).getBoredom()
                        + " Health: " + amokPets.getHealth() + " Cage: " + ((OrganicPets) amokPets).getCage() + " Thrist: " +
                        ((OrganicPets) amokPets).getThirst());
            }

        }
    }

}
