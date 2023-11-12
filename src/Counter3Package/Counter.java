package Counter3Package;
import java.util.Scanner;
public class Counter {

    private int line;
    private int character;
    private final String text;

    public Counter(int myLine, int myCharacter, String myText) {
        line = myLine;
        character = myCharacter;
        text = myText;
    }

    public int getLine() {
        return line;
    }

    public int getCharacter() {
        return character;
    }

    public String getText() {
        return text;
    }

    public void counter() {

        System.out.println("Write a text for each row and press Enter");
        System.out.println("Close the program by typing the word \"stop\" ");

        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String text = scan.nextLine();
            if (text.equals("stop")) {
                break;
            }
            line++;
            character += text.length();
        }
    }

    public void printOut() {
        System.out.println("You have typed in " + line + " rows and " + character + " " +
                "characters excluding your word \"stop\" ");
    }

}
