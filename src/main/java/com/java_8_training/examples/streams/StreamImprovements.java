package com.java_8_training.examples.streams;

public class StreamImprovements
{
    public static void main(String[] args)
    {
        // 0. Every third number under 100
        // 1. Show that it never terminates
        // 2. use new iterate with filter method
        // 3. takeWhile / dropWhile
        // 4. Stream.ofNullable - looking up properties by name - Stream.of("app.config", "app.home", "user.home")

    }



    /*final String configurationDirectory =
            Stream.of("app.config", "app.home", "user.home")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)))
                .findFirst()
                .get();

        System.out.println(configurationDirectory);*/

}
