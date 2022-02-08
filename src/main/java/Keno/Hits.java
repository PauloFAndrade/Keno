package Keno;

import java.util.Set;
import java.util.TreeSet;

public class Hits {
    private Set<Integer> hits = new TreeSet<>();

    public void calculateHits(Set<Integer> draw,Set<Integer> spots) {
        Set<Integer> aux = new TreeSet<>(spots);
        aux.retainAll(draw);
        hits = aux;
    }

    public void showHits() {
        System.out.println("You hit the following number(s): " + hits);
    }
    
    public int getHits() {
        return hits.size();
    }
}