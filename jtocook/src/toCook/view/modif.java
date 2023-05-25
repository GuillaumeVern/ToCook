/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toCook.view;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JFrame;
import toCook.DAO.CategorieCSADAO;
import toCook.DAO.DiffusionDAO;
import toCook.DAO.EmissionDAO;
import toCook.DAO.ProgrammeDAO;
import toCook.model.CategorieCSA;
import toCook.model.Diffusion;

/**
 *
 * @author a.hammerlin
 */
public class modif extends javax.swing.JFrame {

    
    protected Diffusion diffusion;
    /**
     * Creates new form modif
     */
    public modif(int id) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        Color col=new Color(255,199,199);
        getContentPane().setBackground(col);
        
        this.diffusion = DiffusionDAO.getLaDiffusion(id);
        
        ArrayList<CategorieCSA> categorieCSAs = CategorieCSADAO.getLesCategorieCSA();
        for(CategorieCSA categorieCSA : categorieCSAs){
            this.entree_categoriecsa.addItem(categorieCSA.getCode());
        }
       
        this.entree_date.setText(diffusion.getLeJour().toString());
        this.entree_hdebut.setText(diffusion.getHoraire());
        this.entree_categoriecsa.setSelectedItem(diffusion.getLeProgramme().getLaCategorieCSA().getCode());
        this.entree_duree.setText(Integer.toString(diffusion.getLeProgramme().getDuree()));
        this.entree_titre.setText(diffusion.getLeProgramme().getEmission().getTitre());
        this.entree_origine.setText(diffusion.getLeProgramme().getEmission().getOrigine());
        this.entree_genre.setText(diffusion.getLeProgramme().getEmission().getGenre());
        this.entree_hfin.setText((LocalTime.parse(diffusion.getHoraire()).plusMinutes(diffusion.getLeProgramme().getDuree())).toString());
        this.entree_direct.setSelectedIndex((diffusion.getDirect())? 1 : 0);
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JLabel();
        annuler = new javax.swing.JButton();
        intervenant_modif = new javax.swing.JLabel();
        entree_intervenant = new javax.swing.JTextField();
        paneau_haut = new javax.swing.JPanel();
        date_modif = new javax.swing.JLabel();
        entree_date = new javax.swing.JTextField();
        hdebut_modif = new javax.swing.JLabel();
        entree_hdebut = new javax.swing.JTextField();
        hfin_modif = new javax.swing.JLabel();
        entree_hfin = new javax.swing.JTextField();
        categoriecsa_modif2 = new javax.swing.JLabel();
        entree_direct = new javax.swing.JComboBox<>();
        top2 = new javax.swing.JLabel();
        categoriecsa_modif1 = new javax.swing.JLabel();
        entree_categoriecsa1 = new javax.swing.JTextField();
        categoriecsa_modif3 = new javax.swing.JLabel();
        entree_culinaire = new javax.swing.JComboBox<>();
        enregistrer1 = new javax.swing.JButton();
        paneau_haut1 = new javax.swing.JPanel();
        duree_modif = new javax.swing.JLabel();
        entree_duree = new javax.swing.JTextField();
        categoriecsa_modif = new javax.swing.JLabel();
        entree_categoriecsa = new javax.swing.JComboBox<>();
        top3 = new javax.swing.JLabel();
        paneau_haut2 = new javax.swing.JPanel();
        titre_modif = new javax.swing.JLabel();
        entree_titre = new javax.swing.JTextField();
        origine_modif = new javax.swing.JLabel();
        entree_origine = new javax.swing.JTextField();
        genre_modif = new javax.swing.JLabel();
        entree_genre = new javax.swing.JTextField();
        top1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        top.setFont(new java.awt.Font("ASimpleLife", 1, 18)); // NOI18N
        top.setText("Modification du programme");

