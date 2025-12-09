import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner textInput = new Scanner(System.in);

        //try with resources, zorgt achterliggend voor een close en beheert alles
        try (FileWriter writer = new FileWriter("test.txt")){
            String line = textInput.nextLine();
            while(! line.equals("STOP")){
                writer.append(line);
                line = textInput.nextLine();
            }
        }catch(IOException e){
            System.out.println("geen geldig pad of bestand");
        }


        File bestand = new File("C:\\Users\\david.van.steertegem\\OneDrive - Erasmushogeschool Brussel\\Bureaublad\\omdat_het_kan.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(bestand))){
            String gelezenLijn;
            while((gelezenLijn = reader.readLine()) != null){
                System.out.println(gelezenLijn);
            }

        }catch(FileNotFoundException fnfe){
            System.out.println("bestand niet gevonden, controleer je pad");
        }catch(IOException ioe){
            System.out.println("Probleem met het bestand");
        }


    }
}