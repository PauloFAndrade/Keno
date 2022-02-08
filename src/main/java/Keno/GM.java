package Keno;

import java.util.Set;

public class GM {
    public void start(Bet bet) {
        for(int i = 1; i <= bet.getRounds() ; i++) {
            System.out.println("This is round #" + i + ", and your bet is $" + bet.getBetPerRound() + ".");

            // create draw
            Draw draw = new Draw();
            draw.makeDraw();
            draw.showDraw();

            // calculate hits
            Hits hits = new Hits();
            hits.calculateHits(draw.getDraw(), bet.getSpots());
            hits.showHits();

            // calculate payout
            Payout payout = new Payout();
            payout.getPayoutRate(bet.getSpots().size(),hits.getHits());
            payout.showPayout(bet.getBetPerRound());

            // update wage
            bet.setWage(bet.getWage() - bet.getBetPerRound() + payout.getTotalPayout());
            bet.showWage();
        }
    }

}