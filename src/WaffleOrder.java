
public class WaffleOrder implements Command{
    Cook cook;
    String[] chocoList;
    String order;
    public WaffleOrder(Cook cook, String order, String[] chocoList){
        this.cook = cook;
        this.order = order;
        this.chocoList = chocoList;
    }

    @Override
    public void orderUp() {
        cook.waffleType = order;
        cook.chocoList = this.chocoList;
        cook.getOrder("Waffle");
    }
}
