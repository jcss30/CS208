/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcss
 */
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Animation_SantosJ extends JPanel implements ActionListener 
{
    long start = System.nanoTime();
    public static double speed=1, secs, msecs, pscaler2, lscaler2, ballSpeed, bSpeedReal=0, LsubScaler=1, PsubScaler=1, Pscaler=0.03,Lscaler=0.03;
    public static double dropSpeed;
    Timer T = new Timer(20,this);
    int move=0;
    AffineTransform original;
    static Image grass, ash, balloon, speech;
    
    Animation_SantosJ(){
        try {
            grass = ImageIO.read(this.getClass().getResource("grass.png"));
        } catch (Exception e) {
            System.out.println("No image was found");
        }
        try {
            ash = ImageIO.read(this.getClass().getResource("ash.png"));
        } catch (Exception e) {
            System.out.println("No image was found");
        }
        try {
            balloon = ImageIO.read(this.getClass().getResource("balloon.png"));
        } catch (Exception e) {
            System.out.println("No image was found");
        }
        try {
            speech = ImageIO.read(this.getClass().getResource("speech.png"));
        } catch (Exception e) {
            System.out.println("No image was found");
        }
    }
    
    public void grass(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(grass, 0, 0, 930, 730, null);
    }
    public void ash(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(ash, 10, 300, 150, 250, null);
    }
    public void balloon(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(balloon, 10, 100, 210, 220, null);
    }
    
    public void braso(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs2 = new BasicStroke(3.0f);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(bs2);        
        
        AffineTransform scale = new AffineTransform();
        scale.setToScale(0.9, 0.9);
        
        //Kaliwang arm
        GeneralPath lbraso = new GeneralPath();
        lbraso.moveTo(128, 414);
        lbraso.curveTo(95, 364, 70, 271, 95, 220);//lbraso1
        lbraso.curveTo(105, 200, 130, 168, 150, 177);//lbraso2
        lbraso.curveTo(190, 185, 240, 240, 260, 259);//lbraso3
        lbraso.curveTo(160, 320, 159, 365, 128, 414);//lbraso4
        g2d.setPaint(new Color(48,81,78));
        g2d.fill(scale.createTransformedShape(lbraso));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(lbraso));
        
        //Kaliwang kuko sa arm
        GeneralPath lbrasokuko = new GeneralPath();
        lbrasokuko.moveTo(95, 220);
        lbrasokuko.lineTo(85, 200);//lkuko1
        lbrasokuko.lineTo(105, 205);//lkuko2
        lbrasokuko.lineTo(94, 183);//lkuko3
        lbrasokuko.lineTo(115, 190);//lkuko4
        lbrasokuko.lineTo(115, 165);//lkuko5
        lbrasokuko.lineTo(137, 176);//lkuko6
        lbrasokuko.lineTo(142, 159);//lkuko7
        lbrasokuko.lineTo(154, 177);//lkuko8
        lbrasokuko.lineTo(162, 163);//lkuko9
        lbrasokuko.lineTo(168, 183);//lkuko10
        lbrasokuko.curveTo(140, 164, 120, 178, 95, 220);//lkuko11
        g2d.setPaint(new Color(230,240,240));
        g2d.fill(scale.createTransformedShape(lbrasokuko));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(lbrasokuko));
        
        //Kaliwang braso shadow
        Graphics2D g3d = (Graphics2D) g;
        BasicStroke bs1 = new BasicStroke(1.0f);
        g3d.setStroke(bs1);
        GeneralPath lbrasoshadow = new GeneralPath();
        lbrasoshadow.moveTo(153, 179);
        lbrasoshadow.curveTo(167, 198, 184, 247, 223, 282);//lbrasoshadow1
        lbrasoshadow.curveTo(230, 278, 240, 270, 257, 259);//lbrasoshadow2
        lbrasoshadow.curveTo(208, 210, 190, 193, 153, 179);//lbrasoshadow2
        g3d.setPaint(new Color(22,51,62));
        g3d.fill(scale.createTransformedShape(lbrasoshadow));
        g3d.draw(scale.createTransformedShape(lbrasoshadow));
    }
    public void snorlax(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs2 = new BasicStroke(3.0f);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(bs2);        
        
        AffineTransform scale = new AffineTransform();
        scale.setToScale(0.9, 0.9);
        
        //Katawan
        GeneralPath tiyan = new GeneralPath();
        tiyan.moveTo(295, 242);
        tiyan.curveTo(320, 227, 245, 260, 194, 310);//tiyan1
        tiyan.curveTo(148, 359, 102, 450, 110, 528);//tiyan2
        tiyan.lineTo(253,645);//tiyan3
        tiyan.curveTo(270, 657, 296, 653, 300, 653);//tiyan4
        tiyan.lineTo(640, 653);//tiyan5
        tiyan.curveTo(660, 653, 680, 656, 687, 646);//tiyan6
        tiyan.lineTo(790, 501);//tiyan7
        tiyan.curveTo(795, 450, 785, 359, 739, 310);//tiyan8
        tiyan.curveTo(688, 260, 630, 227, 583, 214);//tiyan9
        tiyan.curveTo(500, 198, 470, 188, 368, 213);//tiyan10
        tiyan.curveTo(315, 227, 255, 260, 295, 242);//tiyan11
        g2d.setPaint(new Color(48,81,78));
        g2d.fill(scale.createTransformedShape(tiyan));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(tiyan));
        
        //Tiyan   
        GeneralPath innertiyan = new GeneralPath();
        
        innertiyan.moveTo(295, 242);
        innertiyan.curveTo(290, 250, 280, 249, 260, 269);//innertiyan1
        innertiyan.curveTo(250, 280, 240, 280, 218, 310);//innertiyan2
        innertiyan.curveTo(205, 325, 191, 350, 189, 360);//innertiyan3
        innertiyan.curveTo(172, 390, 181, 420, 200, 442);//innertiyan4
        innertiyan.curveTo(210, 450, 220, 454, 240, 455);//innertiyan5
        innertiyan.curveTo(250, 452, 270, 455, 296, 444);//innertiyan6
        innertiyan.curveTo(310, 440, 320, 438, 350, 436);//innertiyan7
        innertiyan.curveTo(390, 428, 430, 435, 480, 439);//innertiyan8
        innertiyan.curveTo(510, 442, 530, 444, 590, 445);//innertiyan9
        innertiyan.curveTo(610, 445, 630, 445, 650, 445);//innertiyan10
        innertiyan.curveTo(680, 447, 700, 435, 717, 410);//innertiyan11
        innertiyan.curveTo(722, 400, 730, 380, 727, 370);//innertiyan12
        innertiyan.curveTo(730, 360, 723, 320, 715, 310);//innertiyan13
        innertiyan.curveTo(715, 305, 695, 270, 668, 254);//innertiyan14
        innertiyan.curveTo(640, 228, 620, 230, 583, 213);//innertiyan15
        innertiyan.curveTo(500, 198, 470, 188, 368, 213);//innertiyan16
        innertiyan.curveTo(315, 227, 300, 245, 295, 242);//innertiyan17
        g2d.setPaint(new Color(250,230,180));
        g2d.fill(scale.createTransformedShape(innertiyan));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(innertiyan));
        
        //Ulo
        GeneralPath ulo = new GeneralPath();
        ulo.moveTo(269, 252);
        ulo.curveTo(267, 273, 260, 186, 289, 158);//lpisngi
        ulo.curveTo(287, 121, 285, 66, 299, 44);//ltenga1
        ulo.curveTo(327, 40, 376, 64, 394, 73);//ltenga2
        ulo.lineTo(517, 73);//noo
        ulo.curveTo(553, 55, 611, 33, 638, 38);//rtenga1
        ulo.curveTo(652, 65, 650, 113, 648, 150);//rtenga2
        ulo.curveTo(670, 176, 675, 218, 668, 254);//rpisngi
        ulo.curveTo(640, 228, 620, 230, 583, 214);//leeg1
        ulo.curveTo(500, 198, 470, 188, 368, 213);//leeg2
        ulo.curveTo(315, 227, 300, 245, 269, 252);//leeg3
        g2d.setPaint(new Color(48,82,78));
        g2d.fill(scale.createTransformedShape(ulo));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(ulo));
        
        //Loob ng ulo
        GeneralPath innerface = new GeneralPath();
        innerface.moveTo(295, 242);
        innerface.curveTo(283, 182, 325, 125, 360, 110);//innerface1
        innerface.curveTo(382, 95, 436, 98, 460, 117);//innerface2
        innerface.curveTo(506, 92, 562, 94, 582, 108);//innerface3
        innerface.curveTo(655, 150, 655, 205, 645, 237);//innerface4
        innerface.curveTo(617, 220, 605, 225, 583, 214);//innerface5
        innerface.curveTo(500, 198, 470, 188, 368, 213);//innerface6
        innerface.curveTo(315, 227, 300, 245, 295, 242);//innerface7
        g2d.setPaint(new Color(250,230,180));
        g2d.fill(scale.createTransformedShape(innerface));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(innerface));
        
        //Left Mata
        GeneralPath lmata = new GeneralPath();
        lmata.moveTo(352, 147);
        lmata.curveTo(369, 142, 397, 140, 418, 143);//lmata
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(lmata));
        
        //Right Mata
        GeneralPath rmata = new GeneralPath();
        rmata.moveTo(501, 144);
        rmata.curveTo(527, 140, 555, 142, 570, 147);//rmata
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(rmata));
        
        //Bibig 
        GeneralPath bibig = new GeneralPath();
        bibig.moveTo(398, 187);
        bibig.curveTo(435, 179, 489, 179, 524, 183);//bibig
        bibig.lineTo(514, 169);//ngipin1
        bibig.lineTo(504, 182);//ngipin2
        bibig.curveTo(489, 179, 435, 179, 425, 183);//bibigreverse
        bibig.lineTo(412, 171);//ngipin3
        bibig.lineTo(402, 187);//ngipin3
        g2d.setPaint(Color.WHITE);
        g2d.fill(scale.createTransformedShape(bibig));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(bibig));
        
        //Kanang arm
        GeneralPath rbraso = new GeneralPath();
        rbraso.moveTo(720, 292);
        rbraso.curveTo(740, 304, 745, 298, 773, 317);//rbraso1
        rbraso.curveTo(805, 340, 820, 350, 837, 380);//rbraso2
        rbraso.curveTo(848, 395, 853, 410, 860, 420);//rbraso3
        rbraso.curveTo(870, 440, 880, 460, 880, 480);//rbraso4
        rbraso.curveTo(880, 505, 877, 520, 859, 528);//rbraso5
        rbraso.curveTo(855, 529, 850, 512, 840, 528);//rbrasokuko1
        rbraso.lineTo(790, 502);//rbraso5.5
        rbraso.curveTo(795, 448, 789, 354, 724, 296);//rbraso6
        g2d.setPaint(new Color(48,81,78));
        g2d.fill(scale.createTransformedShape(rbraso));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(rbraso));
        
        //Kanang kuko sa arm
        GeneralPath rbrasokuko = new GeneralPath();
        rbrasokuko.moveTo(859, 528);
        rbrasokuko.curveTo(855, 529, 850, 512, 840, 528);//rkuko1
        rbrasokuko.lineTo(851, 545);//rkuko1.5
        rbrasokuko.lineTo(859, 528);//rkuko2
        rbrasokuko.lineTo(870, 545);//rkuko3
        rbrasokuko.lineTo(873, 518);//rkuko4
        rbrasokuko.lineTo(890, 528);//rkuko5
        rbrasokuko.lineTo(880, 500);//rkuko6
        rbrasokuko.lineTo(899, 500);//rkuko7
        rbrasokuko.lineTo(880, 478);//rkuko8
        rbrasokuko.curveTo(876, 529, 880, 512, 859, 528);//rkuko8.5
        g2d.setPaint(new Color(183,198,192));
        g2d.fill(scale.createTransformedShape(rbrasokuko));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(rbrasokuko));
        
        //Epal na kuko sa kanang braso
        GeneralPath repalkuko = new GeneralPath();
        repalkuko.moveTo(890, 488);
        repalkuko.lineTo(899, 488);//repal1
        repalkuko.lineTo(880, 465);//repal2
        repalkuko.lineTo(880, 478);//repal3
        repalkuko.lineTo(890, 488);//repal4
        g2d.setPaint(new Color(183,198,192));
        g2d.fill(scale.createTransformedShape(repalkuko));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(repalkuko));
        
        //Kaliwang paa
        GeneralPath lpaa = new GeneralPath();
        lpaa.moveTo(138, 508);
        lpaa.curveTo(128, 510, 115, 518, 108, 526);//lpaa1
        lpaa.lineTo(80, 552);//lpaa1.5
        lpaa.curveTo(64, 569, 63, 595, 63, 600);//lpaa2
        lpaa.lineTo(62, 630);//lpaa2.5
        lpaa.curveTo(70, 650, 88, 678, 125, 685);//lpaa3
        lpaa.curveTo(145, 695, 200, 685, 216, 673);//lpaa4
        lpaa.curveTo(247, 657, 252, 642, 261, 627);//lpaa5
        lpaa.curveTo(280, 600, 278, 535, 236, 510);//lpaa6
        lpaa.curveTo(232, 504, 185, 496, 174, 500);//lpaa7
        lpaa.lineTo(138, 508);//lpaa7.5
        g2d.setPaint(new Color(250,230,180));
        g2d.fill(scale.createTransformedShape(lpaa));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(lpaa));
        
        //Unang kuko sa left paa
        GeneralPath lpaakuko1 = new GeneralPath();
        lpaakuko1.moveTo(113, 528);
        lpaakuko1.lineTo(68, 515);//lpaakuko1
        lpaakuko1.lineTo(85, 562);//lpaakuko2
        lpaakuko1.curveTo(100, 565, 120, 550, 113, 528);//lpaakuko3
        g2d.setPaint(new Color(229,238,238));
        g2d.fill(scale.createTransformedShape(lpaakuko1));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(lpaakuko1));
        
        //Pangalawang kuko sa left paa
        GeneralPath lpaakuko2 = new GeneralPath();
        lpaakuko2.moveTo(79, 600);
        lpaakuko2.curveTo(65, 602, 43, 603, 38, 609);//lpaakuko1
        lpaakuko2.curveTo(35, 611, 47, 626, 65, 631);//lpaakuko2
        lpaakuko2.curveTo(80, 633, 90, 611, 80, 601);//lpaakuko3
        g2d.setPaint(new Color(229,238,238));
        g2d.fill(scale.createTransformedShape(lpaakuko2));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(lpaakuko2));
        
        //Pangatlong kuko sa left paa
        GeneralPath lpaakuko3 = new GeneralPath();
        lpaakuko3.moveTo(140, 517);
        lpaakuko3.curveTo(140, 510, 143, 480, 145, 476);//lpaakuko1
        lpaakuko3.curveTo(145, 470, 165, 488, 180, 510);//lpaakuko2
        lpaakuko3.curveTo(165, 522, 157, 522, 140, 517);//lpaakuko3
        g2d.setPaint(new Color(229,238,238));
        g2d.fill(scale.createTransformedShape(lpaakuko3));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(lpaakuko3));
        
        //Left paa shadow
        GeneralPath lpaashadow = new GeneralPath();
        lpaashadow.moveTo(185, 682);
        lpaashadow.curveTo(160, 680, 140, 675, 128, 650);//lpaashadow1
        lpaashadow.curveTo(120, 630, 130, 600, 166, 575);//lpaashadow2
        lpaashadow.curveTo(190, 555, 220, 558, 269, 589);//lpaashadow3
        lpaashadow.curveTo(267, 645, 210, 680, 185, 682);//lpaashadow4
        g2d.setPaint(new Color(197,167,131));
        g2d.fill(scale.createTransformedShape(lpaashadow));
        g2d.draw(scale.createTransformedShape(lpaashadow));
        
        //Bilog sa left paa
        GeneralPath lbilogpaa = new GeneralPath();
        lbilogpaa.moveTo(238, 620);
        lbilogpaa.curveTo(243, 630, 228, 645, 221, 653);//linnerpaa1
        lbilogpaa.curveTo(210, 660, 205, 668, 190, 670);//linnerpaa2
        lbilogpaa.curveTo(132, 671, 135, 638, 160, 610);//linnerpaa3
        lbilogpaa.curveTo(170, 602, 177, 593, 195, 586);//linnerpaa4
        lbilogpaa.curveTo(210, 584, 233, 580, 238, 618);//linnerpaa5
        g2d.setPaint(new Color(160,100,64));
        g2d.fill(scale.createTransformedShape(lbilogpaa));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(lbilogpaa));
        
         //Kanang paa
        GeneralPath rpaa = new GeneralPath();
        rpaa.moveTo(770, 500);
        rpaa.curveTo(790, 500, 810, 510, 809, 509);//rpaa1
        rpaa.lineTo(838,525);//rpaa1.5
        rpaa.curveTo(847, 530, 862, 570, 858, 571);//rpaa2
        rpaa.lineTo(850, 605);//rpaa2.5
        rpaa.curveTo(848, 615, 843, 643, 797, 669);//rpaa3
        rpaa.curveTo(780, 675, 760, 675, 750, 673);//rpaa4
        rpaa.curveTo(730, 672, 710, 668, 698, 655);//rpaa5
        rpaa.curveTo(670, 635, 665, 615, 661, 600);//rpaa6
        rpaa.curveTo(643, 570, 685, 515, 725, 500);//rpaa7
        rpaa.lineTo(770, 500);//rpaa7.5
        g2d.setPaint(new Color(250,230,180));
        g2d.fill(scale.createTransformedShape(rpaa));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(rpaa));
        
        //Unang kuko sa right paa
        GeneralPath rpaakuko1 = new GeneralPath();
        rpaakuko1.moveTo(763, 515);
        rpaakuko1.curveTo(769, 505, 770, 475, 769, 460);//rpaakuko1
        rpaakuko1.curveTo(748, 475, 738, 490, 725, 500);//rpaakuko2
        rpaakuko1.curveTo(728, 525, 745, 530, 763, 515);//rpaakuko3
        g2d.setPaint(new Color(229,238,238));
        g2d.fill(scale.createTransformedShape(rpaakuko1));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(rpaakuko1));
        
        //Pangalawang kuko sa right paa
        GeneralPath rpaakuko2 = new GeneralPath();
        rpaakuko2.moveTo(799, 515);
        rpaakuko2.curveTo(831, 500, 846, 485, 848, 490);//rpaakuko1
        rpaakuko2.curveTo(842, 510, 840, 520, 830, 540);//rpaakuko2
        rpaakuko2.curveTo(826, 550, 792, 545, 799, 515);//rpaakuko3
        g2d.setPaint(new Color(229,238,238));
        g2d.fill(scale.createTransformedShape(rpaakuko2));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(rpaakuko2));
        
        //Pangatlong kuko sa right paa
        GeneralPath rpaakuko3 = new GeneralPath();
        rpaakuko3.moveTo(842, 570);
        rpaakuko3.curveTo(855, 573, 865, 572, 890, 580);//rpaakuko1
        rpaakuko3.curveTo(890, 580, 867, 600, 850, 605);//rpaakuko2
        rpaakuko3.curveTo(831, 600, 833, 575, 842, 570);//rpaakuko3
        g2d.setPaint(new Color(229,238,238));
        g2d.fill(scale.createTransformedShape(rpaakuko3));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(rpaakuko3));
        
        //Right paa shadow
        GeneralPath rpaashadow = new GeneralPath();
        rpaashadow.moveTo(691, 645);
        rpaashadow.curveTo(654, 619, 677, 580, 695, 578);//rpaashadow1
        rpaashadow.curveTo(705, 570, 730, 574, 760, 580);//rpaashadow2
        rpaashadow.curveTo(785, 585, 800, 600, 798, 620);//rpaashadow3
        rpaashadow.curveTo(798, 625, 805, 640, 782, 662);//rpaashadow4
        rpaashadow.curveTo(760, 677, 714, 673, 691, 645);//rpaashadow5
        g2d.setPaint(new Color(196,166,131));
        g2d.fill(scale.createTransformedShape(rpaashadow));
        g2d.draw(scale.createTransformedShape(rpaashadow));
        
        //Bilog sa right paa
        GeneralPath rbilogpaa = new GeneralPath();
        rbilogpaa.moveTo(710, 585);
        rbilogpaa.curveTo(700, 585, 685, 595, 688, 610);//rinnerpaa1
        rbilogpaa.curveTo(688, 617, 692, 628, 706, 640);//rinnerpaa2
        rbilogpaa.curveTo(730, 650, 755, 650, 770, 631);//rinnerpaa3
        rbilogpaa.curveTo(775, 625, 780, 618, 768, 600);//rinnerpaa4
        rbilogpaa.curveTo(745, 577, 715, 585, 710, 585);//rinnerpaa5
        g2d.setPaint(new Color(160,100,64));
        g2d.fill(scale.createTransformedShape(rbilogpaa));
        g2d.setPaint(Color.BLACK);
        g2d.draw(scale.createTransformedShape(rbilogpaa));
        
        //Inner tiyan shadow
        Graphics2D g3d = (Graphics2D) g;
        BasicStroke bs1 = new BasicStroke(1.0f);
        g3d.setStroke(bs1);
        GeneralPath innertiyanshadow = new GeneralPath();
        innertiyanshadow.moveTo(590,443);
        innertiyanshadow.curveTo(680, 413, 710, 320, 668, 256);//innertiyanshadow1
        innertiyanshadow.curveTo(675, 258, 700, 282, 714, 310);//innertiyanshadow2
        innertiyanshadow.curveTo(730, 357, 723, 350, 726, 370);//innertiyanshadow3
        innertiyanshadow.curveTo(721, 400, 728, 380, 714, 410);//innertiyanshadow4
        innertiyanshadow.curveTo(690, 440, 680, 442, 650, 443);//innertiyanshadow5
        innertiyanshadow.curveTo(610, 443, 630, 443, 590, 443);//innertiyanshadow6
        g3d.setPaint(new Color(197,167,130));
        g3d.fill(scale.createTransformedShape(innertiyanshadow));
        g3d.draw(scale.createTransformedShape(innertiyanshadow));
        
        //Kanang braso shadow
        GeneralPath rbrasoshadow = new GeneralPath();
        rbrasoshadow.moveTo(877, 465);
        rbrasoshadow.curveTo(870, 500, 850, 510, 846, 508);//rbrasoshadow1
        rbrasoshadow.curveTo(841, 515, 841, 521, 840, 523);//rbrasoshadow2
        rbrasoshadow.lineTo(839, 525);//rbrasoshadow3
        rbrasoshadow.curveTo(850, 512, 855, 527, 859, 525);//rbrasoshadow4
        rbrasoshadow.curveTo(881, 515, 877, 489, 877, 465);//rbrasoshadow5
        g3d.setPaint(new Color(21,50,61));
        g3d.fill(scale.createTransformedShape(rbrasoshadow));
        g3d.draw(scale.createTransformedShape(rbrasoshadow));
        
        //Mukha shadow
        GeneralPath mukhashadow = new GeneralPath();
        mukhashadow.moveTo(627, 148);
        mukhashadow.curveTo(620, 190, 610, 200, 588, 214);//mukhashadow1
        mukhashadow.curveTo(622, 226, 612, 222, 644, 234);//mukhashadow2
        mukhashadow.curveTo(649, 200, 653, 189, 627, 148);//mukhashadow3
        g3d.setPaint(new Color(196,166,131));
        g3d.fill(scale.createTransformedShape(mukhashadow));
        g3d.draw(scale.createTransformedShape(mukhashadow));
        
        //Innerface shadow
        GeneralPath innerfaceshadow = new GeneralPath();
        innerfaceshadow.moveTo(627, 142);
        innerfaceshadow.curveTo(659, 189, 652, 200, 648, 237);//mukhashadow1
        innerfaceshadow.curveTo(660, 245, 662, 246, 666, 251);//mukhashadow2
        innerfaceshadow.curveTo(673, 218, 668, 176, 646, 150);//mukhashadow3
        innerfaceshadow.curveTo(648, 113, 650, 65, 637, 39);//mukhashadow3
        innerfaceshadow.curveTo(615, 60, 620, 135, 627, 142);//mukhashadow3
        g3d.setPaint(new Color(21,51,61));
        g3d.fill(scale.createTransformedShape(innerfaceshadow));
        g3d.draw(scale.createTransformedShape(innerfaceshadow));
        
        //Tiyan shadow
        GeneralPath tiyanshadow = new GeneralPath();
        tiyanshadow.moveTo(241, 511);
        tiyanshadow.curveTo(295, 520, 320, 600, 320, 600);//tiyanshadow1
        tiyanshadow.curveTo(500, 550, 540, 590, 659, 600);//tiyanshadow2
        tiyanshadow.curveTo(663, 615, 668, 630, 684, 645);//tiyanshadow3
        tiyanshadow.curveTo(680, 654, 660, 651, 640, 651);//tiyanshadow4
        tiyanshadow.lineTo(300, 651);
        tiyanshadow.curveTo(270, 651, 279, 654, 254, 643);//tiyanshadow5
        tiyanshadow.curveTo(290, 600, 275, 530, 241, 511);//tiyanshadow6
        g3d.setPaint(new Color(21,50,61));
        g3d.fill(scale.createTransformedShape(tiyanshadow));
        g3d.draw(scale.createTransformedShape(tiyanshadow));
        
        //Left paa kuko shadow
        GeneralPath lkukoshadow1 = new GeneralPath();
        
        lkukoshadow1.moveTo(178,509);//unang kuko
        lkukoshadow1.lineTo(154, 482);
        lkukoshadow1.lineTo(165,516);
        lkukoshadow1.curveTo(178, 512, 178, 509, 178, 509);
        
        lkukoshadow1.moveTo(110, 528);//pangalwang kuko
        lkukoshadow1.lineTo(72,518);
        lkukoshadow1.lineTo(111, 546);
        lkukoshadow1.curveTo(113, 540, 114, 530, 110, 528);
               
        lkukoshadow1.moveTo(60,604);//pangatlong kuko
        lkukoshadow1.lineTo(76, 602);
        lkukoshadow1.curveTo(82, 605, 83, 612, 80, 620);
        lkukoshadow1.lineTo(60,604);
        g3d.setPaint(new Color(182,198,191));
        g3d.setPaint(new Color(182,198,191));  
        g3d.fill(scale.createTransformedShape(lkukoshadow1));
        g3d.draw(scale.createTransformedShape(lkukoshadow1));
        
        //Right paa kuko shadow
        GeneralPath rkukoshadow1 = new GeneralPath();    
        rkukoshadow1.moveTo(762, 513);//unang kuko
        rkukoshadow1.curveTo(766, 502, 766, 492, 766, 492);
        rkukoshadow1.lineTo(750, 520);
        rkukoshadow1.lineTo(762, 513);
        
        rkukoshadow1.moveTo(828, 540);//pangalawang kuko
        rkukoshadow1.lineTo(839, 513);
        rkukoshadow1.lineTo(815, 542);
        rkukoshadow1.curveTo(819, 542, 826, 542, 828, 540);

        rkukoshadow1.moveTo(850, 603);//pangatlong kuko
        rkukoshadow1.curveTo(863, 598, 872, 591, 882, 584);
        rkukoshadow1.lineTo(838, 583);
        rkukoshadow1.curveTo(834, 591, 843, 602, 850, 603);
        g3d.setPaint(new Color(182,198,191));
        g3d.fill(scale.createTransformedShape(rkukoshadow1));
        g3d.draw(scale.createTransformedShape(rkukoshadow1));
    }
    
     public void redsnorlax(Graphics g){
        //Katawan
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs2 = new BasicStroke(3.0f);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(bs2);        
        
        g2d.setPaint(Color.RED);
        
        GeneralPath tiyan = new GeneralPath();
        tiyan.moveTo(295, 242);
        tiyan.curveTo(320, 227, 245, 260, 194, 310);//tiyan1
        tiyan.curveTo(148, 359, 102, 450, 110, 528);//tiyan2
        tiyan.lineTo(253,645);//tiyan3
        tiyan.curveTo(270, 657, 296, 653, 300, 653);//tiyan4
        tiyan.lineTo(640, 653);//tiyan5
        tiyan.curveTo(660, 653, 680, 656, 687, 646);//tiyan6
        tiyan.lineTo(790, 501);//tiyan7
        tiyan.curveTo(795, 450, 785, 359, 739, 310);//tiyan8
        tiyan.curveTo(688, 260, 630, 227, 583, 214);//tiyan9
        tiyan.curveTo(500, 198, 470, 188, 368, 213);//tiyan10
        tiyan.curveTo(315, 227, 255, 260, 295, 242);//tiyan11
        g2d.fill(tiyan);
        g2d.draw(tiyan);
        
        //Tiyan   
        GeneralPath innertiyan = new GeneralPath();
        
        innertiyan.moveTo(295, 242);
        innertiyan.curveTo(290, 250, 280, 249, 260, 269);//innertiyan1
        innertiyan.curveTo(250, 280, 240, 280, 218, 310);//innertiyan2
        innertiyan.curveTo(205, 325, 191, 350, 189, 360);//innertiyan3
        innertiyan.curveTo(172, 390, 181, 420, 200, 442);//innertiyan4
        innertiyan.curveTo(210, 450, 220, 454, 240, 455);//innertiyan5
        innertiyan.curveTo(250, 452, 270, 455, 296, 444);//innertiyan6
        innertiyan.curveTo(310, 440, 320, 438, 350, 436);//innertiyan7
        innertiyan.curveTo(390, 428, 430, 435, 480, 439);//innertiyan8
        innertiyan.curveTo(510, 442, 530, 444, 590, 445);//innertiyan9
        innertiyan.curveTo(610, 445, 630, 445, 650, 445);//innertiyan10
        innertiyan.curveTo(680, 447, 700, 435, 717, 410);//innertiyan11
        innertiyan.curveTo(722, 400, 730, 380, 727, 370);//innertiyan12
        innertiyan.curveTo(730, 360, 723, 320, 715, 310);//innertiyan13
        innertiyan.curveTo(715, 305, 695, 270, 668, 254);//innertiyan14
        innertiyan.curveTo(640, 228, 620, 230, 583, 213);//innertiyan15
        innertiyan.curveTo(500, 198, 470, 188, 368, 213);//innertiyan16
        innertiyan.curveTo(315, 227, 300, 245, 295, 242);//innertiyan17
        g2d.fill(innertiyan);
        g2d.draw(innertiyan);
        
        //Ulo
        GeneralPath ulo = new GeneralPath();
        ulo.moveTo(269, 252);
        ulo.curveTo(267, 273, 260, 186, 289, 158);//lpisngi
        ulo.curveTo(287, 121, 285, 66, 299, 44);//ltenga1
        ulo.curveTo(327, 40, 376, 64, 394, 73);//ltenga2
        ulo.lineTo(517, 73);//noo
        ulo.curveTo(553, 55, 611, 33, 638, 38);//rtenga1
        ulo.curveTo(652, 65, 650, 113, 648, 150);//rtenga2
        ulo.curveTo(670, 176, 675, 218, 668, 254);//rpisngi
        ulo.curveTo(640, 228, 620, 230, 583, 214);//leeg1
        ulo.curveTo(500, 198, 470, 188, 368, 213);//leeg2
        ulo.curveTo(315, 227, 300, 245, 269, 252);//leeg3
        g2d.fill(ulo);
        
        
        //Loob ng ulo
        GeneralPath innerface = new GeneralPath();
        innerface.moveTo(295, 242);
        innerface.curveTo(283, 182, 325, 125, 360, 110);//innerface1
        innerface.curveTo(382, 95, 436, 98, 460, 117);//innerface2
        innerface.curveTo(506, 92, 562, 94, 582, 108);//innerface3
        innerface.curveTo(655, 150, 655, 205, 645, 237);//innerface4
        innerface.curveTo(617, 220, 605, 225, 583, 214);//innerface5
        innerface.curveTo(500, 198, 470, 188, 368, 213);//innerface6
        innerface.curveTo(315, 227, 300, 245, 295, 242);//innerface7
        g2d.fill(innerface);
        g2d.draw(innerface);
        
        //Left Mata
        GeneralPath lmata = new GeneralPath();
        lmata.moveTo(352, 147);
        lmata.curveTo(369, 142, 397, 140, 418, 143);//lmata
        g2d.draw(lmata);
        
        //Right Mata
        GeneralPath rmata = new GeneralPath();
        rmata.moveTo(501, 144);
        rmata.curveTo(527, 140, 555, 142, 570, 147);//rmata
        g2d.draw(rmata);
        
        //Bibig 
        GeneralPath bibig = new GeneralPath();
        bibig.moveTo(398, 187);
        bibig.curveTo(435, 179, 489, 179, 524, 183);//bibig
        bibig.lineTo(514, 169);//ngipin1
        bibig.lineTo(504, 182);//ngipin2
        bibig.curveTo(489, 179, 435, 179, 425, 183);//bibigreverse
        bibig.lineTo(412, 171);//ngipin3
        bibig.lineTo(402, 187);//ngipin3
        g2d.fill(bibig);
        g2d.draw(bibig);
        
        //Kaliwang arm
        GeneralPath lbraso = new GeneralPath();
        lbraso.moveTo(128, 414);
        lbraso.curveTo(95, 364, 70, 271, 95, 220);//lbraso1
        lbraso.curveTo(105, 200, 130, 168, 150, 177);//lbraso2
        lbraso.curveTo(190, 185, 240, 240, 260, 259);//lbraso3
        lbraso.curveTo(160, 320, 159, 365, 128, 414);//lbraso4
        g2d.fill(lbraso);
        
        //Kaliwang kuko sa arm
        GeneralPath lbrasokuko = new GeneralPath();
        lbrasokuko.moveTo(95, 220);
        lbrasokuko.lineTo(85, 200);//lkuko1
        lbrasokuko.lineTo(105, 205);//lkuko2
        lbrasokuko.lineTo(94, 183);//lkuko3
        lbrasokuko.lineTo(115, 190);//lkuko4
        lbrasokuko.lineTo(115, 165);//lkuko5
        lbrasokuko.lineTo(137, 176);//lkuko6
        lbrasokuko.lineTo(142, 159);//lkuko7
        lbrasokuko.lineTo(154, 177);//lkuko8
        lbrasokuko.lineTo(162, 163);//lkuko9
        lbrasokuko.lineTo(168, 183);//lkuko10
        lbrasokuko.curveTo(140, 164, 120, 178, 95, 220);//lkuko11
        g2d.fill(lbrasokuko);
        g2d.draw(lbrasokuko);        
        
        //Kanang arm
        GeneralPath rbraso = new GeneralPath();
        rbraso.moveTo(720, 292);
        rbraso.curveTo(740, 304, 745, 298, 773, 317);//rbraso1
        rbraso.curveTo(805, 340, 820, 350, 837, 380);//rbraso2
        rbraso.curveTo(848, 395, 853, 410, 860, 420);//rbraso3
        rbraso.curveTo(870, 440, 880, 460, 880, 480);//rbraso4
        rbraso.curveTo(880, 505, 877, 520, 859, 528);//rbraso5
        rbraso.curveTo(855, 529, 850, 512, 840, 528);//rbrasokuko1
        rbraso.lineTo(790, 502);//rbraso5.5
        rbraso.curveTo(795, 448, 789, 354, 724, 296);//rbraso6
        g2d.fill(rbraso);
        
        //Kanang kuko sa arm
        GeneralPath rbrasokuko = new GeneralPath();
        rbrasokuko.moveTo(859, 528);
        rbrasokuko.curveTo(855, 529, 850, 512, 840, 528);//rkuko1
        rbrasokuko.lineTo(851, 545);//rkuko1.5
        rbrasokuko.lineTo(859, 528);//rkuko2
        rbrasokuko.lineTo(870, 545);//rkuko3
        rbrasokuko.lineTo(873, 518);//rkuko4
        rbrasokuko.lineTo(890, 528);//rkuko5
        rbrasokuko.lineTo(880, 500);//rkuko6
        rbrasokuko.lineTo(899, 500);//rkuko7
        rbrasokuko.lineTo(880, 478);//rkuko8
        rbrasokuko.curveTo(876, 529, 880, 512, 859, 528);//rkuko8.5
        g2d.fill(rbrasokuko);
        g2d.draw(rbrasokuko);
        
        //Epal na kuko sa kanang braso
        GeneralPath repalkuko = new GeneralPath();
        repalkuko.moveTo(890, 488);
        repalkuko.lineTo(899, 488);//repal1
        repalkuko.lineTo(880, 465);//repal2
        repalkuko.lineTo(880, 478);//repal3
        repalkuko.lineTo(890, 488);//repal4
        g2d.fill(repalkuko);
        g2d.draw(repalkuko);
        
        //Kaliwang paa
        GeneralPath lpaa = new GeneralPath();
        lpaa.moveTo(138, 508);
        lpaa.curveTo(128, 510, 115, 518, 108, 526);//lpaa1
        lpaa.lineTo(80, 552);//lpaa1.5
        lpaa.curveTo(64, 569, 63, 595, 63, 600);//lpaa2
        lpaa.lineTo(62, 630);//lpaa2.5
        lpaa.curveTo(70, 650, 88, 678, 125, 685);//lpaa3
        lpaa.curveTo(145, 695, 200, 685, 216, 673);//lpaa4
        lpaa.curveTo(247, 657, 252, 642, 261, 627);//lpaa5
        lpaa.curveTo(280, 600, 278, 535, 236, 510);//lpaa6
        lpaa.curveTo(232, 504, 185, 496, 174, 500);//lpaa7
        lpaa.lineTo(138, 508);//lpaa7.5
        g2d.fill(lpaa);
        
        //Unang kuko sa left paa
        GeneralPath lpaakuko1 = new GeneralPath();
        lpaakuko1.moveTo(113, 528);
        lpaakuko1.lineTo(68, 515);//lpaakuko1
        lpaakuko1.lineTo(85, 562);//lpaakuko2
        lpaakuko1.curveTo(100, 565, 120, 550, 113, 528);//lpaakuko3
        g2d.fill(lpaakuko1);
        g2d.draw(lpaakuko1);
        
        //Pangalawang kuko sa left paa
        GeneralPath lpaakuko2 = new GeneralPath();
        lpaakuko2.moveTo(79, 600);
        lpaakuko2.curveTo(65, 602, 43, 603, 38, 609);//lpaakuko1
        lpaakuko2.curveTo(35, 611, 47, 626, 65, 631);//lpaakuko2
        lpaakuko2.curveTo(80, 633, 90, 611, 80, 601);//lpaakuko3
        g2d.fill(lpaakuko2);
        g2d.draw(lpaakuko2);
        
        //Pangatlong kuko sa left paa
        GeneralPath lpaakuko3 = new GeneralPath();
        lpaakuko3.moveTo(140, 517);
        lpaakuko3.curveTo(140, 510, 143, 480, 145, 476);//lpaakuko1
        lpaakuko3.curveTo(145, 470, 165, 488, 180, 510);//lpaakuko2
        lpaakuko3.curveTo(165, 522, 157, 522, 140, 517);//lpaakuko3
        g2d.fill(lpaakuko3);
        g2d.draw(lpaakuko3);
        
        //Left paa shadow
        GeneralPath lpaashadow = new GeneralPath();
        lpaashadow.moveTo(185, 682);
        lpaashadow.curveTo(160, 680, 140, 675, 128, 650);//lpaashadow1
        lpaashadow.curveTo(120, 630, 130, 600, 166, 575);//lpaashadow2
        lpaashadow.curveTo(190, 555, 220, 558, 269, 589);//lpaashadow3
        lpaashadow.curveTo(267, 645, 210, 680, 185, 682);//lpaashadow4
        g2d.fill(lpaashadow);
        g2d.draw(lpaashadow);
        
        //Bilog sa left paa
        GeneralPath lbilogpaa = new GeneralPath();
        lbilogpaa.moveTo(238, 620);
        lbilogpaa.curveTo(243, 630, 228, 645, 221, 653);//linnerpaa1
        lbilogpaa.curveTo(210, 660, 205, 668, 190, 670);//linnerpaa2
        lbilogpaa.curveTo(132, 671, 135, 638, 160, 610);//linnerpaa3
        lbilogpaa.curveTo(170, 602, 177, 593, 195, 586);//linnerpaa4
        lbilogpaa.curveTo(210, 584, 233, 580, 238, 618);//linnerpaa5
        g2d.fill(lbilogpaa);
        g2d.draw(lbilogpaa);
        
         //Kanang paa
        GeneralPath rpaa = new GeneralPath();
        rpaa.moveTo(770, 500);
        rpaa.curveTo(790, 500, 810, 510, 809, 509);//rpaa1
        rpaa.lineTo(838,525);//rpaa1.5
        rpaa.curveTo(847, 530, 862, 570, 858, 571);//rpaa2
        rpaa.lineTo(850, 605);//rpaa2.5
        rpaa.curveTo(848, 615, 843, 643, 797, 669);//rpaa3
        rpaa.curveTo(780, 675, 760, 675, 750, 673);//rpaa4
        rpaa.curveTo(730, 672, 710, 668, 698, 655);//rpaa5
        rpaa.curveTo(670, 635, 665, 615, 661, 600);//rpaa6
        rpaa.curveTo(643, 570, 685, 515, 725, 500);//rpaa7
        rpaa.lineTo(770, 500);//rpaa7.5
        g2d.fill(rpaa);
        
        
        //Unang kuko sa right paa
        GeneralPath rpaakuko1 = new GeneralPath();
        rpaakuko1.moveTo(763, 515);
        rpaakuko1.curveTo(769, 505, 770, 475, 769, 460);//rpaakuko1
        rpaakuko1.curveTo(748, 475, 738, 490, 725, 500);//rpaakuko2
        rpaakuko1.curveTo(728, 525, 745, 530, 763, 515);//rpaakuko3
        g2d.fill(rpaakuko1);
        g2d.draw(rpaakuko1);
        
        //Pangalawang kuko sa right paa
        GeneralPath rpaakuko2 = new GeneralPath();
        rpaakuko2.moveTo(799, 515);
        rpaakuko2.curveTo(831, 500, 846, 485, 848, 490);//rpaakuko1
        rpaakuko2.curveTo(842, 510, 840, 520, 830, 540);//rpaakuko2
        rpaakuko2.curveTo(826, 550, 792, 545, 799, 515);//rpaakuko3
        g2d.fill(rpaakuko2);
        g2d.draw(rpaakuko2);
        
        //Pangatlong kuko sa right paa
        GeneralPath rpaakuko3 = new GeneralPath();
        rpaakuko3.moveTo(842, 570);
        rpaakuko3.curveTo(855, 573, 865, 572, 890, 580);//rpaakuko1
        rpaakuko3.curveTo(890, 580, 867, 600, 850, 605);//rpaakuko2
        rpaakuko3.curveTo(831, 600, 833, 575, 842, 570);//rpaakuko3
        g2d.fill(rpaakuko3);
        g2d.draw(rpaakuko3);
        
        //Right paa shadow
        GeneralPath rpaashadow = new GeneralPath();
        rpaashadow.moveTo(691, 645);
        rpaashadow.curveTo(654, 619, 677, 580, 695, 578);//rpaashadow1
        rpaashadow.curveTo(705, 570, 730, 574, 760, 580);//rpaashadow2
        rpaashadow.curveTo(785, 585, 800, 600, 798, 620);//rpaashadow3
        rpaashadow.curveTo(798, 625, 805, 640, 782, 662);//rpaashadow4
        rpaashadow.curveTo(760, 677, 714, 673, 691, 645);//rpaashadow5
        g2d.fill(rpaashadow);
        g2d.draw(rpaashadow);
        
        //Bilog sa right paa
        GeneralPath rbilogpaa = new GeneralPath();
        rbilogpaa.moveTo(710, 585);
        rbilogpaa.curveTo(700, 585, 685, 595, 688, 610);//rinnerpaa1
        rbilogpaa.curveTo(688, 617, 692, 628, 706, 640);//rinnerpaa2
        rbilogpaa.curveTo(730, 650, 755, 650, 770, 631);//rinnerpaa3
        rbilogpaa.curveTo(775, 625, 780, 618, 768, 600);//rinnerpaa4
        rbilogpaa.curveTo(745, 577, 715, 585, 710, 585);//rinnerpaa5
        g2d.fill(rbilogpaa);
        g2d.draw(rbilogpaa);
        
        //Inner tiyan shadow
        Graphics2D g3d = (Graphics2D) g;
        BasicStroke bs1 = new BasicStroke(3.0f);
        g3d.setStroke(bs1);
        GeneralPath innertiyanshadow = new GeneralPath();
        innertiyanshadow.moveTo(590,443);
        innertiyanshadow.curveTo(680, 413, 710, 320, 668, 256);//innertiyanshadow1
        innertiyanshadow.curveTo(675, 258, 700, 282, 714, 310);//innertiyanshadow2
        innertiyanshadow.curveTo(730, 357, 723, 350, 726, 370);//innertiyanshadow3
        innertiyanshadow.curveTo(721, 400, 728, 380, 714, 410);//innertiyanshadow4
        innertiyanshadow.curveTo(690, 440, 680, 442, 650, 443);//innertiyanshadow5
        innertiyanshadow.curveTo(610, 443, 630, 443, 590, 443);//innertiyanshadow6
        g3d.fill(innertiyanshadow);
        g3d.draw(innertiyanshadow);
        
        //Kaliwang braso shadow
        GeneralPath lbrasoshadow = new GeneralPath();
        lbrasoshadow.moveTo(153, 179);
        lbrasoshadow.curveTo(167, 198, 184, 247, 223, 282);//lbrasoshadow1
        lbrasoshadow.curveTo(230, 278, 240, 270, 257, 259);//lbrasoshadow2
        lbrasoshadow.curveTo(208, 210, 190, 193, 153, 179);//lbrasoshadow2
        g3d.fill(lbrasoshadow);
        g3d.draw(lbrasoshadow);
        
        //Kanang braso shadow
        GeneralPath rbrasoshadow = new GeneralPath();
        rbrasoshadow.moveTo(877, 465);
        rbrasoshadow.curveTo(870, 500, 850, 510, 846, 508);//rbrasoshadow1
        rbrasoshadow.curveTo(841, 515, 841, 521, 840, 523);//rbrasoshadow2
        rbrasoshadow.lineTo(839, 525);//rbrasoshadow3
        rbrasoshadow.curveTo(850, 512, 855, 527, 859, 525);//rbrasoshadow4
        rbrasoshadow.curveTo(881, 515, 877, 489, 877, 465);//rbrasoshadow5
        g3d.fill(rbrasoshadow);
        g3d.draw(rbrasoshadow);
        
        //Mukha shadow
        GeneralPath mukhashadow = new GeneralPath();
        mukhashadow.moveTo(627, 148);
        mukhashadow.curveTo(620, 190, 610, 200, 588, 214);//mukhashadow1
        mukhashadow.curveTo(622, 226, 612, 222, 644, 234);//mukhashadow2
        mukhashadow.curveTo(649, 200, 653, 189, 627, 148);//mukhashadow3
        g3d.fill(mukhashadow);
        g3d.draw(mukhashadow);
        
        //Innerface shadow
        GeneralPath innerfaceshadow = new GeneralPath();
        innerfaceshadow.moveTo(627, 142);
        innerfaceshadow.curveTo(659, 189, 652, 200, 648, 237);//mukhashadow1
        innerfaceshadow.curveTo(660, 245, 662, 246, 666, 251);//mukhashadow2
        innerfaceshadow.curveTo(673, 218, 668, 176, 646, 150);//mukhashadow3
        innerfaceshadow.curveTo(648, 113, 650, 65, 637, 39);//mukhashadow3
        innerfaceshadow.curveTo(615, 60, 620, 135, 627, 142);//mukhashadow3
        g3d.fill(innerfaceshadow);
        g3d.draw(innerfaceshadow);
        
        //Tiyan shadow
        GeneralPath tiyanshadow = new GeneralPath();
        tiyanshadow.moveTo(241, 511);
        tiyanshadow.curveTo(295, 520, 320, 600, 320, 600);//tiyanshadow1
        tiyanshadow.curveTo(500, 550, 540, 590, 659, 600);//tiyanshadow2
        tiyanshadow.curveTo(663, 615, 668, 630, 684, 645);//tiyanshadow3
        tiyanshadow.curveTo(680, 654, 660, 651, 640, 651);//tiyanshadow4
        tiyanshadow.lineTo(300, 651);
        tiyanshadow.curveTo(270, 651, 279, 654, 254, 643);//tiyanshadow5
        tiyanshadow.curveTo(290, 600, 275, 530, 241, 511);//tiyanshadow6
        g3d.fill(tiyanshadow);
        g3d.draw(tiyanshadow);
        
        //Left paa kuko shadow
        GeneralPath lkukoshadow1 = new GeneralPath();
        
        lkukoshadow1.moveTo(178,509);//unang kuko
        lkukoshadow1.lineTo(154, 482);
        lkukoshadow1.lineTo(165,516);
        lkukoshadow1.curveTo(178, 512, 178, 509, 178, 509);
        
        lkukoshadow1.moveTo(110, 528);//pangalwang kuko
        lkukoshadow1.lineTo(72,518);
        lkukoshadow1.lineTo(111, 546);
        lkukoshadow1.curveTo(113, 540, 114, 530, 110, 528);
               
        lkukoshadow1.moveTo(60,604);//pangatlong kuko
        lkukoshadow1.lineTo(76, 602);
        lkukoshadow1.curveTo(82, 605, 83, 612, 80, 620);
        lkukoshadow1.lineTo(60,604);
        g3d.fill(lkukoshadow1);
        g3d.draw(lkukoshadow1);
        
        //Right paa kuko shadow
        GeneralPath rkukoshadow1 = new GeneralPath();    
        rkukoshadow1.moveTo(762, 513);//unang kuko
        rkukoshadow1.curveTo(766, 502, 766, 492, 766, 492);
        rkukoshadow1.lineTo(750, 520);
        rkukoshadow1.lineTo(762, 513);
        
        rkukoshadow1.moveTo(828, 540);//pangalawang kuko
        rkukoshadow1.lineTo(839, 513);
        rkukoshadow1.lineTo(815, 542);
        rkukoshadow1.curveTo(819, 542, 826, 542, 828, 540);

        rkukoshadow1.moveTo(850, 603);//pangatlong kuko
        rkukoshadow1.curveTo(863, 598, 872, 591, 882, 584);
        rkukoshadow1.lineTo(838, 583);
        rkukoshadow1.curveTo(834, 591, 843, 602, 850, 603);
        g3d.fill(rkukoshadow1);
        g3d.draw(rkukoshadow1);
        
        g2d.setPaint(new Color(139,0,0));
        g2d.draw(ulo);
        g2d.draw(lbraso);
        g2d.draw(rbraso);
        g2d.draw(lpaa);
        g2d.draw(rpaa);
    }
