package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelter;
    public VirtualPetShelter(){
        shelter = new ArrayList<>();
        shelter.add(new VirtualPet("dude", 3,5,4));
        shelter.add(new VirtualPet("echo", 4,6,3));
        shelter.add(new VirtualPet("duke", 6,3,4));
    }

    public int returnSize() {
        return shelter.size();
    }
    public VirtualPet onePet(int num){
        return shelter.get(num);

    }
    public boolean checkPet(VirtualPet pet){
        if(shelter.contains(pet)){
            return true;
        }
        return false;
    }
    public void feedAll(){
        for (VirtualPet pet : shelter) {
            pet.feed();
        }
    }

    public void hydrateAll(int amount){
        for (VirtualPet pet : shelter) {
            pet.hydrate(amount);
        }
    }
    public void entertainAll(int play){
        for (VirtualPet pet : shelter) {
            pet.entertainment(play);
        }
    }
    public void adoptPet(VirtualPet pet){
        shelter.remove(pet);
    }

    public void admitPet(VirtualPet pet){
        shelter.add(pet);
    }

    public void feedOne(VirtualPet pet){
        pet.feed();
    }
    public void hydrateOne(VirtualPet pet, int amount){
        pet.hydrate(amount);
    }
    public void  entertainOne(VirtualPet pet, int amount){
        pet.entertainment(amount);
    }

    public void updateTickAll(){
        for(VirtualPet pet : shelter){
            pet.tick();
        }
    }
    public void allPetStatus(){
        for (VirtualPet pet : shelter) {
            pet.petStatus();
        }

    }

}
