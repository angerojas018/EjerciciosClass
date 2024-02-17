package Ejercicios;

import javax.swing.*;

public class Romanosswitch {

public static void main(String args[]) {
char x;

x = JOptionPane.showInputDialog("Digite algunos de los siguientes números romanos [I,V,X,L,C,D,M]: ").charAt(0);
       
x -= 32;
switch (x) {

case 'I':
JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 1");
break;

case 'V':
JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 5");
break;

case 'X':
JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 10");
break;
            
case 'L':
JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 50");
break;
           
case 'C':
JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 50");
break;
            
case 'D':
JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 500");
break;
            
case 'M':
JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 1000");
break;

 default:
 JOptionPane.showMessageDialog(null, "Error: Digite I,V,X,L,C,D,M ");

}

  }
       
}
