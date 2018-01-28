# bookmaker-parser
This is a project to extract odds from different bookmakers.

First version takes only odds from La Liga, Champions League and Premier League and save them in different csv files.

# how to build it 
(Maven is needed https://maven.apache.org/install.html)

_mvn clean install_

# how to use it
By now, it can be use it executing the following command (you will need to be in the root project folder)

java -jar target/bookmaker-parser-1.0-SNAPSHOT.jar

After that, you should see something like this:

Getting La Liga odds from William's Hill...

Odd{time='41:18', localTeam='Sevilla', visitingTeam='Getafe', localWinnerOdd=1.67, tieOdd=3.1, visitingOdd=7.0}

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

Getting Premiere odds from William's Hill...

Odd{time='19:45 UK', localTeam='Swansea', visitingTeam='Arsenal', localWinnerOdd=6.5, tieOdd=4.2, visitingOdd=1.5}

Odd{time='19:45 UK', localTeam='West Ham', visitingTeam='Crystal Palace', localWinnerOdd=2.75, tieOdd=3.2, visitingOdd=2.6}

Odd{time='20:00 UK', localTeam='Huddersfield', visitingTeam='Liverpool', localWinnerOdd=9.0, tieOdd=4.8, visitingOdd=1.35}

Odd{time='19:45 UK', localTeam='Newcastle', visitingTeam='Burnley', localWinnerOdd=2.2, tieOdd=3.1, visitingOdd=3.6}

Odd{time='19:45 UK', localTeam='Chelsea', visitingTeam='Bournemouth', localWinnerOdd=1.22, tieOdd=6.0, visitingOdd=12.0}

Odd{time='19:45 UK', localTeam='Southampton', visitingTeam='Brighton', localWinnerOdd=1.7, tieOdd=3.4, visitingOdd=5.5}

Odd{time='19:45 UK', localTeam='Everton', visitingTeam='Leicester', localWinnerOdd=2.87, tieOdd=3.1, visitingOdd=2.5}

Odd{time='20:00 UK', localTeam='Stoke', visitingTeam='Watford', localWinnerOdd=2.2, tieOdd=3.3, visitingOdd=3.3}

Odd{time='20:00 UK', localTeam='Man City', visitingTeam='West Brom', localWinnerOdd=1.12, tieOdd=8.5, visitingOdd=19.0}

Odd{time='20:00 UK', localTeam='Tottenham', visitingTeam='Man Utd', localWinnerOdd=2.25, tieOdd=3.25, visitingOdd=3.2}

Odd{time='12:30 UK', localTeam='Burnley', visitingTeam='Man City', localWinnerOdd=10.0, tieOdd=5.5, visitingOdd=1.28}

Odd{time='15:00 UK', localTeam='Man Utd', visitingTeam='Huddersfield', localWinnerOdd=1.18, tieOdd=6.5, visitingOdd=17.0}

Odd{time='15:00 UK', localTeam='West Brom', visitingTeam='Southampton', localWinnerOdd=2.75, tieOdd=3.0, visitingOdd=2.75}

Odd{time='15:00 UK', localTeam='Bournemouth', visitingTeam='Stoke', localWinnerOdd=2.05, tieOdd=3.5, visitingOdd=3.5}

Odd{time='15:00 UK', localTeam='Leicester', visitingTeam='Swansea', localWinnerOdd=1.61, tieOdd=3.6, visitingOdd=6.0}

Odd{time='15:00 UK', localTeam='Brighton', visitingTeam='West Ham', localWinnerOdd=2.6, tieOdd=3.0, visitingOdd=2.9}

Odd{time='17:30 UK', localTeam='Arsenal', visitingTeam='Everton', localWinnerOdd=1.33, tieOdd=5.0, visitingOdd=9.0}

Odd{time='14:15 UK', localTeam='Crystal Palace', visitingTeam='Newcastle', localWinnerOdd=2.1, tieOdd=3.25, visitingOdd=3.6}

Odd{time='16:30 UK', localTeam='Liverpool', visitingTeam='Tottenham', localWinnerOdd=2.0, tieOdd=3.75, visitingOdd=3.4}

Odd{time='20:00 UK', localTeam='Watford', visitingTeam='Chelsea', localWinnerOdd=6.5, tieOdd=4.2, visitingOdd=1.5}

Saving them to ./premiere.csv file...

Process finished