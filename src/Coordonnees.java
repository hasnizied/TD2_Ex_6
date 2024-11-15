public class Coordonnees {
    private String Nom;
    private String Prenom;
    private String Telephone;
    private String Adresse;


    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }


    public Coordonnees()
    {

    }


    public Coordonnees(String Nom, String Prenom, String Telephone, String Adresse)
    {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Telephone = Telephone;
        this.Adresse = Adresse;

    }
    @Override
    public String toString() {
        return "Coordonnees [Nom=" + Nom + ", Prenom=" + Prenom + ", Telephone=" + Telephone + ", Adresse=" + Adresse + "]";
    }


}
