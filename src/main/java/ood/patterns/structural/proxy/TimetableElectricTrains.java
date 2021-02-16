package ood.patterns.structural.proxy;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TimetableElectricTrains implements TimetableTrains {

    @Override
    public String[] getTimetable() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(
                    new FileReader("src/main/java/ood/patterns/structural/proxy/electric_trains.csv"));
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list.toArray(new String[list.size()]);
    }

}
