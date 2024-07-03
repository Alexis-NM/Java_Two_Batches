import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * AlertMe est une classe qui fournit une fonctionnalité pour alerter l'utilisateur.
 * Elle peut soit imprimer un message sur la console, soit l'écrire dans un fichier, en fonction du niveau d'alerte.
 */
public class AlertMe {

    /**
     * Cette méthode est utilisée pour alerter l'utilisateur.
     * @param rMsg C'est le message qui sera affiché ou écrit dans un fichier.
     * @param rLevel C'est le niveau d'alerte. S'il est de 1, le message sera imprimé sur la console.
     *               S'il est de 2, le message sera écrit dans un fichier.
     */
    @Deprecated
    public void doAlert(String rMsg, int rLevel){
        if (rLevel == 1){
            System.out.println(rMsg);
        } else if (rLevel == 2){
            writeToFile(rMsg);
        }
    }

    /**
     * Cette méthode est utilisée pour écrire un message dans un fichier.
     * @param message C'est le message qui sera écrit dans le fichier.
     */
    private void writeToFile(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("err_msg.log", true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture dans le fichier" + e);
        }
    }
}