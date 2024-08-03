import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * Represents a virtual genie with name, happiness, and endurance for interactive user engagement.
 *
 * by Samhitha Srikar
 * 
 * 2/27/24
 * 
 */


public class Geniegotchi {
    
    //main method just to check original status (not asked)
    public static void main(String[] args) {
        Geniegotchi genie = new Geniegotchi();
        genie.genieInfo();
        genie.feed();
        genie.play();
        genie.askFortune();
        genie.genieInfo();
    }

    private String name;
    private int endurance;
    private int happiness;

    // constructor
    public Geniegotchi() {
        this.name = "Bob";
        this.endurance = 4;
        this.happiness = 3;
    }

    // set the name of the Geniegotchi
    public void setName(String newName) {
        this.name = newName;
        System.out.println("Genie's name set to: " + newName);
    }

    // display Geniegotchi information
    public void genieInfo() {
        System.out.println("Genie's name: " + name);
        System.out.println("Endurance level: " + endurance);
        System.out.println("Happiness level: " + happiness);
    }

    // get the current endurance level
    public int getEndurance() {
        return endurance;
    }

    // get the current happiness level
    public int getHappiness() {
        return happiness;
    }

    // feed the Geniegotchi
    public void feed() {
        if (endurance < 10) {
            endurance += 1;
            System.out.println("Genie has been fed. Endurance increased by 1.");
        } else {
            System.out.println("No, thanks... Genie is full!");
        }
    }

    // play with the Geniegotchi
    public void play() {
        if (happiness < 10) {
            happiness += 1;
            endurance -= 2;
            System.out.println("Genie is happy! Happiness increased by 1, endurance decreased by 2.");
        } else {
            System.out.println("No, thanks... Genie is too happy to play!");
        }
    }

    // ask the Geniegotchi for a fortune
    public void askFortune() {
        if (happiness > 6 && endurance > 5) {
            int ran = (int) (Math.random() * 100) + 1;
            try (BufferedReader br = new BufferedReader(new FileReader("fortunes.txt"))) {
                String fortune;
                for (int i = 1; i <= ran; i++) {
                    fortune = br.readLine();
                    if (i == ran) {
                        System.out.println("Genie's fortune: " + fortune);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            decreaseEnduranceAndHappiness();
        } else if (happiness > 6 && endurance <= 5) {
            System.out.println("Low endurance! Genie can't predict your fortune.");
            decreaseEnduranceAndHappiness();
        } else if (endurance > 5 && happiness <= 6) {
            System.out.println("Low happiness! Genie can't predict your fortune.");
            decreaseEnduranceAndHappiness();
        } else {
            System.out.println("Feed and play with the Geniegotchi to improve both endurance and happiness.");
        }
    }


    // reduce both endurance and happiness by 1
    private void decreaseEnduranceAndHappiness() {
        endurance -= 1;
        happiness -= 1;
    }
}


