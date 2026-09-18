package util;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveSeating(String examId, String seatingData) {

        String fileName = examId + "_seating.txt";

        try {

            FileWriter writer = new FileWriter(fileName);

            writer.write(seatingData);

            writer.close();

            System.out.println("Seating file created: " + fileName);

        } catch (IOException e) {

            System.out.println("Error while saving seating file.");
            System.out.println(e.getMessage());
        }
    }
}
