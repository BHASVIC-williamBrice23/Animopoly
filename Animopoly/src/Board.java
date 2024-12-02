import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Board extends JFrame {
    private JPanel MainPanel;
    private JTextArea start;
    private JTextArea squirrelTextArea;
    private JTextArea snakeTextArea;
    private JTextArea catTextArea;
    private JTextArea pigeonTextArea;
    private JTextArea mouseTextArea;
    private JTextArea ratTextArea;
    private JTextArea dearTextArea;
    private JTextArea turtleTextArea;
    private JTextArea hamsterTextArea;
    private JTextArea tigerTextArea;
    private JTextArea giraffeTextArea;
    private JTextArea chickenTextArea;
    private JTextArea missATurnTextArea;
    private JTextArea cowTextArea;
    private JTextArea goatTextArea;
    private JTextArea horseTextArea;
    private JTextArea ponyTextArea;
    private JTextArea blackBearTextArea;
    private JTextArea polarBearTextArea;
    private JTextArea koalaTextArea;
    private JTextArea kangarooTextArea;
    private JTextArea spiderTextArea;
    private JTextArea apeTextArea;
    private JTextArea monkeyTextArea;
    private JTextArea lionTextArea;
    private JTextField Dice1;
    private JButton nextPlayerButton;
    private JTextField Dice2;
    private JTextField name;
    private JTextField level;
    private JTextField price;
    private JTextField cost;
    private JTextField owned;
    private JTextArea deckTextArea;
    private JButton Buy;
    private JTextArea Description;
    private JPanel IncreaseLevel;
    private JTextField Owned1;
    private JTextField Owned2;
    private JTextField Owned3;
    private JTextField Owned5;
    private JTextField Owned6;
    private JTextField Owned7;
    private JTextField Owned8;
    private JTextField Owned9;
    private JTextField Cost1;
    private JTextField Rent1;
    private JButton levelUpButton;
    private JButton levelUpButton1;
    private JButton levelUpButton2;
    private JButton levelUpButton3;
    private JButton levelUpButton4;
    private JButton levelUpButton5;
    private JButton levelUpButton6;
    private JButton levelUpButton7;
    private JButton levelUpButton8;
    private JTextField Rent2;
    private JTextField Cost2;
    private JTextField Cost3;
    private JTextField Rent3;
    private JTextField Rent4;
    private JTextField Cost4;
    private JTextField Rent5;
    private JTextField Cost5;
    private JTextField Rent6;
    private JTextField Cost6;
    private JTextField Cost7;
    private JTextField Rent8;
    private JTextField Cost8;
    private JTextField Rent9;
    private JTextField Cost9;
    private JTextField Owned4;
    private JTextField Rent7;
    private JTextField playerTextField;
    private JTextField Owned10;
    private JTextField Owned11;
    private JTextField Owned12;
    private JTextField Cost10;
    private JTextField Cost11;
    private JTextField Cost12;
    private JTextField Rent10;
    private JTextField Rent11;
    private JTextField Rent12;
    private JButton levelUpButton9;
    private JButton levelUpButton10;
    private JButton levelUpButton11;
    private int Turn = -1;
    private String BeforeH = "start";
    private String BeforeD = "start";
    private String BeforeB = "start";
    public ArrayList<Animal> HatAnimals = new ArrayList<Animal>();
    public ArrayList<Animal> DogAnimals = new ArrayList<Animal>();
    public ArrayList<Animal> BoatAnimals = new ArrayList<Animal>();
    private int Hindex = 0;
    private int Dindex = 0;
    private int Bindex = 0;

    public Players Hat=new Players("","");
    public Players Dog=new Players("","");
    public Players Boat=new Players("","");
    private int HBuy=1;
    private int DBuy=1;
    private int BBuy=1;


    public Board(Players[] LivePlayers, Animal[] Anilist) {
        int NumofPlayers=LivePlayers.length;
        for (int i = 0; i < 11; i++) {
            HatAnimals.add(new Animal("", "", 0, 0, 0));
            DogAnimals.add(new Animal("", "", 0, 0, 0));
            BoatAnimals.add(new Animal("", "", 0, 0, 0));
        }
        JTextArea[] BoardParts = {start, squirrelTextArea, snakeTextArea, catTextArea, pigeonTextArea, mouseTextArea, ratTextArea, dearTextArea, turtleTextArea, hamsterTextArea, tigerTextArea, giraffeTextArea, chickenTextArea, missATurnTextArea, cowTextArea, goatTextArea, horseTextArea, ponyTextArea, blackBearTextArea, polarBearTextArea, koalaTextArea, kangarooTextArea, spiderTextArea, apeTextArea, monkeyTextArea, lionTextArea};
        Random random = new Random();
        JFrame frame = new JFrame("Simple JScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JScrollPane scrollPane = new JScrollPane(MainPanel);
        frame.add(scrollPane);
        frame.setVisible(true);
        JTextField[] Owned = {Owned1, Owned2, Owned3, Owned4, Owned5, Owned6, Owned7, Owned8, Owned9, Owned10, Owned11, Owned12};
        JTextField[] Cost = {Cost1, Cost2, Cost3, Cost4, Cost5, Cost6, Cost7, Cost8, Cost9, Cost10, Cost11, Cost12};
        JTextField[] Rent = {Rent1, Rent2, Rent3, Rent4, Rent5, Rent6, Rent7, Rent8, Rent9, Rent10, Rent11, Rent12};

        nextPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Turn += 1;

                if(NumofPlayers==1) {
                    Hat = LivePlayers[0];
                }
                if(NumofPlayers==2) {
                    Hat = LivePlayers[0];
                    Dog = LivePlayers[1];
                }
                if(NumofPlayers==3) {
                    Hat = LivePlayers[0];
                    Dog = LivePlayers[1];
                    Boat = LivePlayers[2];
                }
                if (Turn > NumofPlayers-1) {
                    Turn = 0;
                }
                int num = random.nextInt(1, 7);
                int number = random.nextInt(1, 7);
                int sum = num + number;
                Dice1.setText("Dice 1: " + num);
                Dice2.setText("Dice 2: " + number);
                if (Turn == 0&&NumofPlayers>0) {
                    if (num == number) {
                        Card Money_Change = Card.RandCard();
                        Hat.changeMoney(Money_Change.ChangeMoney);
                        deckTextArea.setText(Money_Change.Output);
                    } else {
                        deckTextArea.setText("");
                    }

                    if (Hat.getMiss() > 0) {
                        Description.setText(Hat.getPersonName() + " you miss a turn");
                        Hat.DecreseMiss();
                    } else {
                        HBuy=0;
                        playerTextField.setText("Hat, " + Hat.getPersonName());
                        BoardParts[Hat.getPosition()].setText(BeforeH);
                        Hat.changePos(sum);
                        Description.setText(Hat.getPersonName() + " you rolled " + (num) + " and " + (number) + " \nso you have moved to " + BoardParts[Hat.getPosition()].getText() + " \nyou have £" + Hat.getMoney());
                        BeforeH = BoardParts[Hat.getPosition()].getText();
                        BoardParts[Hat.getPosition()].setText(BeforeH + " H");
                        if (Hat.getPosition() == Dog.getPosition()&&NumofPlayers>1) {
                            BeforeH = BeforeD;
                            BeforeD = BeforeD + " H";
                        }
                        if (Hat.getPosition() == Boat.getPosition()&&NumofPlayers>2) {
                            BeforeH = BeforeB;
                            BeforeB = BeforeB + " H";
                        }
                        name.setText("name: " + Anilist[Hat.getPosition()].getName());
                        owned.setText("owned: " + Anilist[Hat.getPosition()].getOwned());
                        price.setText("price(to buy): " + Anilist[Hat.getPosition()].getAnimalPrice());
                        level.setText("level: " + Anilist[Hat.getPosition()].getAnimalLevel());
                        cost.setText("rent: " + Anilist[Hat.getPosition()].getAnimalRent());
                        if (Anilist[Hat.getPosition()].getOwned() == "" && Anilist[Hat.getPosition()].getAnimalPrice() < Hat.getMoney() && Hat.getPosition() != 13 && Hat.getPosition() != 0&&Turn==0){
                            Description.setText(Description.getText()+" \nyou can buy this property");
                        }
                        if (Anilist[Hat.getPosition()].getOwned() != "" && Anilist[Hat.getPosition()].getOwned() != "Hat") {
                            Hat.changeMoney(-Anilist[Hat.getPosition()].getAnimalRent());
                            Description.setText(Description.getText() + "\nyou have landed on an owned property \nyou need to pay £" + Anilist[Hat.getPosition()].getAnimalRent() + " \nyou now have £" + Hat.getMoney());
                            if (Anilist[Hat.getPosition()].getOwned() == "Boat") {
                                Boat.changeMoney(Anilist[Hat.getPosition()].getAnimalRent());
                                Description.setText(Description.getText() + "\nBoats money has increased to £" + Boat.getMoney());
                            } else {
                                Dog.changeMoney(Anilist[Hat.getPosition()].getAnimalRent());
                                Description.setText(Description.getText() + "\nDog money has increased to £" + Dog.getMoney());
                            }
                        }
                        Buy.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (Anilist[Hat.getPosition()].getOwned() == "" && Anilist[Hat.getPosition()].getAnimalPrice() < Hat.getMoney() && Hat.getPosition() != 13 && Hat.getPosition() != 0&&Turn==0) {
                                    Anilist[Hat.getPosition()].changeOwned("Hat");
                                    Hat.changeMoney(-Anilist[Hat.getPosition()].getAnimalPrice());
                                    Description.setText("you just bought " + Anilist[Hat.getPosition()].getName() + " \nyou now have £" + Hat.getMoney());
                                    HatAnimals.add(Hindex, Anilist[Hat.getPosition()]);
                                    HatAnimals.remove(HatAnimals.size()-1);
                                    Hindex += 1;
                                }
                            }
                        });
                        ArrayList<Animal> OwnedAnimals= HatAnimals;
                        Players player=Hat;
                        for(int i=0;i<(OwnedAnimals.size());i++){
                            Owned[i].setText("Name: "+(OwnedAnimals.get(i)).getName());
                            Cost[i].setText("Cost: "+(OwnedAnimals.get(i)).getAnimalPrice());
                            Rent[i].setText("New Rent: "+(OwnedAnimals.get(i)).getAnimalRent());
                        }

                        levelUpButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(player.getMoney()>(OwnedAnimals.get(0).getAnimalPrice())&&OwnedAnimals.get(0).getName()!=""&&Turn==0&&HBuy==0&&OwnedAnimals.get(0).getAnimalLevel()<4){
                                    HBuy+=1;
                                    OwnedAnimals.get(0).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(0)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(0).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(player.getMoney()>((OwnedAnimals.get(1)).getAnimalPrice())&&OwnedAnimals.get(1).getName()!=""&&Turn==0&&HBuy==0&&OwnedAnimals.get(1).getAnimalLevel()<4){
                                    HBuy+=1;
                                    OwnedAnimals.get(1).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(1)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(1).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(player.getMoney()>((OwnedAnimals.get(2)).getAnimalPrice())&&OwnedAnimals.get(2).getName()!=""&&Turn==0&&HBuy==0&&OwnedAnimals.get(2).getAnimalLevel()<4){
                                    HBuy+=1;
                                    OwnedAnimals.get(2).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(2)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(2).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(3)).getAnimalPrice())&&OwnedAnimals.get(3).getName()!=""&&Turn==0&&HBuy==0&&OwnedAnimals.get(3).getAnimalLevel()<4) {
                                    HBuy+=1;
                                    OwnedAnimals.get(3).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(3)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(3).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(4)).getAnimalPrice())&&OwnedAnimals.get(4).getName()!=""&&Turn==0&&HBuy==0&&OwnedAnimals.get(4).getAnimalLevel()<4) {
                                    HBuy+=1;
                                    OwnedAnimals.get(4).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(4)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(4).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton5.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(5)).getAnimalPrice())&&OwnedAnimals.get(5).getName()!=""&&Turn==0&&HBuy==0&&OwnedAnimals.get(5).getAnimalLevel()<4) {
                                    HBuy+=1;
                                    OwnedAnimals.get(5).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(5)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(5).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton6.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(6)).getAnimalPrice())&&OwnedAnimals.get(6).getName()!=""&&Turn==0&&HBuy==0&&OwnedAnimals.get(6).getAnimalLevel()<4) {
                                    HBuy+=1;
                                    OwnedAnimals.get(6).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(6)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(6).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton7.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(7)).getAnimalPrice())&&OwnedAnimals.get(7).getName()!=""&&Turn==0&&HBuy==0&&OwnedAnimals.get(7).getAnimalLevel()<4) {
                                    HBuy+=1;
                                    OwnedAnimals.get(7).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(7)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(7).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton8.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(8)).getAnimalPrice())&&OwnedAnimals.get(8).getName()!=""&&Turn==0&&HBuy==0&&OwnedAnimals.get(8).getAnimalLevel()<4) {
                                    HBuy+=1;
                                    OwnedAnimals.get(8).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(8)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(8).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton9.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(9)).getAnimalPrice())&&OwnedAnimals.get(9).getName()!=""&&Turn==0&&HBuy==0) {
                                    HBuy+=1;
                                    OwnedAnimals.get(9).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(9)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(9).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton10.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(10)).getAnimalPrice())&&OwnedAnimals.get(10).getName()!=""&&Turn==0&&HBuy==0) {
                                    HBuy+=1;
                                    OwnedAnimals.get(10).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(9)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(10).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                    }
                }
                if (Turn == 1&&NumofPlayers>1) {
                    if (num == number) {
                        Card Money_Change = Card.RandCard();
                        Dog.changeMoney(Money_Change.ChangeMoney);
                        deckTextArea.setText(Money_Change.Output);
                    } else {
                        deckTextArea.setText("");
                    }
                    if (Dog.getMiss() == 1) {
                        Description.setText(Dog.getPersonName() + " you miss a turn");
                        Dog.DecreseMiss();
                    } else {
                        DBuy=0;
                        playerTextField.setText("Dog, " + Dog.getPersonName());
                        BoardParts[Dog.getPosition()].setText(BeforeD);
                        Dog.changePos(sum);
                        Description.setText(Dog.getPersonName() + " you rolled " + (num) + " and " + (number) + " \nso you have moved to " + BoardParts[Dog.getPosition()].getText() + " \nyou have £" + Dog.getMoney());
                        BeforeD = BoardParts[Dog.getPosition()].getText();
                        BoardParts[Dog.getPosition()].setText(BeforeD + " D");
                        if (Dog.getPosition() == Boat.getPosition()&&NumofPlayers>2) {
                            BeforeD = BeforeB;
                            BeforeB = BeforeB + " D";
                        }
                        if (Dog.getPosition() == Hat.getPosition()) {
                            BeforeD = BeforeH;
                            BeforeH = BeforeH + " D";
                        }
                        name.setText("name: " + Anilist[Dog.getPosition()].getName());
                        owned.setText("owned: " + Anilist[Dog.getPosition()].getOwned());
                        price.setText("price(to buy): " + Anilist[Dog.getPosition()].getAnimalPrice());
                        level.setText("level: " + Anilist[Dog.getPosition()].getAnimalLevel());
                        cost.setText("rent: " + Anilist[Dog.getPosition()].getAnimalRent());
                        if (Anilist[Dog.getPosition()].getOwned() == "" && Anilist[Dog.getPosition()].getAnimalPrice() < Dog.getMoney() && Dog.getPosition() != 13 && Dog.getPosition() != 0&&Turn==1){
                            Description.setText(Description.getText()+" \nyou can buy this property");
                        }
                        if (Anilist[Dog.getPosition()].getOwned() != "" && Anilist[Dog.getPosition()].getOwned() != "Dog") {
                            Dog.changeMoney(-Anilist[Dog.getPosition()].getAnimalRent());
                            Description.setText(Description.getText() + "\nyou have landed on an owned property \nyou need to pay £" + Anilist[Dog.getPosition()].getAnimalRent() + " \nyou now have £" + Dog.getMoney());
                            if (Anilist[Dog.getPosition()].getOwned() == "Hat") {
                                Hat.changeMoney(Anilist[Dog.getPosition()].getAnimalRent());
                                Description.setText(Description.getText() + "\nHat money has increased to £" + Hat.getMoney());
                            } else {
                                Boat.changeMoney(Anilist[Dog.getPosition()].getAnimalRent());
                                Description.setText(Description.getText() + "\nBoats money has increased to £" + Boat.getMoney());
                            }
                        }
                        Buy.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (Anilist[Dog.getPosition()].getOwned() == "" && Anilist[Dog.getPosition()].getAnimalPrice() < Dog.getMoney() && Dog.getPosition() != 13 && Dog.getPosition() != 0&&Turn==1) {
                                    Anilist[Dog.getPosition()].changeOwned("Dog");
                                    Dog.changeMoney(-Anilist[Dog.getPosition()].getAnimalPrice());
                                    Description.setText("you just bought " + Anilist[Dog.getPosition()].getName() + " \nyou now have £" + Dog.getMoney());
                                    DogAnimals.add(Dindex, Anilist[Dog.getPosition()]);
                                    DogAnimals.remove(DogAnimals.size()-1);
                                    Dindex += 1;
                                }
                            }
                        });
                        ArrayList<Animal> OwnedAnimals= DogAnimals;
                        Players player=Dog;
                        for(int i=0;i<(OwnedAnimals.size());i++){
                            Owned[i].setText("Name: "+(OwnedAnimals.get(i)).getName());
                            Cost[i].setText("Cost: "+(OwnedAnimals.get(i)).getAnimalPrice());
                            Rent[i].setText("New Rent: "+(OwnedAnimals.get(i)).getAnimalRent());
                        }

                        levelUpButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(player.getMoney()>(OwnedAnimals.get(0).getAnimalPrice())&&OwnedAnimals.get(0).getName()!=""&&Turn==1&&DBuy==0&&OwnedAnimals.get(0).getAnimalLevel()<4){
                                    DBuy+=1;
                                    OwnedAnimals.get(0).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(0)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(0).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(player.getMoney()>((OwnedAnimals.get(1)).getAnimalPrice())&&OwnedAnimals.get(1).getName()!=""&&Turn==1&&DBuy==0&&OwnedAnimals.get(1).getAnimalLevel()<4){
                                    DBuy+=1;
                                    OwnedAnimals.get(1).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(1)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(1).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(player.getMoney()>((OwnedAnimals.get(2)).getAnimalPrice())&&OwnedAnimals.get(2).getName()!=""&&Turn==1&&DBuy==0&&OwnedAnimals.get(2).getAnimalLevel()<4){
                                    DBuy+=1;
                                    OwnedAnimals.get(2).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(2)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(2).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(3)).getAnimalPrice())&&OwnedAnimals.get(3).getName()!=""&&Turn==1&&DBuy==0&&OwnedAnimals.get(3).getAnimalLevel()<4) {
                                    DBuy+=1;
                                    OwnedAnimals.get(3).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(3)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(3).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(4)).getAnimalPrice())&&OwnedAnimals.get(4).getName()!=""&&Turn==1&&DBuy==0&&OwnedAnimals.get(4).getAnimalLevel()<4) {
                                    DBuy+=1;
                                    OwnedAnimals.get(4).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(4)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(4).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton5.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(5)).getAnimalPrice())&&OwnedAnimals.get(5).getName()!=""&&Turn==1&&DBuy==0&&OwnedAnimals.get(5).getAnimalLevel()<4) {
                                    DBuy+=1;
                                    OwnedAnimals.get(5).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(5)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(5).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton6.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(6)).getAnimalPrice())&&OwnedAnimals.get(6).getName()!=""&&Turn==1&&DBuy==0&&OwnedAnimals.get(6).getAnimalLevel()<4) {
                                    DBuy+=1;
                                    OwnedAnimals.get(6).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(6)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(6).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton7.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(7)).getAnimalPrice())&&OwnedAnimals.get(7).getName()!=""&&Turn==1&&DBuy==0&&OwnedAnimals.get(7).getAnimalLevel()<4) {
                                    DBuy+=1;
                                    OwnedAnimals.get(7).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(7)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(7).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton8.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(8)).getAnimalPrice())&&OwnedAnimals.get(8).getName()!=""&&Turn==1&&DBuy==0&&OwnedAnimals.get(8).getAnimalLevel()<4) {
                                    DBuy+=1;
                                    OwnedAnimals.get(8).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(8)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(8).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton9.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(9)).getAnimalPrice())&&OwnedAnimals.get(9).getName()!=""&&Turn==1&&DBuy==0) {
                                    DBuy+=1;
                                    OwnedAnimals.get(9).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(9)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(9).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton10.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(10)).getAnimalPrice())&&OwnedAnimals.get(10).getName()!=""&&Turn==1&&DBuy==0) {
                                    DBuy+=1;
                                    OwnedAnimals.get(10).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(9)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(10).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                    }
                }

                if (Turn == 2&&NumofPlayers>2) {
                    BBuy=0;
                    if (num == number) {
                        Card Money_Change = Card.RandCard();
                        Boat.changeMoney(Money_Change.ChangeMoney);
                        deckTextArea.setText(Money_Change.Output);
                    } else {
                        deckTextArea.setText("");
                    }
                    if (Boat.getMiss() == 1) {
                        Description.setText(Boat.getPersonName() + " you miss a turn");
                        Boat.DecreseMiss();
                    } else {
                        playerTextField.setText("Boat, " + Boat.getPersonName());
                        BoardParts[Boat.getPosition()].setText(BeforeB);
                        Boat.changePos(sum);
                        Description.setText(Boat.getPersonName() + " you rolled " + (num) + " and " + (number) + " \nso you have moved to " + BoardParts[Boat.getPosition()].getText() + " \nyou have £" + Boat.getMoney());
                        BeforeB = BoardParts[Boat.getPosition()].getText();
                        BoardParts[Boat.getPosition()].setText(BeforeB + " B");
                        if (Boat.getPosition() == Hat.getPosition()) {
                            BeforeB = BeforeH;
                            BeforeH = BeforeH + " B";
                        }
                        if (Boat.getPosition() == Dog.getPosition()) {
                            BeforeB = BeforeD;
                            BeforeD = BeforeD + " B";
                        }
                        name.setText("name: " + Anilist[Boat.getPosition()].getName());
                        owned.setText("owned: " + Anilist[Boat.getPosition()].getOwned());
                        price.setText("price(to buy): " + Anilist[Boat.getPosition()].getAnimalPrice());
                        level.setText("level: " + Anilist[Boat.getPosition()].getAnimalLevel());
                        cost.setText("rent: " + Anilist[Boat.getPosition()].getAnimalRent());
                        if (Anilist[Boat.getPosition()].getOwned() == "" && Anilist[Boat.getPosition()].getAnimalPrice() < Boat.getMoney() && Boat.getPosition() != 13 && Boat.getPosition() != 0&&Turn==2){
                            Description.setText(Description.getText()+" \nyou can buy this property");
                        }
                        if (Anilist[Boat.getPosition()].getOwned() != "" && Anilist[Boat.getPosition()].getOwned() != "Boat") {
                            Boat.changeMoney(-Anilist[Boat.getPosition()].getAnimalRent());
                            Description.setText(Description.getText() + "\nyou have landed on an owned property \nyou need to pay £" + Anilist[Boat.getPosition()].getAnimalRent() + " \nyou now have £" + Boat.getMoney());
                            if (Anilist[Boat.getPosition()].getOwned() == "Hat") {
                                Hat.changeMoney(Anilist[Boat.getPosition()].getAnimalRent());
                                Description.setText(Description.getText() + "\nHat money has increased to £" + Hat.getMoney());
                            } else {
                                Dog.changeMoney(Anilist[Boat.getPosition()].getAnimalRent());
                                Description.setText(Description.getText() + "\nDog money has increased to £" + Dog.getMoney());
                            }
                        }
                        Buy.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (Anilist[Boat.getPosition()].getOwned() == "" && Anilist[Boat.getPosition()].getAnimalPrice() < Boat.getMoney() && Boat.getPosition() != 13 && Boat.getPosition() != 0&&Turn==2) {
                                    Anilist[Boat.getPosition()].changeOwned("Boat");
                                    Boat.changeMoney(-Anilist[Boat.getPosition()].getAnimalPrice());
                                    Description.setText("you just bought " + Anilist[Boat.getPosition()].getName() + " \nyou now have £" + Boat.getMoney());
                                    BoatAnimals.add(Bindex, Anilist[Boat.getPosition()]);
                                    BoatAnimals.remove(BoatAnimals.size()-1);
                                    Bindex += 1;
                                }
                            }
                        });
                        ArrayList<Animal> OwnedAnimals= BoatAnimals;
                        Players player=Boat;
                        for(int i=0;i<(OwnedAnimals.size());i++){
                            Owned[i].setText("Name: "+(OwnedAnimals.get(i)).getName());
                            Cost[i].setText("Cost: "+(OwnedAnimals.get(i)).getAnimalPrice());
                            Rent[i].setText("New Rent: "+(OwnedAnimals.get(i)).getAnimalRent());
                        }

                        levelUpButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(player.getMoney()>(OwnedAnimals.get(0).getAnimalPrice())&&OwnedAnimals.get(0).getName()!=""&&Turn==2&&BBuy==0&&OwnedAnimals.get(0).getAnimalLevel()<4){
                                    BBuy+=1;
                                    OwnedAnimals.get(0).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(0)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(0).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(player.getMoney()>((OwnedAnimals.get(1)).getAnimalPrice())&&OwnedAnimals.get(1).getName()!=""&&Turn==2&&BBuy==0&&OwnedAnimals.get(1).getAnimalLevel()<4){
                                    BBuy+=1;
                                    OwnedAnimals.get(1).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(1)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(1).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(player.getMoney()>((OwnedAnimals.get(2)).getAnimalPrice())&&OwnedAnimals.get(2).getName()!=""&&Turn==2&&BBuy==0&&OwnedAnimals.get(2).getAnimalLevel()<4){
                                    BBuy+=1;
                                    OwnedAnimals.get(2).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(2)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(2).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(3)).getAnimalPrice())&&OwnedAnimals.get(3).getName()!=""&&Turn==2&&BBuy==0&&OwnedAnimals.get(3).getAnimalLevel()<4) {
                                    BBuy+=1;
                                    OwnedAnimals.get(3).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(3)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(3).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(4)).getAnimalPrice())&&OwnedAnimals.get(4).getName()!=""&&Turn==2&&BBuy==0&&OwnedAnimals.get(4).getAnimalLevel()<4) {
                                    BBuy+=1;
                                    OwnedAnimals.get(4).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(4)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(4).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton5.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(5)).getAnimalPrice())&&OwnedAnimals.get(5).getName()!=""&&Turn==2&&BBuy==0&&OwnedAnimals.get(5).getAnimalLevel()<4) {
                                    BBuy+=1;
                                    OwnedAnimals.get(5).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(5)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(5).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton6.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(6)).getAnimalPrice())&&OwnedAnimals.get(6).getName()!=""&&Turn==2&&BBuy==0&&OwnedAnimals.get(6).getAnimalLevel()<4) {
                                    BBuy+=1;
                                    OwnedAnimals.get(6).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(6)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(6).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton7.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(7)).getAnimalPrice())&&OwnedAnimals.get(7).getName()!=""&&Turn==2&&BBuy==0&&OwnedAnimals.get(7).getAnimalLevel()<4) {
                                    BBuy+=1;
                                    OwnedAnimals.get(7).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(7)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(7).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton8.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(8)).getAnimalPrice())&&OwnedAnimals.get(8).getName()!=""&&Turn==2&&BBuy==0&&OwnedAnimals.get(8).getAnimalLevel()<4) {
                                    BBuy+=1;
                                    OwnedAnimals.get(8).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(8)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(8).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton9.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(9)).getAnimalPrice())&&OwnedAnimals.get(9).getName()!=""&&Turn==2&&BBuy==0) {
                                    BBuy+=1;
                                    OwnedAnimals.get(9).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(9)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(9).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                        levelUpButton10.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (player.getMoney() > ((OwnedAnimals.get(10)).getAnimalPrice())&&OwnedAnimals.get(10).getName()!=""&&Turn==2&&BBuy==0) {
                                    BBuy+=1;
                                    OwnedAnimals.get(10).increaseLevel();
                                    player.changeMoney(-(OwnedAnimals.get(9)).getAnimalPrice());
                                    Description.setText(Description.getText()+"\nyou just upgraded "+OwnedAnimals.get(10).getName()+" \nyou now have £"+player.getMoney());
                                }
                            }
                        });
                    }
                }
            }
        });
    }
}