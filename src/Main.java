import be.ehb.gebruiker.Gebruiker;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner textInput = new Scanner(System.in);

        Gebruiker admin = new Gebruiker("Admin", "admin@ehb.be");


        try(ObjectOutputStream mObjectOutputStream = new ObjectOutputStream(
                                                     new FileOutputStream("admin.data"))){
            mObjectOutputStream.writeObject(admin);
        }catch(IOException io){
            System.out.println("fout met het wegschrijven naar het bestand");
        }


        try(ObjectInputStream mObjectInputStream = new ObjectInputStream(
                                                    new FileInputStream("admin.data"))){

            Gebruiker userData = (Gebruiker)mObjectInputStream.readObject();
            System.out.println(userData);
        } catch (IOException e) {
            System.out.println("fout met het inlezen van het bestand");
        } catch (ClassNotFoundException e) {
            System.out.println("opgeslagen gegevens zijn niet van het type 'gebruiker'");
        }





        /*
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
        //*/
    }
}