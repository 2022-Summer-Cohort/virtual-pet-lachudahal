package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet pet = new VirtualPet("dude", 5, 4, 7);
        pet.petStatus();

        while (true) {
            System.out.println("what you want to do with " + pet.getName());
            System.out.println("Feed --> 1");
            System.out.println("Hydrate --> 2");
            System.out.println("Boredom --> 3");
            System.out.println("exit --> 4");
            int play = input.nextInt();

            if (play == 4) {
                break;
            }
            if (play == 1) {
                if (pet.getHungerLevel() == 10) {
                    System.out.println("I am not hungry");
                } else {
                    pet.feed();
                    int updateValue = pet.getHungerLevel() + 1;
                    System.out.println("your " + pet.getName() + " current  level is " + updateValue);
                }
            }
            if (play == 2) {
                if (pet.getThirstLevel() == 10) {
                    System.out.println("I am not feeling thirsty");

                } else {
                    System.out.println("Please enter the amount of water");
                    int waterNum = input.nextInt();
                    input.nextLine();
                    pet.hydrate(waterNum);
                    int updateValue = pet.getThirstLevel() + 1;
                    System.out.println("your " + pet.getName() + " current  level is " + updateValue);
                }
            }
            if (play == 3) {
                if (pet.getBoredomLevel() == 10) {
                    System.out.println("I am not feeling bored.");
                } else {
                    System.out.println("Choose the option below to lower the boredom level");
                    System.out.println("To pet him ---> Enter  1");
                    System.out.println("To watch movie with him --> Enter 2");
                    System.out.println("To go on Walk --> Enter 3");
                    int lowerBoredom = input.nextInt();
                    input.nextLine();
                    if (lowerBoredom == 1) {
                        pet.entertainment(play);
                        int updateValue = pet.getBoredomLevel() + 1;
                        System.out.println("your current Boredom level is " + updateValue);
                    } else if (lowerBoredom == 2) {
                        pet.entertainment(play);
                        int updateValue = pet.getBoredomLevel() + 1;
                        System.out.println("your current Boredom level is " + updateValue);

                    } else {
                        pet.entertainment(play);
                        int updateValue = pet.getBoredomLevel() + 1;
                        System.out.println("your " + pet.getName() + " current Boredom level is " + updateValue);
                    }
                }

            }
            pet.tick();

        }
        System.out.println("Thank you for playing this game");
        System.out.println("GoodBye!!");
    }
}


