public class CarnetCoordonnes {


    private Coordonnees[] Carnet = new Coordonnees[5];
    private int NbrCoordonnes;


    public int getNbrCoordonnes() {
        return NbrCoordonnes;
    }

    public void setNbrCoordonnes(int nbrCoordonnes) {
        NbrCoordonnes = nbrCoordonnes;
    }

    public CarnetCoordonnes()
    {

    }


    public CarnetCoordonnes(int NomCarnetCoordonnes)
    {
        this.NbrCoordonnes =  NomCarnetCoordonnes ;
    }


    public void Afficher()
    {
        for (Coordonnees c : Carnet){
            if (c != null){
                System.out.println(c);
            }

        }
    }



    public void Ajouter(Coordonnees c)
    {
        for (int i = 0; i < Carnet.length; i++) {
            if (Carnet[i] == null)
            {
                Carnet[i] = c;
                break;
            }
        }
    }



    public void RechercherCoordonnees(String nom,String prenom)
    {
        for (Coordonnees c : Carnet){
            if (c != null && c.getNom().equals(nom) && c.getPrenom().equals(prenom) ){
                System.out.println(c);
            }


        }



    }


}
