package com.janestreet;

import java.util.HashSet;

class Spreadsheet {
    private Cell[][] M;

    Spreadsheet(Cell[][] M) {
        this.M = M;
    }

    int getVal(int m, int n) {
        var visited = new HashSet<>();
        return M[m][n].getVal((RefCell cell) -> {
            if (visited.contains(cell)) {
                throw new RuntimeException();
            } else {
                visited.add(cell);
            }
        });
    }

    @FunctionalInterface
    public interface F {
        void visited(RefCell cell);
    }

    interface Cell {
        int getVal(F f);
    }

    static class ValCell implements Cell {
        private int val;

        ValCell(int val) {
            this.val = val;
        }

        @Override
        public int getVal(F f) {
            return val;
        }
    }

    static class RefCell implements Cell {
        private Cell c1;
        private Cell c2;

        RefCell(Cell c1, Cell c2) {
            this.c1 = c1;
            this.c2 = c2;
        }

        RefCell() {
            this(null, null);
        }

        void setRef1(Cell c1) {
            this.c1 = c1;
        }

        void setRef2(Cell c2) {
            this.c2 = c2;
        }

        @Override
        public int getVal(F f) {
            try {
                f.visited(this);
            } catch (RuntimeException e) {
                return (int) Float.NaN;
            }
            return c1.getVal(f) + c2.getVal(f);
        }
    }
}
