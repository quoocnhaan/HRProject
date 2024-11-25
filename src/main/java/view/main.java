
import javax.swing.*;
import java.awt.*;

public class main extends JPanel {

    private static main instance;

    private main() {
        setLayout();
        addComponents();
    }

    public static main getInstance() {
        if (instance == null) {
            instance = new main();
        }
        return instance;
    }

    private void setLayout() {
        this.setLayout(new CardLayout());
    }

    private void addComponents() {
        // Add custom panels to the CardLayout with unique names
        this.add(new FunctionData_Component(), "Function_Component");
        this.add(new EmployeeBasicInfo_Component(), "Employee_Component");
    }

    public void changePage(String text) {
        CardLayout cardLayout = (CardLayout) this.getLayout();
        cardLayout.show(this, text);  // Switch to the component specified by 'text'
        this.revalidate();            // Revalidate the layout
        this.repaint();               // Redraw the panel
        System.out.println("Switched to: " + text);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Content Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(main.getInstance());
        frame.setVisible(true);

        // Switch to "Employee_Component" after 2 seconds
        new Timer(2000, e -> main.getInstance().changePage("Employee_Component")).start();
    }
}

class FunctionData_Component extends JPanel {

    public FunctionData_Component() {
        setBackground(Color.CYAN);
        setLayout(new FlowLayout());  // Simple layout for testing
        add(new JLabel("Function Data"));
    }
}

class EmployeeBasicInfo_Component extends JPanel {

    public EmployeeBasicInfo_Component() {
        setBackground(Color.GREEN);
        setLayout(new FlowLayout());  // Simple layout for testing
        add(new JLabel("Employee Info"));
    }
}
