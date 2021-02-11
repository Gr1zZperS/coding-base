package ood.patterns.creational.factoryMethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtDocument implements InputDocument{

    @Override
    public String readData(String fileName) {

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
