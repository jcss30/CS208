/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs208_santos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class TransportationVehicle extends JPanel implements ActionListener
{
    Timer t = new Timer(10,this);

    int x = 0,y = 0;//starting pixel of the car
    int xspeed = 2;//number of pixels will move from x every repaint
    //int yspeed = -2;//number of pixels will move from x every repaint

    double picHeight = 604, picWidth = 1000;//resolution of the original image

    double aspectratio = picWidth/picHeight;//aspect ratio of the original image

    double height = 650,width = height;//size of the panel adjusted by the height

    @Override
    public void actionPerformed(ActionEvent e) {//Method to run after triggering the Timer
        x+=xspeed;//move the original x by the xspeed    
        //y+=yspeed;//move the original x by the xspeed      
        repaint();//draw the next frame
    }

    TransportationVehicle(){
        setSize((int)width,(int)height);
    }

    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs2 = new BasicStroke(3.0f);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(bs2);
        super.paintComponent(g);
        y=(int)(Math.random()*3);
        AffineTransform move = AffineTransform.getTranslateInstance(x,y);;
        g2d.setTransform(move);
        GeneralPath katawan = new GeneralPath();
        GeneralPath yellow = new GeneralPath();
        GeneralPath pinto = new GeneralPath();
        GeneralPath backlight = new GeneralPath();
        GeneralPath frontlight = new GeneralPath();
        GeneralPath bintana = new GeneralPath();
        GeneralPath lights = new GeneralPath();
        
        //Katawan
        katawan.moveTo(78, 321);
        katawan.lineTo(78, 499);
        katawan.lineTo(858, 499);
        katawan.curveTo(858, 499, 880, 460, 880, 450);
        katawan.quadTo(886, 370, 871, 313);
        katawan.curveTo(872, 311, 850, 270, 820, 261);
        katawan.lineTo(766, 252);
        katawan.lineTo(743, 107);
        katawan.quadTo(650, 34, 552, 110);
        katawan.quadTo(517, 150, 513, 207);
        katawan.lineTo(512, 445);
        katawan.lineTo(485, 445);
        katawan.lineTo(485, 321);
        katawan.lineTo(78, 321);
        g2d.setPaint(new Color(255,72,32));
        g2d.fill(katawan);
        g2d.draw(katawan);
        
        //Pinto
        pinto.moveTo(561, 293);
        pinto.lineTo(600, 292);
        pinto.quadTo(613, 302, 600, 313);
        pinto.lineTo(561, 313);
        pinto.quadTo(550, 303, 561, 293);
        g2d.setPaint(new Color(254,134,136));
        g2d.fill(pinto);
        
        //Gulong
        Ellipse2D.Double leftgulong = new Ellipse2D.Double(123, 385, 164, 204);
        Ellipse2D.Double rightgulong = new Ellipse2D.Double(672, 395, 146, 182);
        g2d.setPaint(new Color(74,74,74));
        g2d.fill(leftgulong);
        g2d.fill(rightgulong);
        
        //Inner gulong
        Ellipse2D.Double innergulongl = new Ellipse2D.Double(163, 432, 84, 106);
        Ellipse2D.Double innergulongr = new Ellipse2D.Double(706, 435, 78, 97);
        g2d.setPaint(new Color(66,66,66));
        g2d.fill(innergulongl);
        g2d.fill(innergulongr);
        
        //Inner inner gulong
        Ellipse2D.Double innerinnergulongl = new Ellipse2D.Double(172, 443, 67, 86);
        Ellipse2D.Double innerinnergulongr = new Ellipse2D.Double(715, 446, 59, 78);
        g2d.setPaint(new Color(183,183,183));
        g2d.fill(innerinnergulongl);
        g2d.fill(innerinnergulongr);    
        
        //Yellow
        yellow.moveTo(69, 319);//box
        yellow.lineTo(487, 319);
        yellow.quadTo(495, 315, 495, 299);
        yellow.lineTo(495, 73);
        yellow.quadTo(491, 54, 478, 53);
        yellow.lineTo(74, 53);
        yellow.quadTo(56, 57, 55, 70);
        yellow.lineTo(55, 300);
        yellow.quadTo(59, 316, 69, 318);
        
        yellow.moveTo(130, 465);//left gulong
        yellow.quadTo(122, 480, 114, 462);
        yellow.quadTo(120, 394, 168, 365);
        yellow.quadTo(204, 340, 247, 370);
        yellow.quadTo(284, 403, 292, 458);
        yellow.quadTo(285, 481, 273, 458);
        yellow.quadTo(262, 420, 238, 398);
        yellow.quadTo(203, 370, 165, 403);
        yellow.quadTo(139, 430, 130, 465);
        
        yellow.moveTo(681, 462);//right gulong
        yellow.quadTo(671, 485, 665, 456);
        yellow.quadTo(673, 410, 703, 383);
        yellow.quadTo(747, 352, 782, 381);
        yellow.quadTo(820, 415, 822, 454);
        yellow.quadTo(818, 487, 806, 455);
        yellow.quadTo(800, 431, 779, 409);
        yellow.quadTo(745, 382, 711, 410);
        yellow.quadTo(690, 424, 681, 462);
        
        yellow.moveTo(320, 467);//bar ilalim
        yellow.lineTo(628, 467);
        yellow.quadTo(642, 470, 643, 490);
        yellow.quadTo(640, 507, 628, 511);
        yellow.lineTo(320, 511);
        yellow.quadTo(305, 505, 305, 490);
        yellow.quadTo(307, 472, 320, 467);
        
        yellow.moveTo(62, 467);//likod
        yellow.lineTo(93, 467);
        yellow.quadTo(107, 474, 105, 491);
        yellow.quadTo(107, 505, 93, 511);
        yellow.lineTo(62, 511);
        yellow.quadTo(45, 504, 48, 489);
        yellow.quadTo(45, 473, 62, 467);
        
        yellow.moveTo(851, 467);//harap
        yellow.lineTo(883, 467);
        yellow.quadTo(899, 472, 897, 490);
        yellow.quadTo(899, 505, 883, 511);
        yellow.lineTo(851, 511);
        yellow.quadTo(835, 505, 837, 490);
        yellow.quadTo(835, 472, 851, 467);        
        g2d.setPaint(new Color(255,221,62));
        g2d.fill(yellow);
        g2d.draw(yellow);
        
        //Backlight
        backlight.moveTo(76, 406);
        backlight.quadTo(64, 415, 64, 428);
        backlight.quadTo(64, 449, 76, 455);
        backlight.lineTo(76, 406);
        g2d.setPaint(new Color(255,4,2));
        g2d.fill(backlight);
        g2d.draw(backlight);
        
        //Frontlight
        frontlight.moveTo(875, 319);
        frontlight.quadTo(900, 336, 900, 366);
        frontlight.quadTo(903, 401, 884, 418);
        frontlight.quadTo(882, 365, 875, 319);
        g2d.setPaint(new Color(253,197,70));
        g2d.fill(frontlight);
        g2d.draw(frontlight);
        
        //Lights
        lights.moveTo(924, 323);//1
        lights.lineTo(957, 295);
        lights.quadTo(968, 296, 967, 308);
        lights.lineTo(933, 337);
        lights.quadTo(921, 336, 924, 323);
        
        lights.moveTo(927, 359);//2
        lights.lineTo(966, 355);
        lights.quadTo(981, 364, 968, 374);
        lights.lineTo(931, 377);
        lights.quadTo(918, 371, 927, 359);
        
        lights.moveTo(931, 397);//3
        lights.lineTo(970, 413);
        lights.quadTo(978, 423, 966, 428);
        lights.lineTo(926, 411);
        lights.quadTo(918, 399, 931, 397);
        g2d.setPaint(new Color(255,213,106));
        g2d.fill(lights);
        g2d.draw(lights);
        
        //bintana
        bintana.moveTo(753, 286);
        bintana.lineTo(734, 125);
        bintana.quadTo(733, 115, 717, 110);
        bintana.quadTo(646, 87, 594, 106);
        bintana.quadTo(555, 122, 546, 155);
        bintana.quadTo(536, 197, 539, 243);
        bintana.quadTo(601, 260, 639, 286);
        bintana.quadTo(696, 312, 753, 286);
        g2d.setPaint(new Color(223,253,255));
        g2d.fill(bintana);
        g2d.draw(bintana);
        
        t.start();
        
    }
    
    public static void main(String args[])
    {
        JFrame jframe = new JFrame();
        TransportationVehicle p1 = new TransportationVehicle();
//        p1.setTitle("Transportation");
//        p1.setUndecorated(true);
//        p1.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
//        p1.setBackground(Color.WHITE);
//        p1.setSize(1000,604);
//        p1.setForeground(Color.black);
//        p1.setVisible(true);
        jframe.setMinimumSize(new Dimension(p1.getWidth()*2,p1.getHeight()));
        jframe.add(p1);
        jframe.pack();
        jframe.setVisible(true);
        
        jframe.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e){
            super.windowClosing(e);
            System.exit(0);
        }
        
        });
        
        
        
    }
}
