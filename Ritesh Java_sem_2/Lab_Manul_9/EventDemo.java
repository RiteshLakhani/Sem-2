interface EventListener 
{
    void performEvent();
}

interface MouseListener extends EventListener 
{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListener extends EventListener
{
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener {

    //MouseListner interface//
    public void mouseClicked() 
    {
        System.out.println("Mouse clicked!");
    }

    public void mousePressed() 
    {
        System.out.println("Mouse pressed!");
    }

    public void mouseReleased() 
    {
        System.out.println("Mouse released!");
    }

    public void mouseMoved() 
    {
        System.out.println("Mouse moved!");
    }

    public void mouseDragged() 
    {
        System.out.println("Mouse dragged!");
    }

    // KeyListener interface//

    public void keyPressed() 
    {
        System.out.println("Key pressed!");
    }

    public void keyReleased() 
    {
        System.out.println("Key released!");
    }

    // EventListener interface//
    public void performEvent() 
    {
        System.out.println("Event performed!");
    }

    public static void main(String[] args) {
        
        EventDemo eventDemo = new EventDemo();

        //MouseListener methods
        eventDemo.mouseClicked();
        eventDemo.mousePressed();
        eventDemo.mouseReleased();
        eventDemo.mouseMoved();
        eventDemo.mouseDragged();

        //KeyListener methods
        eventDemo.keyPressed();
        eventDemo.keyReleased();

        //EventListener interface
        eventDemo.performEvent();
    }
}
