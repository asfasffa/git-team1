package test1.day08;

public class Car extends Velc {
    private String type;
public  Double price(int day){
    Double s=day*getPerice();
    if (day>7&&day<=30){
        s=day*getPerice()*0.9;
    }if (day>30&&day<=150){
        s=day*getPerice()*0.8;
    }if (day>150){
        s=day*getPerice()*0.7;
    }return  s;
}
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car){
            Car d= (Car) obj;
            if (d.getName().equals(getName())&&d.type.equals(this.type)){
                return true;
        }
        }   return   false;
    }

    public Car(String name, String type) {
        super(name);
        this.type = type;
    }
    public Car() {
    }

    public Car(String name, String id, double perice, String type) {
        super(name, id, perice);
        this.type = type;
    }

    public Car(String type) {
        this.type = type;
    }
}
