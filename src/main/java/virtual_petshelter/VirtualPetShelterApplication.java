package virtual_petshelter;

import virtual_pet.VirtualPet;

import java.util.Scanner;


public class VirtualPetShelterApplication {

    public static void feedAllPets(VirtualPetShelter petShelter, int amount) {
        petShelter.feedAll(amount);
    }

    public static void feedOnePet(VirtualPetShelter petShelter, Scanner input, int amount) {
        System.out.println("Please choose which pet you want to feed");
        for (int i = 0; i < petShelter.returnSize(); i++) {
            System.out.println(petShelter.onePet(i).getName() + "--> " + i + " ");
        }
        int petNum = input.nextInt();
        input.nextLine();

        if (petNum == 0) {
            petShelter.feedOne(petShelter.onePet(0), amount);
        } else if (petNum == 1) {
            petShelter.feedOne(petShelter.onePet(1), amount);
        } else {
            petShelter.feedOne(petShelter.onePet(2), amount);
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
        if (petNum == 0) {
            petShelter.hydrateOne(petShelter.onePet(0), amount);
        } else if (petNum == 1) {
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

        } else if (petNum == 2) {
            if (lowerBoredom == 1) {
                petShelter.onePet(2).entertainment(lowerBoredom);
            } else if (lowerBoredom == 2) {
                petShelter.onePet(2).entertainment(lowerBoredom);
            } else {
                petShelter.onePet(2).entertainment(lowerBoredom);
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

    public static void petDeath(VirtualPetShelter petShelter) {

        for (int i = 0; i < petShelter.returnSize(); i++) {
            if (petShelter.onePet(i).getThirstLevel() >= 10 || petShelter.onePet(i).getHungerLevel() >= 10 ||
                    petShelter.onePet(i).getBoredomLevel() >= 10) {
                System.out.println(petShelter.onePet(i).getName() + " has died.");
                petShelter.adoptPet(petShelter.onePet(i));
                i--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter petShelter = new VirtualPetShelter();
        while (petShelter.returnSize() != 0) {
            System.out.println("Your pets current status are:");
            petShelter.allPetStatus();
            System.out.println("Please choose what you wan to do");
            System.out.println("Feed    -------> 1");
            System.out.println("Hydrate -------> 2");
            System.out.println("Boredom -------> 3");
            System.out.println("Adopt   -------> 4");
            System.out.println("Admit   -------> 5");
            System.out.println("Exit    -------> 6");
            int play = input.nextInt();
            input.nextLine();

            if (play == 1) {
                System.out.println("Would you like to feed one pet or all of them");
                System.out.println("Feed one ------> 1");
                System.out.println("Feed all ------> 2");
                int feedNum = input.nextInt();
                System.out.println("Enter the amount that you want to feed");
                int amount = input.nextInt();
                input.nextLine();
                if (feedNum == 1) {
                    feedOnePet(petShelter, input, amount);
                } else {
                    feedAllPets(petShelter, amount);
                }
            } else if (play == 2) {
                System.out.println("would you like to hydrate one pet or all of them");
                System.out.println("Hydrate one ------> 1");
                System.out.println("Hydrate all ------> 2");
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
                System.out.println("Entertain one ------> 1");
                System.out.println("Entertain all ------> 2");
                int entertainNum = input.nextInt();
                input.nextLine();
                System.out.println("To pet       ------> Enter  1");
                System.out.println("Watch Movie  ------> Enter 2");
                System.out.println("Walk         ------> Enter 3");
                int lowerBoredom = input.nextInt();
                input.nextLine();

                if (entertainNum == 1) {
                    entertainOnePet(petShelter, input, lowerBoredom);
                } else {
                    entertainAllPets(petShelter, lowerBoredom);
                }
            } else if (play == 4) {
                if (petShelter.returnSize() == 0) {
                    System.out.println("There is no more pets in shelter");
                } else {
                    adoptPet(petShelter, input);
                }
            } else if (play == 5) {
                admitPet(petShelter, input);
            } else if (play == 6) {
                break;
            } else {
                System.out.println("Wrong Input, please enter again.");
            }
            petShelter.updateTickAll();
            petDeath(petShelter);
        }
        System.out.println("Thank you for playing the game");
        System.out.println("Goodbye!");
    }
}
