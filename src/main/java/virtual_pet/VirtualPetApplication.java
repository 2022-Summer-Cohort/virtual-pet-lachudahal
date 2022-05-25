package virtual_pet;

import java.util.*;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int hungerlevel;
        int thirstlevel;
        int boredomlevel;
        boolean level = true;

        VirtualPet pet = new VirtualPet("Dude", 3, 1, 5);
        System.out.println("------------------------------------------------");
        System.out.println("Your current status of " + pet.getName() + "...");
        System.out.print(" Hunger Level: " + pet.getHungerLevel());
        System.out.print(" Thirst Level: " + pet.getThirstLevel());
        System.out.println(" Boredom Level: " + pet.getBoredomLevel());
        System.out.println("-------------------------------------------------");

        while (level = true) {
            System.out.println();
            System.out.println("what you want to do with " + pet.getName());
            System.out.println("please choose the option below: ");
            System.out.println("Feed --> Enter feed or F");
            System.out.println("Hydrate --> Enter water or W");
            System.out.println("Boredom --> Enter Bored or B");
            System.out.println("exit --> Enter exit or E");
            System.out.println();

            String choose = input.nextLine();
            String play = choose.toLowerCase();
            if (play.equals("exit") || play.equals("e")) {
                break;

            } if (play.equals("feed") || play.equals("f")) {
                if (pet.getHungerLevel() == 0) {
                    System.out.println("Your " + pet.getName() + " is full.");
                } else {
                    System.out.println("how much do you want to feed: ");
                    int num = input.nextInt();
                    input.nextLine();
                    pet.feed(num);
                    int  updateValue= pet.getHungerLevel() + 1;
                    System.out.println("Your " + pet.getName() + " current hunger level is " +
                            updateValue);
                }

            }
            if (play.equals("water") || play.equals("w")) {
                if (pet.getThirstLevel() == 0) {
                    System.out.println("your " + pet.getName() + " is not thirsty.");
                } else {
                    System.out.println("how much do you want want him to drink: ");
                    int waterNum = input.nextInt();
                    input.nextLine();
                    pet.drink(waterNum);
                    int updateValue = pet.getThirstLevel() + 1;
                    System.out.println("your " + pet.getName() + " current  level is " +  updateValue);
                }
            }
            if (play.equals("Bored") || play.equals("b")) {
                if (pet.getBoredomLevel() == 0) {
                    System.out.println("your " + pet.getName() + " is not bored.");
                } else {
                    System.out.println("Choose the option below to lower the bordom level");
                    System.out.println("To pet him ---> Enter  1");
                    System.out.println("To watch movie with him --> Enter 2");
                    System.out.println("To go on Walk --> Enter 3");
                    int lowerBoredom = input.nextInt();
                    input.nextLine();
                    if (lowerBoredom == 1) {
                        pet.entertainment(1);
                        int updateValue = pet.getBoredomLevel() + 1;
                        System.out.println("your current Boredom level is " + updateValue);
                    } else if (lowerBoredom == 2) {
                        pet.entertainment(2);
                        int updateValue = pet.getBoredomLevel() + 1;
                        System.out.println("your current Boredom level is " +updateValue);

                    } else {
                        pet.entertainment(3);
                        int updateValue = pet.getBoredomLevel() + 1;
                        System.out.println("your " + pet.getName() + " current Boredom level is " + updateValue);
                    }
                }

            }
            pet.tick();

        }
        System.out.println("GoodBye!!");
    }
}






