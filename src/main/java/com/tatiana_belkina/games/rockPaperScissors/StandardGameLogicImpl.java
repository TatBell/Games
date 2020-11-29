package src.main.java.com.tatiana_belkina.javacore.rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class StandardGameLogicImpl implements GameLogic {
    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);

    private void showMenu() {
        System.out.println("Choose your variant: ");
        System.out.println("         1.ROCK; ");
        System.out.println("         2.SCISSORS; ");
        System.out.println("         3.PAPER; ");
    }

    private Integer getInput() {
        return scanner.nextInt();
    }

    private boolean validateInput(Integer input) {
        if (input < 1 || input > 3) {
            System.out.println("Your choice is wrong!");
            System.out.println("Please, choose again.");
            return false;
        }
        return true;
    }
// выбор компьютера. Класс Random.
    private Figure generatePCChoice() {
        System.out.println("Generation PC variant!");
        int randomIndex = new Random().nextInt(3);
        return Figure.values()[randomIndex];
    }
// Элемент массива Enum Figure.
    private Figure convertChoice(Integer input) {
        return Figure.values()[input];
    }
// Выбор из трех выигрышных
    private String checkWinner() {
        if (field.getFirstPlayerInput().equals(field.getSecondPlayerInput())) {
            return "draw";
        } else if ((field.getFirstPlayerInput().equals(Figure.ROCK) && field.getSecondPlayerInput().equals(Figure.SCISSORS)) ||
                (field.getFirstPlayerInput().equals(Figure.SCISSORS) && field.getSecondPlayerInput().equals(Figure.PAPER)) ||
                (field.getFirstPlayerInput().equals(Figure.PAPER) && field.getSecondPlayerInput().equals(Figure.ROCK))) {
            return "win";
        } return "loose";

    }

    public void start() {
        showMenu();
        Integer input = getInput();
        while (!validateInput(input)) {
            input  = getInput();
        }

        Figure userChoice = convertChoice(input);
        Figure pcChoice = generatePCChoice();
        field.setFirstPlayerInput(userChoice);
        field.setSecondPlayerInput(pcChoice);
        field.showField();
        System.out.println(checkWinner());
    }
}
