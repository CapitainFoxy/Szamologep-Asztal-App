import javax.swing.*;
import java.awt.*;

public class EredmenyPanel extends JPanel {

    private JLabel eredmenyLabel;

    public EredmenyPanel() {
        setLayout(new BorderLayout());
        eredmenyLabel = new JLabel("Eredmény: ");
        add(eredmenyLabel, BorderLayout.CENTER);
    }

    public void frissitEredmeny(double eredmeny) {
        eredmenyLabel.setText("Eredmény: " + eredmeny);
    }
}
