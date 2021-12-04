package com.java_8_training.problems.lambdas;

public class ThisPuzzle {

    private int size = 5;

    public static void main(String[] args) {

        new ThisPuzzle().run();

    }

    private void run() {
        PrintMe printAnonymous = new PrintMe() {

            private int size = 3;

            @Override
            public void print() {
                System.out.println(this.size);
            }
        };

        printAnonymous.print(); // 3

        PrintMe printLambda = () -> {
            this.size = 2;
            System.out.println(this.size);
        };

        printLambda.print(); // 5
    }

    @FunctionalInterface
    interface PrintMe {
        void print();
    }

}
