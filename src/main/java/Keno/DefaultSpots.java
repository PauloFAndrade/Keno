package Keno;

import java.util.*;

public class DefaultSpots implements GameMode{
    Scanner scan = new Scanner(System.in);

    public Set<Integer> setSpots() {
        System.out.println("How many numbers do you want to bet? The limit is 15.");
        int qtd = scan.nextInt();
        if(qtd > 15) {
            qtd = 15;
        }
        System.out.println("Insert the bet numbers separated by space. The proper range is [1, 80].");
        Set<Integer> spots = new TreeSet<>();
        for(int i = 0; i < qtd; i++) {
            int num = scan.nextInt();
            if(num >= 1 && num <= 80) {
                spots.add(num);
            }
        }
        System.out.println(spots);
        return spots;
    }
}
