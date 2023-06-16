public class GameManager  implements  GameService{
    @Override
    public void add(Game game) {
        System.out.println("Game Added With Name :  " + game.getGameName() + " Game Category : " + game.getGameCategory() + " Game Price : " + game.getGamePrice() +  " Game Discount : " +game.getDiscount() );
    }
    @Override
    public void delete(Game game) {
        System.out.println("Game Deleted With Name :  " + game.getGameName() + " Game Category : " + game.getGameCategory() + " Game Price : " + game.getGamePrice() +  " Game Discount : " +game.getDiscount() );
    }
}
