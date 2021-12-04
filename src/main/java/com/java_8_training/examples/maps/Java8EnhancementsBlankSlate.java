package com.java_8_training.examples.maps;

import java.util.HashMap;
import java.util.Map;

public class Java8EnhancementsBlankSlate
{
    public static void main(String[] args)
    {
        final Product defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        // Lookup products, with a default alternative
        // Apply a function to generate a custom product with the given id
        // Use the replace function to start selling a bigger door
        // replace all products using an update function to increase their weight.
        // For each to print out all the entries in the map
    }
}
