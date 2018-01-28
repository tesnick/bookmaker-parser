package com.tesnick.bookmakerparser.williamshill;

import com.tesnick.bookmakerparser.model.Odd;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tesnick on 28/01/18.
 */
public class WilliamsHillParser {

    private String SPAIN_HOME_URL = "http://sports.williamhill.es/bet_esp/es";

    private String HOME_LALIGA = "http://sports.williamhill.es/bet_esp/es/betting/t/338/LaLiga.html";

    public List<Odd> getLaLigaOdds() {

        List<Odd> oddList = new ArrayList<>();

        try {

            Document doc = Jsoup.connect(HOME_LALIGA).get();

            Elements newBetLiveHolders = doc.select("#newBetLiveHolder");

            if(newBetLiveHolders.size() > 2) {
                Element apuestasEnDirecto = newBetLiveHolders.get(0);
                oddList.addAll(parseApuestasEnDirecto(apuestasEnDirecto));
            }

            Element partidosFuturos = doc.select("#newBetLiveHolder").get(newBetLiveHolders.size()-1);

            oddList.addAll(parsePartidosFuturos(partidosFuturos));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return oddList;
    }

    private List<Odd> parseApuestasEnDirecto(Element apuestasEnDirecto) {

        List<Odd> oddList = new ArrayList<>();

        Element tbody = apuestasEnDirecto.getElementsByTag("tbody").first();

        for (Element tr : tbody.getElementsByTag("tr")) {

            try {

                Elements tdElements = tr.getElementsByTag("td");

                if(tdElements.size()>1) {

                    String time = tdElements.get(0).text();

                    String score = tdElements.get(1).text();

                    String teams = tdElements.get(2).wholeText().trim();

                    Float oddForLocalWinner = Float.parseFloat(tdElements.get(4).text());

                    Float oddForTie = Float.parseFloat(tdElements.get(5).text());

                    Float oddForVisitingWinner = Float.parseFloat(tdElements.get(6).text());

                    Odd odd = new Odd(time, teams, oddForLocalWinner, oddForTie, oddForVisitingWinner);
                    odd.setScore(score);

                    oddList.add(odd);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return oddList;
    }

    private List<Odd> parsePartidosFuturos(Element newBetLiveHolder) {

        List<Odd> oddList = new ArrayList<>();

        Element tbody = newBetLiveHolder.getElementsByTag("tbody").first();

        for (Element tr : tbody.getElementsByTag("tr")) {

            try {

                String time;

                Elements tdElements = tr.getElementsByTag("td");
                String trZeroText = tdElements.get(0).text();
                if (StringUtils.isEmpty(trZeroText)) {
                    time = "Directo";
                } else {
                    time = tdElements.get(1).text();
                }

                String teams = tdElements.get(2).text();

                Float oddForLocalWinner = Float.parseFloat(tdElements.get(4).text());

                Float oddForTie = Float.parseFloat(tdElements.get(5).text());

                Float oddForVisitingWinner = Float.parseFloat(tdElements.get(6).text());

                Odd odd = new Odd(time, teams, oddForLocalWinner, oddForTie, oddForVisitingWinner);
                oddList.add(odd);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return oddList;
    }
}
