import java.time.LocalDate;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MernisServiceAdapter playerValidationManager = new PlayerValidationManager();

        Player player1 = new Player(1, "Mert", "Duran", LocalDate.of(1998, 03, 16), "123123123");
        Game game1 = new Game(1, "Cyberpunk", 69.99, 20.0, "Action", 5000);
        Campaign campaign1 = new Campaign(1, "Summer", 20);

        PlayerManager playerManager = new PlayerManager(playerValidationManager);
        playerManager.add(player1);

        GameManager gameManager = new GameManager();
        gameManager.add(game1);

        CampaingManager campaingManager = new CampaingManager();
        campaingManager.add(campaign1);
    }
}