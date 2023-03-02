package presenter;

import model.Calculator;
import view.View;


/**
 * Presenter.java serves as the Presenter layer in the proyect
 *
 * @author sebastiancanoncastellanos
 * @see Calculator
 */

public class Presenter {
    private Calculator calculator;
    private View view;

    public Presenter() {
        calculator = new Calculator();
        view = new View();
    }

    public void run() {
        int option = 0;
        while (option != 9) {
            option = showMenu();
            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    additionString();
                    break;
                case 6:
                    substractionString();
                    break;
                case 7:
                    timesString();
                    break;
                case 8:
                    divisionString();
                    break;
                case 9:
                    end();
                    break;
            }
        }
    }

    public int showMenu() {
        int option = view.readInt("Main menu \n1 suma de numero \n2 resta de numero \n3 multiplicacion de numero" +
                "\n4 division de numero \n5 suma de string \n6 resta de string \n7 multiplicacion de string" +
                "\n8 division de string \n9 salir");
        return option;
    }

    public void add() {
        calculator.setFirstNumber(view.readInt("Ingrese el primer número"));
        calculator.setSecondNumber(view.readInt("Ingrese el primer número"));
        view.showMessage("la suma es " + calculator.add() + "\n");
    }

    public void sub() {
        calculator.setFirstNumber(view.readInt("Ingrese el primer número"));
        calculator.setSecondNumber(view.readInt("Ingrese el primer número"));
        view.showMessage("la resta es " + calculator.sub() + "\n");
    }

    public void times() {
        calculator.setFirstNumber(view.readInt("Ingrese el primer número"));
        calculator.setSecondNumber(view.readInt("Ingrese el primer número"));
        view.showMessage("la multiplicación es " + calculator.times() + "\n");
    }

    public void division() {
        calculator.setFirstNumber(view.readInt("Ingrese el primer número"));
        calculator.setSecondNumber(view.readInt("Ingrese el primer número"));
        view.showMessage("la división es " + calculator.division() + "\n");
    }

    public void additionString() {
        calculator.setFirstString(view.readString("Ingrese su 1ra cadena de texto"));
        calculator.setSecondString(view.readString("Ingrese su 2da cadena de texto"));
        view.showMessage("la suma es " + calculator.addStrings() + "\n");
    }

    public void substractionString() {
        calculator.setFirstString(view.readString("Ingrese su cadena de texto"));
        calculator.setSubstractionStringNumber(view.readInt("Ingrese su número para restar los primeros caracteres por izquierda"));
        view.showMessage("la resta es " + calculator.subStrings() + "\n");
    }

    public void timesString() {
        calculator.setFirstString(view.readString("Ingrese su cadena de texto"));
        calculator.setSecondString(view.readString("Ingrese el caracter a remplazar"));
        view.showMessage("la multiplicacion es " + calculator.timesString() + "\n");
    }

    public void divisionString() {
        calculator.setFirstString(view.readString("Ingrese su cadena de texto"));
        calculator.setSecondString(view.readString("Ingrese el caracter a remplazar para convertir en subcadenas"));
        view.showMessage("la division es " + calculator.divisionString() + "\n");
    }

    public void end() {
        System.exit(0);
    }

    public static void main(String[] args) {
        new Presenter().run();
    }
}