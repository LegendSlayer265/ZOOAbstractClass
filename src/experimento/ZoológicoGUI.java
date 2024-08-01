package experimento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZoológicoGUI {
    private JFrame ventana;
    private JTextField txtAnimal;
    private JTextArea txtResultado;

    public ZoológicoGUI() {
        ventana = new JFrame("Zoológico");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        txtAnimal = new JTextField(20);
        ventana.add(txtAnimal);

        JButton btnComer = new JButton("Comer");
        btnComer.addActionListener((ActionEvent e) -> {
            Animal animal = crearAnimal(txtAnimal.getText());
            if (animal != null) {
                txtResultado.setText(animal.comer());
            } else {
                txtResultado.setText("Animal no encontrado");
            }
        });
        ventana.add(btnComer);

        JButton btnDormir = new JButton("Dormir");
        btnDormir.addActionListener((ActionEvent e) -> {
            Animal animal = crearAnimal(txtAnimal.getText());
            if (animal != null) {
                txtResultado.setText(animal.dormir());
            } else {
                txtResultado.setText("Animal no encontrado");
            }
        });
        ventana.add(btnDormir);

        JButton btnHacerRuido = new JButton("Hacer Ruido");
        btnHacerRuido.addActionListener((ActionEvent e) -> {
            Animal animal = crearAnimal(txtAnimal.getText());
            if (animal != null) {
                txtResultado.setText(animal.hacerRuido());
            } else {
                txtResultado.setText("Animal no encontrado");
            }
        });
        ventana.add(btnHacerRuido);

        txtResultado = new JTextArea(10, 20);
        ventana.add(new JScrollPane(txtResultado));

        ventana.pack();
        ventana.setVisible(true);
    }

    private Animal crearAnimal(String nombre) {
        if (nombre.equalsIgnoreCase("León")) {
            return new Leon();
        } else if (nombre.equalsIgnoreCase("Mono")) {
            return new Mono();
        } else {
            return null;
        }
    }

}

