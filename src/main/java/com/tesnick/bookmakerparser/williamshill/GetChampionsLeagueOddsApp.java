package com.tesnick.bookmakerparser.williamshill;

import com.tesnick.bookmakerparser.OddsCSVWriter;
import com.tesnick.bookmakerparser.model.Odd;

import java.util.List;

/**
 * Created by tesnick on 28/01/18.
 */
public class GetChampionsLeagueOddsApp {

    public static void main(String[] args) throws Exception {

        WilliamsHillParser application = new WilliamsHillParser();
        OddsCSVWriter oddsCSVWriter = new OddsCSVWriter();

        System.out.println("Getting Champions League odds from William's Hill...");

        List<Odd> laLigaOdds = application.getChampionsLeagueOdds();

        for (Odd ligaOdd : laLigaOdds) {
            System.out.println(ligaOdd);
        }

        System.out.println("Saving them to ./championsLeagueOdds.csv file...");

        oddsCSVWriter.writeOddsToCSVFile(laLigaOdds, "championsLeagueOdds");

        System.out.println("Process finished");
    }
}
