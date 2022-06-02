package pr2;

public class Main {
    public static void main(String[] args){
        BreadBins bins1 = new BreadBins("Gold", 5, "Gray");
        Thermoses thermoses1 = new Thermoses("Aurum", 1, "Yellow");
        FoodContainers food1 = new FoodContainers("Steel", 2, "Red");
        System.out.println(bins1);
    }

}
