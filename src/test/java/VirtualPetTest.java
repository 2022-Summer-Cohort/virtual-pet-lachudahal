import org.junit.jupiter.api.Test;
import virtual_pet.VirtualPet;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VirtualPetTest {
    @Test
    public void feedShouldLowerTheHungerLevel(){
       VirtualPet underTest = new VirtualPet("Ram", 5, 5, 5);
       underTest.feed(1);
       assertEquals(6, underTest.getHungerLevel());
    }
    @Test
    public void entertainmentShouldLowerTheBoredomLevel(){
        VirtualPet underTest = new VirtualPet("Ram", 5, 5, 5);
        underTest.entertainment(1);
        assertEquals(6, underTest.getBoredomLevel());
    }
    @Test
    public void drinkingShouldLowerTheThirstLevel(){
        VirtualPet underTest = new VirtualPet("Ram", 5, 5, 5);
        underTest.hydrate(2);
        assertEquals(7, underTest.getThirstLevel());
    }
}
