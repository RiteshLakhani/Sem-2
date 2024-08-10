abstract class Vegetable {
    private String color;
    
    public Vegetable(String color) {
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    //@Override
    public String toString() {
        return "Vegetable: color=" + color;
    }
}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }
    
    //@Override
    public String toString() {
        return "Potato: color=" + getColor();
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }
    
    //@Override
    public String toString() {
        return "Brinjal: color=" + getColor();
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }
    
  //  @Override
    public String toString() {
        return "Tomato: color=" + getColor();
    }
}

public class Pra_1 {
    public static void main(String[] args) {
        //Vegetable v1 = new Vegetable("green");
        //System.out.println(v1);
        
        Potato p1 = new Potato("brown");
        System.out.println(p1);
        
        Brinjal b1 = new Brinjal("purple");
        System.out.println(b1);
        
        Tomato t1 = new Tomato("red");
        System.out.println(t1);
    }
}
