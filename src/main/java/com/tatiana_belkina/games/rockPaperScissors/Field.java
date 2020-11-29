package src.main.java.com.tatiana_belkina.javacore.rockPaperScissors;


public class Field {

    private Figure firstPlayerInput;
    private Figure secondPlayerInput;

    public Figure getFirstPlayerInput() {
        return firstPlayerInput;
    }

    public void setFirstPlayerInput(Figure figure) {
        this.firstPlayerInput = figure;
    }

    public Figure getSecondPlayerInput() {
        return secondPlayerInput;
    }

    public void setSecondPlayerInput(Figure secondPlayerInput) {
        this.secondPlayerInput = secondPlayerInput;
    }

    public void showField() {
        System.out.println("Player 1: " + this.firstPlayerInput);
        System.out.println("Player 2: " + this.secondPlayerInput);
    }
}
