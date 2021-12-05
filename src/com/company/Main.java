package com.company;

import java.util.LinkedList;

import java.util.Queue;

public class Main {


    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Astana");

        queue.offer("Almaty");

        queue.offer("Turkestan");

        queue.offer("Shymkent");


        System.out.println(queue.peek()); // en birinshi elementrt shigarady


        String town;

        while ((town = queue.poll()) != null) { // element bar kezge deyin shygarady

            System.out.println(town);

        }

    }

}
