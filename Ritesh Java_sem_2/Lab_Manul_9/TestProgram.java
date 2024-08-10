interface Transport 
{
    void deliver();
}

abstract class Animal implements Transport
{

    abstract void eat();
    
}

class Tiger extends Animal
{
    public void eat()
    {
        System.out.println("Tiger is non-vegetarian");    
    }
    
}

class Camel extends Animal
{
    public void eat()
    {
        System.out.println("Camel is vegetarian");    
    }

    public void deliver() 
    {
        System.out.println("Camel is drinking water.");
    }
}

class Deer extends Animal 
{
    public void eat()
    {
        System.out.println("Deer  is vegetarian");    
    }
}

class Donkey extends Animal
{
    public void eat()
    {
        System.out.println("Donkey is vegetarian");    
    }

    public void deliver() 
    {
        System.out.println("Donkey is good Animal.");
    }
}


class TestProgram 
{
    public static void main(String[] args) 
    {
        Animal[] a = new Animal[4];

        //a[0] = new Camel();
        a[0].eat();
        //((Camel) a[0]).deliver();

        //a[3] = new Donkey();
        a[3].eat();
        //((Donkey) a[3]).deliver();
    }
}
