package com.java_8_training.problems.streams;

import org.junit.Ignore;
import org.junit.Test;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class ReduceExerciseTest {

    @Test
    public void findMinimumValue() {
        Stream<Integer> input = Stream.of(5, 2, 200, 33, 150, 0);

        // TODO: find the lowest number in the stream
        int min = Integer.MAX_VALUE;

        assertThat(min, is(0));
    }

}
