package com.tesnick.bookmakerparser;

import com.opencsv.CSVWriter;
import com.tesnick.bookmakerparser.model.Odd;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by tesnick on 28/01/18.
 */
public class OddsCSVWriter {

    public void writeOddsToCSVFile(List<Odd> laLigaOdds, String fileName) throws IOException {

        String timestamp = new SimpleDateFormat("yyyyMMddHHmm'.txt'").format(new Date());

        Writer writer = Files.newBufferedWriter(Paths.get("./" + fileName + "_" + timestamp + ".csv"));

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
    }

    private String[] createRow(Odd laLigaOdd) {

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
