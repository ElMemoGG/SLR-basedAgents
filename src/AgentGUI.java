

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AgentGUI extends JFrame {
    private Main myAgent;
    private JTextField yField;

    AgentGUI(Main a) {
        super(a.getLocalName());

        myAgent = a;

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 2));
        p.add(new JLabel(""));
        yField = new JTextField(15);
        p.add(yField);
        getContentPane().add(p, BorderLayout.CENTER);

        JButton addButton = new JButton("Calcular");
        addButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try {
                    int x = Integer.parseInt(yField.getText());
                    myAgent.sendX(x);
                    yField.setText("");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(AgentGUI.this, "Invalid values. "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } );
        p = new JPanel();
        p.add(addButton);
        getContentPane().add(p, BorderLayout.SOUTH);


        addWindowListener(new    WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                myAgent.doDelete();
            }
        } );

    }

    public void showGui() {
        pack();
        this.setSize(new Dimension(300,200));
        setLocationRelativeTo(null);

        super.setVisible(true);
    }



}
