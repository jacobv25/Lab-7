import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

public class SouthernComponent extends JPanel{
    private JLabel priceLabel;
    private BigDecimal price;
    public SouthernComponent(){
        setLayout(new FlowLayout());
        add(new JButton("MAKE COFFEE"));
        add(new JLabel("machine offline"));
        setVisible(true);
    }
}
