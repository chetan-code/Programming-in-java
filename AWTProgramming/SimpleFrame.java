
import java.awt.*;

/**
 * Application window toolkit help us create GUI elements with various 
 * componenets such as buttons , checkbox etc.
 */
public class SimpleFrame
{
    public static void main (String args[]){
        //creating a frame with defualt constructor provided
        Frame frame = new Frame("Frame in Java");
        frame.resize(500, 500); //using method provided by AWT
        frame.setBackground(Color.blue);
        
        frame.show();//necesaary to display frame on screen
    }
}
