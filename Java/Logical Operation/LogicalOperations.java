import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogicalOperations extends JFrame {
    private JComboBox<String> aComboBox, bComboBox;
    private JTextArea resultArea;
    
    public LogicalOperations() {
        setTitle("Logical Operations Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        
        // Create main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        // Create input panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        inputPanel.setBorder(new TitledBorder("Input Values (0 or 1)"));
        
        inputPanel.add(new JLabel("Value A:"));
        aComboBox = new JComboBox<>(new String[]{"0", "1"});
        inputPanel.add(aComboBox);
        
        inputPanel.add(new JLabel("Value B:"));
        bComboBox = new JComboBox<>(new String[]{"0", "1"});
        inputPanel.add(bComboBox);
        
        JButton evaluateButton = new JButton("Evaluate Operations");
        inputPanel.add(evaluateButton);
        
        // Create result panel
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(new TitledBorder("Results"));
        
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        resultPanel.add(new JScrollPane(resultArea), BorderLayout.CENTER);
        
        // Add panels to main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(resultPanel, BorderLayout.CENTER);
        
        // Add action listener to button
        evaluateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evaluateOperations();
            }
        });
        
        add(mainPanel);
        setVisible(true);
        
        // Evaluate initial values
        evaluateOperations();
    }
    
    private void evaluateOperations() {
        int a = Integer.parseInt((String) aComboBox.getSelectedItem());
        int b = Integer.parseInt((String) bComboBox.getSelectedItem());
        
        boolean boolA = (a == 1);
        boolean boolB = (b == 1);
        
        // Perform logical operations
        boolean andResult = boolA && boolB;
        boolean orResult = boolA || boolB;
        boolean notA = !boolA;
        boolean notB = !boolB;
        boolean xorResult = boolA ^ boolB;
        boolean nandResult = !(boolA && boolB);
        boolean norResult = !(boolA || boolB);
        
        // Build result string
        StringBuilder result = new StringBuilder();
        result.append("Input Values: A = ").append(a).append(", B = ").append(b).append("\n\n");
        result.append("Logical AND (A && B): ").append(andResult ? "1" : "0").append("\n");
        result.append("Logical OR (A || B):  ").append(orResult ? "1" : "0").append("\n");
        result.append("Logical NOT (!A):     ").append(notA ? "1" : "0").append("\n");
        result.append("Logical NOT (!B):     ").append(notB ? "1" : "0").append("\n");
        result.append("Logical XOR (A ^ B):  ").append(xorResult ? "1" : "0").append("\n");
        result.append("Logical NAND (!(A && B)): ").append(nandResult ? "1" : "0").append("\n");
        result.append("Logical NOR (!(A || B)):  ").append(norResult ? "1" : "0").append("\n\n");
        
        // Add truth table for AND
        result.append("AND Truth Table:\n");
        result.append("A | B | Result\n");
        result.append("0 | 0 |   0\n");
        result.append("0 | 1 |   0\n");
        result.append("1 | 0 |   0\n");
        result.append("1 | 1 |   1\n\n");
        
        // Add truth table for OR
        result.append("OR Truth Table:\n");
        result.append("A | B | Result\n");
        result.append("0 | 0 |   0\n");
        result.append("0 | 1 |   1\n");
        result.append("1 | 0 |   1\n");
        result.append("1 | 1 |   1");
        
        resultArea.setText(result.toString());
    }
    
    public static void main(String[] args) {
        // Use SwingUtilities to ensure thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LogicalOperations();
            }
        });
    }
}