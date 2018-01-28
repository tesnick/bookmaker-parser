package com.tesnick.bookmakerparser.williamshill;

import com.opencsv.CSVWriter;
import com.tesnick.bookmakerparser.model.Odd;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tesnick on 28/01/18.
 */
public class Application {

    public static void main(String[] args) throws Exception {

        WilliamsHillParser application = new WilliamsHillParser();

        System.out.println("Getting La Liga odds from William's Hill...");

        List<Odd> laLigaOdds = application.getLaLigaOdds();

        for (Odd ligaOdd : laLigaOdds) {
            System.out.println(ligaOdd);
        }

        System.out.println("Saving them to ./laLigaOdds.csv file...");

        Writer writer = Files.newBufferedWriter(Paths.get("./laLigaOdds.csv"));

        CSVWriter csvWriter = new CSVWriter(writer,
                ';',
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);

        String[] headerRecord = {"time", "localTeam", "visitingTeam", "localWinnerOdd", "tieOdd", "visitingOdd"};
        csvWriter.writeNext(headerRecord);

        for (Odd laLigaOdd : laLigaOdds) {

            String[] row = createRow(laLigaOdd);

            csvWriter.writeNext(row);
        }
        csvWriter.close();

        System.out.println("Process finished");
    }

    private static String[] createRow(Odd laLigaOdd) {

        List<String> rowList = new ArrayList<>();

        rowList.add(laLigaOdd.getTime());
        rowList.add(laLigaOdd.getLocalTeam());
        rowList.add(laLigaOdd.getVisitingTeam());
        rowList.add(Float.toString(laLigaOdd.getLocalWinnerOdd()));
        rowList.add(Float.toString(laLigaOdd.getTieOdd()));
        rowList.add(Float.toString(laLigaOdd.getVisitingOdd()));

        return rowList.toArray(new String[rowList.size()]);
    }
}
