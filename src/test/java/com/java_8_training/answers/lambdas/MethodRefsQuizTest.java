package com.java_8_training.answers.lambdas;

import com.java_8_training.problems.lambdas.TextFormatter;
import com.java_8_training.problems.lambdas.TitleFormatter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class MethodRefsQuizTest {

    @Test
    public void stringToIntegerQuiz() {
        Function<String, Integer> stringToInteger = Integer::parseInt;

        assertThat(2, is(stringToInteger.apply("2")));
    }

    @Test
    public void containsQuiz() {
        BiPredicate<List<String>, String> contains = List::contains;

        boolean doesItContainIt = contains.test(Arrays.asList("who", "how", "why"), "who");

        assertEquals(true, doesItContainIt);
    }

    @Test
    public void startsWithNumberQuiz() {
        Predicate<String> startsWithNumber = this::startsWithNumber;

        boolean doesItContainIt = startsWithNumber.test("1abc");

        assertEquals(true, doesItContainIt);
    }

    private boolean startsWithNumber(String string)
    {
        return Character.isDigit(string.charAt(0));
    }


    @Test
    public void formatText() {

        TextFormatter formatter = new TitleFormatter();

        String filmTitle = "the force aWakens";

        Function<String, String> formatText = formatter::format;

        assertEquals("The Force Awakens", formatText.apply(filmTitle));
    }
}
