import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ActionListener,ChangeListener{
  private JLabel label1,label2;
  private JCheckBox check1;
  private JButton boton1,boton2;
  private JScrollPane scrollPane1;
  private JTextArea textArea1;
  String nombre = "";

  public Licencia(){
   setLayout(null);
   setTitle("Licencia de uso");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventanaBienvenida = new Bienvenida();
   nombre = ventanaBienvenida.texto; 

   label1 = new JLabel("TÉRMINOS Y CONDICIONES");
   label1.setBounds(215,5,200,30);
   label1.setFont(new Font("Andale Mono",1,14));
   label1.setForeground(new Color(0,0,0));
   add(label1);
   
   textArea1 = new JTextArea();
   textArea1.setEditable(false);
   textArea1.setFont(new Font("Andale Mono",0,9));
   textArea1.setText("\n\n          Terminos y condiciones" +
                    "\n\n           A-Ninguna." +
                    "\n\n           Gracias por leer.");
   scrollPane1 = new JScrollPane(textArea1);
   scrollPane1.setBounds(10,40,575,200);
   add(scrollPane1);

   check1 = new JCheckBox("Yo "+ nombre +" Acepto");
   check1.setBounds(10,250,300,30);
   check1.addChangeListener(this);
   add(check1);

   boton1 = new JButton("Continuar");
   boton1.setBounds(10,290,100,30);
   boton1.addActionListener(this);
   boton1.setEnabled(false);
   add(boton1);

   boton2 = new JButton("No Acepto");
   boton2.setBounds(120,290,100,30);
   boton2.addActionListener(this);
   boton1.setEnabled(true);
   add(boton2);

   ImageIcon imagen = new ImageIcon("images/coca-cola.png");
   label2 = new JLabel(imagen);
   label2.setBounds(315,135,300,300);
   add(label2);
  }

  public void stateChanged(ChangeEvent e){
    if(check1.isSelected()==true){
    boton1.setEnabled(true);
    boton2.setEnabled(false);
   }else{
    boton1.setEnabled(false);
    boton2.setEnabled(true);
   }
  }

 public void actionPerformed(ActionEvent e){
  if(e.getSource()==boton1){
  Principal vistaPrincipal = new Principal();
  vistaPrincipal.setBounds(0,0,640,535);
  vistaPrincipal.setLocationRelativeTo(null);
  vistaPrincipal.setResizable(false);
  vistaPrincipal.setVisible(true);
  this.setVisible(false);
  }
  if(e.getSource()==boton2){
  Bienvenida vistaBienvenida = new Bienvenida();
  vistaBienvenida.setBounds(0,0,350,450);
  vistaBienvenida.setLocationRelativeTo(null);
  vistaBienvenida.setResizable(false);
  vistaBienvenida.setVisible(true);
  this.setVisible(false);
  }

  }

  public static void main(String args[]){
  Licencia vistaLicencia = new Licencia();
  vistaLicencia.setBounds(0,0,600,360);
  vistaLicencia.setLocationRelativeTo(null);
  vistaLicencia.setResizable(false);
  vistaLicencia.setVisible(true);
 }
}