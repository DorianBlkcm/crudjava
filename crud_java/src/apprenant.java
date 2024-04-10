import java.util.ArrayList;
import java.util.List;

// Classe apprenant
public class apprenant {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String adresse;
    private int nbAbsences;
    private boolean delegue;

    // Constructeur
    public apprenant(int id,String nom, Strin -w<g prenom, String email, String telephone, String adresse, int nbAbsences, boolean delegue) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.nbAbsences = nbAbsences;
        this.delegue = delegue;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbAbsences() {
        return nbAbsences;
    }

    public boolean isDelegue() {
        return delegue;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNbAbsences(int nbAbsences) {
        this.nbAbsences = nbAbsences;
    }

    public void setDelegue(boolean delegue) {
        this.delegue = delegue;
    }

    // Méthode pour afficher les informations de l'apprenant
    public void afficherApprenant() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Email : " + email);
        System.out.println("Téléphone : " + telephone);
        System.out.println("Adresse : " + adresse);
        System.out.println("Nombre d'absences : " + nbAbsences);
        System.out.println("Délégué : " + delegue);
    }

    // Méthode pour ajouter une absence
    public void ajouterAbsence() {
        nbAbsences++;
    }

    // Méthode pour supprimer une absence
    public void supprimerAbsence() {
        if (nbAbsences > 0) {
            nbAbsences--;
        }
    }

    // Méthode pour vérifier si l'apprenant est délégué
    public boolean estDelegue() {
        return delegue;
    }

    // Méthode pour vérifier si l'apprenant est absent
    public boolean estAbsent() {
        return nbAbsences > 0;

    }
}