import java.awt.event.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    public Form() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        logFrame.setVisible(true);
    }
    private void userFieldMouseClicked(MouseEvent e) {
        if (userField.getText().equals("Enter Username"))
            userField.setText("");
    }
    private void passFieldMouseClicked(MouseEvent e) {
        if (passField.getText().equals("Enter Password"))
            passField.setText("");
    }
    private void logSuccessButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }
    private void logButtonMouseClicked(MouseEvent e) {
        if (userField.getText().equals("") || userField.getText().equals("Enter Username")) {
            logErrorText.setText("Username can't be empty");
            logErrorDialog.setVisible(true);
        }
        else if (passField.getText().equals("") || passField.getText().equals("Enter Password")) {
            logErrorText.setText("Password can't be empty");
            logErrorDialog.setVisible(true);
        }
        else {
            if (Repository.users.contains(userField.getText()) == false) {
                logErrorText.setText("User doesn't exist");
                logErrorDialog.setVisible(true);
            }
            else {
                int index = Repository.users.indexOf(userField.getText());
                String pass = Repository.passes.get(index);
                if (passField.getText().equals(pass)) {
                    logSuccessText.setText("Login successful");
                    logFrame.setVisible(false);
                    logSuccessDialog.setVisible(true);
                }
                else {
                    logErrorText.setText("Wrong password");
                    logErrorDialog.setVisible(true);
                }
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mahdyar Mousavi
        logFrame = new JFrame();
        userField = new JTextField();
        passField = new JTextField();
        logButton = new JButton();
        logErrorDialog = new JDialog();
        logErrorText = new JLabel();
        logSuccessDialog = new JDialog();
        logSuccessText = new JLabel();
        logSuccessButton = new JButton();

        //======== logFrame ========
        {
            logFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Container logFrameContentPane = logFrame.getContentPane();
            logFrameContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //---- userField ----
            userField.setText("Enter Username");
            userField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    userFieldMouseClicked(e);
                }
            });
            logFrameContentPane.add(userField, "cell 0 0 5 1");

            //---- passField ----
            passField.setText("Enter Password");
            passField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    passFieldMouseClicked(e);
                }
            });
            logFrameContentPane.add(passField, "cell 0 1 5 1");

            //---- logButton ----
            logButton.setText("Log In");
            logButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    logButtonMouseClicked(e);
                }
            });
            logFrameContentPane.add(logButton, "cell 2 2");
            logFrame.setSize(200, 200);
            logFrame.setLocationRelativeTo(null);
        }

        //======== logErrorDialog ========
        {
            Container logErrorDialogContentPane = logErrorDialog.getContentPane();
            logErrorDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]"));

            //---- logErrorText ----
            logErrorText.setText("text");
            logErrorText.setHorizontalAlignment(SwingConstants.CENTER);
            logErrorDialogContentPane.add(logErrorText, "cell 0 0");
            logErrorDialog.setSize(200, 100);
            logErrorDialog.setLocationRelativeTo(null);
        }

        //======== logSuccessDialog ========
        {
            logSuccessDialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            Container logSuccessDialogContentPane = logSuccessDialog.getContentPane();
            logSuccessDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]" +
                "[25]" +
                "[]"));

            //---- logSuccessText ----
            logSuccessText.setText("text");
            logSuccessText.setHorizontalAlignment(SwingConstants.CENTER);
            logSuccessDialogContentPane.add(logSuccessText, "cell 0 0 1 2");

            //---- logSuccessButton ----
            logSuccessButton.setText("Done");
            logSuccessButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    logSuccessButtonMouseClicked(e);
                }
            });
            logSuccessDialogContentPane.add(logSuccessButton, "cell 0 2");
            logSuccessDialog.pack();
            logSuccessDialog.setLocationRelativeTo(logSuccessDialog.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mahdyar Mousavi
    private JFrame logFrame;
    private JTextField userField;
    private JTextField passField;
    private JButton logButton;
    private JDialog logErrorDialog;
    private JLabel logErrorText;
    private JDialog logSuccessDialog;
    private JLabel logSuccessText;
    private JButton logSuccessButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
