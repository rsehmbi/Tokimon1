package com.company;

import java.util.Scanner;

/**
 * Helper class to print Menu and validate Inputs entered by the user
 * Helper class is a subclass of Tokimon Description class, so it inherits all the methods of Tokimon Description class
 * Methods include Constructor, printTitle, printStars, getInput,
 * assessInput, getOption, getStrength, listTokimons, AddnewTokimon
 * and startAgain to run the program successfully
 */

public class Helper extends TokimonDescription {
    private String Title;
    private String Options[];
    private Tokimons ListofallTokimons = new Tokimons();

    Helper(String Title, String[] Options) {
        this.Title = Title;
        this.Options = new String[Options.length];
        for (int iterator = 0; iterator < Options.length; iterator++) {
            this.Options[iterator] = Options[iterator];
        }
        printStars("Tokimon Tracker by RamanPreet Singh Sehmbi Student Number 301326893");
        printTitle(this.Title, this.Options);

    }

    public void printTitle(String titletoshowonscreen, String[] Options) {
        printStars(titletoshowonscreen);
        System.out.println();

        for (int iterator = 0; iterator < Options.length; iterator++) {
            System.out.println((iterator + 1 + ". ") + Options[iterator]);
        }
        getInput();
    }

    public void printStars(String Title) {
        int lengthofTitle = Title.length();
        for (int iterator = 0; iterator < lengthofTitle + 4; iterator++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("* " + Title + " *");
        for (int iterator = 0; iterator < lengthofTitle + 4; iterator++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        int Option = scanner.nextInt();
        if (Option >= 7
                || Option <= 0) {
            System.out.println(" Please enter a valid input ");
            startAgain();
        }
        assessInput(Option);
    }

    public void assessInput(int option) {
        if (option == 1) {
            listTokimons();
            if (ListofallTokimons.listofTokimonObjects.size() == 0) {
                System.out.println(" Currently there are no Tokimons :( ");
                startAgain();
            } else {
                startAgain();
            }
        }
        if (option == 2) {
            AddnewTokimon();
            startAgain();
        }
        if (option == 3) {
            listTokimons();
            if (ListofallTokimons.listofTokimonObjects.size() == 0) {
                System.out.println(" Currently there are no Tokimons :( ");
                startAgain();
            } else {
                System.out.println("Enter 0 to cancel");
                System.out.println("Select the Tokimon you want to delete");
                int Optionselectedbyuser = getOption();
                if(Optionselectedbyuser == 0 ){
                    startAgain();
                }
                else {
                    ListofallTokimons.listofTokimonObjects.remove(Optionselectedbyuser - 1);
                    startAgain();
                }
            }
        }
        if (option == 4) {
            listTokimons();
            if (ListofallTokimons.listofTokimonObjects.size() == 0) {
                System.out.println(" Currently there are no Tokimons :( ");
                startAgain();
            } else {
                System.out.println("Enter 0 to cancel");
                System.out.println("Select the Tokimon of whom you want to change the strength");
                int Optionselecetedbyuser = getOption();
                if (Optionselecetedbyuser == 0) {
                    startAgain();
                } else {
                    System.out.println("Increase the strength by ?");
                    int strength = getStrength();
                    ListofallTokimons.listofTokimonObjects.get(Optionselecetedbyuser - 1).setStrengthofTokimon(strength);
                    System.out.println(ListofallTokimons.listofTokimonObjects.get(Optionselecetedbyuser - 1).getNameofTokimon() + " has now strength " + strength);
                    startAgain();
                }

            }

        }
        if (option == 5) {
            if (ListofallTokimons.listofTokimonObjects.size() == 0) {
                System.out.println(" Currently there are no Tokimons :( ");
                startAgain();
            } else {
                System.out.println("All Tokimon Objects:");
                for (int iterator = 0; iterator < ListofallTokimons.listofTokimonObjects.size(); iterator++) {
                    System.out.println(iterator + 1 + ". " + ListofallTokimons.listofTokimonObjects.get(iterator).toString());
                }
                startAgain();
            }
        }
        if (option == 6) {
            System.out.println("BYE!");
        }
    }

    private int getOption() {
        Scanner scanner = new Scanner(System.in);
        int Option = scanner.nextInt();
        while (Option >= ListofallTokimons.listofTokimonObjects.size() + 1
                || Option < 0) {
            System.out.println(" Please enter a valid input ");
            Option = scanner.nextInt();
        }
        return Option;
    }

    private int getStrength() {
        Scanner scanner = new Scanner(System.in);
        int strength = scanner.nextInt();
        while (strength > 100
                || strength < 0) {
            System.out.println("Please enter a valid number!! Remember strength is between 0 and 100");
            strength = scanner.nextInt();
        }
        return strength;
    }

    private void listTokimons() {
        printStars("List of Tokimons: ");
        for (int iterator = 0; iterator < ListofallTokimons.listofTokimonObjects.size(); iterator++) {
            System.out.println(iterator + 1 + "." + " " + ListofallTokimons.listofTokimonObjects.get(iterator).getNameofTokimon() + ", "
                    + ListofallTokimons.listofTokimonObjects.get(iterator).getSizeofTokimon() + "m, " + ListofallTokimons.listofTokimonObjects.get(iterator).getAbilityofTokimon() +
                    " ability, " + ListofallTokimons.listofTokimonObjects.get(iterator).getStrengthofTokimon() + " strength");
        }

    }

    private void AddnewTokimon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Tokimon Name :  ");
        String nameoftokimon = scanner.nextLine();
        System.out.print("Enter Tokimon Type :  ");
        String typeoftokimon = scanner.nextLine();
        System.out.print("Enter Tokimon Size :  ");
        float size = scanner.nextFloat();
        System.out.println("You entered " + nameoftokimon);
        System.out.println("You entered " + typeoftokimon);
        System.out.println("You entered " + size);
        TokimonDescription addTokimon = new TokimonDescription();
        addTokimon.setNameofTokimon(nameoftokimon);
        addTokimon.setAbilityofTokimon(typeoftokimon);
        addTokimon.setSizeofTokimon(size);
        addTokimon.setStrengthofTokimon(0);
        ListofallTokimons.listofTokimonObjects.add(addTokimon);
    }

    private void startAgain() {
        printTitle(this.Title, this.Options);
    }

}
