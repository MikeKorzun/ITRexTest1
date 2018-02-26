package by;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "";
        try {
            text = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Remover result = new Remover();
        text = result.stepFour(text);
        text = result.stepOne(text);
        text = result.stepTwo(text);
        text = result.stepThree(text);
        System.out.println("Simplified text = "+text);
    }
}