import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AlertFile implements IAlert {

    // Paramètre de fichier de destination
    private static final String FILE_NAME = "alert.log";

    public void doAlert(String rMsg) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(rMsg);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture dans le fichier" + e);
        }
    }
}