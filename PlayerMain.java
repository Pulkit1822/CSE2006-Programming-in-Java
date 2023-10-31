import java.util.Scanner;

class Player {
    private String name;
    private int playerId;
    private String country;

    // Constructor
    public Player(String name, int playerId, String country) {
        this.name = name;
        this.playerId = playerId;
        this.country = country;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Input method
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player's name: ");
        name = scanner.nextLine();
        System.out.println("Enter player's ID: ");
        playerId = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        System.out.println("Enter player's country: ");
        country = scanner.nextLine();
    }

    // Output method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Player ID: " + playerId);
        System.out.println("Country: " + country);
    }
}

class Cricket extends Player {
    private int matches;
    private int runs;
    private int wickets;
    private int catches;

    public Cricket(String name, int playerId, String country) {
        super(name, playerId, country);
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of matches played: ");
        matches = scanner.nextInt();
        System.out.println("Enter the total runs scored: ");
        runs = scanner.nextInt();
        System.out.println("Enter the total wickets taken: ");
        wickets = scanner.nextInt();
        System.out.println("Enter the total catches taken: ");
        catches = scanner.nextInt();
    }

    public void display() {
        super.display();
        System.out.println("Matches Played: " + matches);
        System.out.println("Total Runs: " + runs);
        System.out.println("Total Wickets: " + wickets);
        System.out.println("Total Catches: " + catches);
    }
}

class Football extends Player {
    private int matches;
    private int goals;

    public Football(String name, int playerId, String country) {
        super(name, playerId, country);
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of matches played: ");
        matches = scanner.nextInt();
        System.out.println("Enter the total goals scored: ");
        goals = scanner.nextInt();
    }

    public void display() {
        super.display();
        System.out.println("Matches Played: " + matches);
        System.out.println("Total Goals: " + goals);
    }
}

class Tennis extends Player {
    private int matches;
    private int titles;

    public Tennis(String name, int playerId, String country) {
        super(name, playerId, country);
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of matches played: ");
        matches = scanner.nextInt();
        System.out.println("Enter the number of titles won: ");
        titles = scanner.nextInt();
    }

    public void display() {
        super.display();
        System.out.println("Matches Played: " + matches);
        System.out.println("Total Titles: " + titles);
    }
}

public class PlayerMain {
    public static void main(String[] args) {
        Cricket cricketPlayer = new Cricket("John", 101, "England");
        Football footballPlayer = new Football("David", 102, "Spain");
        Tennis tennisPlayer = new Tennis("Serena", 103, "USA");

        System.out.println("Cricket Player Details:");
        cricketPlayer.input();
        System.out.println("\nPlayer Information:");
        cricketPlayer.display();

        System.out.println("\nFootball Player Details:");
        footballPlayer.input();
        System.out.println("\nPlayer Information:");
        footballPlayer.display();

        System.out.println("\nTennis Player Details:");
        tennisPlayer.input();
        System.out.println("\nPlayer Information:");
        tennisPlayer.display();
    }
}
