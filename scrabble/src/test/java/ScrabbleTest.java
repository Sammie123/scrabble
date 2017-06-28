import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1a() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }
  @Test
  public void calculateScore_returnsScoreForTwoLetters_1b() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("b"));
  }
  @Test
  public void calculateScore_returnsScoreForTwoLetters_8d() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_3c() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("c"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_2d() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1e() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("e"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_4f() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("f"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_2g() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("g"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_4h() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("h"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1i() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("i"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_8j() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateScore("j"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_5k() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("k"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1l() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("l"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_3m() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("m"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1n() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("n"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1o() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("o"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_3p() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("p"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_10q() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("q"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1r() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("r"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1s() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("s"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1t() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("t"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1u() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("u"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_4v() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("v"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_4w() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("w"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_8x() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateScore("x"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_4y() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("y"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_10z() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("z"));
  }

}
