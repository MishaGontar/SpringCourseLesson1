package Tires;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rosava implements Tire{
    private String name = "Rosava" ;
    private String status = "good";
    private int price = 100 ;

    public Rosava(){}
    public Rosava(String n , String s , int p){
        this.name = n;
        this.status = s;
        this.price = p;
    }

    @Override
    public void printTire() {
        System.out.println("This is " + name);
    }
}
