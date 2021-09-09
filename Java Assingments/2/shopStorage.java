import java.util.Scanner;

abstract class dessertItem{
    String itemName;
    double cost;

    public abstract double getCost();

    public dessertItem(String itemName,double cost){
        this.itemName=itemName;
        this.cost=cost;
    }
    public void display(){
        System.out.println(this.itemName+": "+this.getCost());

    }

}
class Candie extends dessertItem{
    public Candie(String itemName, int cost) {
        super(itemName, cost);
    }
    @Override
    public double getCost() {
        return (this.cost*60);
    }
}

class Cookie extends dessertItem{
    public Cookie(String itemName, double cost) {
        super(itemName, cost);
    }
    @Override
    public double getCost() {
        return (this.cost*70);
    }
}

class IceCream extends dessertItem{
    public IceCream(String itemName, double cost) {
        super(itemName, cost);
    }
    @Override
    public double getCost() {
        return this.cost;
    }
}


public class shopStorage {

    public static void main(String[] args) {
        dessertItem[] candie=new Candie[20];
        dessertItem[] iceCream=new  IceCream[20];
        dessertItem[] cookie= new Cookie[20];
        int userType;
        int cookieCount=0;
        int candyCount=0;
        int iceCount=0;
        Scanner sc = new Scanner(System.in);
        char flag ='y';
        while (flag=='y'){
            System.out.println("CHOOSE AN USER:");
            System.out.println("\n1.Customer");
            System.out.println("2.OWNER");
            System.out.println("\nEnter your choice: ");

            switch (sc.nextInt()){
                case 1:
                    System.out.println("hello customer!! What would you like to buy?");
                    displayItems();
                    System.out.println("Enter your choice: ");
                    switch (sc.nextInt()){
                        case 1:
                            placeOrder(cookie,cookieCount);
                            break;
                        case 2:
                            placeOrder(candie,candyCount);
                            break;
                        case 3:
                            placeOrder(iceCream,iceCount);
                    }
                    break;

                case 2:
                    System.out.println("What would you like to add?");
                    displayItems();
                    System.out.println("Enter your choice: ");
                    switch (sc.nextInt()){
                        case 1:
                            addItem(cookie,cookieCount);
                            cookieCount++;
                            break;
                        case 2:
                            addItem(candie,candyCount);
                            candyCount++;
                            break;
                        case 3:
                            addItem(iceCream,iceCount);
                            iceCount++;
                            break;
                        default:
                            System.out.println("invalid choice..!!");



                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

            System.out.println("\nDo you want to continue (y/n):");
            flag= sc.next().charAt(0);
        }
    }

    private static void displayItems() {
       System.out.println("Choose an item:");
        System.out.println("\n1.Cookie");
        System.out.println("2.Candie");
        System.out.println("3.IceCream");
    }

    private static void addItem(dessertItem[] item,int cookieCount){
        Scanner sc = new Scanner(System.in);
        String name;
        int cookieCost;
        System.out.println("Enter the name of the item: ");
        name= sc.next();
        System.out.println("Enter the cost: ");
        cookieCost= sc.nextInt();
        item[cookieCount]= new Cookie(name,cookieCost);
    }

    private static void placeOrder(dessertItem[] item, int count)
    {
        if (count<=0) {
            System.out.println("PLease ask OWNER to add items.");
        }
        else{
        Scanner in = new Scanner(System.in);
        System.out.println("AVAILABLE ITEMS:");
        for (int i =0;i< count;i++)
            item[i].display();
        String choice;
        System.out.println("Choose the ITEM you like to buy today :");
        choice= in.next();
        for (int i =0; i<count; i++)
            if (choice.equals(item[i].itemName)) {
                System.out.println("ORDER PLACED!");
                System.out.println("Total Cost(Rs): "+item[i].getCost());
                break;
            }
            else{
                System.out.println("Invalid input");
                break;
            }
        }
    }
}
