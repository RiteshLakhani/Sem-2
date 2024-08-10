abstract class Vegetable {
    private String color;

    public Vegetable(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return getName() + " - Color: " + getColor();
    }
}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Potato";
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Brinjal";
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Tomato";
    }
}

public class VegetableDemo {
    public static void main(String[] args) {
        Potato potato = new Potato("Brown");
        Brinjal brinjal = new Brinjal("Purple");
        Tomato tomato = new Tomato("Red");

        System.out.println(potato.toString());
        System.out.println(brinjal.toString());
        System.out.println(tomato.toString());
    }
}
