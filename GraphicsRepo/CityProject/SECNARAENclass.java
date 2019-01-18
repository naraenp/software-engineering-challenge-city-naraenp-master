//Naraen Palanikumar
//1.14.2019
//Software Engineering Project
//This class has the stuff to make the buildings

import java.awt.*; //this imports the color class
import java.util.Random;

public class SECNARAENclass implements Runnable
{
    //VARIABLES
    private int baseX;     //start x of rect, bl
    private int baseY;     //start y of rect, bl
    private Color color;   //color of building
    private int width;     //width building, start from left
    private int height;    //height building

    //random generator initialized
    Random generator = new Random();

    //building default constructor
    public SECNARAENclass (int center, int bottom, Color shade, int w, int h)
    {
        //sets the starting point of the rectangle to be drawn
        baseX = center;
        baseY = bottom;

        //sets color of building
        color = shade;

        //width and height of building
        width = w;
        height = h;
    }

    //draws ground and sky
    public void drawGS(Graphics page)
    {
        //sets the color of the ground to green
        page.setColor(Color.green);

        //Ground
        page.fillRect(0, 550, 800, 50);

        //sets the color of the sky to blue
        page.setColor(Color.blue);

        //Sky
        page.fillRect(0, 0, 800, 550);
    }

    //draws buildings
    public void drawB(Graphics page)
    {
        //sets the color of the buildings
        page.setColor(color);

        //One Building or rectangle
        page.fillRect(baseX, baseY, width, height);
    }

    //draws windows
    public void drawWindows(Graphics page){
        //sets the floors and columns to use
        int floors = 4;
        int col = 4;

        //iterator to draw the windows for the buildings in a loop
        while(floors < height){
            while (col < (width - 4)){
                //sets windows color
                int x = generator.nextInt(2);
                if(x == 1)
                    page.setColor(Color.yellow);
                else
                    page.setColor(Color.black);

                //makes windows
                page.fillRect(baseX + col, baseY + floors, 4, 5);

                //iterator
                col += 9;
            }
            col = 4;
            floors += 11;
        }
    }

    //draws sun
    public void drawSun(Graphics page){
        //sets sun color
        page.setColor(Color.orange);

        //draws the sun itself
        page.fillOval(20, 20, 150, 150);
    }

    //draws clouds
    public void drawClouds(Graphics page){
        //makes the clouds white
        page.setColor(Color.white);

        //draws clouds
        //generates their positions
        int xpos = generator.nextInt(799);
        int ypos = 100;

        //generates their height and width
        int hh = generator.nextInt(40) + 20;
        int ww = generator.nextInt(60) + 30;

        //draws the clouds themselves
        page.fillOval(xpos, ypos, ww, hh);
        page.fillOval(xpos + 10, ypos + 10, ww, hh - 10);
        page.fillOval(xpos - 10, ypos + 10, ww, hh - 10);
    }

    //run method
    public void run(){
        while (true){
            try{
                Thread.sleep(17);
            }catch (Exception e){}
        }
    }//end of run
}

