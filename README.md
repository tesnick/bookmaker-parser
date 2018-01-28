# bookmaker-parser
This is a project to extract odds from different bookmakers.

First version takes only odds from "La Liga" and save them in a csv file called laLigaOdds.csv

# how to build it (Maven is needed -> https://maven.apache.org/install.html)
mvn clean install

# how to use it
By now, it can be use it executing the following command (you will need to be in the root project folder)

java -jar target/bookmaker-parser-1.0-SNAPSHOT.jar

After that, you should see something like this:

*Getting La Liga odds from William's Hill...
Odd{time='4 mins', localTeam='Sevilla', visitingTeam='Getafe', localWinnerOdd=1.5, tieOdd=4.2, visitingOdd=6.5}
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
Process finished*
