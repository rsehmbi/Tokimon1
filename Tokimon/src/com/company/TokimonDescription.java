package com.company;

/**
 * Class to hold only Tokimon Description
 * Description includes Name, Size, Ability and Strength
 * Includes Getters, Setters and toString Method
 */

class TokimonDescription {
    private String nameofTokimon;
    private double sizeofTokimon;
    private String abilityofTokimon;
    private int strengthofTokimon;


    public String getNameofTokimon() {
        return nameofTokimon;
    }

    public double getSizeofTokimon() {
        return sizeofTokimon;
    }

    public String getAbilityofTokimon() {
        return abilityofTokimon;
    }

    public int getStrengthofTokimon() {
        return strengthofTokimon;
    }

    public void setNameofTokimon(String nameofTokimon) {
        this.nameofTokimon = nameofTokimon;
    }

    public void setSizeofTokimon(float sizeofTokimon) {
        this.sizeofTokimon = sizeofTokimon;
    }

    public void setAbilityofTokimon(String abilityofTokimon) {
        this.abilityofTokimon = abilityofTokimon;
    }

    public void setStrengthofTokimon(int strengthofTokimon) {
        this.strengthofTokimon = strengthofTokimon;
    }

    @Override
    public String toString() {
        String string = "Name: " + this.nameofTokimon + " " + "Size: " + this.sizeofTokimon + " " + "Ability: " + this.abilityofTokimon
                + " " + "Strength: " + this.strengthofTokimon;
        return (string);
    }

    public void start() {
        String Options[] = {"List Tokimons", "Add a new Tokimon",
                "Remove a Tokimon", "Change Tokimon strength", "DEBUG: Dump objects (toString)", "Exit"};
        Helper mainMenu = new Helper("MainMenu", Options);

    }
}
