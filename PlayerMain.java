import java.util.Scanner;

class Player {
    String name;
    int playerID;
    String country;

    Player(String name, int playerID, String country) {
        this.name = name;
        this.playerID = playerID;
        this.country = country;
    }

    void getPlayerDetails(Scanner scanner) {
        System.out.print("Enter player name: ");
        name = scanner.nextLine();
        System.out.print("Enter player ID: ");
        playerID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter player country: ");
        country = scanner.nextLine();
    }

    void displayPlayerDetails() {
        System.out.println("Player Name: " + name);
        System.out.println("Player ID: " + playerID);
        System.out.println("Player Country: " + country);
    }
}

class Cricket extends Player {
    int matches;
    int runs;
    int wickets;
    int catches;

    Cricket(String name, int playerID, String country) {
        super(name, playerID, country);
    }

    void getCricketDetails(Scanner scanner) {
        getPlayerDetails(scanner);
        System.out.print("Enter number of matches played: ");
        matches = scanner.nextInt();
        System.out.print("Enter total runs scored: ");
        runs = scanner.nextInt();
        System.out.print("Enter total wickets taken: ");
        wickets = scanner.nextInt();
        System.out.print("Enter total catches: ");
        catches = scanner.nextInt();
    }

    void displayCricketDetails() {
        displayPlayerDetails();
        System.out.println("Matches Played: " + matches);
        System.out.println("Runs Scored: " + runs);
        System.out.println("Wickets Taken: " + wickets);
        System.out.println("Catches: " + catches);
    }
}

class Football extends Player {
    int matches;
    int goals;

    Football(String name, int playerID, String country) {
        super(name, playerID, country);
    }

    void getFootballDetails(Scanner scanner) {
        getPlayerDetails(scanner);
        System.out.print("Enter number of matches played: ");
        matches = scanner.nextInt();
        System.out.print("Enter total goals scored: ");
        goals = scanner.nextInt();
    }

    void displayFootballDetails() {
        displayPlayerDetails();
        System.out.println("Matches Played: " + matches);
        System.out.println("Goals Scored: " + goals);
    }
}

class Tennis extends Player {
    int matches;
    int titles;

    Tennis(String name, int playerID, String country) {
        super(name, playerID, country);
    }

    void getTennisDetails(Scanner scanner) {
        getPlayerDetails(scanner);
        System.out.print("Enter number of matches played: ");
        matches = scanner.nextInt();
        System.out.print("Enter total titles won: ");
        titles = scanner.nextInt();
    }

    void displayTennisDetails() {
        displayPlayerDetails();
        System.out.println("Matches Played: " + matches);
        System.out.println("Titles Won: " + titles);
    }
}

public class PlayerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cricket cricketPlayer = new Cricket("", 0, "");
        Football footballPlayer = new Football("", 0, "");
        Tennis tennisPlayer = new Tennis("", 0, "");

        System.out.println("Enter Cricket Player Details:");
        cricketPlayer.getCricketDetails(scanner);
        System.out.println("\nCricket Player Details:");
        cricketPlayer.displayCricketDetails();

        System.out.println("\nEnter Football Player Details:");
        footballPlayer.getFootballDetails(scanner);
        System.out.println("\nFootball Player Details:");
        footballPlayer.displayFootballDetails();

        System.out.println("\nEnter Tennis Player Details:");
        tennisPlayer.getTennisDetails(scanner);
        System.out.println("\nTennis Player Details:");
        tennisPlayer.displayTennisDetails();

        scanner.close();
    }
}
