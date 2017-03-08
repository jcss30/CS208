/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerard santos
 */
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Affine extends Frame 
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
//        line.moveTo(150, 200);
//        line.lineTo(200, 200);
//        line.lineTo(200, 150);
//        line.lineTo(250, 150);
//        line.lineTo(250, 450);
//        line.lineTo(450, 450);
//        line.lineTo(450, 150);
//        line.lineTo(500, 150);
//        line.lineTo(500, 200);
//        line.lineTo(550, 200);
//        line.lineTo(550, 100);
//        line.lineTo(500, 50);
//        line.lineTo(200, 50);
//        line.lineTo(150, 100);
//        line.lineTo(150, 200);
//        g2d.setPaint(Color.BLUE);   
//        g2d.fill(line);
//        g2d.draw(line);

//          boat.moveTo(200, 300);
//          boat.lineTo(250, 400);
//          boat.lineTo(550, 400);
//          boat.lineTo(600, 300);
//          boat.lineTo(405, 300);
//          boat.lineTo(200, 300);
//          boat.moveTo(395, 300);
//          boat.lineTo(405, 300);
//          boat.lineTo(405, 100);
//          boat.lineTo(395, 100);
//          boat.lineTo(395, 300);
//          boat.moveTo(405, 100);
//          boat.lineTo(491, 150);
//          boat.lineTo(405, 150);
//          g2d.setPaint(Color.YELLOW);
//          g2d.fill(boat);
//          g2d.draw(boat);

//            cross.moveTo(300, 300);
//            cross.lineTo(300, 200);
//            cross.quadTo(300, 160, 340, 160);
//            cross.lineTo(360, 160);
//            cross.quadTo(400, 160, 400, 200);
//            cross.lineTo(400, 300);
//            cross.lineTo(500, 300);
//            cross.quadTo(540, 300, 540, 340);
//            cross.lineTo(540, 360);
//            cross.quadTo(540, 400, 500, 400);
//            cross.lineTo(400, 400);
//            cross.lineTo(400, 500);
//            cross.quadTo(400, 540, 360, 540);
//            cross.lineTo(340, 540);
//            cross.quadTo(300, 540, 300, 500);
//            cross.lineTo(300, 400);
//            cross.lineTo(200, 400);
//            cross.quadTo(160, 400, 160, 360);
//            cross.lineTo(160, 340);
//            cross.quadTo(160, 300, 200, 300);
//            cross.lineTo(300, 300);
//            g2d.setPaint(Color.RED);
//            g2d.fill(cross);
//            g2d.draw(cross);

//            star.moveTo(400,160);
//            star.lineTo(420,180);
//            star.lineTo(400,200);
//            star.lineTo(380,180);
//            star.lineTo(400,160);
//            g2d.setPaint(Color.yellow);
//            g2d.fill(star);
//        
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
            g2d.setPaint(Color.green);
            //g2d.fill(tree);
            AffineTransform scale = new AffineTransform();
            scale.setToScale(3, 0.3);
            g2d.draw(scale.createTransformedShape(tree));
            
            AffineTransform rotate = new AffineTransform();
            rotate.setToRotation(Math.PI/6);
            g2d.draw(rotate.createTransformedShape(tree));
            
            AffineTransform shear = new AffineTransform();
            shear.setToShear(2, 0.3);
            g2d.draw(shear.createTransformedShape(tree));
            
            AffineTransform translate = new AffineTransform();
            translate.setToTranslation(60, 70);
            translate.preConcatenate(rotate);
            g2d.draw(translate.createTransformedShape(tree));
//        
//            kahoy.moveTo(390,650);
//            kahoy.lineTo(420,650);
//            kahoy.lineTo(420,680);
//            kahoy.lineTo(390,680);
//            kahoy.lineTo(390,650);
//            g2d.setPaint(Color.gray);
//            g2d.fill(kahoy);
    }
    
    public static void main(String args[])
    {
        Affine p1 = new Affine();
        p1.setTitle("Affine Transform");
        p1.setBackground(Color.WHITE);
        p1.setSize(800,700);
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
