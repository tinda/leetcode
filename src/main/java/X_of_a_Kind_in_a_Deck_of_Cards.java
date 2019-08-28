import java.util.*;

/**
 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
 * <p>
 * In a deck of cards, each card has an integer written on it.
 * <p>
 * Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:
 * <p>
 * Each group has exactly X cards.
 * All the cards in each group have the same integer.
 */

public class X_of_a_Kind_in_a_Deck_of_Cards {

    public static void main(String[] args) {
        int[] deck = {1, 1, 1, 2, 2, 2, 3, 3, 3};

        System.out.println(hasGroupsSizeX(deck));
    }

    /**
     * Approach 1: Brute Force
     * Intuition
     *
     * We can try every possible X.
     *
     * Algorithm
     *
     * Since we divide the deck of N cards into say, K piles of X cards each, we must have N % X == 0.
     *
     * Then, say the deck has C_i copies of cards with number i. Each group with number i has X copies, so we must have C_i % X == 0. These are necessary and sufficient conditions.
     */
    public static boolean hasGroupsSizeX(int[] deck) {

        int N = deck.length;
        int[] count = new int[10000];
        for (int c : deck)
            count[c]++;

        List<Integer> values = new ArrayList();
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0)
                values.add(count[i]);

        search:
        for (int X = 2; X <= N; ++X)
            if (N % X == 0) {
                for (int v : values)
                    if (v % X != 0)
                        continue search;
                return true;
            }

        return false;
    }
}
