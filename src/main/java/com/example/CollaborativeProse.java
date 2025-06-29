package com.example;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.example.ExampleSentence;
import de.htw_berlin.fb4.proseapp_Shamanina.inplementations.SimpleSentence;


// import de.htw_berlin.fb4.examples.SimpleSentence;


public class CollaborativeProse {
    public static void main(String[] args) {
        ProseBuilder builder = new ProseBuilder();

        builder.register(new ExampleSentence());

        builder.register(new de.htw_berlin.prose.SimpleSentence("Manchmal führt der Umweg zum schönsten Ziel."));

        // Peer 2-Komponente (importiert oben)
        //builder.register(new SimpleSentence());
        builder.register(new SimpleSentence("In jedem Irrtum steckt oft mehr Erkenntnis als in mancher Wahrheit."));

        System.out.println(builder.get());

    }
}
