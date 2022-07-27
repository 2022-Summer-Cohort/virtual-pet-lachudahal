package VirtualPetAmok;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetsAmokApp {
    public static void main(String[] args) {
        VirtualPetAmok petAmokShelter = new VirtualPetAmok();
        Scanner input = new Scanner(System.in);

        while (petAmokShelter.sizeOfShelter() != 0) {
            System.out.println("Your pets current status are:");
            petAmokShelter.showStatusAll();
            System.out.println();
            System.out.println("Please choose what you wan to do");
            System.out.println("Oil         -------> 1");
            System.out.println("Maintenance -------> 2");
            System.out.println("Charge      -------> 3");
            System.out.println("Cage        -------> 4");
            System.out.println("Hydrate     -------> 5");
            System.out.println("Boredom     -------> 6");
            System.out.println("Adopt       -------> 7");
            System.out.println("Admit       -------> 8");
            System.out.println("Exit        -------> 9");
            int play = input.nextInt();
            input.nextLine();

            if (play == 1) {
                petAmokShelter.oilForAllRoboticPets();
                petAmokShelter.updateTick();
            } else if (play == 2) {
                petAmokShelter.allRoboticPetsMaintenance();
                petAmokShelter.updateTick();
            } else if (play == 3) {
                petAmokShelter.chargeAllRoboticPets();
                petAmokShelter.updateTick();
            } else if (play == 4) {
                petAmokShelter.cleanAllOrganicPetsCage();
                petAmokShelter.updateTick();
            } else if (play == 5) {
                petAmokShelter.hydrateAllOrganicPets();
                petAmokShelter.updateTick();
            } else if (play == 6) {
                petAmokShelter.entertainAllPets();
                petAmokShelter.updateTick();
            } else if (play == 7) {
                System.out.println("Which pet do you want to adopt? ");
                for (int i = 0; i < petAmokShelter.sizeOfShelter(); i++) {
                    System.out.print(i + ": " + petAmokShelter.getOnePetWithIndex(i).getName() + " ");
                }
                int petNumber = input.nextInt();
                input.nextLine();
                petAmokShelter.adoptPet(petAmokShelter.getOnePetWithIndex(petNumber));
                petAmokShelter.updateTick();
            } else if(play == 8) {
                System.out.println("What is the name of the pet to admit? ");
                String petName = input.nextLine();
                System.out.println("What type of pet is it? ");
                String typeOfPet = input.nextLine();
                VirtualPets tempPet = null;
                if(typeOfPet.equalsIgnoreCase("rd")) {
                    tempPet = new RoboticDog(petName,10,10,10,10);
                } else if(typeOfPet.equalsIgnoreCase("rc")) {
                    tempPet = new RoboticCat(petName,10,10,10,10);
                }else if(typeOfPet.equalsIgnoreCase("od")) {
                    tempPet = new OrganicDog(petName,10,10,10,10);
                } else if (typeOfPet.equalsIgnoreCase("oc")){
                    tempPet = new OrganicCat(petName,10,10,10,10);
                }
                petAmokShelter.admitPet(tempPet);
                petAmokShelter.updateTick();
            } else if(play==9) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Error entry, try again");
                System.out.println();
            }


        }


    }
}
