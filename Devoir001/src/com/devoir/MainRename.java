package com.devoir;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * La classe MainRename sert de point d'entrée pour l'application de renommage de fichiers.
 * Elle charge la configuration à partir d'un fichier de propriétés et initie le processus de renommage des fichiers.
 */
public class MainRename {
    public static void main(String[] args) {
        String propFilePath = System.getProperty("propfile");

        Properties properties = new Properties();
        // Charge les propriétés à partir du fichier de configuration
        try (InputStream input = new FileInputStream("config_rename.properties")) {
            properties.load(input);
        } catch (IOException ex) {
            System.out.println("Exception : " + ex);
        }

        // Crée une instance de RenameMe avec les propriétés chargées
        RenameMe renameMe = new RenameMe(properties);
        // Affiche le préfixe et le suffixe utilisés pour le renommage
        System.out.println("Préfixe : " + renameMe.getPrefix());
        System.out.println("Suffixe : " + renameMe.getSuffix());

        // Démarre le processus de renommage dans le répertoire spécifié
        String directoryPath = "/Users/alexis/Desktop/JAVA_ANGULAR/Java_Two_Batches/Devoir001/test_files";
        renameMe.renameAll(directoryPath);

        // Annuler le renommage des fichiers
        renameMe.undoRenameAll(directoryPath);

    }
}