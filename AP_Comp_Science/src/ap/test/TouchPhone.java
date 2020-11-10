package ap.test;

class CellPhone {
    public void print() {
        System.out.println("I'm a cellphone");
    }
}

public class TouchPhone extends CellPhone {
    
    public void print() {
        super.print();
        System.out.println("I'm a touch screen cellphone");
    }
    
    public static void main (String[] args) {
        TouchPhone p = new TouchPhone();
        p.print();
    }
}

/*
I'm a cellphone
I'm a touch screen cellphone
*/
