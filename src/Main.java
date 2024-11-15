//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CarnetCoordonnes c =new CarnetCoordonnes();
        c.Ajouter(new Coordonnees("Ben Ali","Mohamed","654654","Tunis"));
        c.Ajouter(new Coordonnees("Ben Amor","Seif","678695","Sousse"));
        c.Ajouter(new Coordonnees("Selmani","Akram","256987","Sfax"));
       System.out.println("----------------------------------------------------");
        c.Afficher();

        System.out.println("----------------------------------------------------");
        c.RechercherCoordonnees("Ben Amor","Seif");
    }
}