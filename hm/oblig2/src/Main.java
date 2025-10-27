public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        World todaysWorld = new World(7, false);

        // Opprett to Robot-objekter
        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        Robot robot1 = new Robot("Dancatron 4000", 80.0, 1500, "B-Bot");
        Robot robot2 = new Robot("Spark-E", 50.0, 800, "Toaster");


        // print ut statusen til begge robottene
        System.out.println("Status til roboter: \n"+ robot1.reportStatus() + "\n\n" + robot2.reportStatus());

        // Sjekk om robotene kan gå til danseklubben
        // Sjekk om robotene kan gå til parken

         System.out.println(robot2.canDanceAtClub(todaysWorld));
        System.out.println(robot1.canGoToPark(todaysWorld));

    }
}