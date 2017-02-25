/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcss
 */
package cs208_santos;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;

public class CartoonCharacterV1 extends Frame 
{
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);
        //g2d.setFont(new Font("Arial",Font.BOLD,40));
        //g2d.drawString("I love CS 208", 100, 250);
        
        //QuadCurve2D.Double q1 = new QuadCurve2D.Double(50,60,150,200,350,100);
        //g2d.draw(q1);
        //CubicCurve2D.Double q = new CubicCurve2D.Double(20, 20, 100, 120, 210, 150, 350, 40);
        //g2d.draw(q);
        //Rectangle2D.Double r = new Rectangle2D.Double(40, 50, 400, 300);
        //g2d.draw(r);
        //g2d.setPaint(Color.green);
        //g2d.fill(r);
        /*Ellipse2D.Double elli = new Ellipse2D.Double(200,300,400,400);
        g2d.draw(elli);
        g2d.setPaint(Color.green);
        g2d.fill(elli);*/
        //Katawan
        CubicCurve2D.Double tiyan1 = new CubicCurve2D.Double(110, 528, 102, 450, 148, 359, 194, 310);
        g2d.draw(tiyan1);
        CubicCurve2D.Double tiyan2 = new CubicCurve2D.Double(194, 310, 245, 260, 320, 227, 371, 213);
        g2d.draw(tiyan2);
        CubicCurve2D.Double tiyan3 = new CubicCurve2D.Double(368, 213, 470, 188, 500, 198, 583, 212);
        g2d.draw(tiyan3);
        CubicCurve2D.Double tiyan4 = new CubicCurve2D.Double(583, 212, 630, 227, 688, 260, 739, 310);
        g2d.draw(tiyan4);
        CubicCurve2D.Double tiyan5 = new CubicCurve2D.Double(739, 310, 785, 359, 795, 450, 790, 501);
        g2d.draw(tiyan5);
        CubicCurve2D.Double tiyan6 = new CubicCurve2D.Double(253, 645, 270, 657, 296, 653, 300, 653);
        g2d.draw(tiyan6);
        Line2D.Double tiyan7 = new Line2D.Double(300, 653, 640, 653);
        g2d.draw(tiyan7);
        CubicCurve2D.Double tiyan8 = new CubicCurve2D.Double(640, 653, 660, 653, 680, 656, 687, 646);
        g2d.draw(tiyan8);
        CubicCurve2D.Double innertiyan1 = new CubicCurve2D.Double(295, 241, 290, 250, 280, 249, 260, 269);
        g2d.draw(innertiyan1);
        CubicCurve2D.Double innertiyan2 = new CubicCurve2D.Double(260, 269, 250, 280, 240, 280, 218, 310);
        g2d.draw(innertiyan2);
        CubicCurve2D.Double innertiyan3 = new CubicCurve2D.Double(218, 310, 205, 325, 191, 350, 189, 360);
        g2d.draw(innertiyan3);
        CubicCurve2D.Double innertiyan4 = new CubicCurve2D.Double(189, 359, 172, 390, 181, 420, 200, 442);
        g2d.draw(innertiyan4);
        CubicCurve2D.Double innertiyan5 = new CubicCurve2D.Double(200, 442, 210, 450, 220, 454, 240, 455);
        g2d.draw(innertiyan5);
        CubicCurve2D.Double innertiyan6 = new CubicCurve2D.Double(240, 455, 250, 452, 270, 455, 296, 444);
        g2d.draw(innertiyan6);
        CubicCurve2D.Double innertiyan7 = new CubicCurve2D.Double(296, 444, 310, 440, 320, 438, 350, 436);
        g2d.draw(innertiyan7);
        CubicCurve2D.Double innertiyan8 = new CubicCurve2D.Double(350, 436, 390, 428, 430, 435, 480, 439);
        g2d.draw(innertiyan8);
        CubicCurve2D.Double innertiyan9 = new CubicCurve2D.Double(480, 439, 510, 442, 530, 444, 590, 445);
        g2d.draw(innertiyan9);
        CubicCurve2D.Double innertiyan10 = new CubicCurve2D.Double(590, 445, 610, 445, 630, 445, 650, 443);
        g2d.draw(innertiyan10);
        CubicCurve2D.Double innertiyan11 = new CubicCurve2D.Double(650, 443, 680, 445, 700, 435, 715, 410);
        g2d.draw(innertiyan11);
        CubicCurve2D.Double innertiyan12 = new CubicCurve2D.Double(715, 410, 722, 400, 730, 380, 727, 370);
        g2d.draw(innertiyan12);
        CubicCurve2D.Double innertiyan13 = new CubicCurve2D.Double(727, 370, 730, 360, 723, 320, 715, 310);
        g2d.draw(innertiyan13);
        CubicCurve2D.Double innertiyan14 = new CubicCurve2D.Double(715, 310, 715, 305, 695, 270, 668, 254);
        g2d.draw(innertiyan14);
        
        //Kanang braso
        CubicCurve2D.Double rbraso1 = new CubicCurve2D.Double(726, 298, 737, 304, 745, 298, 770, 317);
        g2d.draw(rbraso1);
        CubicCurve2D.Double rbraso2 = new CubicCurve2D.Double(770, 317, 805, 340, 820, 350, 836, 380);
        g2d.draw(rbraso2);
        CubicCurve2D.Double rbraso3 = new CubicCurve2D.Double(836, 380, 848, 395, 853, 410, 860, 420);
        g2d.draw(rbraso3);
        CubicCurve2D.Double rbraso4 = new CubicCurve2D.Double(860, 420, 870, 440, 880, 460, 880, 480);
        g2d.draw(rbraso4);
        CubicCurve2D.Double rbraso5 = new CubicCurve2D.Double(880, 480, 880, 505, 877, 520, 859, 528);
        g2d.draw(rbraso5);
        CubicCurve2D.Double rkuko1 = new CubicCurve2D.Double(859, 528, 855, 529, 850, 512, 840, 528);
        g2d.draw(rkuko1);
        Line2D.Double rkuko2 = new Line2D.Double(859, 528, 851, 545);
        g2d.draw(rkuko2);
        Line2D.Double rkuko3 = new Line2D.Double(859, 528, 870, 545);
        g2d.draw(rkuko3);
        Line2D.Double rkuko4 = new Line2D.Double(870, 545, 873, 518);
        g2d.draw(rkuko4);
        Line2D.Double rkuko5 = new Line2D.Double(873, 518, 890, 528);
        g2d.draw(rkuko5);
        Line2D.Double rkuko6 = new Line2D.Double(890, 528, 880, 500);
        g2d.draw(rkuko6);
        Line2D.Double rkuko7 = new Line2D.Double(880, 500, 899, 500);
        g2d.draw(rkuko7);
        Line2D.Double rkuko8 = new Line2D.Double(899, 500, 880, 478);
        g2d.draw(rkuko8);
        Line2D.Double rkuko9 = new Line2D.Double(890, 488, 899, 488);
        g2d.draw(rkuko9);
        Line2D.Double rkuko10 = new Line2D.Double(899, 488, 880, 465);
        g2d.draw(rkuko10);
        
        //Kaliwang braso
        CubicCurve2D.Double lbraso1 = new CubicCurve2D.Double(127, 414, 95, 364, 70, 271, 95, 220);
        g2d.draw(lbraso1);
        CubicCurve2D.Double lbraso2 = new CubicCurve2D.Double(95, 220, 105, 200, 130, 168, 150, 177);
        g2d.draw(lbraso2);
        CubicCurve2D.Double lbraso3 = new CubicCurve2D.Double(150, 177, 190, 185, 240, 240, 260, 261);
        g2d.draw(lbraso3);
        Line2D.Double lkuko1 = new Line2D.Double(95, 220, 85, 200);
        g2d.draw(lkuko1);
        Line2D.Double lkuko2 = new Line2D.Double(85, 200, 105, 205);
        g2d.draw(lkuko2);
        Line2D.Double lkuko3 = new Line2D.Double(105, 205, 94, 183);
        g2d.draw(lkuko3);
        Line2D.Double lkuko4 = new Line2D.Double(94, 183, 115, 190);
        g2d.draw(lkuko4);
        Line2D.Double lkuko5 = new Line2D.Double(117, 188, 115, 165);
        g2d.draw(lkuko5);
        Line2D.Double lkuko6 = new Line2D.Double(115, 165, 137, 176);
        g2d.draw(lkuko6);
        Line2D.Double lkuko7 = new Line2D.Double(137, 176, 142, 159);
        g2d.draw(lkuko7);
        Line2D.Double lkuko8 = new Line2D.Double(143, 159, 154, 177);
        g2d.draw(lkuko8);
        Line2D.Double lkuko9 = new Line2D.Double(154, 177, 162, 163);
        g2d.draw(lkuko9);
        Line2D.Double lkuko10 = new Line2D.Double(162, 163, 168, 183);
        g2d.draw(lkuko10);
        
        //Pisngi
        CubicCurve2D.Double lpisngi = new CubicCurve2D.Double(268, 252, 267, 273, 260, 186, 290, 158);
        g2d.draw(lpisngi);
        CubicCurve2D.Double rpisngi = new CubicCurve2D.Double(648, 150, 670, 176, 675, 218, 668, 254);
        g2d.draw(rpisngi);
        
        //Tenga
        CubicCurve2D.Double ltenga1 = new CubicCurve2D.Double(289, 158, 287, 121, 285, 66, 299, 44);
        g2d.draw(ltenga1);
        CubicCurve2D.Double ltenga2 = new CubicCurve2D.Double(299, 44, 327, 40, 376, 64, 394, 73);
        g2d.draw(ltenga2);
        CubicCurve2D.Double rtenga1 = new CubicCurve2D.Double(517, 73, 553, 55, 611, 33, 636, 38);
        g2d.draw(rtenga1);
        CubicCurve2D.Double rtenga2 = new CubicCurve2D.Double(638, 38, 652, 65, 650, 113, 648, 150);
        g2d.draw(rtenga2);
        
        //Noo
        Line2D.Double noo = new Line2D.Double(394, 73, 517, 73);
        g2d.draw(noo);
        
        //Loob ng mukha
        CubicCurve2D.Double innerface1 = new CubicCurve2D.Double(295, 242, 283, 182, 325, 125, 360, 110);
        g2d.draw(innerface1);
        CubicCurve2D.Double innerface2 = new CubicCurve2D.Double(360, 110, 382, 95, 436, 98, 460, 117);
        g2d.draw(innerface2);
        CubicCurve2D.Double innerface3 = new CubicCurve2D.Double(460, 117, 506, 92, 562, 94, 585, 110);
        g2d.draw(innerface3);
        CubicCurve2D.Double innerface4 = new CubicCurve2D.Double(582, 108, 655, 150, 655, 205, 645, 240);
        g2d.draw(innerface4);
        CubicCurve2D.Double mata1 = new CubicCurve2D.Double(352, 147, 369, 142, 397, 140, 418, 143);
        g2d.draw(mata1);
        CubicCurve2D.Double mata2 = new CubicCurve2D.Double(501, 144, 527, 140, 555, 142, 570, 147);
        g2d.draw(mata2);
        CubicCurve2D.Double bibig = new CubicCurve2D.Double(398, 187, 435, 179, 489, 179, 524, 183);
        g2d.draw(bibig);
        Line2D.Double lngipin1 = new Line2D.Double(402, 187, 412, 171);
        g2d.draw(lngipin1);
        Line2D.Double lngipin2 = new Line2D.Double(413, 173, 425, 183);
        g2d.draw(lngipin2);
        Line2D.Double rngipin1 = new Line2D.Double(504, 182, 513, 169);
        g2d.draw(rngipin1);
        Line2D.Double rngipin2 = new Line2D.Double(514, 169, 523, 182);
        g2d.draw(rngipin2);
        
        //Kaliwang Paa
        CubicCurve2D.Double lpaa1 = new CubicCurve2D.Double(108, 526, 115, 518, 128, 510, 138, 508);
        g2d.draw(lpaa1);
        CubicCurve2D.Double lpaa2 = new CubicCurve2D.Double(80, 552, 64, 569, 63, 595, 63, 600);
        g2d.draw(lpaa2);
        CubicCurve2D.Double lpaa3 = new CubicCurve2D.Double(62, 630, 70, 650, 88, 678, 125, 685);
        g2d.draw(lpaa3);
        CubicCurve2D.Double lpaa4 = new CubicCurve2D.Double(125, 685, 145, 695, 200, 685, 216, 673);
        g2d.draw(lpaa4);
        CubicCurve2D.Double lpaa5 = new CubicCurve2D.Double(216, 673, 247, 657, 252, 642, 261, 627);
        g2d.draw(lpaa5);
        CubicCurve2D.Double lpaa6 = new CubicCurve2D.Double(261, 627, 280, 600, 278, 535, 235, 511);
        g2d.draw(lpaa6);
        CubicCurve2D.Double lpaa7 = new CubicCurve2D.Double(235, 511, 232, 504, 185, 496, 174, 500);
        g2d.draw(lpaa7);
        CubicCurve2D.Double linnerpaa1 = new CubicCurve2D.Double(238, 620, 243, 630, 228, 645, 221, 653);
        g2d.draw(linnerpaa1);
        CubicCurve2D.Double linnerpaa2 = new CubicCurve2D.Double(221, 653, 210, 660, 205, 668, 190, 670);
        g2d.draw(linnerpaa2);
        CubicCurve2D.Double linnerpaa3 = new CubicCurve2D.Double(187, 671, 132, 671, 135, 638, 160, 610);
        g2d.draw(linnerpaa3);
        CubicCurve2D.Double linnerpaa4 = new CubicCurve2D.Double(160, 610, 170, 602, 177, 593, 195, 586);
        g2d.draw(linnerpaa4);
        CubicCurve2D.Double linnerpaa5 = new CubicCurve2D.Double(195, 586, 210, 584, 233, 580, 238, 618);
        g2d.draw(linnerpaa5);
        Line2D.Double lkukopaa1 = new Line2D.Double(113, 528, 68, 515);
        g2d.draw(lkukopaa1);
        Line2D.Double lkukopaa2 = new Line2D.Double(68, 515, 85, 562);
        g2d.draw(lkukopaa2);
        CubicCurve2D.Double lkukopaa3 = new CubicCurve2D.Double(85, 562, 100, 565, 120, 550, 113, 528);
        g2d.draw(lkukopaa3);
        CubicCurve2D.Double lkukopaa4 = new CubicCurve2D.Double(79, 600, 65, 602, 43, 603, 38, 609);
        g2d.draw(lkukopaa4);
        CubicCurve2D.Double lkukopaa5 = new CubicCurve2D.Double(38, 609, 35, 611, 47, 626, 65, 631);
        g2d.draw(lkukopaa5);
        CubicCurve2D.Double lkukopaa6 = new CubicCurve2D.Double(65, 631, 80, 633, 90, 611, 80, 601);
        g2d.draw(lkukopaa6);
        CubicCurve2D.Double lkukopaa7 = new CubicCurve2D.Double(140, 517, 140, 510, 143, 480, 145, 476);
        g2d.draw(lkukopaa7);
        CubicCurve2D.Double lkukopaa8 = new CubicCurve2D.Double(147, 476, 145, 470, 165, 488, 180, 510);
        g2d.draw(lkukopaa8);
        CubicCurve2D.Double lkukopaa9 = new CubicCurve2D.Double(180, 510, 165, 522, 157, 522, 140, 517);
        g2d.draw(lkukopaa9);
        
        //Kanang paa
        CubicCurve2D.Double rpaa1 = new CubicCurve2D.Double(770, 500, 790, 500, 810, 510, 809, 509);
        g2d.draw(rpaa1);
        CubicCurve2D.Double rpaa2 = new CubicCurve2D.Double(838, 525, 847, 530, 862, 570, 858, 571);
        g2d.draw(rpaa2);
        CubicCurve2D.Double rpaa3 = new CubicCurve2D.Double(850, 605, 848, 615, 843, 643, 797, 669);
        g2d.draw(rpaa3);
        CubicCurve2D.Double rpaa4 = new CubicCurve2D.Double(796, 669, 780, 675, 760, 675, 750, 673);
        g2d.draw(rpaa4);
        CubicCurve2D.Double rpaa5 = new CubicCurve2D.Double(750, 673, 730, 672, 710, 670, 698, 655);
        g2d.draw(rpaa5);
        CubicCurve2D.Double rpaa6 = new CubicCurve2D.Double(698, 655, 670, 635, 665, 615, 661, 600);
        g2d.draw(rpaa6);
        CubicCurve2D.Double rpaa7 = new CubicCurve2D.Double(661, 600, 643, 570, 685, 515, 725, 500);
        g2d.draw(rpaa7);
        CubicCurve2D.Double rinnerpaa1 = new CubicCurve2D.Double(710, 575,  700, 575, 685, 585, 688, 600);
        g2d.draw(rinnerpaa1);
        CubicCurve2D.Double rinnerpaa2 = new CubicCurve2D.Double(688, 600, 688, 607, 692, 618, 706, 630);
        g2d.draw(rinnerpaa2);
        CubicCurve2D.Double rinnerpaa3 = new CubicCurve2D.Double(706, 630, 730, 640, 755, 640, 770, 621);
        g2d.draw(rinnerpaa3);
        CubicCurve2D.Double rinnerpaa4 = new CubicCurve2D.Double(770, 621, 775, 615, 780, 608, 768, 590);
        g2d.draw(rinnerpaa4);
        CubicCurve2D.Double rinnerpaa5 = new CubicCurve2D.Double(768, 590, 745, 567, 715, 575, 710, 575);
        g2d.draw(rinnerpaa5);
        CubicCurve2D.Double rkukopaa1 = new CubicCurve2D.Double(763, 515, 769, 505, 770, 475, 769, 460);
        g2d.draw(rkukopaa1);
        CubicCurve2D.Double rkukopaa2 = new CubicCurve2D.Double(769, 460, 748, 475, 738, 490, 725, 500);
        g2d.draw(rkukopaa2);
        CubicCurve2D.Double rkukopaa3 = new CubicCurve2D.Double(725, 500, 728, 525, 745, 530, 763, 515);
        g2d.draw(rkukopaa3);
        CubicCurve2D.Double rkukopaa4 = new CubicCurve2D.Double(799, 515, 831, 500, 846, 485, 848, 490);
        g2d.draw(rkukopaa4);
        CubicCurve2D.Double rkukopaa5 = new CubicCurve2D.Double(848, 490, 842, 510, 840, 520, 830, 540);
        g2d.draw(rkukopaa5);
        CubicCurve2D.Double rkukopaa6 = new CubicCurve2D.Double(830, 540, 826, 550, 792, 545, 799, 515);
        g2d.draw(rkukopaa6);
        CubicCurve2D.Double rkukopaa7 = new CubicCurve2D.Double(842, 570, 855, 573, 865, 572, 890, 580);
        g2d.draw(rkukopaa7);
        CubicCurve2D.Double rkukopaa8 = new CubicCurve2D.Double(890, 581, 890, 580, 867, 600, 850, 605);
        g2d.draw(rkukopaa8);
        CubicCurve2D.Double rkukopaa9 = new CubicCurve2D.Double(850, 605, 831, 600, 833, 575, 842, 570);
        g2d.draw(rkukopaa9);
    }
    
    public static void main(String args[])
    {
        CartoonCharacterV1 p1 = new CartoonCharacterV1();
        p1.setTitle("Snorlax V1");
        //p1.setUndecorated(true);
        //p1.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
        p1.setBackground(Color.WHITE);
        p1.setSize(930,800);
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
