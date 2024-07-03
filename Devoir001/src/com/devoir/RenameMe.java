package com.devoir;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.Properties;

/**
 * Une classe utilitaire pour renommer les fichiers dans un répertoire avec un préfixe et un suffixe spécifiés.
 */
public class RenameMe {
    private final String prefix;
    private final String suffix;

    /**
     * Construit une instance de RenameMe avec des valeurs de préfixe et de suffixe spécifiées dans un objet Properties.
     * Utilise "xxx_" comme préfixe et "_yyy" comme suffixe par défaut si non spécifié.
     *
     * @param properties Objet Properties contenant la configuration du préfixe et du suffixe.
     */
    public RenameMe(Properties properties) {
        this.prefix = properties.getProperty("prefix", "xxx_");
        this.suffix = properties.getProperty("suffix", "_yyy");
    }

    /**
     * Retourne le préfixe utilisé pour renommer les fichiers.
     *
     * @return La chaîne de caractères du préfixe.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Retourne le suffixe utilisé pour renommer les fichiers.
     *
     * @return La chaîne de caractères du suffixe.
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Renomme tous les fichiers dans le répertoire spécifié en ajoutant le préfixe et le suffixe configurés à chaque nom de fichier.
     * Conserve l'extension de fichier originale. Affiche un message d'erreur pour chaque fichier qui n'a pas pu être renommé.
     *
     * @param directoryPath Le chemin vers le répertoire contenant les fichiers à renommer.
     */
    public void renameAll(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        String baseName = FilenameUtils.getBaseName(file.getName());
                        String extension = FilenameUtils.getExtension(file.getName());
                        String newName = prefix + baseName + suffix + "." + extension;
                        File newFile = new File(directory, newName);
                        if (!file.renameTo(newFile)) {
                            System.out.println("Failed to rename: " + file.getName());
                        }
                    }
                }
            }
        } else {
            System.out.println("The provided path is not a directory.");
        }
    }
}