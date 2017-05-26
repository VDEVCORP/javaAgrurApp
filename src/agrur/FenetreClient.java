package agrur;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public  class FenetreClient extends javax.swing.JFrame  {

    
  Bdd laBdd = new Bdd();
  

    public FenetreClient() throws Exception {
        
        try {
            laBdd.connexion();
            initComponents();
            remplirCombo();
            remplirTableau();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    //Déclaration des variables
    private javax.swing.JButton bExporter;
    private javax.swing.JButton bStatus;
    private javax.swing.JButton bModifier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listeClient;
    private javax.swing.JTable tableauCommande;
    private void initComponents() {
        // Initialisation des variables
        java.awt.GridBagConstraints gridBagConstraints;
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());
        getContentPane().setPreferredSize(new Dimension(400, 300)); // Permet de paramètrer les dimension pour plus de lisibilité -> optionnel
        listeClient = new javax.swing.JComboBox<>();
        listeClient.addActionListener((ActionEvent e) -> {
            try {
                ((DefaultTableModel) tableauCommande.getModel()).setRowCount(0);
                for (Commande uneCommande : laBdd.getListeCommande(((javax.swing.JComboBox)e.getSource()).getSelectedItem().toString())){
                    
                    if(laBdd.getDetailCommande(uneCommande.getIdCommande()).size()>0){
                        ((DefaultTableModel) tableauCommande.getModel()).addRow(new Object[]{ ""+uneCommande.getIdCommande(),uneCommande.getSoumission().toString(), uneCommande.getStatue()});
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(FenetreClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        bExporter = new javax.swing.JButton();
        bExporter.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Fichier XML = new Fichier();
                    XML.ouvrir("D:/a/"+listeClient.getSelectedItem().toString()+".xml", "W");
                    XML.ecrire("<?xml version=\"1.0\"?>\n");
                    XML.ecrire("<CLIENT>\n  <NOM>"+listeClient.getSelectedItem().toString()+"</NOM>");
                    for (Commande uneCommande : laBdd.getListeCommande(listeClient.getSelectedItem().toString())){
                        
                        if(laBdd.getDetailCommande(uneCommande.getIdCommande()).size()>0){
                            XML.ecrire("\n  <COMMANDE>\n      <IDCOMMANDE>"+uneCommande.getIdCommande()+"</IDCOMMANDE>"); 
                            XML.ecrire("\n      <SOUMISSION>"+uneCommande.getSoumission().toString()+"</SOUMISSION>"); 
                            XML.ecrire("\n      <STATUS>"+uneCommande.getStatue()+"</STATUS>"); 
                            XML.ecrire("\n  </COMMANDE>");
                        }
                        else{
                            System.out.println("NOPE 3"+uneCommande.getIdCommande());
                        }
               
                    }
                    XML.ecrire("\n</CLIENT>");
                    XML.fermer();
                } catch (IOException ex) {
                    Logger.getLogger(FenetreClient.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(FenetreClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        bStatus = new javax.swing.JButton();
        bStatus.addActionListener((ActionEvent e) -> {
            try {
                String[] statut = {"en attente", "en cours", "expedie"};
                String etat = (String)JOptionPane.showInputDialog(null, "Quel est le statuts ?", "Changement de statut", JOptionPane.QUESTION_MESSAGE, null, statut,statut[0]);
                String id = tableauCommande.getValueAt(tableauCommande.getSelectedRow(),0).toString();
                int i = Integer.parseInt(id); 
                switch (etat)
                {
                    case "en attente":
                        laBdd.changeStatus(i,1);
                        break;
                    case "en cours":
                        laBdd.changeStatus(i,2);
                        break;
                    case "expedie":
                        laBdd.changeStatus(i,3);
                        break;
                }
                JOptionPane.showMessageDialog(null, "Le statut " + etat + " a été Attribuer", "Statut", JOptionPane.INFORMATION_MESSAGE);
                remplirTableau();
            }
            catch (Exception ex) {
                Logger.getLogger(FenetreClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        bModifier = new javax.swing.JButton();
        bModifier.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = tableauCommande.getValueAt(tableauCommande.getSelectedRow(),0).toString();
                    int i = Integer.parseInt(id);
                    FenetreCommande fenCom = new FenetreCommande(i);
                    fenCom.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FenetreClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        jScrollPane1 = new javax.swing.JScrollPane();
        tableauCommande = new javax.swing.JTable();
     
   //--------------------------------------------------------------------------------------------------------------     
    //Gestion des positionnement de chaque éléments sur la grille de la fenêtre

       //ComboBox de la liste des clients
        listeClient.setModel(new javax.swing.DefaultComboBoxModel<>());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(listeClient, gridBagConstraints);
        
       //Bonton Status
        bStatus.setText("Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        getContentPane().add(bStatus, gridBagConstraints);

        //Bonton Exporter
        bExporter.setText("Exporter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        getContentPane().add(bExporter, gridBagConstraints);

        //BoutonModifier
        bModifier.setText("Modifier");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        getContentPane().add(bModifier, gridBagConstraints);
        

        //Tableau de commande
        
        tableauCommande.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Num Com.", "Date soumission", "Status"
            }
        ) 
        {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
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
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.4;
        getContentPane().add(jScrollPane1, gridBagConstraints);
     

        //Gére la dimension de la page au démarrage de façon automatique
        pack();
    }

                                       
 //---------------------------------------------------------------------------------------------------------------------                
    //Getteur
   
    public JButton getbExporter() {
        return bExporter;
    }
    public JButton getbModifier() {
        return bModifier;
    }
    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }
    public JComboBox<String> getListeClient() {
        return listeClient;
    }
    public JTable getTableauCommande() {
        return tableauCommande;
    }
    
    private void remplirCombo() throws Exception{
        int i = 0;
            ((DefaultComboBoxModel) listeClient.getModel()).removeAllElements();
            for (String unClient : laBdd.listeNomClient()){
                listeClient.addItem(unClient);
            }
    }
    
    public void remplirTableau() throws Exception{
        ((DefaultTableModel) tableauCommande.getModel()).setRowCount(0);
            for (Commande uneCommande : laBdd.getListeCommande(listeClient.getSelectedItem().toString())){
                if(laBdd.getDetailCommande(uneCommande.getIdCommande()).size()>0){
                        ((DefaultTableModel) tableauCommande.getModel()).addRow(new Object[]{ ""+uneCommande.getIdCommande(),uneCommande.getSoumission().toString(), uneCommande.getStatue()});
                    }
                    else{
                        System.out.println("NOPE 2"+uneCommande.getIdCommande());
                    }
               
            }
    }
    
}

    