        annuler.setFont(new java.awt.Font("ASimpleLife", 1, 12)); // NOI18N
        annuler.setText("Annuler");
        annuler.setBorderPainted(false);
        annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annulerMouseClicked(evt);
            }
        });
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        intervenant_modif.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        intervenant_modif.setText("Intervenant :");

        entree_intervenant.setToolTipText("");

        paneau_haut.setBackground(new java.awt.Color(255, 148, 148));

        date_modif.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        date_modif.setText("Date");

        hdebut_modif.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        hdebut_modif.setText("Heure debut");

        hfin_modif.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        hfin_modif.setText("Heure fin");

        categoriecsa_modif2.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        categoriecsa_modif2.setText("En direct ?");

        entree_direct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non", "Oui" }));

        top2.setFont(new java.awt.Font("ASimpleLife", 1, 18)); // NOI18N
        top2.setForeground(new java.awt.Color(51, 51, 51));
        top2.setText("Diffusion");

        javax.swing.GroupLayout paneau_hautLayout = new javax.swing.GroupLayout(paneau_haut);
        paneau_haut.setLayout(paneau_hautLayout);
        paneau_hautLayout.setHorizontalGroup(
            paneau_hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneau_hautLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(top2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(paneau_hautLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneau_hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneau_hautLayout.createSequentialGroup()
                        .addComponent(hdebut_modif)
                        .addGap(18, 18, 18)
                        .addComponent(entree_hdebut, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneau_hautLayout.createSequentialGroup()
                        .addComponent(hfin_modif)
                        .addGap(18, 18, 18)
                        .addComponent(entree_hfin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneau_hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneau_hautLayout.createSequentialGroup()
                        .addComponent(date_modif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(entree_date, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneau_hautLayout.createSequentialGroup()
                        .addComponent(categoriecsa_modif2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(entree_direct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        paneau_hautLayout.setVerticalGroup(
            paneau_hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneau_hautLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(top2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneau_hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hdebut_modif)
                    .addComponent(entree_hdebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriecsa_modif2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entree_direct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneau_hautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hfin_modif)
                    .addComponent(entree_hfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_modif)
                    .addComponent(entree_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        categoriecsa_modif1.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        categoriecsa_modif1.setText("Lien Image");

        entree_categoriecsa1.setToolTipText("");

        categoriecsa_modif3.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        categoriecsa_modif3.setText("Programme culinaire");

        entree_culinaire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non", "Oui" }));

        enregistrer1.setFont(new java.awt.Font("ASimpleLife", 1, 12)); // NOI18N
        enregistrer1.setText("Enregistrer");
        enregistrer1.setBorderPainted(false);
        enregistrer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enregistrer1MouseClicked(evt);
            }
        });
        enregistrer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrer1ActionPerformed(evt);
            }
        });

        paneau_haut1.setBackground(new java.awt.Color(255, 148, 148));

        duree_modif.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        duree_modif.setText("Duree :");

        entree_duree.setToolTipText("");

        categoriecsa_modif.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        categoriecsa_modif.setText("Categorie CSA");

        top3.setFont(new java.awt.Font("ASimpleLife", 1, 18)); // NOI18N
        top3.setForeground(new java.awt.Color(51, 51, 51));
        top3.setText("Programme");

        javax.swing.GroupLayout paneau_haut1Layout = new javax.swing.GroupLayout(paneau_haut1);
        paneau_haut1.setLayout(paneau_haut1Layout);
        paneau_haut1Layout.setHorizontalGroup(
            paneau_haut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneau_haut1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(duree_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entree_duree, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(categoriecsa_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entree_categoriecsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(paneau_haut1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(top3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneau_haut1Layout.setVerticalGroup(
            paneau_haut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneau_haut1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(top3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(paneau_haut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duree_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entree_duree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriecsa_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entree_categoriecsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        paneau_haut2.setBackground(new java.awt.Color(255, 148, 148));

        titre_modif.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        titre_modif.setText("Titre :");

        entree_titre.setToolTipText("");

        origine_modif.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        origine_modif.setText("Origine :");

        entree_origine.setToolTipText("");

        genre_modif.setFont(new java.awt.Font("ASimpleLife", 1, 14)); // NOI18N
        genre_modif.setText("Genre :");

        entree_genre.setToolTipText("");

        top1.setFont(new java.awt.Font("ASimpleLife", 1, 18)); // NOI18N
        top1.setForeground(new java.awt.Color(51, 51, 51));
        top1.setText("Emission");

        javax.swing.GroupLayout paneau_haut2Layout = new javax.swing.GroupLayout(paneau_haut2);
        paneau_haut2.setLayout(paneau_haut2Layout);
        paneau_haut2Layout.setHorizontalGroup(
            paneau_haut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneau_haut2Layout.createSequentialGroup()
                .addGroup(paneau_haut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneau_haut2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paneau_haut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneau_haut2Layout.createSequentialGroup()
                                .addComponent(origine_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entree_origine, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneau_haut2Layout.createSequentialGroup()
                                .addComponent(titre_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entree_titre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(genre_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entree_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(paneau_haut2Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(top1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        paneau_haut2Layout.setVerticalGroup(
            paneau_haut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneau_haut2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(top1)
                .addGap(18, 18, 18)
                .addGroup(paneau_haut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titre_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entree_titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genre_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entree_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneau_haut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origine_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entree_origine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paneau_haut1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneau_haut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(paneau_haut2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(intervenant_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entree_intervenant, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(categoriecsa_modif1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entree_categoriecsa1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(categoriecsa_modif3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entree_culinaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(top)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(annuler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enregistrer1)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(top)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneau_haut2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(intervenant_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entree_intervenant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoriecsa_modif1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entree_categoriecsa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoriecsa_modif3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entree_culinaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneau_haut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paneau_haut1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enregistrer1)
                    .addComponent(annuler))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerActionPerformed

    private void enregistrer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enregistrer1ActionPerformed

    private void annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseClicked
        this.dispose();
    }//GEN-LAST:event_annulerMouseClicked

    private void enregistrer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrer1MouseClicked
        this.diffusion.setLeJour(java.sql.Date.valueOf(LocalDate.parse(this.entree_date.getText())));
        this.diffusion.setDirect(this.entree_direct.getSelectedIndex() == 1);
        this.diffusion.setHoraire(this.entree_hdebut.getText());
        this.diffusion.getLeProgramme().setDuree(Integer.parseInt(this.entree_duree.getText()));
        this.diffusion.getLeProgramme().getLaCategorieCSA().setCode((String) this.entree_categoriecsa.getSelectedItem());
        this.diffusion.getLeProgramme().getlEmission().setOrigine(this.entree_origine.getText());
        this.diffusion.getLeProgramme().getlEmission().setTitre(this.entree_titre.getText());
        this.diffusion.getLeProgramme().getlEmission().setGenre(this.entree_genre.getText());
        
        DiffusionDAO.update(this.diffusion);
        ProgrammeDAO.update(this.diffusion.getLeProgramme());
        EmissionDAO.update(this.diffusion.getLeProgramme().getlEmission());
    }//GEN-LAST:event_enregistrer1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JLabel categoriecsa_modif;
    private javax.swing.JLabel categoriecsa_modif1;
    private javax.swing.JLabel categoriecsa_modif2;
    private javax.swing.JLabel categoriecsa_modif3;
    private javax.swing.JLabel date_modif;
    private javax.swing.JLabel duree_modif;
    private javax.swing.JButton enregistrer1;
    private javax.swing.JComboBox<String> entree_categoriecsa;
    private javax.swing.JTextField entree_categoriecsa1;
    private javax.swing.JComboBox<String> entree_culinaire;
    private javax.swing.JTextField entree_date;
    private javax.swing.JComboBox<String> entree_direct;
    private javax.swing.JTextField entree_duree;
    private javax.swing.JTextField entree_genre;
    private javax.swing.JTextField entree_hdebut;
    private javax.swing.JTextField entree_hfin;
    private javax.swing.JTextField entree_intervenant;
    private javax.swing.JTextField entree_origine;
    private javax.swing.JTextField entree_titre;
    private javax.swing.JLabel genre_modif;
    private javax.swing.JLabel hdebut_modif;
    private javax.swing.JLabel hfin_modif;
    private javax.swing.JLabel intervenant_modif;
    private javax.swing.JLabel origine_modif;
    private javax.swing.JPanel paneau_haut;
    private javax.swing.JPanel paneau_haut1;
    private javax.swing.JPanel paneau_haut2;
    private javax.swing.JLabel titre_modif;
    private javax.swing.JLabel top;
    private javax.swing.JLabel top1;
    private javax.swing.JLabel top2;
    private javax.swing.JLabel top3;
    // End of variables declaration//GEN-END:variables
}
