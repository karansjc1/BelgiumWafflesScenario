package Beverage;

import java.util.Scanner;

public class Tea extends HotBeverage{
    double cost = 70;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding lemon");
    }

    //hook
    public boolean customerWantsCondiment(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost + 20;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like lemon? --- Rs. 20 (y/n)");

        Scanner sc=new Scanner(System.in);
        answer = sc.nextLine();

        return answer;
    }
}
