package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class View {


    public static void showStarWars() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File inputFile = new File("./lab-papers-please/output/starwars.json");
        JsonNode data = mapper.readTree(inputFile).get("individuals");
        System.out.println("--------- Star Wars ---------");
        for(JsonNode entry : data){

            FilePrint.printEntry(entry);

        }
        System.out.println("-----------------------------");
    }
    public static void showHitchhiker() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        File inputFile = new File("C:/Users/caram/IdeaProjects/oop-course-repo/lab-papers-please/output/hitchhiker.json");
        JsonNode data = mapper.readTree(inputFile).get("individuals");
        System.out.println("--------- Hitchhiker ---------");
        for(JsonNode entry : data){

            FilePrint.printEntry(entry);

        }
        System.out.println("------------------------------");
    }
    public static void showMarvel() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        File inputFile = new File("C:/Users/caram/IdeaProjects/oop-course-repo/lab-papers-please/output/marvel.json");
        JsonNode data = mapper.readTree(inputFile).get("individuals");
        System.out.println("----------- Marvel -----------");
        for(JsonNode entry : data){

            FilePrint.printEntry(entry);

        }
        System.out.println("------------------------------");
    }
    public static void showRings() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        File inputFile = new File("C:/Users/caram/IdeaProjects/oop-course-repo/lab-papers-please/output/rings.json");
        JsonNode data = mapper.readTree(inputFile).get("individuals");
        System.out.println("----- Lord of the Rings ------");
        for(JsonNode entry : data){

            FilePrint.printEntry(entry);

        }
        System.out.println("------------------------------");
    }
}