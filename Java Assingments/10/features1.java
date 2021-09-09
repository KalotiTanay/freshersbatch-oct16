package myJAVAPkg;

import java.util.function.Consumer;
class simpleInterest {
    int principle;
    double rate;
    int time;

    public simpleInterest(int principle, double rate, int time) {
        this.principle = principle;
        this.rate = rate;
        this.time = time;
    }
}

public class features1 {
    public static void main(String[] args) {

        simpleInterest SI1 = new simpleInterest(123000,5.2,10);

        Consumer<simpleInterest> calculate = p->{
            var total=p.time*p.principle * p.rate;
            total/=100;
            System.out.println(total);};
        calculate.accept(SI1);
    }
}
