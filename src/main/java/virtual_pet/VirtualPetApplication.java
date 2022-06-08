package virtual_pet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void feedAllPets(VirtualPetShelter petShelter) {
        petShelter.feedAll();
    }

    public static void feedOnePet(VirtualPetShelter petShelter, Scanner input) {
        System.out.println("Please choose which pet you want to feed");
        for (int i = 0; i < petShelter.returnSize(); i++) {
            System.out.println(petShelter.onePet(i).getName() + "--> " + i + " ");
        }
        int petNum = input.nextInt();
        input.nextLine();
        if (petNum == 1) {
            petShelter.feedOne(petShelter.onePet(0));
        } else if (petNum == 2) {
            petShelter.feedOne(petShelter.onePet(1));
        } else {
            petShelter.feedOne(petShelter.onePet(2));
        }
    }

    public static void hydrateAllPets(VirtualPetShelter petShelter, int amount) {
        petShelter.hydrateAll(amount);
    }

    public static void hydrateOnePet(VirtualPetShelter petShelter, Scanner input, int amount) {
        System.out.println("Please choose which pet you want to hydrate");
        for (int i = 0; i < petShelter.returnSize(); i++) {
            System.out.println(petShelter.onePet(i).getName() + "--> " + i + " ");
        }
        int petNum = input.nextInt();
        input.nextLine();
        System.out.println("Enter hydrate amount");
        amount = input.nextInt();
        input.nextLine();
        if (petNum == 1) {
            petShelter.hydrateOne(petShelter.onePet(0), amount);
        } else if (petNum == 2) {
            petShelter.hydrateOne(petShelter.onePet(1), amount);
        } else {
            petShelter.hydrateOne(petShelter.onePet(2), amount);
        }
    }

    public static void entertainAllPets(VirtualPetShelter petShelter, int play) {
        petShelter.entertainAll(play);
    }

    public static void entertainOnePet(VirtualPetShelter petShelter, Scanner input, int lowerBoredom) {
        System.out.println("Please choose which pet you want to entertain");
        for (int i = 0; i < petShelter.returnSize(); i++) {
            System.out.println(petShelter.onePet(i).getName() + "--> " + i + " ");
        }
        int petNum = input.nextInt();
        input.nextLine();
        if (petNum == 0) {
            if (lowerBoredom == 1) {
                petShelter.onePet(0).entertainment(lowerBoredom);
            } else if (lowerBoredom == 2) {
                petShelter.onePet(0).entertainment(lowerBoredom);
            } else {
                petShelter.onePet(0).entertainment(lowerBoredom);
            }

        } else if (petNum == 1) {
            if (lowerBoredom == 1) {
                petShelter.onePet(1).entertainment(lowerBoredom);
            } else if (lowerBoredom == 2) {
                petShelter.onePet(1).entertainment(lowerBoredom);
            } else {
                petShelter.onePet(1).entertainment(lowerBoredom);
            }
            if (petNum == 2) {
                if (lowerBoredom == 1) {
                    petShelter.onePet(2).entertainment(lowerBoredom);
                } else if (lowerBoredom == 2) {
                    petShelter.onePet(2).entertainment(lowerBoredom);
                } else {
                    petShelter.onePet(0).entertainment(lowerBoredom);
                }
            }
        }
    }

    public static void adoptPet(VirtualPetShelter petShelter, Scanner input) {
        System.out.println("Please choose which pet you want to adopt");

        for (int i = 0; i < petShelter.returnSize(); i++) {
            System.out.println(petShelter.onePet(i).getName() + "--> " + i + " ");
        }
        int petNum = input.nextInt();
        petShelter.adoptPet(petShelter.onePet(petNum));
    }


    public static void admitPet(VirtualPetShelter petShelter, Scanner input) {
        System.out.println("Enter the name of your pet:");
        String name = input.nextLine();
        VirtualPet pet4 = new VirtualPet(name, 1, 3, 2);
        petShelter.admitPet(pet4);
    }
    public static void PetDeath(VirtualPet petShelter){
        if(petShelter.getHungerLevel() >= 10 || petShelter.getThirstLevel() >= 10 || petShelter.getBoredomLevel() >= 10){
            System.out.println("Your pet died");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter petShelter = new VirtualPetShelter();

        while (true && petShelter.returnSize() != 0) {
            petShelter.allPetStatus();
            System.out.println("Please choose what you wan to do");
            System.out.println("Feed --> 1");
            System.out.println("Hydrate --> 2");
            System.out.println("Boredom --> 3");
            System.out.println("Adopt --> 4");
            System.out.println("Admit --> 5");
            System.out.println("Exit --> 6");
            int play = input.nextInt();
            input.nextLine();

            if (play == 1) {
                System.out.println("Would you like to feed one pet or all of them");
                System.out.println("Feed one ---> 1");
                System.out.println("Feed all ---> 2");
                int feedNum = input.nextInt();
                if (feedNum == 1) {
                    feedOnePet(petShelter, input);
                } else {
                    feedAllPets(petShelter);
                }
            } else if (play == 2) {
                System.out.println("would you like to hydrate one pet or all of them");
                System.out.println("Hydrate one ---> 1");
                System.out.println("Hydrate all  ---> 2");
                int hydrateNum = input.nextInt();
                input.nextLine();
                System.out.println("Enter hydrate amount");
                int amount = input.nextInt();
                input.nextLine();
                if (hydrateNum == 1) {
                    hydrateOnePet(petShelter, input, amount);
                } else {
                    hydrateAllPets(petShelter, amount);
                }
            } else if (play == 3) {
                System.out.println("Would you like to entertain one pet or all of them");
                System.out.println("Entertain one ---> 1");
                System.out.println("Entertain all  ---> 2");
                int entertainNum = input.nextInt();
                input.nextLine();
                System.out.println("To pet him ---> Enter  1");
                System.out.println("To watch movie with him --> Enter 2");
                System.out.println("To go on Walk --> Enter 3");
                int lowerBoredom = input.nextInt();
                input.nextLine();

                if (entertainNum == 1) {
                    entertainOnePet(petShelter, input, lowerBoredom);
                } else {
                    entertainAllPets(petShelter, lowerBoredom);
                }
            } else if (play == 4) {
                if (petShelter.returnSize() == 0) {
                    System.out.println("Shelter is empty");
                } else {
                    adoptPet(petShelter, input);
                }
            } else if (play == 5) {
                admitPet(petShelter, input);
            } else {
                break;
            }
            petShelter.updateTickAll();
        }
        System.out.println("Thank you for playing the game");
        System.out.println("Goodbye!");
    }
}
