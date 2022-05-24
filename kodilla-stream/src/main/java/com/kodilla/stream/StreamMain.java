package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;



public class StreamMain {

    public static void main(String[] args) {


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(" Polubiłem programowanie!", (text) -> "ABC" + text + "ABC"); //1
        poemBeautifier.beautify("Jazda szybko na motocyklu jest niebezpieczna.", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Jak zostac programista?", (text) -> text.toLowerCase());
        poemBeautifier.beautify("??? Wyrażenia lambda - to podejście funkcyjne ???",(text) ->  text.replace('?','!'));



    }
}
