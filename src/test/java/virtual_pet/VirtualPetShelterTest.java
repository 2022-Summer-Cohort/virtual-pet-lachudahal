package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    @BeforeEach
    public void setUp() {
        underTest = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("dude", 3,5,4);
        VirtualPet pet2 = new VirtualPet("echo", 4,6,3);
        VirtualPet pet3 = new VirtualPet("duke", 6,3,4);
        underTest.admitPet(pet1);
        underTest.admitPet(pet2);
        underTest.admitPet(pet3);
    }

    @Test
    public void feedAllPet() {
        underTest.feedAll();
        assertEquals(4, underTest.onePet(0).getHungerLevel());
        assertEquals(5, underTest.onePet(1).getHungerLevel());
        assertEquals(7, underTest.onePet(2).getHungerLevel());
    }
    @Test
    public void  hydrateAllPet() {
        underTest.hydrateAll(2);
        assertEquals(7, underTest.onePet(0).getThirstLevel());
        assertEquals(8, underTest.onePet(1).getThirstLevel());
        assertEquals(5, underTest.onePet(2).getThirstLevel());
    }
    @Test
    public void  entertainAllPet() {
        underTest.entertainAll(3);
        assertEquals(7, underTest.onePet(0).getBoredomLevel());
        assertEquals(6, underTest.onePet(1).getBoredomLevel());
        assertEquals(7, underTest.onePet(2).getBoredomLevel());
    }
    @Test
    public void shouldRemovePet(){
        VirtualPet newPet = new VirtualPet("dude", 3,5,4);
        underTest.adoptPet(newPet);
        assertTrue(!underTest.checkPet(newPet));
    }
    @Test
    public void shouldAddPet(){
       VirtualPet newPet =  new VirtualPet("protein", 6,3,4);
       underTest.admitPet(newPet);
       assertTrue(underTest.checkPet(newPet));
    }
    @Test
    public void shouldFeedOnePet(){
        underTest.feedOne(underTest.onePet(1));
        assertEquals(5, underTest.onePet(1).getHungerLevel());
    }
    @Test
    public void shouldHydrateOnePet(){
        underTest.hydrateOne(underTest.onePet(1), 1);
        assertEquals(7, underTest.onePet(1).getThirstLevel());
    }
    @Test
    public void shouldEntertainOnePet(){
        underTest.entertainOne(underTest.onePet(1), 1);
        assertEquals(4, underTest.onePet(1).getBoredomLevel());
    }

}
