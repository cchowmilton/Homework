import java.sql.SQLOutput;

public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall= new Conditionals();

    }//main method

    public Conditionals(){
        String question= "Will you win today?";
        System.out.println(question);

        int randomInt = (int) (Math.random()*11);
        System.out.println("Random no. between 0 and 10");
        if (randomInt == 0) {
            System.out.println("haha you lose");
        } else if (randomInt == 1) {
            System.out.println("Better than zero, try again.");
        } else if (randomInt == 2) {
            System.out.println("Getting better there.");
        } else if (randomInt == 3) {
            System.out.println("Without a doubt.");
        } else if (randomInt == 4) {
            System.out.println("Better not tell you now.");
        } else if (randomInt == 5) {
            System.out.println("Very doubtful.");
        } else if (randomInt == 6) {
            System.out.println("As I see it, yes.");
        } else if (randomInt == 7) {
            System.out.println("Outlook not so good.");
        } else {
            System.out.println("you win, congrats!");
        }


    }//constructor method
}
