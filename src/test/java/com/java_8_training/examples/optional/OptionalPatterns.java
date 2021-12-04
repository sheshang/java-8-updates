package com.java_8_training.examples.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalPatterns {

    public static void main(String[] args) {

        //0. Show Stream findAny() long city name


        //1. Creating Optionals: Optional.of(), Optional.ofEmpty(), Optional.ofNullable

        //2. strToInt using Optional
        //Optional<Integer> number = strToInt("10");

        //3. get / orElse

        //5. map

        //6. getCarInsuranceNameWithOptional
        //7. flatMap
        //8. filter

        Insurance insurance = new Insurance("AXAUK");
        Car car = new Car(insurance);
        Person richard = new Person("Richard", car);

        System.out.println(getCarInsuranceName(richard));

    }


    public static String getCarInsuranceName(Person person){
        return person.getCar().getInsurance().getName();
    }
//
//    public static Optional<Integer> strToInt(String string) {
//        try {
//            return Optional.of(Integer.parseInt(string));
//        }
//        catch(NumberFormatException e) {
//            return Optional.empty();
//        }
//    }


    static class Person {
        private final String name;
        private final Car car;

        Person(String name, Car car) {
            this.name = name;
            this.car = car;
        }

        public Car getCar() {
            return car;
        }
    }

    static class Car {
        private final Insurance insurance;

        Car(Insurance insurance) {
            this.insurance = insurance;
        }

        public Insurance getInsurance() {
            return insurance;
        }
    }

    static class Insurance {
        private final String name;

        Insurance(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}