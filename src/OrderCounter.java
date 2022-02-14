// Invoker
public class OrderCounter {
    Command command;

    public void takeOrder(Command c){
        command = c;
        command.orderUp();
    }
}
