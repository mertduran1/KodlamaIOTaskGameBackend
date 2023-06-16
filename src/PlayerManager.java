public class PlayerManager implements PlayerService{
    private MernisServiceAdapter mernisServiceAdapter;
    private PlayerValidationManager playerValidationManager;

    public PlayerManager(MernisServiceAdapter mernisServiceAdapter) {
        this.mernisServiceAdapter = mernisServiceAdapter;
    }
    @Override
    public void add(Player player) {
        if(mernisServiceAdapter.realPerson(player)) {
            System.out.println("Player added to the database : " + player.getFirstName() + " " + player.getLastName());
        }else {
            System.out.println("Not a real person!");
        }
    }
    @Override
    public void update(Player player) {
        System.out.println("Player updated");
    }

    @Override
    public void delete(Player player) {
        System.out.println("Player Deleted");
    }
}
