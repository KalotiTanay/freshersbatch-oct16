package myLambdaPKG;

class Orders{

    int orderID;
    int price;
    String status;

    public Orders(int orderID, int price, String status) {
        this.orderID = orderID;
        this.price = price;
        this.status = status;
    }

    public void display(){
        System.out.println("\nOrderID:"+this.orderID +"  Price: "+this.price +"  Status: "+this.status);
    }
}

interface check {
    public void check(Orders obj);
}
public class lambda2 {
    public static void main(String[] args) {
        Orders o1 = new Orders(1001,15000,"Accepted");
        Orders o2 = new Orders(1008,21500,"completed");
        Orders o3 = new Orders(1006,7500,"Accepted");
        Orders o4= new Orders(1079,15000,"dispatched");

        check c1 = (Orders obj)->{
          if (obj.price >10000 && (obj.status.equalsIgnoreCase("accepted")||obj.status.equalsIgnoreCase("completed")))
              obj.display();
        };

        c1.check(o1);
        c1.check(o2);
        c1.check(o3);
        c1.check(o4);
    }
}
