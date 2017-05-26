package agrur;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FenetreCommande extends javax.swing.JFrame  {
  Bdd laBdd = new Bdd();
  int unIdCommande;

    public Bdd getLaBdd() {
        return laBdd;
    }

    public int getUnIdCommande() {
        return unIdCommande;
    }
  

    public FenetreCommande(int idCommande) throws Exception {
        
        try {
            laBdd.connexion();
            initComponents();
            unIdCommande = idCommande;
            remplirTableauDetails(unIdCommande);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    //Déclaration des variables
    private javax.swing.JButton bExporter;
    private javax.swing.JButton bSupprimer;
    private javax.swing.JButton bRetirer;
    private javax.swing.JButton bAjouter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableauCommande;
        
    private void initComponents() {
        // Initialisation des variables
        //setDefaultCloseOperation(FenetreClient.);
        java.awt.GridBagConstraints gridBagConstraints;
        getContentPane().setLayout(new java.awt.GridBagLayout());
        getContentPane().setPreferredSize(new Dimension(400, 300)); // Permet de paramètrer les dimension pour plus de lisibilité -> optionnel
        bExporter = new javax.swing.JButton();
        bExporter.addActionListener((ActionEvent e) -> {
            try {
                Fichier XML = new Fichier();
                XML.ouvrir("D:/a/cmd"+unIdCommande+".xml", "W");
                XML.ecrire("<?xml version=\"1.0\"?>\n");
                XML.ecrire("<COMMANDE>\n");
                XML.ecrire("    <NUMERO>"+unIdCommande+"</NUMERO>\n");
                XML.ecrire("    <PRODUITS>\n");
                for (DetailCommande unDetailCommande : laBdd.getDetailCommande(unIdCommande)){
                    XML.ecrire("        <LIGNE>\n");
                    XML.ecrire("            <LIBELLE>"+unDetailCommande.getLibelleConditionnement()+"</LIBELLE>\n");
                    XML.ecrire("            <QTE>"+unDetailCommande.getQuantite()+"</QTE>\n");
                    XML.ecrire("        </LIGNE>\n");
                }
                XML.ecrire("    </PRODUITS>\n</COMMANDE>");
                XML.fermer();
            } catch (IOException ex) {
                Logger.getLogger(FenetreCommande.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FenetreCommande.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        bRetirer = new javax.swing.JButton();
        bRetirer.addActionListener((ActionEvent e) -> {
            try {
                String nom = tableauCommande.getValueAt(tableauCommande.getSelectedRow(),0).toString();
                laBdd.retireProduit(nom,unIdCommande);
                JOptionPane.showMessageDialog(null, "Le produit"+nom+" à été retiré de votre commande.", "Modification", JOptionPane.INFORMATION_MESSAGE);
                remplirTableauDetails(unIdCommande);
            }
            catch (Exception ex) {
                Logger.getLogger(FenetreClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        bSupprimer = new javax.swing.JButton();
        bSupprimer.addActionListener((ActionEvent e) -> {
                try{
                    JOptionPane jop = new JOptionPane();    	
                    int option = jop.showConfirmDialog(null, "Voulez-vous confirmer la suppression ?","Supression", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);                
                    if(option == JOptionPane.OK_OPTION){
                        laBdd.supprimeCommande(unIdCommande);
                    dispose();
      }
                }  
                catch(Exception ex){
                Logger.getLogger(FenetreClient.class.getName()).log(Level.SEVERE, null, ex);
                }
    
        });
        bAjouter = new javax.swing.JButton();
        bAjouter.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {/**
            try {
                
                String etat = (String)JOptionPane.showInputDialog(null, "Quel est le statuts ?", "Changement de statut", JOptionPane.QUESTION_MESSAGE, null, statut,statut[0]);
                String id = tableauCommande.getValueAt(tableauCommande.getSelectedRow(),0).toString();
                int i = Integer.parseInt(id); 
                JOptionPane.showMessageDialog(null, "Le statut " + etat + " a été Attribuer", "Statut", JOptionPane.INFORMATION_MESSAGE);

            }
            catch (Exception ex) {
                Logger.getLogger(FenetreClient.class.getName()).log(Level.SEVERE, null, ex);
            }**/
          }} );
        jScrollPane1 = new javax.swing.JScrollPane();
        tableauCommande = new javax.swing.JTable();
        tableauCommande.addMouseListener(new TableauListener(){
            public int  tableauMouseClicked(java.awt.event.MouseEvent evt) {
            // gestion du simple clic
            return tableauCommande.getSelectedRow();
            }
        });
        
     
   //--------------------------------------------------------------------------------------------------------------     
    //Gestion des positionnement de chaque éléments sur la grille de la fenêtre

        
       //Bonton Ajouté
        bAjouter.setText("Ajouter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        getContentPane().add(bAjouter, gridBagConstraints);
        
        //Bonton Retirer
        bRetirer.setText("Retirer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        getContentPane().add(bRetirer, gridBagConstraints);


        //Bonton Exporter
        bExporter.setText("Exporter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        getContentPane().add(bExporter, gridBagConstraints);

        //Bouton Supprimer
        bSupprimer.setText("Supprimer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        bSupprimer.setBackground(Color.RED);
        bSupprimer.setForeground(Color.WHITE);
        getContentPane().add(bSupprimer, gridBagConstraints);

        //Tableau de commande
        
        tableauCommande.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Produit", "Quantités"
            }
        ) 
        {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableauCommande);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        getContentPane().add(jScrollPane1, gridBagConstraints);
     

        //Gére la dimension de la page au démarrage de façon automatique
        pack();
    }

                                       
 //---------------------------------------------------------------------------------------------------------------------                
    //Getteur
   
    public JButton getbExporter() {
        return bExporter;
    }
    public JButton getbSupprimer() {
        return bSupprimer;
    }
     public JButton getbAjouter() {
        return bAjouter;
    }
    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }
    public JTable getTableauCommande() {
        return tableauCommande;
    }
    
     private void remplirTableauDetails(int idCommande) throws Exception{
        ((DefaultTableModel) tableauCommande.getModel()).setRowCount(0);
                    for (DetailCommande unDetailCommande : laBdd.getDetailCommande(idCommande)){
                ((DefaultTableModel) tableauCommande.getModel()).addRow(new Object[]{ unDetailCommande.getLibelleConditionnement(), "" + unDetailCommande.getQuantite()});
            }
    }
     /**
      private void remplirComboConditionnement() throws Exception{
        int i = 0;
            ((DefaultComboBoxModel) listeClient.getModel()).removeAllElements();
            for (Object unClient : laBdd.getListeLibelle()){
                    listeClient.addItem(unClient);
            }
    }
    * **/
}


    

