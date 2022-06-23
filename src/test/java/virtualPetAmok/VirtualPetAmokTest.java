package virtualPetAmok;

import VirtualPetAmok.VirtualPetAmok;
import org.junit.jupiter.api.BeforeEach;
import VirtualPetAmok.RoboticDog;
import VirtualPetAmok.RoboticCat;
import VirtualPetAmok.OrganicDog;
import VirtualPetAmok.OrganicCat;
import org.junit.jupiter.api.Test;
import virtual_pet.VirtualPet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetAmokTest {
    VirtualPetAmok underTest;
    @BeforeEach
    public void setUp(){
        underTest = new VirtualPetAmok();
        underTest.admitPet(new OrganicDog("dude", 5, 2, 3, 4));
        underTest.admitPet(new OrganicCat("luna", 6, 2, 3, 3));
        underTest.admitPet(new RoboticDog("echo", 3, 5, 7, 2));
        underTest.admitPet(new RoboticCat("Bella", 2, 7, 5, 2));
    }
    @Test
    public void shouldCleanAllOrganicPetsCage(){
        underTest.entertainAllPets();
        assertEquals(2, ((OrganicDog)underTest.getOnePetWithIndex(0)).getBoredom());
        assertEquals(2, ((OrganicCat)underTest.getOnePetWithIndex(1)).getBoredom());
    }
    @Test
    public void shouldChargeAllRoboticPets(){
        underTest.chargeAllRoboticPets();
        assertEquals(1, ((RoboticDog)underTest.getOnePetWithIndex(2)).getChargeLevel());
        assertEquals(0, ((RoboticCat)underTest.getOnePetWithIndex(3)).getChargeLevel());
    }
    @Test
    public void shouldLowerAllRoboticPetsMaintenanceLevel(){
        underTest.allRoboticPetsMaintenance();
        assertEquals(6, ((RoboticDog)underTest.getOnePetWithIndex(2)).getMaintenance());
        assertEquals(4, ((RoboticCat)underTest.getOnePetWithIndex(3)).getMaintenance());
    }

}

