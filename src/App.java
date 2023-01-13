import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        FruitsSalad fruits1 = new FruitsSalad(new ArrayList<String>(){
            {
                add("strawberry");
                add("grape");
                add("acerola");
                add("mago");
            }
        });

        FruitsSalad fruits2 = new FruitsSalad(new ArrayList<String>(){
            {
                add("pear");
                add("cashew");
                add("strawberry");
                add("kiwi");
            }
        });

        System.out.println();
        for (String fruit1 : fruits1.getFruitsSalad()) {
            for (String fruit2 : fruits2.getFruitsSalad()) {
                if (fruit1.equals(fruit2)) {
                    System.out.println("Both fruits salad have " + fruit1 + "! :D");
                    return;
                }
            }
        }
        System.out.println("Both fruits salad have no fruit in common :/");
    }
}
