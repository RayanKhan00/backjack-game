public class Money  {
    int money;
    public Money(){
        money=100;
    }

    //Subtract money if player bets
    public int addOrSubMoney(int bet){
        return money += bet;
    }


}
