package com.example.hackwestern10.dog_information;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Dictionary;
import java.util.Map;

public class DogInformationBase {
    public DogInformationSingle goldenRetriever = new DogInformationSingle("Male: 23-24 inches",
            "Female: 21.5-22.5 inches",
            "Male: 65-75 pounds",
            "Female: 55-65 pounds",
            "10-12 years",
            "     Opt for high-quality dog food suitable for the dog's life stage (puppy, adult, or senior) to ensure proper nutrition.Monitor calorie intake and weight to prevent obesity, a concern for some Golden Retrievers.\nUse treats in moderation, considering their role in training, and avoid excess to prevent obesity.\nLimit or avoid table scraps, especially those with cooked bones or high fat content.\nFamiliarize yourself with safe and unsafe human foods for dogs.\nConsult your vet for concerns regarding your dog's weight or diet.",
            "    Golden Retrievers, like most Sporting breeds, require ample daily exercise.\nInsufficient exercise may lead to undesirable behavior in Goldens.\nThey are suitable companions for long runs and bike rides.\nConsultation with a vet is advised before engaging in strenuous activities that may stress bones and joints.\nGoldens can get exercise through hunting trips, field trials, and participation in canine sports like agility, obedience, and tracking.");
    public DogInformationSingle unfound = new DogInformationSingle(
            "N/A",
            "N/A",
            "N/A",
            "N/A",
            "N/A",
            "N/A",
            "N/A");

}
