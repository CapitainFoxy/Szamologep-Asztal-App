import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Szamologep extends JFrame {

    private JTextField eredmenyMezo;
    private EredmenyPanel eredmenyPanel;
    private Muveletek muveletek;

    public Szamologep() {
        setTitle("Számológép");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        muveletek = new Muveletek();
        eredmenyPanel = new EredmenyPanel();

        eredmenyMezo = new JTextField();
        eredmenyMezo.setEditable(false);
        eredmenyMezo.setHorizontalAlignment(JTextField.RIGHT);

        JPanel gombokPanel = new JPanel();
        gombokPanel.setLayout(new GridLayout(4, 4));

        String[] gombSzovegek = {"7", "8", "9", "/",
                                 "4", "5", "6", "*",
                                 "1", "2", "3", "-",
                                 "0", ".", "=", "+"};

        for (String szoveg : gombSzovegek) {
            JButton gomb = new JButton(szoveg);
            gomb.addActionListener(new GombNyomas());
            gombokPanel.add(gomb);
        }

        add(eredmenyMezo, BorderLayout.NORTH);
        add(gombokPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private class GombNyomas implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String akcio = e.getActionCommand();
            if (akcio.equals("=")) {
                String kifejezes = eredmenyMezo.getText();
                double eredmeny = muveletek.szamol(kifejezes);
                eredmenyMezo.setText(String.valueOf(eredmeny));
            } else {
                eredmenyMezo.setText(eredmenyMezo.getText() + akcio);
            }
        }
    }
}
