package com.tesnick.bookmakerparser.williamshill;

import com.tesnick.bookmakerparser.OddsCSVWriter;
import com.tesnick.bookmakerparser.model.Odd;

import java.io.IOException;
import java.util.List;

/**
 * Created by tesnick on 28/01/18.
 */
public class Application {

    public static void main(String[] args) throws IOException {

        WilliamsHillParser application = new WilliamsHillParser();
        OddsCSVWriter oddsCSVWriter = new OddsCSVWriter();

        System.out.println("Getting La Liga odds from William's Hill...");

        List<Odd> laLigaOdds = application.getLaLigaOdds();

        for (Odd ligaOdd : laLigaOdds) {
            System.out.println(ligaOdd);
        }

        System.out.println("Saving them to ./laLigaOdds.csv file...");

        oddsCSVWriter.writeOddsToCSVFile(laLigaOdds, "laLigaOdds");

        System.out.println("Process finished");

        System.out.println("Getting Champions League odds from William's Hill...");

        List<Odd> championsLeagueOdds = application.getChampionsLeagueOdds();

        for (Odd ligaOdd : championsLeagueOdds) {
            System.out.println(ligaOdd);
        }

        System.out.println("Saving them to ./championsLeagueOdds.csv file...");

        oddsCSVWriter.writeOddsToCSVFile(championsLeagueOdds, "championsLeagueOdds");

        System.out.println("Process finished");

        System.out.println("Getting Premiere odds from William's Hill...");

        List<Odd> premiereLeagueOdds = application.getPremiereOdds();

        for (Odd ligaOdd : premiereLeagueOdds) {
            System.out.println(ligaOdd);
        }

        System.out.println("Saving them to ./premiere.csv file...");

        oddsCSVWriter.writeOddsToCSVFile(premiereLeagueOdds, "premiere");

        System.out.println("Process finished");
    }
}
