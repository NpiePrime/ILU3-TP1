package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;


public class Utils {
	private static Random random = new Random();
	
	public static <U> boolean verifierRassemblement(List<U> liste) {
		boolean found = true;
		
		return found;
	}

	public static <U> U extraire(List<U> liste) {
		if (liste.isEmpty()) {
			throw new IllegalArgumentException("Liste vide");
		}
		int index = random.nextInt(liste.size());
		return liste.remove(index);
	}

	public static <U> U extraireIT(List<U> liste) {
		if (liste.isEmpty()) {
			throw new IllegalArgumentException("Liste vide");
		}
		ListIterator<U> iterator = liste.listIterator();
		int index = random.nextInt(liste.size());
		while (iterator.hasNext() && index > 0) {
			iterator.next();
			index--;
		}
		U element = iterator.next();
		iterator.remove();
		return element;
	}
	
	public static <U> List<U> melanger(List<U> liste) {
		List<U> listeMelangee = new ArrayList<>();
		while (!liste.isEmpty()) {
			listeMelangee.add(extraire(liste));
		}
		return listeMelangee;
	}
	
	public static <U> boolean verifierMelange(List<U> liste1, List<U> liste2) {
		boolean found = true;
		for (U u : liste1) {
			if (Collections.frequency(liste1, u)!=Collections.frequency(liste2, u)) {
				found = false;
			}
		}
		return found;
	}
	
	public static <U> List<U> rassembler(List<U> liste) {
        List<U> listeMelangee = new ArrayList<>(liste);
        List<U> listeRassemblee = new ArrayList<>();

        for (U element : listeMelangee) {
        	if (!listeRassemblee.contains(element)) {
                 for (int i = 0; i < Collections.frequency(listeMelangee, element); i++) {
 					listeRassemblee.add(element);
 				}
			}
        }
        return listeRassemblee;
    }
   
	
	

}
