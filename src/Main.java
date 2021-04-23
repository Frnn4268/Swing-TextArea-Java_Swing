import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener{
    JTextField caja_texto;
    JButton button;
    JLabel label;
    JTextArea area_texto;
    JScrollPane scroll;

    Main(){
        JFrame frame = new JFrame();

        label = new JLabel("Ingrese el nombre: ");
        label.setBounds(10, 10, 200, 100);
        Font font = new Font("Verdana", Font.BOLD, 12);
        label.setFont(font);
        label.setForeground(Color.BLACK);

        caja_texto = new JTextField();
        caja_texto.setBounds(150,50,150,20);

        area_texto = new JTextArea();

        button = new JButton("ENVIAR");
        button.setBounds(105,75,100,50);
        button.addActionListener(this);
        Font font1 = new Font("Verdana", Font.BOLD, 12);
        button.setFont(font1);
        button.setForeground(Color.BLACK);

        scroll = new JScrollPane(area_texto);
        scroll.setBounds(10, 135, 290, 200);

        frame.add(caja_texto);
        frame.add(button);
        frame.add(label);
        frame.add(scroll);

        frame.setTitle("Lista Estudiantes");
        frame.setSize(325,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        String s1 = caja_texto.getText();
        area_texto.append(s1+"\n");
        caja_texto.setText("");
    }
    public static void main(String[] args) {
        new Main();
    }
}