# Projet Java - Exercices

Ce dépôt contient des exercices pratiques en Java, organisés dans deux dossiers : `devoir000` et `devoir001`. Ces exercices ont pour but de renforcer les compétences en programmation Java, notamment la manipulation des classes, interfaces, gestion des fichiers, et configuration de projet.

## Structure du Dépôt

- **devoir000** : Exercices portant sur la création et l'amélioration d'une classe de gestion d'alertes.
- **devoir001** : Exercices axés sur la manipulation des fichiers et des propriétés, ainsi que l'utilisation de bibliothèques externes.

## Lancer le Projet

### Prérequis

- Java Development Kit (JDK) installé sur votre machine.
- Un IDE Java (par exemple, IntelliJ IDEA, Eclipse) ou un éditeur de texte avec support Java.
- Git pour cloner le dépôt.

### Étapes pour Compiler et Exécuter

1. **Cloner le Dépôt** :

   ```sh
   git clone https://votre-repo.git
   cd votre-repo
   ```

2. **Compilation et Exécution** :

   #### Pour `devoir000` :

   1. Ouvrez un terminal et naviguez vers le dossier `devoir000` :
      ```sh
      cd devoir000
      ```
   
   2. Compilez les fichiers Java :
      ```sh
      javac -d bin src/com/devoir/*.java
      ```
   
   3. Exécutez le programme principal :
      ```sh
      java -cp bin com.devoir.Main
      ```

   #### Pour `devoir001` :

   1. Téléchargez la bibliothèque Commons IO et placez le fichier JAR dans un répertoire `lib` à la racine du projet. Vous pouvez télécharger la bibliothèque [ici](https://commons.apache.org/proper/commons-io/download_io.cgi).
   
   2. Ouvrez un terminal et naviguez vers le dossier `devoir001` :
      ```sh
      cd devoir001
      ```

   3. Compilez les fichiers Java en incluant le fichier JAR de Commons IO :
      ```sh
      javac -d bin -cp lib/commons-io-2.11.0.jar src/com/devoir/*.java
      ```

   4. Exécutez le programme principal :
      ```sh
      java -cp bin:lib/commons-io-2.11.0.jar com.devoir.MainRename
      ```