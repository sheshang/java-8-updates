package com.java_8_training.problems.streams;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class FilterExerciseTest {

    @Test
    public void findEvenNumbers() {
        Stream<Integer> input = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // TODO: find only the even numbers
        List<Integer> evenNumbers = null;

        assertThat(evenNumbers, is(Arrays.asList(0, 2, 4, 6, 8, 10)));
    }

}
