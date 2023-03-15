import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class ToyStore {
    int id;
    String nameOfToy;
    int amount;
    int chanceOfWin;
    public String toString() {

        return nameOfToy;
        
        }
    
public static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public static ToyStore toyCreate() {
        int id = Integer.parseInt(prompt("id of a toy: "));
        String nameOfToy = prompt("Name of a toy: ");
        int amount = Integer.parseInt(prompt("Amount of toys: "));
        int chanceOfWin = Integer.parseInt  (prompt ("Chance of winning this toy"));
        return (new ToyStore (Integer.parseInt(id), nameOfToy, Integer.parseInt(amount), Integer.parseInt(chanceOfWin)));
    }

    public static void main(String[] args) {
        ToyStore seal = new ToyStore();
        seal.id = 1;
        seal.nameOfToy = "Тюлень";
        seal.amount = 1;
        seal.chanceOfWin = 5;

        ToyStore doll = new ToyStore();
        doll.id = 2;
        doll.nameOfToy = "Двухмерная тян";
        doll.amount = 1;
        doll.chanceOfWin = 20;

        ToyStore tamagochi = new ToyStore();
        tamagochi.id = 3;
        tamagochi.nameOfToy = "Тамагочи";
        tamagochi.amount = 1;
        tamagochi.chanceOfWin = 50;

        ToyStore duck = new ToyStore();
        duck.id = 4;
        duck.nameOfToy = "Резиновая уточка";
        duck.amount = 1;
        duck.chanceOfWin = 60;

        ToyStore dakimakura = new ToyStore();
        dakimakura.id = 5;
        dakimakura.nameOfToy = "Дакимакура";
        dakimakura.amount = 1;
        dakimakura.chanceOfWin = 10;

        ToyStore furby = new ToyStore();
        furby.id = 6;
        furby.nameOfToy = "Ферби";
        furby.amount = 1;
        furby.chanceOfWin = 30;

        ToyStore tetris = new ToyStore();
        tetris.id = 7;
        tetris.nameOfToy = "Тетрис";
        tetris.amount = 1;
        tetris.chanceOfWin = 70;

        ToyStore yoyo = new ToyStore();
        yoyo.id = 8;
        yoyo.nameOfToy = "Йо-йо";
        yoyo.amount = 1;
        yoyo.chanceOfWin = 40;

        System.out.println("In our store we have: " + seal.nameOfToy + ", " + doll.nameOfToy + ", " + tamagochi.nameOfToy + ", " + duck.nameOfToy + ", " + dakimakura.nameOfToy + ", " + furby.nameOfToy+ ", "+ tetris.nameOfToy +", "+ yoyo.nameOfToy);


        List<ToyStore> list = new ArrayList<>();
        
        list.add(0, seal);
        list.add(1, doll);
        list.add(2, tamagochi);
        list.add(3, duck);
        list.add(4, dakimakura);
        list.add(5, furby);
        list.add(6, tetris);
        list.add(7, yoyo);

        Random random = new Random();
        ToyStore yourToy = list.get(random.nextInt(list.size()));
        System.out.println("You have got the toy " + yourToy);



        
        

    }
    
}