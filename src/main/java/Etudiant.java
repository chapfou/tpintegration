package com.poec;

public class Etudiant extends Main {

    private String nom;

    private String prenom;

    private String adresse;

    private Integer age;

    public Etudiant(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.age = age; }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getAge() { return age; }

    public void setAge(Integer age) { this.age = age; }
}
