package ua.lviv.iot.fourthLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class BikeDetailWriter {
    public void writeToFile(List<BikeDetail> bikeDetails) throws FileNotFoundException {
        File csvFile = new File("bikeDetailObjects.csv");
        PrintWriter out = new PrintWriter(csvFile);

        for (BikeDetail bikeDetail : bikeDetails) {
            out.println(bikeDetail.getHeaders());
            out.println(bikeDetail.toCSV());
        }

        out.close();
    }
}
