/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;

/**
 *
 * @author User
 */
public class area_SantosJ extends Frame 
{
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);
        GeneralPath line = new GeneralPath();
        GeneralPath boat = new GeneralPath();
        GeneralPath cross = new GeneralPath();
        GeneralPath star = new GeneralPath();
        GeneralPath tree = new GeneralPath();
        GeneralPath kahoy = new GeneralPath();
//        g2d.setFont(new Font("Arial",Font.BOLD,40));
//        g2d.drawString("Recall:", 650, 250);
        tree.moveTo(400,200);
        tree.lineTo(450,350);
        tree.lineTo(430,350);
        tree.lineTo(500,500);
        tree.lineTo(480,500);
        tree.lineTo(550,650);
        tree.lineTo(250,650);
        tree.lineTo(320,500);
        tree.lineTo(300,500);
        tree.lineTo(370,350);
        tree.lineTo(350,350);
        tree.lineTo(400,200);
        
        cross.moveTo(300, 300);
            cross.lineTo(300, 200);
            cross.quadTo(300, 160, 340, 160);
            cross.lineTo(360, 160);
            cross.quadTo(400, 160, 400, 200);
            cross.lineTo(400, 300);
            cross.lineTo(500, 300);
            cross.quadTo(540, 300, 540, 340);
            cross.lineTo(540, 360);
            cross.quadTo(540, 400, 500, 400);
            cross.lineTo(400, 400);
            cross.lineTo(400, 500);
            cross.quadTo(400, 540, 360, 540);
            cross.lineTo(340, 540);
            cross.quadTo(300, 540, 300, 500);
            cross.lineTo(300, 400);
            cross.lineTo(200, 400);
            cross.quadTo(160, 400, 160, 360);
            cross.lineTo(160, 340);
            cross.quadTo(160, 300, 200, 300);
            cross.lineTo(300, 300);
            
          boat.moveTo(200, 300);
          boat.lineTo(250, 400);
          boat.lineTo(550, 400);
          boat.lineTo(600, 300);
          boat.lineTo(405, 300);
          boat.lineTo(200, 300);
          boat.moveTo(395, 300);
          boat.lineTo(405, 300);
          boat.lineTo(405, 100);
          boat.lineTo(395, 100);
          boat.lineTo(395, 300);
          boat.moveTo(405, 100);
          boat.lineTo(491, 150);
          boat.lineTo(405, 150);
          
        line.moveTo(150, 200);
        line.lineTo(200, 200);
        line.lineTo(200, 150);
        line.lineTo(250, 150);
        line.lineTo(250, 450);
        line.lineTo(450, 450);
        line.lineTo(450, 150);
        line.lineTo(500, 150);
        line.lineTo(500, 200);
        line.lineTo(550, 200);
        line.lineTo(550, 100);
        line.lineTo(500, 50);
        line.lineTo(200, 50);
        line.lineTo(150, 100);
        line.lineTo(150, 200);
        
        Ellipse2D.Double e = new Ellipse2D.Double(20, 20, 1000, 800);
        
        Area TREE = new Area(tree);
        Area CROSS = new Area(cross);
        Area BOAT = new Area(boat);
        Area LINE = new Area(line);
        Area E = new Area(e);
        
//        g2d.setPaint(Color.RED);
//        TREE.add(CROSS);
//        g2d.fill(TREE);
        
//        g2d.setPaint(Color.BLUE);
//        BOAT.add(LINE);
//        g2d.fill(BOAT);
//        
//        g2d.setPaint(Color.MAGENTA);
//        E.subtract(BOAT);
//        g2d.fill(E);
//        
//        g2d.setPaint(Color.YELLOW);
//        BOAT.intersect(TREE);
//        g2d.fill(BOAT);
//        
//        g2d.setPaint(Color.PINK);
//        TREE.subtract(BOAT);
//        g2d.fill(TREE);
//        
//        g2d.setPaint(Color.GREEN);
//        CROSS.subtract(LINE);
//        g2d.fill(CROSS);
//        
//        g2d.setPaint(Color.CYAN);
//        BOAT.exclusiveOr(CROSS);
//        g2d.fill(BOAT);
    }
    
    public static void main(String args[])
    {
        area_SantosJ p1 = new area_SantosJ();
        p1.setTitle("area");
        //p1.setUndecorated(true);
        //p1.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
        p1.setBackground(Color.WHITE);
        p1.setSize(800,750);
        p1.setForeground(Color.black);
        p1.setVisible(true);
        
        p1.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e){
            super.windowClosing(e);
            System.exit(0);
        }
        
        });
    }
}
