/**
 * MainAlert est la classe principale qui utilise la classe AlertMe pour afficher des messages.
 * Elle crée une instance de AlertMe et l'utilise pour afficher des messages sur la console et écrire dans un fichier.
 */
public class MainAlert {
    /**
     * La méthode main est le point d'entrée de toute application Java.
     * Elle crée une instance de AlertMe et l'utilise pour afficher un message sur la console et écrire un message dans un fichier.
     * @param args Il s'agit d'un tableau d'arguments de ligne de commande.
     */
    public static void main(String[] args) {
        // Affiche un message sur la console
        System.out.println("coucou");

        // Crée une instance de AlertMe
        // Cette ligne est commentée car elle n'est plus utilisée dans le code actuel
        // AlertMe alertMe = new AlertMe();

        // Utilise l'instance de AlertMe pour afficher un message sur la console
        // Cette ligne est commentée car elle n'est plus utilisée dans le code actuel
        // alertMe.doAlert("Hello World", 1);

        // Utilise l'instance de AlertMe pour écrire un message dans un fichier
        // Cette ligne est commentée car elle n'est plus utilisée dans le code actuel
        // alertMe.doAlert("Just Do It !", 2);

        // Définit le type d'alerte en fonction du premier argument passé à l'application
        int alertType;
        try {
            alertType = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("The first parameter must be an integer (1 for console, 2 for file)");
            return;
        }

        // Définit le message à afficher ou à écrire en fonction du deuxième argument passé à l'application
        String message = args[1];

        // Crée une instance de IAlert en fonction du type d'alerte
        IAlert alert;
        switch (alertType) {
            case 1:
                // Crée une instance de AlertLog pour afficher le message sur la console
                alert = new AlertLog();
                break;
            case 2:
                // Crée une instance de AlertFile pour écrire le message dans un fichier
                alert = new AlertFile();
                break;
            default:
                System.out.println("Invalid alert type. Use 1 for console or 2 for file.");
                return;
        }

        // Affiche le message sur la console ou l'écrit dans un fichier en fonction du type d'alerte
        alert.doAlert(message);
    }
}