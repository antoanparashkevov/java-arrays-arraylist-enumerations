package com.citb408.university;

public enum ProgramType {
    MAJOR(240), MINOR(120);//additional properties attached to the constants
    private int minimalAmountOfCredits;

    ProgramType(int minimalAmountOfCredits) {
        this.minimalAmountOfCredits = minimalAmountOfCredits;
    }

    public int getMinimalAmountOfCredits() {
        return minimalAmountOfCredits;
    }
}
