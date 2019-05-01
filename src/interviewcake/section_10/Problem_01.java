package interviewcake.section_10;

import static java.lang.Math.max;
import static java.lang.Math.min;

class Problem_01 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(1)
     <li>space_worst=O(1)
     </ul>

     @param r1 a rectangle
     @param r2 a second rectangle
     @return the area of overlap between {@code r1} and {@code r2}
     */
    Rect findOverlap(Rect r1, Rect r2) {
        var left = max(r1.left, r2.left);
        var width = min(r1.left + r1.width, r2.left + r2.width) - left;

        var bottom = max(r1.bottom, r2.bottom);
        var height = min(r1.bottom + r1.height, r2.bottom + r2.height) - bottom;

        if (width <= 0 || height <= 0) {
            return new Rect();
        } else {
            return new Rect(left, bottom, width, height);
        }
    }

    static class Rect {
        int left;
        int bottom;
        int width;
        int height;

        Rect(int left, int bottom, int width, int height) {
            this.left = left;
            this.bottom = bottom;
            this.width = width;
            this.height = height;
        }

        Rect() {
        }

        @Override
        public String toString() {
            return String.format("(left: %d, bottom: %d, width: %d, height: %d)", left, bottom, width, height);
        }
    }
}
