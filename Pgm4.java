class Box {
    double length;
    double width;
    double height;

    Box() {
        length = -1;
        width = -1;
        height = -1;
    }

    Box(double len, double wid, double hgt) {
        length = len;
        width = wid;
        height = hgt;
    }

    Box(Box ob) {
        length = ob.length;
        width = ob.width;
        height = ob.height;
    }

    Box(double len){
        width=height=length=len;
    }

    double volume() {
        return length * width * height;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double wid, double hgt, double wt) {
        super(len, wid, hgt);
        weight = wt;
    }

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeight(double len, double wt){
        super(len);
        weight=wt;
    }
}

class Shipment extends BoxWeight {
    double cost;
    
    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double wid, double hgt, double wt, double c) {
        super(len, wid, hgt, wt);
        cost = c;
    }

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    Shipment(double len, double wt, double c){
        super(len,wt);
        cost=c;
    }
}
    
public class Pgm4{
    public static void main(String[] args){
        Shipment shipment1 =new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is "+ shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is "+ shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }
}