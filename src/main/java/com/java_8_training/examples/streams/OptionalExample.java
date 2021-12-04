package com.java_8_training.examples.streams;


import java.util.Optional;

public class OptionalExample
{
    public static void main(String[] args)
    {
        // 1. Optional.stream() - lookupSettingByName / Stream.of("app.config", "app.home", "user.home");
        // 2. Optional.ifPresentOrElse() - Booking.lookupBooking("LCY");
        // 3. Optional.or() findClient("aClient") / lookupCompanyDetails("anotherCompany");
        // 4. Optional.get() deprecation



        /*final String configurationDirectory =
            Stream.of("app.config", "app.home", "user.home")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)))
                .findFirst()
                .get();

        System.out.println(configurationDirectory);*/
    }


    static Optional<Client> findClient(final String clientId)
    {
        return "aClient".equals(clientId)
            ? Optional.of(new Client("London"))
            : Optional.empty();
    }

    static Optional<Client> lookupCompanyDetails(final String clientId)
    {
        return "anotherCompany".equals(clientId)
            ? Optional.of(new Client("Cambridge"))
            : Optional.empty();
    }

}
