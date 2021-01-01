import java.awt.event.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    public int index;
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
    private void uNameFieldMouseClicked(MouseEvent e) {
        if (uNameField.getText().equals("Enter New Name"))
            uNameField.setText("");
    }
    private void uUserFieldMouseClicked(MouseEvent e) {
        if (uUserField.getText().equals("Enter New Username"))
            uUserField.setText("");
    }
    private void uPassFieldMouseClicked(MouseEvent e) {
        if (uPassField.getText().equals("Enter New Password"))
            uPassField.setText("");
    }
    private void uEmailFieldMouseClicked(MouseEvent e) {
        if (uEmailField.getText().equals("Enter New Email"))
            uEmailField.setText("");
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
                index = Repository.users.indexOf(userField.getText());
                String pass = Repository.passes.get(index);
                if (passField.getText().equals(pass)) {
                    logFrame.setVisible(false);
                    updateFrame.setVisible(true);
                }
                else {
                    logErrorText.setText("Wrong password");
                    logErrorDialog.setVisible(true);
                }
            }
        }
    }
    private void updateButtonMouseClicked(MouseEvent e) {
        if (uNameField.getText().equals("Enter New Name"))
            uNameField.setText("");
        if (uUserField.getText().equals("Enter New Username"))
            uUserField.setText("");
        if (uPassField.getText().equals("Enter New Password"))
            uPassField.setText("");
        if (uEmailField.getText().equals("Enter New Email"))
            uEmailField.setText("");
        String un=null, uu=null, up=null, ue=null;
        if (!uNameField.getText().equals(""))
            un = uNameField.getText();
        else try {
            un = Service.getInstance().report().get(index).getName();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (!uUserField.getText().equals(""))
            uu = uUserField.getText();
        else try {
            uu = Service.getInstance().report().get(index).getUsername();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (!uPassField.getText().equals(""))
            up = uPassField.getText();
        else try {
            up = Service.getInstance().report().get(index).getPassword();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (!uEmailField.getText().equals(""))
            ue = uEmailField.getText();
        else try {
            ue = Service.getInstance().report().get(index).getEmail();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            Service.getInstance().edit(new Entity().setId(index + 1).setName(un).setUsername(uu).setPassword(up).setEmail(ue));
        } catch (Exception ex) {
            System.out.println("failed to update " + ex.getMessage());
        }
        updateFrame.setVisible(false);
        successDialog.setVisible(true);
    }
    private void successButtonMouseClicked(MouseEvent e) {
        System.exit(0);
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
        updateFrame = new JFrame();
        uNameField = new JTextField();
        uUserField = new JTextField();
        uPassField = new JTextField();
        uEmailField = new JTextField();
        updateButton = new JButton();
        successDialog = new JDialog();
        label1 = new JLabel();
        successButton = new JButton();

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

        //======== updateFrame ========
        {
            updateFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Container updateFrameContentPane = updateFrame.getContentPane();
            updateFrameContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- uNameField ----
            uNameField.setText("Enter New Name");
            uNameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    uNameFieldMouseClicked(e);
                }
            });
            updateFrameContentPane.add(uNameField, "cell 0 0");

            //---- uUserField ----
            uUserField.setText("Enter New Username");
            uUserField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    uUserFieldMouseClicked(e);
                }
            });
            updateFrameContentPane.add(uUserField, "cell 0 1");

            //---- uPassField ----
            uPassField.setText("Enter New Password");
            uPassField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    uPassFieldMouseClicked(e);
                }
            });
            updateFrameContentPane.add(uPassField, "cell 0 2");

            //---- uEmailField ----
            uEmailField.setText("Enter New Email");
            uEmailField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    uEmailFieldMouseClicked(e);
                }
            });
            updateFrameContentPane.add(uEmailField, "cell 0 3");

            //---- updateButton ----
            updateButton.setText("Done");
            updateButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    updateButtonMouseClicked(e);
                }
            });
            updateFrameContentPane.add(updateButton, "cell 0 4");
            updateFrame.setSize(200, 250);
            updateFrame.setLocationRelativeTo(null);
        }

        //======== successDialog ========
        {
            successDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            Container successDialogContentPane = successDialog.getContentPane();
            successDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("Update Successful");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            successDialogContentPane.add(label1, "cell 0 0 1 2");

            //---- successButton ----
            successButton.setText("Close");
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
    private JFrame logFrame;
    private JTextField userField;
    private JTextField passField;
    private JButton logButton;
    private JDialog logErrorDialog;
    private JLabel logErrorText;
    private JFrame updateFrame;
    private JTextField uNameField;
    private JTextField uUserField;
    private JTextField uPassField;
    private JTextField uEmailField;
    private JButton updateButton;
    private JDialog successDialog;
    private JLabel label1;
    private JButton successButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
