import javax.swing.*;
import java.awt.*;


class LanguageGui {


    private JPanel languageGuiPanel;
    private JButton greekButton;
    private JButton englishButton;
    private JFrame languageGuiFrame;
    private QuestionAnswer qa = new QuestionAnswer();



    LanguageGui() {

        languageGuiFrame = new JFrame("APORTHITO");

        languageGuiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Στηνει το frame
        languageGuiFrame.setSize(700, 500);
        languageGuiFrame.setLocationRelativeTo(null);
        languageGuiFrame.setVisible(true);
        languageGuiFrame.setContentPane(languageGuiPanel);



        setGreekButtonAction();                                   //Καλει δυο μεθοδους για τα κουμπια επιλογης
        setEnglishButtonAction();

    }

    private void setGreekButtonAction() {

        greekButton.addActionListener(ae -> {                        //Φτιαχνουμε ενα "αυτι" για το κουμπι των ελληνικων

            languageGuiFrame.setVisible(false);                       // Αφου επιλεγει το κουμπι μας εξαφανιζουμε το frame

            Language.languageChoice = "greek";                           //αποθηκευουμε σε μια μεταβλητη την επιλογη του παικτη
            qa.setupListsFromTexts();                                 // ετοιμαζουμε τις λιστες με τις ελληνικες ερωτησεις
            Language.setMenuGR();                                       // Σεταρουμε το μενου στα ελληνικα


        });
    }

    private void setEnglishButtonAction() {
        englishButton.addActionListener(ae -> {
                                                          //Ιδια με την παραπανω.
            languageGuiFrame.setVisible(false);

            Language.languageChoice = "english";
            qa.setupListsFromTexts();
            Language.setMenuEN();

        });
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        languageGuiPanel = new JPanel();
        languageGuiPanel.setLayout(new GridBagLayout());
        languageGuiPanel.setBackground(new Color(-10328710));
        languageGuiPanel.setEnabled(false);
        languageGuiPanel.setForeground(new Color(-10328710));
        languageGuiPanel.putClientProperty("html.disable", Boolean.FALSE);
        englishButton = new JButton();
        englishButton.setBackground(new Color(-15332589));
        englishButton.setForeground(new Color(-16551924));
        englishButton.setText("ENGLISH");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        languageGuiPanel.add(englishButton, gbc);
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-6250346));
        label1.setFont(new Font("Corbel", Font.PLAIN, 24));
        label1.setForeground(new Color(-15332589));
        label1.setText("Select your language");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        languageGuiPanel.add(label1, gbc);
        greekButton = new JButton();
        greekButton.setBackground(new Color(-15332589));
        greekButton.setEnabled(true);
        greekButton.setForeground(new Color(-16551924));
        greekButton.setHideActionText(false);
        greekButton.setText("GREEK");
        greekButton.setVerticalAlignment(0);
        greekButton.putClientProperty("hideActionText", Boolean.FALSE);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        languageGuiPanel.add(greekButton, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return languageGuiPanel;
    }
}