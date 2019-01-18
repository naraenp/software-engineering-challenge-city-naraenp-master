//Naraen Palanikumar
//1.14.2019
//Software Engineering Project
//This client will output the city with an applet

//IMPORTS
import java.util.Random;
import java.applet.Applet;
import java.awt.*;

public class SECNARAENclient extends Applet
{
    //VARIABLES
    private final int APPLET_WIDTH = 800;
    private final int APPLET_HEIGHT = 600;
    private final int HEIGHT_MIN = 100;
    private final int VARIANCE = 40;

    //initializes the building objects and make a random generator
    private SECNARAENclass figure1, figure2, figure3, figure4;
    Random generator = new Random();

    public void init () //constructor for applets
    {
        //the buildings
        figure1 = new SECNARAENclass(250, 450, Color.gray, 120, 100);
        figure2 = new SECNARAENclass(100, 300, Color.gray, 100, 250);
        figure3 = new SECNARAENclass(400, 250, Color.gray, 100, 300);
        figure4 = new SECNARAENclass(600, 150, Color.gray, 150, 400);

        //sets the size of the applet
        setSize (APPLET_WIDTH, APPLET_HEIGHT);
    }

    //paint method for drawing the buildings
    public void paint(Graphics page)
    {
        //draws ground, sky, and sun
        figure1.drawGS(page);
        figure1.drawSun(page);

        //draws buildings
        figure1.drawB(page);
        figure2.drawB(page);
        figure3.drawB(page);
        figure4.drawB(page);

        //draws windows
        figure1.drawWindows(page);
        figure2.drawWindows(page);
        figure3.drawWindows(page);
        figure4.drawWindows(page);

        //draws clouds
        figure1.drawClouds(page);
        figure2.drawClouds(page);
        figure3.drawClouds(page);
        figure4.drawClouds(page);

        //refresh rate of program
        try{
            //pause the program for a quarter second (in ms)
            Thread.sleep(500);
        }
        catch(InterruptedException e){}

        repaint(); //repaints the buildings continously

    }
}
