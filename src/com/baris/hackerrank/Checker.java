package com.baris.hackerrank;

import java.util.Comparator;

/**
 * Created by barisilhan on 11/18/2018.
 */
public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {

        Player p1 = o1;
        Player p2 = o2;

        if (p1.score==p2.score) {
            return p1.name.compareTo(p2.name);
        }
        else if (p1.score < p2.score) {
            return 1;
        }
        return -1;
    }
}
