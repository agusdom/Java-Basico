import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  JMenuBar menuBar;
  JMenu menu1;
  JMenuItem menuItem1,menuItem2,menuItem3;

  public Formulario(){
   setLayout(null);
   menuBar = new JMenuBar();
   setJMenuBar(menuBar);

   menu1 = new JMenu("Opciones");
   menuBar.add(menu1);

   menuItem1 = new JMenuItem("Rojo");
   menuItem1.addActionListener(this);
   menu1.add(menuItem1);

   menuItem2 = new JMenuItem("Verde");
   menuItem2.addActionListener(this);
   menu1.add(menuItem2);

   menuItem3 = new JMenuItem("Azul");
   menuItem3.addActionListener(this);
   menu1.add(menuItem3);
  }

  public void actionPerformed(ActionEvent e){
   Container fondo = this.getContentPane();

   if(e.getSource() == menuItem1){
   fondo.setBackground(new Color(255,0,0));
   }else if(e.getSource() == menuItem2){
   fondo.setBackground(new Color(0,255,0));
   }else{
   fondo.setBackground(new Color(0,0,255));
   }
  } 

  public static void main(String args[]){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,400,300);
  formulario1.setLocationRelativeTo(null);
  formulario1.setResizable(false);
  formulario1.setVisible(true);
 }
}