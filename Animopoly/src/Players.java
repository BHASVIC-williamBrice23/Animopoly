public class Players{
    private String Piece;
    private String personName;
    private int position=0;

    private int money=1500;

    private int miss=0;
    public Players(String piece,String Name){
        Piece=piece;
        personName=Name;
    }
    public int getMoney(){
        return money;
    }
    public int getPosition(){
        return position;
    }
    public String getPersonName(){
        return personName;
    }
    public String getPiece(){
        return Piece;
    }
    public void changeMoney(int Change){
        money=money+Change;
        if (money < 0){
            miss = 2147483647;
        }
    }
    public void changePos(int Pos){
        position=position+Pos;
        if(position>25){
            position=position-26;
            changeMoney(200);
        }
        if(position==0){
            changeMoney(200);
        }
        if(position==13){
            miss+=1;
        }
    }
//    public void checkBankrupt(){
//        if (money < 0){
//            miss = 2147483647;
//        }
//    }
    public int getMiss(){
        return miss;
    }
    public void DecreseMiss(){
        miss-=1;
    }
}