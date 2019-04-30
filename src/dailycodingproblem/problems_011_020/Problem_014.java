package dailycodingproblem.problems_011_020;

import annotation.PseudoRandom;

import static java.lang.Math.pow;
import static java.lang.Math.random;
import static java.lang.Math.sqrt;

/**
 Problem #14 [Medium] - Google
 */
class Problem_014 {
    /**
     Uses a simple Monte Carlo simulation to approximate the value of pi.
     <p>
     http://mathfaculty.fullerton.edu/mathews/n2003/montecarlopimod.html
     <p>
     Given a circle with radius r=1 inscribed within a square:
     <ul>
     <li>the area of the circle is {@code pi(r^2) = pi(1^2) = pi}
     <li>the area of the square is {@code 2(r^2) = 2(1^2) = 4}
     <li>the ratio of the area of the circle to the area of the square is
     {@code p = pi(r^2) / 2(r^2) = pi/4}
     <li>therefore {@code pi = 4p}
     </ul>

     @param n a sample size
     @return the value of pi
     */
    @PseudoRandom
    double pi(int n) {
        var m = 0;
        for (var i = 0; i < n; i++) {
            var x = random();
            var y = random();
            if (sqrt(pow(x, 2) + pow(y, 2)) <= 1) {
                m++;
            }
        }
        return 4 * ((double) m / n); // pi = 4(m/n) = 4p
    }

    public static void main(String[] args) {
        var P = new Problem_014();
        // pi = 3.14159265359
        System.out.println(P.pi(100_000_000));
    }
}
