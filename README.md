# bookmaker-parser
This is a project to extract odds from different bookmakers.

First version takes only odds from "La Liga" and "Champions League" and save them two different csv files.

# how to build it 
(Maven is needed https://maven.apache.org/install.html)

_mvn clean install_

# how to use it
By now, it can be use it executing the following command (you will need to be in the root project folder)

java -jar target/bookmaker-parser-1.0-SNAPSHOT.jar

After that, you should see something like this:

Getting La Liga odds from William's Hill...

Odd{time='29:33', localTeam='Sevilla', visitingTeam='Getafe', localWinnerOdd=1.73, tieOdd=3.2, visitingOdd=5.8}

Odd{time='Directo', localTeam='Barcelona', visitingTeam='Alavés', localWinnerOdd=1.1, tieOdd=10.0, visitingOdd=19.0}

Odd{time='20:00 UK', localTeam='Celta', visitingTeam='Real Betis', localWinnerOdd=1.75, tieOdd=3.8, visitingOdd=4.33}

Odd{time='20:00 UK', localTeam='Real Sociedad', visitingTeam='Deportivo', localWinnerOdd=1.5, tieOdd=4.4, visitingOdd=6.0}

Odd{time='12:00 UK', localTeam='Eibar', visitingTeam='Sevilla', localWinnerOdd=2.62, tieOdd=3.4, visitingOdd=2.62}

Odd{time='15:15 UK', localTeam='Real Betis', visitingTeam='Villarreal', localWinnerOdd=2.6, tieOdd=3.4, visitingOdd=2.62}

Odd{time='17:30 UK', localTeam='Alavés', visitingTeam='Celta', localWinnerOdd=2.75, tieOdd=3.2, visitingOdd=2.6}

Odd{time='19:45 UK', localTeam='Levante', visitingTeam='Real Madrid', localWinnerOdd=13.0, tieOdd=6.5, visitingOdd=1.2}

Odd{time='11:00 UK', localTeam='Getafe', visitingTeam='Leganés', localWinnerOdd=2.0, tieOdd=3.1, visitingOdd=4.2}

Odd{time='15:15 UK', localTeam='Espanyol', visitingTeam='Barcelona', localWinnerOdd=10.0, tieOdd=5.5, visitingOdd=1.28}

Odd{time='17:30 UK', localTeam='Girona', visitingTeam='Athletic Club', localWinnerOdd=2.62, tieOdd=3.25, visitingOdd=2.7}

Odd{time='19:45 UK', localTeam='Atlético Madrid', visitingTeam='Valencia', localWinnerOdd=1.55, tieOdd=4.0, visitingOdd=6.0}

Odd{time='20:00 UK', localTeam='Las Palmas', visitingTeam='Málaga', localWinnerOdd=2.25, tieOdd=3.4, visitingOdd=3.1}

Saving them to ./laLigaOdds.csv file...

Process finished

Getting Champions League odds from William's Hill...

Odd{time='19:45 UK', localTeam='Juventus', visitingTeam='Tottenham', localWinnerOdd=1.95, tieOdd=3.4, visitingOdd=4.0}

Odd{time='19:45 UK', localTeam='Basilea', visitingTeam='Man City', localWinnerOdd=8.5, tieOdd=4.8, visitingOdd=1.36}

Odd{time='19:45 UK', localTeam='Oporto', visitingTeam='Liverpool', localWinnerOdd=3.0, tieOdd=3.6, visitingOdd=2.2}

Odd{time='19:45 UK', localTeam='Real Madrid', visitingTeam='PSG', localWinnerOdd=2.3, tieOdd=3.5, visitingOdd=2.9}

Odd{time='19:45 UK', localTeam='Chelsea', visitingTeam='Barcelona', localWinnerOdd=3.3, tieOdd=3.6, visitingOdd=2.1}

Odd{time='19:45 UK', localTeam='Bayern Múnich', visitingTeam='Besiktas', localWinnerOdd=1.17, tieOdd=6.5, visitingOdd=15.0}

Odd{time='19:45 UK', localTeam='Sevilla', visitingTeam='Man Utd', localWinnerOdd=3.0, tieOdd=3.4, visitingOdd=2.25}

Odd{time='19:45 UK', localTeam='Shakhtar Donetsk', visitingTeam='Roma', localWinnerOdd=2.62, tieOdd=3.25, visitingOdd=2.7}

Saving them to ./championsLeagueOdds.csv file...

Process finished
