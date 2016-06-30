package com.poec;

public class Main {


    public static void main(String[] args) {
        Etudiant Etudiant1 = new Etudiant("Tourman", "Benjamin", "2 rue Fénélon");
        System.out.println("Etudiant n°1 :");
        System.out.println("Nom : " + Etudiant1.getNom());
        System.out.println("Prénom : " + Etudiant1.getPrenom());
        System.out.println("Adresse : " + Etudiant1.getAdresse());
        System.out.println("Age : " + Etudiant1.getAge());
    }
}