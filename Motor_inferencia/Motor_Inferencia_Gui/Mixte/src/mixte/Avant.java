/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mixte;

import java.awt.event.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Cesar_Chv
 */
public class Avant extends JFrame{
    JLabel l;
     TextField but;
     TextField but2;
     TextArea txt ;
    private String chem_bf;
    private String chem_br;
     String tr="";
     String tr2="";

    public String getChem_bf() {
        return chem_bf;
    }

    public void setChem_bf(String chem_bf) {
        this.chem_bf = chem_bf;
    }

    public String getChem_br() {
        return chem_br;
    }

    public void setChem_br(String chem_br) {
        this.chem_br = chem_br;
    }
     
     
    
    public Avant(){
          super();
      
        setTitle("Avant");
        setSize(450,700);
        
        getContentPane().setLayout(new FlowLayout());
        JPanel p00 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel p01 = new JPanel(new FlowLayout(FlowLayout.LEFT));
       
        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel p0 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel p5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel p6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
      
        but = new TextField(20);
         but2 = new TextField(20);
        JLabel l2 = new JLabel("Trace");
         JLabel l1 = new JLabel("Choose the goal");
        txt = new TextArea(20,40);
        JButton b = new JButton("ok");
       l = new JLabel("Choose the goal");
       JLabel l00 = new JLabel("Confilt resolution : choose the first rule");
       JLabel l01 = new JLabel("Conflit resolution : the rule having the greatest number of facts");
        
       
        JButton b1 = new JButton("ok");
       
        JLabel titre = new JLabel("Forward chaining");
        JLabel f = new JLabel ("you can choose a goal, or add every new information to the fact base");
        p1.add(l1);
        p6.add(l2);
        p1.add(but);
        p1.setSize(20, 30);
        p1.add(b);
        p3.add (l);
        p4.add (but2);
        p4.add (b1);
        p.add(titre);
        p0.add(f);
        p5.add(txt);
      
        p00.add(l00);
        p01.add(l01);
        
        

    
         
       b.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                try {
                    Mixte mi = new Mixte(chem_bf,chem_br);
                     if ("".equals(but.getText()))
                    tr= mi.saturer();
                   else
                 tr= mi.recherche(but.getText());
                  txt.setText(tr);
                  but.setText("");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Avant.class.getName()).log(Level.SEVERE, null, ex);
                }
                     
                
                    }
                }
                );

         b1.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                     try {
                    Mixte mi = new Mixte(chem_bf,chem_br);
                     if ("".equals(but2.getText()))
                    tr2= mi.saturer2();
                   else
                 tr2= mi.recherche2(but2.getText());
                  txt.setText(tr2);
                  but2.setText("");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Avant.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }
                }
                );

this.add(p);
this.add(p0);

this.add(p00);
this.add(p1);
this.add(p01);

this.add(p3);
this.add(p4);
this.add(p6);
this.add(p5);

        setVisible(true);
    }
    
   

 

    
    
}
