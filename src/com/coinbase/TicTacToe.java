package com.coinbase;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TicTacToe {
    private char[][] A = new char[3][3];

    private void play() {
        var R = new Random();
        int n = 0;
        outer:
        while (true) {
            while (true) {
                int x = R.nextInt(3);
                int y = R.nextInt(3);
                if (A[x][y] == '\0') {
                    char c = (n % 2 == 0) ? 'x' : 'o';
                    A[x][y] = c;
                    System.out.println(toString());
                    if (hasWon(c)) {
                        System.out.println(c + " won!");
                        break outer;
                    } else if (++n == 9) {
                        break outer;
                    }
                    continue outer;
                }
            }
        }
    }

    private boolean hasWon(char c) {
        // Check horizontal,
        if (A[0][0] == c && A[0][1] == c && A[0][2] == c) return true;
        if (A[1][0] == c && A[1][1] == c && A[1][2] == c) return true;
        if (A[2][0] == c && A[2][1] == c && A[2][2] == c) return true;

        // vertical,
        if (A[0][0] == c && A[1][0] == c && A[2][0] == c) return true;
        if (A[0][1] == c && A[1][1] == c && A[2][1] == c) return true;
        if (A[0][2] == c && A[1][2] == c && A[2][2] == c) return true;

        // and diagonal win states.
        if (A[0][0] == c && A[1][1] == c && A[2][2] == c) return true;
        if (A[2][0] == c && A[1][1] == c && A[0][2] == c) return true;

        return false;
    }

    @Override
    public String toString() {
        return Stream.of(A).map(Arrays::toString).collect(Collectors.joining("\n", "", "\n"));
    }

    public static void main(String[] args) {
        new TicTacToe().play();
    }
}
