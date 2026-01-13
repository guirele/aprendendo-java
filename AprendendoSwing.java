import javax.swing.*;
import java.awt.*;

public class AprendendoSwing {
    public static void main(String[] args){
        JFrame frame = new JFrame("Frame");
        frame.setLayout(null);
        frame.setSize(450, 450);
        frame.getContentPane().setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton validar = new JButton("Validar");
        validar.setBounds(140, 30, 150, 50);
        validar.setBackground(Color.WHITE);
        validar.setForeground(Color.BLACK);
        validar.addActionListener(e -> validacao());



        frame.add(validar);
        frame.setVisible(true);

    }

    static void validacao(){

      String texto = JOptionPane.showInputDialog(null,
                "Escreva algo",
                "Teste",
                JOptionPane.INFORMATION_MESSAGE);
      if(texto == null) {
          JOptionPane.showMessageDialog(null,
                  "Operaçao Cancelada",
                  "Cancelado",
                  JOptionPane.WARNING_MESSAGE);}

       else if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Voce nao escreveu nada",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);}

       else if (texto.trim().length()< 5) {
            JOptionPane.showMessageDialog(null,
                    "Escreva mais!",
                    "Atençao",
                    JOptionPane.INFORMATION_MESSAGE);}

      else {
          JOptionPane.showMessageDialog(null,
                  "Voce escreveu: " + texto,
                  "Parabens!",
                  JOptionPane.INFORMATION_MESSAGE);}
        return;
    }
}
