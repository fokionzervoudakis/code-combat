package interviewcake.section_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_01 {
    private Problem_01 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_01();
    }

    @Test
    void itReturnsFalseWhenFlightTimeIsLessThanAllMovieTimes() {
        assertFalse(P.canTwoMoviesFillFlight(new int[] { 2, 4 }, 1));
    }

    @Test
    void itReturnsTrueWhenFlightTimeIsTheSumOfMoviesWithDifferentDurations() {
        assertTrue(P.canTwoMoviesFillFlight(new int[] { 2, 4 }, 6));
    }

    @Test
    void itReturnsFalseWhenFlightTimeIsLessThanOneMovieTime() {
        assertFalse(P.canTwoMoviesFillFlight(new int[] { 3, 8 }, 6));
    }

    @Test
    void itReturnsTrueWhenFlightTimeIsTheSumOfMoviesWithTheSameDuration() {
        assertTrue(P.canTwoMoviesFillFlight(new int[] { 3, 8, 3 }, 6));
    }

    @Test
    void itReturnsTrueWhenFlightTimeIsTheSumOfDifferentMoviePairs() {
        assertTrue(P.canTwoMoviesFillFlight(new int[] { 1, 2, 3, 4, 5, 6 }, 7));
    }

    @Test
    void itReturnsTrueWhenTheFirstMovieIsNotUsed() {
        assertTrue(P.canTwoMoviesFillFlight(new int[] { 4, 3, 2 }, 5));
    }

    @Test
    void itReturnsFalseWithOneMovie() {
        assertFalse(P.canTwoMoviesFillFlight(new int[] { 6 }, 6));
    }

    @Test
    void itReturnsFalseWithZeroMovies() {
        assertFalse(P.canTwoMoviesFillFlight(new int[0], 6));
    }
}
