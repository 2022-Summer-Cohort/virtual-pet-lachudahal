package virtual_petshelter;

import virtual_pet.VirtualPet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelter;
    public VirtualPetShelter(){
        shelter = new ArrayList<>();
        shelter.add(new VirtualPet("dude", 3,5,6));
        shelter.add(new VirtualPet("echo", 1,2,3));
        shelter.add(new VirtualPet("duke", 4,3,7));
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
    public void feedAll(int amount){
        for (VirtualPet pet : shelter) {
            pet.feed(amount);
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

    public void feedOne(VirtualPet pet, int amount){
        pet.feed(amount);
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
