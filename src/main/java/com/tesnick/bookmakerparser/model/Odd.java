package com.tesnick.bookmakerparser.model;

/**
 * Created by tesnick on 28/01/18.
 */
public class Odd {

    private String time;

    private String score;

    private String localTeam;

    private String visitingTeam;

    private Float localWinnerOdd;

    private Float tieOdd;

    private Float visitingOdd;

    public Odd(String time, String teams, Float localWinnerOdd, Float tieOdd, Float visitingOdd) {

        this.time = time;
        this.localWinnerOdd = localWinnerOdd;
        this.tieOdd = tieOdd;
        this.visitingOdd = visitingOdd;

        String[] teamsSplitted = teams.split("₋");
        this.localTeam = teamsSplitted[0].replace("\u00A0","").trim();
        this.visitingTeam = teamsSplitted[1].replace("\u00A0","").trim();
    }

    public String getTime() {
        return time;
    }

    public String getLocalTeam() {
        return localTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public Float getLocalWinnerOdd() {
        return localWinnerOdd;
    }

    public Float getTieOdd() {
        return tieOdd;
    }

    public Float getVisitingOdd() {
        return visitingOdd;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Odd{" +
                "time='" + time + '\'' +
                ", localTeam='" + localTeam + '\'' +
                ", visitingTeam='" + visitingTeam + '\'' +
                ", localWinnerOdd=" + localWinnerOdd +
                ", tieOdd=" + tieOdd +
                ", visitingOdd=" + visitingOdd +
                '}';
    }
}
