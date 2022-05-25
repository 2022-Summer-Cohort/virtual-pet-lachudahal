import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import virtual_pet.VirtualPet;

import javax.xml.namespace.QName;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VirtualPetTest {
    @Test
    public void feedShouldLowerTheHungerLevel(){
       VirtualPet underTest = new VirtualPet("Ram", 5, 5, 5);
       underTest.feed(3);
       assertEquals(2, underTest.getHungerLevel());
    }
    @Test
    public void entertainmentShouldLowerTheBoredomLevel(){
        VirtualPet underTest = new VirtualPet("Ram", 5, 5, 5);
        underTest.entertainment(1);
        assertEquals(4, underTest.getBoredomLevel());
    }
    @Test
    public void drinkingShouldLowerTheThristLevel(){
        VirtualPet underTest = new VirtualPet("Ram", 5, 5, 5);
        underTest.drink(2);
        assertEquals(3, underTest.getThirstLevel());
    }
}
