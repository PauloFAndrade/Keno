package Keno;

import java.util.*;

public class RandomSpots implements GameMode {
    Random random = new Random();
    int qnt = random.nextInt(15)+1;
    Set<Integer> spots = new TreeSet<>();

    public Set<Integer> setSpots(){
        int count = 0;
        while(count < qnt) {
            if(spots.add((random.nextInt(80)+1))) {
                count++;
            }
        }
        return spots;
    }
}
