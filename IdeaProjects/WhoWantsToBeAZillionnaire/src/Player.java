import java.util.ArrayList;

public class Player
{
    private String name;
    private int total;
    private boolean FiftyFifty;
    private boolean skip;
    private boolean NewQ;
    ArrayList<Player> players = new ArrayList<Player>();

    public void Setup(){
        //sets up the player array
        Player player1 = new Player("Player1",0,true,true,true);
        Player player2 = new Player("Player2",0,true,true,true);

        players.add(player1);
        players.add(player2);
    }

    public Player() {

    }
    //sets the object up
    Player(String name, int total,boolean FiftyFifty,boolean skip,boolean NewQ){
        this.name = name;
        this.total = total;
        this.FiftyFifty = FiftyFifty;
        this.skip = skip;
        this.NewQ = NewQ;
    }
//setters and getters
    public String getName(int user) {
        name = players.get(user).nameToString();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isFiftyFifty() {
        return FiftyFifty;
    }

    public void setFiftyFifty(boolean fiftyFifty) {
        FiftyFifty = fiftyFifty;
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public boolean isNewQ() {
        return NewQ;
    }

    public void setNewQ(boolean newQ) {
        NewQ = newQ;
    }
    public String toString(){
        return name +"  "+ "total:"+total ;
    }
    //below sets the appropriate to strings so they can be referenced in the other class for display
    public String nameToString(){
        return name;
}
    public int totalPass(){
        return total;
    }
    //used to add to the total if player gets question correct
    public int addtoTotal(int user){
        total = players.get(user).totalPass();
        total = total + 100;
        setTotal(total);
        return total;
    }
}
