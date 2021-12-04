package com.java_8_training.problems.lambdas;

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


    //TODO: refactor to use a method reference
    @Test
    public void stringToIntegerQuiz(){
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);

        assertThat(2, is(stringToInteger.apply("2")));
    }

    //TODO: refactor to use a method reference
    @Test
    public void containsQuiz(){
        BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);

        boolean doesItContainIt = contains.test(Arrays.asList("who", "how", "why"), "who");

        assertEquals(true, doesItContainIt);
    }

    //TODO: refactor to use a method reference
    @Test
    public void startsWithNumberQuiz() {
        Predicate<String> startsWithNumber = (string) -> startsWithNumber(string);

        boolean doesItContainIt = startsWithNumber.test("1abc");

        assertEquals(true, doesItContainIt);
    }

    private boolean startsWithNumber(String string)
    {
        return Character.isDigit(string.charAt(0));
    }

    
    //TODO: refactor to use a method reference
    @Test
    public void formatText() {

        TextFormatter formatter = new TitleFormatter();

        String filmTitle = "the force aWakens";

        Function<String, String> formatText = (String title) -> formatter.format(title);

        assertEquals("The Force Awakens", formatText.apply(filmTitle));
    }


}
