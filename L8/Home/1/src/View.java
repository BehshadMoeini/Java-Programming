import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class View extends JFrame {
    public View() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.setVisible(true);
    }
    private void nameTextMouseClicked(MouseEvent e) {
        if (nameText.getText().equals("Enter Full Name"))
            nameText.setText("");
    }
    private void melliTextMouseClicked(MouseEvent e) {
        if (melliText.getText().equals("Enter Melli Code"))
            melliText.setText("");
    }
    private void ageTextMouseClicked(MouseEvent e) {
        if (ageText.getText().equals("Enter Age"))
            ageText.setText("");
    }
    private void cityTextMouseClicked(MouseEvent e) {
        if (cityText.getText().equals("Enter City"))
            cityText.setText("");
    }
    private void specialtyTextMouseClicked(MouseEvent e) {
        if (specialtyText.getText().equals("Enter Specialty"))
            specialtyText.setText("");
    }
    private void successButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }
    private void formButtonMouseClicked(MouseEvent e) {
        if (nameText.getText().equals("") || nameText.getText().equals("Enter Full Name"))
            error("Name");
        else if (melliText.getText().equals("") || melliText.getText().equals("Enter Melli Code"))
            error("Melli Code");
        else if (ageText.getText().equals("") || ageText.getText().equals("Enter Age"))
            error("Age");
        else if (cityText.getText().equals("") || cityText.getText().equals("Enter City"))
            error("City");
        else if (specialtyText.getText().equals("") || specialtyText.getText().equals("Enter Specialty"))
            error("Specialty");
        else {
            try {
                Service.getInstance().save(new Entity().setId(1).setName(nameText.getText()).setMelli(melliText.getText()).setAge(Integer.parseInt(ageText.getText())).setCity(cityText.getText()).setSpec(specialtyText.getText()));
            } catch (Exception ex) {
                System.out.println("failed to save " + ex.getMessage());
            }
            form.setVisible(false);
            successDialog.setVisible(true);
        }
    }
    private void error(String s) {
        errorText.setText(s + " can't be empty");
        errorDialog.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mahdyar Mousavi
        form = new JFrame();
        nameText = new JTextField();
        melliText = new JTextField();
        ageText = new JTextField();
        cityText = new JTextField();
        specialtyText = new JTextField();
        formButton = new JButton();
        errorDialog = new JDialog();
        errorText = new JLabel();
        successDialog = new JFrame();
        successText = new JLabel();
        successButton = new JButton();

        //======== form ========
        {
            form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Container formContentPane = form.getContentPane();
            formContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- nameText ----
            nameText.setText("Enter Full Name");
            nameText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    nameTextMouseClicked(e);
                }
            });
            formContentPane.add(nameText, "cell 0 0");

            //---- melliText ----
            melliText.setText("Enter Melli Code");
            melliText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    melliTextMouseClicked(e);
                }
            });
            formContentPane.add(melliText, "cell 0 1");

            //---- ageText ----
            ageText.setText("Enter Age");
            ageText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ageTextMouseClicked(e);
                }
            });
            formContentPane.add(ageText, "cell 0 2");

            //---- cityText ----
            cityText.setText("Enter City");
            cityText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    cityTextMouseClicked(e);
                }
            });
            formContentPane.add(cityText, "cell 0 3");

            //---- specialtyText ----
            specialtyText.setText("Enter Specialty");
            specialtyText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    specialtyTextMouseClicked(e);
                }
            });
            formContentPane.add(specialtyText, "cell 0 4");

            //---- formButton ----
            formButton.setText("Done");
            formButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    formButtonMouseClicked(e);
                }
            });
            formContentPane.add(formButton, "cell 0 5");
            form.setSize(200, 300);
            form.setLocationRelativeTo(null);
        }

        //======== errorDialog ========
        {
            Container errorDialogContentPane = errorDialog.getContentPane();
            errorDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]"));

            //---- errorText ----
            errorText.setText("text");
            errorText.setHorizontalAlignment(SwingConstants.CENTER);
            errorDialogContentPane.add(errorText, "cell 0 0");
            errorDialog.setSize(200, 100);
            errorDialog.setLocationRelativeTo(null);
        }

        //======== successDialog ========
        {
            Container successDialogContentPane = successDialog.getContentPane();
            successDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //---- successText ----
            successText.setText("Successful");
            successText.setHorizontalAlignment(SwingConstants.CENTER);
            successDialogContentPane.add(successText, "cell 0 0 1 2");

            //---- successButton ----
            successButton.setText("Done");
            successButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    successButtonMouseClicked(e);
                }
            });
            successDialogContentPane.add(successButton, "cell 0 2");
            successDialog.setSize(200, 150);
            successDialog.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mahdyar Mousavi
    private JFrame form;
    private JTextField nameText;
    private JTextField melliText;
    private JTextField ageText;
    private JTextField cityText;
    private JTextField specialtyText;
    private JButton formButton;
    private JDialog errorDialog;
    private JLabel errorText;
    private JFrame successDialog;
    private JLabel successText;
    private JButton successButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
