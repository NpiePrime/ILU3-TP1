package testsFonctionnels;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import javax.print.event.PrintJobAttributeEvent;

import carte.*;
import utils.*;
import jeu.Joueur;
import jeu.Sabot;


public class Test {
    public static void main(String[] args) {
//        Sabot sabot = new Sabot(52);
//        sabot.ajouterFamilleCarte(new Attaque(3, Type.ACCIDENT), new Parade(3, Type.ACCIDENT), new Botte(1, Type.ACCIDENT));

        
//         Sabot sabot2 = new Sabot(89);
//         sabot2.ajouterFamilleCarte(new Attaque(8, Type.CREVAISON));
//         while (!sabot.estVide()) {
//             System.out.println(sabot.piocher());
//         }
       
    	/*TESTS TP2*/
        
//         JeuDeCartes jeu = new JeuDeCartes();
//         List<Carte> listeCarteNonMelangee = jeu.getListeCarte();
//         List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelangee);
//         System.out.println(listeCartes);
//
//         listeCartes = Utils.melanger(listeCartes);
//         System.out.println(listeCartes);
//         System.out.println("liste mélangée sans erreur ? "
//         + Utils.verifierMelange(listeCarteNonMelangee, listeCartes));
//         
//         listeCartes = Utils.rassembler(listeCartes);
//         System.out.println(listeCartes);
//         System.out.println("liste rassemblée sans erreur ? " + Utils.verifierRassemblement(listeCartes));
//         /*****************************************/
//         
//         JeuDeCartes jeu2 = new JeuDeCartes();
//         System.out.println(jeu2.checkCount());
         
         /*************************************/
         
         
        // while (!sabot.estVide()) {
        //         System.out.println("Je pioche " + sabot.piocher());
        // }


//        for (Carte carte : sabot) {
//            System.out.println("Je pioche " + carte);
//        }
//        
//        Carte carte1 = new Attaque(2, Type.ACCIDENT);
//        Carte carte2 = new Attaque(1, Type.ACCIDENT);
//        
//        System.out.println(carte1.equals(carte2));
        
//        JeuDeCartes jeuDeCartes = new JeuDeCartes();
//        System.out.println(jeuDeCartes.getListeCarte());
//        
//        JeuDeCartes jeu = new JeuDeCartes();
//        List<Carte> listeCarteNonMelangee = jeu.getListeCarte();
//        List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelangee);
//        System.out.println(listeCartes);
        
//        listeCartes = Utils.melanger(listeCartes);
//        System.out.println(listeCartes);
//        System.out.println("liste mélangée sans erreur ? " + Utils.verifierMelange(listeCarteNonMelangee, listeCartes));
//        listeCartes = Utils.rassembler(listeCartes);
//        System.out.println(listeCartes);
//        System.out.println("liste rassemblée sans erreur ? " + Utils.verifierRassemblement(listeCartes));
//        
//        Carte[] typesDeCartes = {new Botte(1, Type.FEU),new Botte(1, Type.CREVAISON), new Botte(1, Type.ESSENCE), new Botte(1, Type.ACCIDENT),
//    			new Attaque(5, Type.FEU), new Attaque(3, Type.ESSENCE), new Attaque(3, Type.CREVAISON), new Attaque(3, Type.ACCIDENT),
//    			new Parade(14, Type.FEU), new Parade(6, Type.ESSENCE), new Parade(6, Type.CREVAISON), new Parade(6, Type.ACCIDENT)};
//        List<Carte> liste = new ArrayList<>();
//        liste = Arrays.asList(typesDeCartes);
//        System.out.println(liste);
    	
    	/* TESTS TP3*/
    	
    	/*TEST getKM*/
    	
//    	Joueur joueur = new Joueur("");
//    	Borne borne = new Borne(1, 5);
//    	Borne borne2 = new Borne(2, 2);
//    	
//    	joueur.donner(borne);
//    	joueur.donner(borne2);
//    	
// 
//    	System.out.println(joueur.getKM());
    	
    	/*Test getLimite*/
//    	Joueur joueur = new Joueur("");
//    	
//    	Limite finlimite = new FinLimite(1);
//    	Limite debLimite = new DebutLimite(1);
//    	System.out.println("Pile limite vide :");
//    	System.out.println(joueur.getPileLimite());
//    	System.out.println(joueur.getLimite()+"\n");
//    	
//    	System.out.println("Sommet finLimite :");
//    	joueur.donner(debLimite);
//    	joueur.donner(finlimite);
//    	System.out.println(joueur.getPileLimite());
//    	System.out.println(joueur.getLimite()+"\n");
//    	
//    	System.out.println("Joueur est prioritaire:");
//    	Botte botte = new Botte(1, Type.FEU);
//    	joueur.donner(botte);
//    	System.out.println(joueur.getBottes());
//    	System.out.println(joueur.getLimite()+"\n");
//    	
//    	Joueur joueur2 = new Joueur("habib");
//    	System.out.println("Sinon :");
//    	joueur2.donner(debLimite);
//    	System.out.println(joueur2.getPileLimite());
//    	System.out.println(joueur2.getLimite()+"\n");
    	
    	/*Tests estBLoque*/
    	
//    	Joueur joueur = new Joueur("");
//    	joueur.donner(new Attaque(1, Type.FEU));
//    	System.out.println(joueur.estBloque());
//
//    	
//    	joueur.donner(new Botte(1, Type.FEU));
//    	System.out.println(joueur.estBloque());
//    	
//    	joueur.donner(new Attaque(1, Type.ACCIDENT));
//    	System.out.println(joueur.estBloque());
//    	
//    	joueur.donner(new Botte(1, Type.ACCIDENT));
//    	System.out.println(joueur.estBloque());
//    	
//    	joueur.donner(new Attaque(1, Type.ESSENCE));
//    	System.out.println(joueur.estBloque());
//    	
//    	joueur.donner(new Parade(1, Type.ESSENCE));
//    	System.out.println(joueur.estBloque());
//    	
//    	joueur.getBottes().clear();
//    	System.out.println(joueur.estBloque());
//    	
//    	joueur.donner(new Parade(1, Type.FEU));
//    	System.out.println(joueur.estBloque());
    

    	
    }

}
