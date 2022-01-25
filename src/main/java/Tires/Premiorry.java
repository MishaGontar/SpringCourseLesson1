package Tires;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Premiorry implements Tire {
    private String name ;
    private String status ;
    private int price ;
    private String color;

    Premiorry(){}
    Premiorry(String n , String s , int p , String c){
        this.name = n;
        this.status = s;
        this.price = p;
        this.color = c;
    }

    @Override
    public void printTire() {
        System.out.println("This is " + name);
    }
}
