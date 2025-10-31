import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class App {
    
    public static void copiaFile(String input, String output) throws Exception {
        //apre il file sorgente e lo legge per copiarlo in quello destinazione
        File f1 = new File(input);
        Scanner leggi = new Scanner(f1);

        //crea il file di destinazione
        FileWriter scrivi = new FileWriter(output);
        while(leggi.hasNextLine()) {
            String s = leggi.nextLine();
            scrivi.write(s + "\n");
        }
        scrivi.close();
        leggi.close();
    }
    public static void main(String[] args) throws Exception {
        //prende in input il file sorgente e di destinazione
        Scanner scan = new Scanner(System.in);
        System.out.print("Scrivi il nome del file sorgente: ");
        String nomeSorgente = scan.nextLine();
        System.out.print("Scrivi il nome del file destinazione: ");
        String nomeDestinazione = scan.nextLine();
        scan.close();

        //copia input in output
        copiaFile(nomeSorgente, nomeDestinazione);
        System.out.println("Fine della copia di " + nomeSorgente + " in " + nomeDestinazione + ".");
    }
}
