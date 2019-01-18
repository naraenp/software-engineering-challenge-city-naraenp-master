//********************************************************************
//  StickFigure.java       Author: Lewis/Loftus/Cocking
//
//  Represents a graphical stick figure.
//********************************************************************

import java.awt.*; //this imports the color class

public class StickFigure
{
   private int baseX;     // center of figure
   private int baseY;     // floor (bottom of feet)
   private Color color;   // color of stick figure
   private int height;    // height of stick figure

   //-----------------------------------------------------------------
   //  Sets up the stick figure's primary attributes.
   //-----------------------------------------------------------------
   public StickFigure (int center, int bottom, Color shade, int size)
   {
      baseX = center;
      baseY = bottom;
      color = shade;
      height = size;
   }

   //-----------------------------------------------------------------
   //  Draws this figure relative to baseX, baseY, and height.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      int top = baseY - height;  // top of head

      page.setColor (color);

      // head
      page.drawOval(baseX - 10, top, 20, 20); 
      
      //smile        x         y      w   h   sa   aa
      page.fillArc(baseX-5, top + 7, 10, 10, 190, 160);
      
      //eyes
      page.fillOval(baseX + 5, top + 4, 3, 3);
      page.fillOval(baseX - 5, top + 4, 3, 3);
      
      
      // trunk
      //increase in y pushes it closer to the bottom
      page.drawLine (baseX, top+20, baseX, baseY-30); 
      
      page.drawLine (baseX, baseY-30, baseX-15, baseY);  // legs
      page.drawLine (baseX, baseY-30, baseX+15, baseY-20);

      page.drawLine (baseX, baseY-70, baseX-25, baseY-70);  // arms
      page.drawLine (baseX, baseY-70, baseX+20, baseY-85);
      

   }
   
   /**
    * setHeight
    * @param new Hieght for figure
      */
    
   public void setHeight(int size){
       height = size;
    }
   
   
   
}