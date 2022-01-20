package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DiapasonFuncTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = DiapasonFunc.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = DiapasonFunc.diapason(5, 8, x -> 2 * x * x);
        List<Double> expected = Arrays.asList(50D, 72D, 98D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = DiapasonFunc.diapason(5, 8, x -> 4 * x);
        List<Double> expected = Arrays.asList(20D, 24D, 28D);
        assertThat(result, is(expected));
    }
}