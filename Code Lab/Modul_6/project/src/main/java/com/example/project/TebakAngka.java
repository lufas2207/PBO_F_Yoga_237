import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TebakAngka extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton tombolTebak;
    private JLabel labelHasil;
    private JLabel labelPercobaan;

    private int angkaTebakan;
    private int jumlahPercobaan;

    public TebakAngka() {
        setTitle("Tebak Angka");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(10);
        tombolTebak = new JButton("Coba Tebak!");
        labelHasil = new JLabel("");
        labelPercobaan = new JLabel("Jumlah percobaan: 0");

        tombolTebak.addActionListener(this);

        add(inputField);
        add(tombolTebak);
        add(labelHasil);
        add(labelPercobaan);

        mulaiBaru();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void mulaiBaru() {
        Random rand = new Random();
        angkaTebakan = rand.nextInt(100) + 1; // angka dari 1 sampai 100
        jumlahPercobaan = 0;
        inputField.setText("");
        tombolTebak.setText("Coba Tebak!");
        tombolTebak.removeActionListener(this);
        tombolTebak.addActionListener(this);
        labelHasil.setText("");
        labelPercobaan.setText("Jumlah percobaan: 0");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tombolTebak.getText().equals("Main Lagi")) {
            mulaiBaru();
            tombolTebak.setText("Coba Tebak!");
            return;
        }

        try {
            int tebakan = Integer.parseInt(inputField.getText());
            jumlahPercobaan++;

            if (tebakan < angkaTebakan) {
                labelHasil.setText("Terlalu kecil!");
            } else if (tebakan > angkaTebakan) {
                labelHasil.setText("Terlalu besar!");
            } else {
                labelHasil.setText("Tebakan benar!");
                tombolTebak.setText("Main Lagi");
            }

            labelPercobaan.setText("Jumlah percobaan: " + jumlahPercobaan);
        } catch (NumberFormatException ex) {
            labelHasil.setText("Masukkan angka valid!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TebakAngka());
    }
}
