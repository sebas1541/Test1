package model;

/**
 * @author sebastiancanoncastellanos
 * @version 1.0
 */
public class Calculator {

    /**
     * Attributes of calculator
     *
     */

    int firstNumber;
    int secondNumber;
    int substractionStringNumber;
    String firstString;
    String secondString;


    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getSubstractionStringNumber() {
        return substractionStringNumber;
    }

    /**
     *
     * @param substractionStringNumber que hace este parametro
     */

    public void setSubstractionStringNumber(int substractionStringNumber) {
        this.substractionStringNumber = substractionStringNumber;
    }

    public String getFirstString() {
        return firstString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    /**
     *
     * @return que hace el metodo
     */
    public String getSecondString() {
        return secondString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    /**
     *
     * @return The method gets
     */
    public int add() {
        return firstNumber + secondNumber;
    }

    public int sub() {
        return firstNumber - secondNumber;
    }

    public int times() {
        return firstNumber * secondNumber;
    }

    public int division() {
        return firstNumber / secondNumber;
    }

    /**
     * The following methods operate the two strings provided by a string or a number like in the substraction
     */

    public String addStrings() {
        return firstString + secondString;
    }

    public StringBuffer subStrings() {
        StringBuffer subString = new StringBuffer(firstString);
        subString.delete(0, getSubstractionStringNumber());
        return subString;
    }

    public String timesString() {
        String newString = getFirstString().replace(getSecondString(), "");
        return newString;
    }

    public String divisionString() {
        String newString = getFirstString().replace(getSecondString(), " ");
        return newString;
    }
}
