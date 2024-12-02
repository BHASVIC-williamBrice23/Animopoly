import java.util.ArrayList;
public class AnimalsArray {

    public Animal[] animalArray() {
        // Create animal objects
        Animal[] animals = new Animal[26];
        animals[0] = (new Animal("", "", 0, 0, 0));
        animals[1] = (new Animal("Squirrel", "", 0, 6, 100));
        animals[2] = (new Animal("Snake", "", 0, 6, 100));

        animals[3] = (new Animal("Cat", "", 0, 10, 120));
        animals[4] = (new Animal("Pigeon", "", 0, 10, 120));
        animals[5] = (new Animal("Mouse", "", 0, 10, 140));

        animals[6] = (new Animal("Rat", "", 0, 14, 160));
        animals[7] = (new Animal("Deer", "", 0, 14, 160));
        animals[8] = (new Animal("Turtle", "", 0, 16, 180));

        animals[9] = (new Animal("Hamster", "", 0, 18, 200));
        animals[10] = (new Animal("Tiger", "", 0, 18, 200));
        animals[11] = (new Animal("Giraffe", "", 0, 20, 220));

        animals[12] = (new Animal("Chicken", "", 0, 30, 200));
        animals[13] = (new Animal("", "", 0, 0, 0));
        animals[14] = (new Animal("Cow", "", 0, 30, 200));

        animals[15] = (new Animal("Goat", "", 0, 22, 240));
        animals[16] = (new Animal("Horse", "", 0, 22, 240));
        animals[17] = (new Animal("Pony", "", 0, 24, 240));

        animals[18] = (new Animal("Black Bear", "", 0, 26, 260));
        animals[19] = (new Animal("Polar Bear", "", 0, 26, 260));
        animals[20] = (new Animal("Koala", "", 0, 28, 280));

        animals[21] = (new Animal("kangaroo", "", 0, 30, 300));
        animals[22] = (new Animal("Spider", "", 0, 30, 300));
        animals[23] = (new Animal("Ape", "", 0, 32, 320));

        animals[24] = (new Animal("Monkey", "", 0, 35, 350));
        animals[25] = (new Animal("Lion", "", 0, 50, 400));
        return animals;
    }
}