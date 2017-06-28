import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a word:");
    String stringUserLetter = myConsole.readLine();
    Scrabble scrabble = new Scrabble();
    Integer scrabbleResult = scrabble.calculateScore(stringUserLetter);

    System.out.println(scrabbleResult);
  }
}
