import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static String beverageType="";
    public static void main(String[] args) {
        OrderCounter orderCounter = new OrderCounter();
        Cook cook = new Cook();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to order?");
            System.out.println("(1) Waffle");
            System.out.println("(2) Drink");
            System.out.println("(Other) I have finished ordering.");

            int a = scanner.nextInt();
            if(a==1) {
                ArrayList<String> chocoList = new ArrayList<>();
                ArrayList<String> fruitList = new ArrayList<>();
                ArrayList<String> condimentList = new ArrayList<>();

                String waffleType = null;
                String answer = null;

                while (true) {
                    System.out.println("Which waffle do you want?");
                    System.out.println("(1) Square Waffle --- Rs. 200");
                    System.out.println("(2) Circular Waffle --- Rs. 150");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        answer = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (answer.equals("1")) {
                        waffleType = "Square Waffle";
                        System.out.println("*** Square Waffle is chosen.");
                        break;
                    } else if (answer.equals("2")) {
                        waffleType = "Circle Waffle";
                        System.out.println("*** Circular Waffle is chosen.");
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("");

                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Chocolate Types --------------------");
                    System.out.println("(1) White Chocolate --- Rs. 50");
                    System.out.println("(2) Dark Chocolate --- Rs. 60");
                    System.out.println("(Other) I finished the chocolate selection.");

                    int value = scan.nextInt();
                    if (value == 1) {
                        chocoList.add("White");
                        System.out.println("*** White Chocolate is chosen.");
                    } else if (value == 2) {
                        chocoList.add("Dark");
                        System.out.println("*** Dark Chocolate is chosen.");
                    } else break;
                }
                System.out.println("The selection of chocolates is completed.");
                System.out.println("");

                String[] chocoArr = new String[chocoList.size()];
                chocoArr = chocoList.toArray(chocoArr);


                WaffleOrder waffleOrder = new WaffleOrder(cook, waffleType, chocoArr);
                orderCounter.takeOrder(waffleOrder);
            }

            else if(a==2) {
                Scanner scanBeverage = new Scanner(System.in);
                System.out.println("-------------------- DRINKS --------------------");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- Drink Types --------------------");
                    System.out.println("(1) Tea --- Rs. 70");
                    System.out.println("(2) Coffee --- Rs. 150");
                    System.out.println("(3) Coca Cola --- Rs. 100");
                    System.out.println("(4) Ice Tea --- Rs. 120");
                    System.out.println("(5) Fanta --- Rs. 100");
                    System.out.println("(6) Sprite --- Rs. 100");
                    System.out.println("(Other) I finished the drink selection.");
                    int drink = scanBeverage.nextInt();
                    if(drink==1){
                        beverageType="Tea";
                        System.out.println("*** Tea is chosen.");
                    }
                    else if(drink==2){
                        beverageType="Coffee";
                        System.out.println("*** Coffee is chosen.");
                    }
                    else if(drink==3){
                        beverageType="Cola";
                        System.out.println("*** Coca Cola is chosen.");
                    }
                    else if(drink==4){
                        beverageType="Ice Tea";
                        System.out.println("*** Ice Tea is chosen.");
                    }
                    else if(drink==5){
                        beverageType="Fanta";
                        System.out.println("*** Fanta is chosen.");
                    }
                    else if(drink==6){
                        beverageType="Sprite";
                        System.out.println("*** Sprite is chosen.");
                    }
                    else{
                        break;
                    }
                }
                System.out.println("The selection of drinks is completed.");
                System.out.println("");

                BeverageOrder beverageOrder = new BeverageOrder(cook, beverageType);
                orderCounter.takeOrder(beverageOrder);
            }

            else{
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Thank You!");
                break;
            }
        }
    }
}
