import java.util.Scanner;

public class Animal
{
    private String name;
    private String owned;
    private int level;
    private int rent;
    private int price;

    public Animal(String newName, String newOwned, int newLevel, int newRent, int newPrice)
    {
        this.name = newName;
        this.owned = newOwned;
        this.level = newLevel;
        this.rent = newRent;
        this.price = newPrice;
    }

    public int getAnimalLevel()
    {
        return level;
    }
    public String getName(){
        return name;
    }
    public String getOwned(){
        return owned;
    }
    public int getAnimalPrice()
    {
        return price;
    }
    public int getAnimalRent()
    {
        return rent;
    }
    public void changeOwned(String player){
        owned=(player);
    }
    public void increaseLevel(){
        if (name == "Chicken" || name == "Cow"){
            rent = rent + 100;
        }
        else {
            level = level + 1;
            switch (level) {
                case 1:
                    rent = rent * 5;
                    break;
                case 2:
                    rent = rent * 3;
                    break;
                case 3, 4:
                    rent = rent * 2;
                    break;
                default:
                    break;
            }
        }
    }



}