//    public void light(Graphics g, double scx, double scy){
//        Graphics2D g2d = (Graphics2D) g;
//        BasicStroke bs1 = new BasicStroke(2.0f);
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2d.setStroke(bs1);
//        
//        AffineTransform scale = new AffineTransform();
//        scale.setToScale(scx, scy);
//        
//        GeneralPath light = new GeneralPath();
//        light.moveTo(63, 55);
//        light.lineTo(240, 690);
//        light.lineTo(920, 690);
//        light.lineTo(63, 55);
//        g2d.setPaint(Color.YELLOW);
//        g2d.fill(scale.createTransformedShape(light));
//    }
    
    public void pokeball(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs2 = new BasicStroke(3.0f);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(bs2); 
        
        GeneralPath upperline = new GeneralPath();
        GeneralPath lowerline = new GeneralPath();     
      
        Ellipse2D.Double pokeballout = new Ellipse2D.Double(10, 10, 100, 100);
        g2d.setPaint(Color.WHITE);
        g2d.fill(pokeballout);
        g2d.setPaint(Color.BLACK);
        g2d.draw(pokeballout);
        
        upperline.moveTo(12, 50);
        upperline.quadTo(30, 47, 48, 50);
        upperline.curveTo(55, 36, 78, 36, 80, 55);
        upperline.lineTo(110, 63);
        upperline.quadTo(111, 22, 68, 10);
        upperline.curveTo(56, 10, 18, 10, 10, 55);
        g2d.setPaint(new Color(240,64,55));
        g2d.fill(upperline);
        g2d.setPaint(Color.BLACK);
        g2d.draw(upperline);
        
        lowerline.moveTo(11, 60);
        lowerline.quadTo(30, 57, 47, 60);
        lowerline.curveTo(50, 75, 72, 75, 78, 65);
        lowerline.lineTo(108, 73);
        lowerline.quadTo(110, 68, 110, 63);
        lowerline.lineTo(80, 55);
        lowerline.curveTo(78, 36, 55, 36, 48, 50);
        lowerline.quadTo(30, 47, 12, 50);
        lowerline.quadTo(10, 55, 11, 60);
        g2d.setPaint(new Color(88,88,91));
        g2d.fill(lowerline);
        g2d.setPaint(Color.BLACK);
        g2d.draw(lowerline);
        
        Ellipse2D.Double inner = new Ellipse2D.Double(54, 46, 20, 20);
        g2d.setPaint(Color.WHITE);
        g2d.fill(inner);
        g2d.setPaint(Color.BLACK);
        g2d.draw(inner);
        
        Ellipse2D.Double inner2 = new Ellipse2D.Double(59, 51, 10, 10);
        g2d.setPaint(Color.WHITE);
        g2d.fill(inner2);
        g2d.setPaint(Color.BLACK);
        g2d.draw(inner2);
    }
    
    public void paintComponent(Graphics g)
    {  
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g);
        original = ((Graphics2D) g).getTransform();
        Calendar time = Calendar.getInstance();
         
        grass(g2d); 
        ash(g2d);
        Graphics2D snorlaxGraphics = (Graphics2D) g;
        Graphics2D pokeBallGraphics = (Graphics2D) g;
        
        
        AffineTransform scaleAll = new AffineTransform();
        scaleAll.translate(50,50);
        snorlaxGraphics.setTransform(scaleAll);
        secs = time.get(Calendar.SECOND);
        msecs = time.get(Calendar.MILLISECOND);
        
        move++;
        System.out.println(move);
        if(msecs>0 && msecs<500 && move < 192 )
        {
            braso(snorlaxGraphics);
            snorlax(g2d);
            move++;
        }
        else if(msecs>500 && msecs<1000 && move < 192 ){
        
        AffineTransform rotate = new AffineTransform();
        rotate.setToRotation(Math.toRadians(-25));
        //envi.setTransform(scaleTranslateMountain);
        rotate.translate(-180, 170);
        snorlaxGraphics.setTransform(rotate);
        
        braso(snorlaxGraphics);
        
        g2d.setTransform(original);
        g2d.translate(50, 50);
        snorlax(g2d);    
        }
        
        AffineTransform transformBall = new AffineTransform();
            transformBall.translate(60,80);
            pokeBallGraphics.setTransform(transformBall);
        //hinuhuli
        if(move>144 && move < 192)
        {
          
            bSpeedReal+=25;
            if(bSpeedReal<300 && bSpeedReal>-1)
            {   
                transformBall.translate(bSpeedReal,bSpeedReal);
                pokeBallGraphics.setTransform(transformBall);
                pokeball(pokeBallGraphics);
                
            }
            else if(bSpeedReal>=300 && bSpeedReal<=600)
            {
                
                transformBall.translate(600- bSpeedReal,600-bSpeedReal);
                pokeBallGraphics.setTransform(transformBall);
                pokeball(pokeBallGraphics);
            }
            if (bSpeedReal>700)
            {
                transformBall.translate(-70,-90);
                pokeBallGraphics.setTransform(transformBall);
                pokeball(pokeBallGraphics);
            }
           
        }   
        
        //pagbalik nung bola
         else if(move >=192 && move<196)
            {
                braso(g2d);
                AffineTransform scaleAll1 = new AffineTransform();
                scaleAll1.translate(50,50);
                snorlaxGraphics.setTransform(scaleAll1);
                snorlax(snorlaxGraphics);
                
                transformBall.translate(-70,-90);
                pokeBallGraphics.setTransform(transformBall);
                pokeball(pokeBallGraphics);
                snorlaxGraphics.setTransform(original);
                
            }
        
         else if(move>=196 && move<220)
            {
                //snorlaxGraphics.setTransform(original);
                
                AffineTransform scaleAll1 = new AffineTransform();
                scaleAll1.translate(50,50);
                snorlaxGraphics.setTransform(scaleAll1);
                redsnorlax(snorlaxGraphics);
                
                transformBall.translate(-70,-90);
                pokeBallGraphics.setTransform(transformBall);
                pokeball(pokeBallGraphics);
               
                light(snorlaxGraphics);
            }
         
         else  if (move >= 220 && move <300)
         {   
            PsubScaler -= Pscaler;
            pscaler2 += Pscaler;
            LsubScaler -= Lscaler;
            lscaler2 += Lscaler;
            
            transformBall.translate(-70,-90);
            pokeBallGraphics.setTransform(transformBall);
            pokeball(pokeBallGraphics);

            snorlaxGraphics.setTransform(original);
            AffineTransform transformLight = new AffineTransform();
            transformLight.setToScale(LsubScaler,LsubScaler);
            //.translate(move, move);
            snorlaxGraphics.setTransform(transformLight);
            light(snorlaxGraphics);
            
            AffineTransform transformLightSnorlax = new AffineTransform();

            transformLightSnorlax.setToScale(PsubScaler,PsubScaler);
            //transformLightSnorlax.translate(500+(500*pscaler2), 300+ (350*pscaler2)); //+ move - 350, 250 + move - 350);
            snorlaxGraphics.setTransform(transformLightSnorlax);
            redsnorlax(snorlaxGraphics);
            if (LsubScaler==0 && PsubScaler==0 )
                {
                    transformBall.translate(-70,-90);
                    pokeBallGraphics.setTransform(transformBall);
                    pokeball(pokeBallGraphics);
                }
            }
         
         else if(move >= 300 && move <325)
         {
            transformBall.translate(-70,-90);
            pokeBallGraphics.setTransform(transformBall);
            pokeball(pokeBallGraphics);
         }
         
         else if(move >=325 && move < 350)  
         {
             
            if(dropSpeed<750)
            {    
                dropSpeed+=35;
                transformBall.translate(0+(dropSpeed/3),-85 + (dropSpeed));
                pokeBallGraphics.setTransform(transformBall);
                pokeball(pokeBallGraphics);
            
            }
            else
            {
                transformBall.translate(0+(750/3),-285 + (750));
                pokeBallGraphics.setTransform(transformBall);
                pokeball(pokeBallGraphics);
            }
         }
         else if(move >= 350){
            balloon(g2d);
            g2d.setFont(new Font("OCR A Std",Font.BOLD,25));
            g2d.setPaint(Color.BLACK);
            g2d.drawString("GOTCHA!!!", 40, 190);
            transformBall.translate(0+(750/3),-285 + (750));
            pokeBallGraphics.setTransform(transformBall);
            pokeball(pokeBallGraphics);
         }
       
       ballSpeed++;
        
       T.start();
    }
    
    public void light(Graphics2D g)
    {   
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
         
        GeneralPath light = new GeneralPath();
        light.moveTo(63, 55);
        light.lineTo(240, 690);
        light.lineTo(920, 690);
        light.lineTo(63, 55);
        g2d.setPaint(Color.RED);
        g2d.fill(light);
    }
    
    public static void main(String args[])
    {
        JFrame jframe = new JFrame();
        Animation_SantosJ p1 = new Animation_SantosJ();
//        p1.setTitle("Transportation");
//        p1.setUndecorated(true);
//        p1.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
//        p1.setBackground(Color.BLACK);
//        p1.setSize(1000,604);
//        p1.setForeground(Color.black);
//        p1.setVisible(true);
        jframe.setTitle("Snorlax Animation");
        jframe.setPreferredSize(new Dimension(930, 730));
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
    @Override
    public void actionPerformed(ActionEvent e) {
    repaint();   
    
    }
}
