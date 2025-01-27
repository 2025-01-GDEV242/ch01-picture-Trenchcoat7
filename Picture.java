/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Circle face;
    private Square eyeOne;
    private Square eyeTwo;
    private Triangle mouth;
    private Person body;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        face = new Circle();
        eyeOne = new Square();
        eyeTwo = new Square();
        mouth = new Triangle();
        body = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            face.changeColor("yellow");
            face.moveHorizontal(-140);
            face.moveVertical(20);
            face.changeSize(120);
            face.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        face.changeColor("black");
        eyeOne.changeColor("white");
        eyeTwo.changeColor("white");
        mouth.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        face.changeColor("yellow");
        eyeOne.changeColor("black");
        eyeTwo.changeColor("black");
        mouth.changeColor("black");
    }
}
