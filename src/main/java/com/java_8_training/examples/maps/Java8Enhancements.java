package com.java_8_training.examples.maps;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements
{
    public static void main(String[] args)
    {
        final Product defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        // Lookup products, with a default alternative
        Product result = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result);
        System.out.println(idToProduct.get(10));
        System.out.println();

        // Apply a function to generate a custom product with the given id
        result = idToProduct
            .computeIfAbsent(10, (id) -> new Product(id, "Custom Product", 10));
        System.out.println(result);
        System.out.println(idToProduct.get(10));
        System.out.println();

        // Use the replace function to start selling a bigger door
        result = idToProduct.replace(1, new Product(1, "Big Door", 50));
        System.out.println(result);
        System.out.println(idToProduct.get(1));
        System.out.println();

        // replace all products using an update function to increase their weight.
        idToProduct.replaceAll((key, oldProduct) ->
            new Product(oldProduct.getId(), oldProduct.getName(), oldProduct.getWeight() + 10));
        System.out.println(idToProduct);
        System.out.println();

        // For each to print out all the entries in the map
        idToProduct.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
