package agrur;

import javax.swing.JOptionPane;

public class Agrur {
    
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Eggs are not supposed to be green.");
        FenetreClient fenCli = new FenetreClient();
        System.out.println("Bonjour");
        fenCli.setVisible(true);
        
    }
    
}
 