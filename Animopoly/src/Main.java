import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of players max 3");
        int numPlayers = Integer.valueOf(scanner.nextLine());
        Players[] LivePlayers={};
        if(numPlayers==1) {
            System.out.println("please enter the names of the first player, they will use the Hat piece");
            String name1 = scanner.nextLine();
            Players Hat = new Players("Hat",name1);
            LivePlayers= new Players[]{Hat};
        }
        if(numPlayers==2) {
            System.out.println("please enter the names of the first player, they will use the Hat piece");
            String name1 = scanner.nextLine();
            Players Hat = new Players("Hat",name1);
            System.out.println("please enter the names of the second player, they will use the Dog piece");
            String name2 = scanner.nextLine();
            Players Dog = new Players("Dog",name2);
            LivePlayers= new Players[]{Hat, Dog};
        }
        if(numPlayers==3) {
            System.out.println("please enter the names of the first player, they will use the Hat piece");
            String name1 = scanner.nextLine();
            Players Hat = new Players("Hat",name1);
            System.out.println("please enter the names of the second player, they will use the Dog piece");
            String name2 = scanner.nextLine();
            Players Dog = new Players("Dog",name2);
            System.out.println("please enter the names of the third player, they will use the Boat piece");
            String name3 = scanner.nextLine();
            Players Boat = new Players("Boat",name3);
            LivePlayers= new Players[]{Hat, Dog, Boat};
        }

        AnimalsArray animals = new AnimalsArray();
        Card[] Deck = Card.Cards();
        Animal[] animalList=animals.animalArray();
        Board board=new Board(LivePlayers,animalList);
    }
}
