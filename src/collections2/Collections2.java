/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author tommib
 */
public class Collections2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }
        
        System.out.println("ArrayList täytetty, koko: " + lista.size());
        
        Iterator iterator = lista.iterator();
        while (iterator.hasNext()) {
            if ((int)iterator.next() >= 5) {
                break;
            } 
            iterator.remove();
        }
        // Iteraattorin forEachRemaining
        iterator.forEachRemaining(s -> System.out.println(s));

        System.out.println("ArrayList iteroitu, koko: " + lista.size());
        System.out.println("Iteraattori muokkaa ArrayListia sitä mukaan, kun käy sitä läpi");
        
        // collectionin removeIf
        lista.removeIf(s -> s * 10 == 70);
        System.out.println(lista);

        /* Seuraavaksi sivun https://www.journaldev.com/2389/java-8-features-with-examples#java8-collection spiterator läpi täältä:
        https://www.baeldung.com/java-spliterator 
        
        "Takes a consumer that's used to consume elements of the Spliterator one by one sequantially?"
        mikä tämä "Consumer" on, jonka ottaa?
        "Base utility for streams" ! Eli tärkeä, mutta "especially" parallel ones? Parallel streamit ??
        */
        
    }

}
