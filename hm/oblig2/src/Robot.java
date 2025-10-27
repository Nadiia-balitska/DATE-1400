public class Robot {
    // gi robotten 4 attributter: name, batteryLevel, distancetoPark og botType
    private String name;
    public double batteryLevel;
    public int distancetoPark;
    private String botType;

    // En utvidelse av oppgaven
    public Robot(String name, double batteryLevel, int distancetoPark, String botType){
        this.name = name;
        this.batteryLevel = batteryLevel;
        this.distancetoPark = distancetoPark;
        this.botType = botType;
    }

    public String reportStatus() {
        // Metode for å rapportere statusen til robotten

        // Endre metoden slik at den retunerer en tekst streng som forklarer statusen til roboten
        // eksempel: Dette er bot Dancatron 4000 av type B-Bot.
        // Denne enheten har 80.0 batterikapasitet igjen og bor 1500 meter fra parken.
        return "Dette er en bot " + name + " av type " + botType +
                ". \nDenne enheten har " + batteryLevel + " batterikapasitet igjen og bor "
                + distancetoPark + " meter fra parken.";}



    public boolean canGoToPark(World world) {
        // Metode for å sjekke om roboten kan gå til parken basert på omgivelsene

        // System.out.println(navn + " sjekker om det er mulig å gå til parken...");
         System.out.println(name + " sjekker om det er mulig å gå til parken...");

        double requiredBattery = distancetoPark / 100.0;

        // Sjekk om det regner
        if (world.getIsRaining()) {
            System.out.println(name + " kan ikke gå i parken fordi det regner");
            // skriv ut hvorfor boten ikke kan gå i parken med System.out.println
            return false;
        } else if(!world.isSunday()){
            System.out.println(name + " kan ikke gå i parken fordi det er ikke søndag");
            return false;
        } else if(batteryLevel < requiredBattery ){
            System.out.println(name + " kan ikke gå i parken fordi den har for lavt batteri ");
            return false;
        } else {
            System.out.println(name + " kan gå i parken");
        }


        // Sjekk om det er søndag. Kan bare gå i parken på søndager.

        // Sjekk batterinivå. En bot trenger 1% batterinivå per 100 meter for å gå til parken.

        return true;
    }


    public boolean canDanceAtClub(World world ){
        if(!botType.equals("B-Bot")){
            System.out.println(name + " får ikke komme inn og danse");
            return false;
        }
        if(batteryLevel <= 50){
            System.out.println(name + " har ikke nok batteri til å danse");
            return false;
        }
        if(world.getDay() % 7 != 0){
            System.out.println(name + " der er mandag så det er stengt");
            return false;
        }

        return true;
    }
    // lag en metode som heter canDanceAtClub, som sjekker om boten kan være med på danseklubben
    // bottypen må være av type B-Bot (hint .equals)
    // En bot trenger minimum 50% batterikapasitet for å være med
    // Det kan ikke være mandag. Da er danseklubben stengt.
}
