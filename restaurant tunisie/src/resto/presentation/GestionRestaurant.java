package resto.presentation;

import java.util.regex.*;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import resto.dao.RestaurantDAO;
import resto.entities.Restaurant;

public class GestionRestaurant extends javax.swing.JFrame {

    RestaurantDAO dao = new RestaurantDAO();
    Restaurant res = new Restaurant();
    int z;
    public GestionRestaurant() {
        initComponents();
        modif1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gestionrestaurant = new javax.swing.JPanel();
        et = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        theme = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        adresse = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        specialite = new javax.swing.JTextField();
        alcool = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        annuler = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        budget = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        restorateur = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        et1 = new javax.swing.JLabel();
        et2 = new javax.swing.JLabel();
        et3 = new javax.swing.JLabel();
        et4 = new javax.swing.JLabel();
        et5 = new javax.swing.JLabel();
        et6 = new javax.swing.JLabel();
        et8 = new javax.swing.JLabel();
        et7 = new javax.swing.JLabel();
        et9 = new javax.swing.JLabel();
        et10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        modif1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        supprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        modif = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        recherche = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Gestionrestaurant.setBackground(new java.awt.Color(255, 255, 255));
        Gestionrestaurant.setForeground(new java.awt.Color(255, 255, 255));

        et.setBackground(new java.awt.Color(255, 255, 255));
        et.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N
        et.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel8.setText("Numero du menu");

        nom.setName("nom"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Budget");

        theme.setName("theme"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel7.setText("Alcool");

        adresse.setName("addresse"); // NOI18N

        tel.setName("telephone"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("Spécialite");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Telephone");

        specialite.setName("specialite"); // NOI18N

        alcool.setName("alchool"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("Adresse");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("Théme");

        menu.setName("menu"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Nom");

        annuler.setBackground(new java.awt.Color(255, 255, 255));
        annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/supprimer-icone-6492-16.png"))); // NOI18N
        annuler.setText("   Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        ajouter.setBackground(new java.awt.Color(255, 255, 255));
        ajouter.setText(" Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel10.setText("Num restaurateur");

        restorateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restorateurActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel12.setText("E-mail");

        et1.setBackground(new java.awt.Color(255, 255, 255));
        et1.setForeground(new java.awt.Color(255, 255, 255));
        et1.setText("*");

        et2.setForeground(new java.awt.Color(255, 255, 255));
        et2.setText("*");

        et3.setForeground(new java.awt.Color(255, 255, 255));
        et3.setText("*");

        et4.setForeground(new java.awt.Color(255, 255, 255));
        et4.setText("*");

        et5.setForeground(new java.awt.Color(255, 255, 255));
        et5.setText("*");

        et6.setForeground(new java.awt.Color(255, 255, 255));
        et6.setText("*");

        et8.setForeground(new java.awt.Color(255, 255, 255));
        et8.setText("*");

        et7.setForeground(new java.awt.Color(255, 255, 255));
        et7.setText("*");

        et9.setForeground(new java.awt.Color(255, 255, 255));
        et9.setText("*");

        et10.setForeground(new java.awt.Color(255, 255, 255));
        et10.setText("*");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("*");

        titre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        titre.setText("Ajouter un restaurant");

        modif1.setBackground(new java.awt.Color(255, 255, 255));
        modif1.setText("Modifier");
        modif1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modif1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout etLayout = new javax.swing.GroupLayout(et);
        et.setLayout(etLayout);
        etLayout.setHorizontalGroup(
            etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etLayout.createSequentialGroup()
                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(etLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(etLayout.createSequentialGroup()
                                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(etLayout.createSequentialGroup()
                                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(37, 37, 37)
                                .addComponent(et10)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(restorateur, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(menu)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, etLayout.createSequentialGroup()
                                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(etLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(et6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, etLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(et5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(budget)))
                            .addGroup(etLayout.createSequentialGroup()
                                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, etLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(etLayout.createSequentialGroup()
                                                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(et4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(et3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(et2, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(et1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                    .addComponent(adresse, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(theme, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(specialite, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addComponent(et9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(etLayout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(et7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(et8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(alcool, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(etLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, etLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(modif1)
                        .addGap(18, 18, 18)
                        .addComponent(annuler)
                        .addGap(18, 18, 18)
                        .addComponent(ajouter)))
                .addContainerGap())
        );
        etLayout.setVerticalGroup(
            etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etLayout.createSequentialGroup()
                .addComponent(titre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, etLayout.createSequentialGroup()
                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(et1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(et2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(et3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(specialite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(et4)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(et5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(budget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(et6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alcool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(et7))
                        .addGap(12, 12, 12)
                        .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(et8)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(et9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(restorateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(et10)
                    .addComponent(jLabel9))
                .addGap(49, 49, 49)
                .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(etLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modif1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des restaurants", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        supprimer.setBackground(new java.awt.Color(255, 255, 255));
        supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/supprimer-icone-9337-16.png"))); // NOI18N
        supprimer.setText("   Supprimer");
        supprimer.setActionCommand("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        tab.setModel(new ModelTable());
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        modif.setBackground(new java.awt.Color(255, 255, 255));
        modif.setText("Modifier");
        modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(346, Short.MAX_VALUE)
                .addComponent(modif, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(modif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Recherche :");

        SearchBtn.setBackground(new java.awt.Color(255, 255, 255));
        SearchBtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/trouver-recherche-zoom-icone-4884-32.png"))); // NOI18N
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnMouseClicked(evt);
            }
        });
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });
        recherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechercheKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout GestionrestaurantLayout = new javax.swing.GroupLayout(Gestionrestaurant);
        Gestionrestaurant.setLayout(GestionrestaurantLayout);
        GestionrestaurantLayout.setHorizontalGroup(
            GestionrestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionrestaurantLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(et, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addGroup(GestionrestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(GestionrestaurantLayout.createSequentialGroup()
                        .addComponent(SearchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(440, Short.MAX_VALUE))
        );
        GestionrestaurantLayout.setVerticalGroup(
            GestionrestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionrestaurantLayout.createSequentialGroup()
                .addGroup(GestionrestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionrestaurantLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(et, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GestionrestaurantLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(GestionrestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GestionrestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Gestionrestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Gestionrestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        String masque = "^[a-zA-Z]+[a-zA-Z0-9\\._-]*[a-zA-Z0-9]@[a-zA-Z]+"+ "[a-zA-Z0-9\\._-]*[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}$";
        Pattern pattern = Pattern.compile(masque);
        Matcher controler = pattern.matcher(mail.getText());
        int b=0;
        int c=0;
        int d=0;
        int e =0;
        int f=0;
        int g=0;
        int h=0;
        int i=0;
        int j=0;
        try 
        {
            j = Integer.parseInt(alcool.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            i = Integer.parseInt(specialite.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            h = Integer.parseInt(theme.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            g = Integer.parseInt(adresse.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            f = Integer.parseInt(nom.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
            
        }
        try 
        {
            e = Integer.parseInt(restorateur.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            d = Integer.parseInt(menu.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            c = Integer.parseInt(budget.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            b = Integer.parseInt(tel.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        if(nom.getText().equals("") ==false && f==0 && adresse.getText().equals("") ==false && g==0 && theme.getText().equals("") == false && h==0 && specialite.getText().equals("") == false && i==0 && tel.getText().equals("") ==false && b!=0 && budget.getText().equals("") ==false && c!=0 && alcool.getText().equals("") == false && j==0 && menu.getText().equals("") ==false && d!=0 && restorateur.getText().equals("") == false && e!=0 && controler.matches()==true)
        {
            res = new Restaurant(nom.getText(), adresse.getText(), theme.getText(), specialite.getText(),Integer.parseInt(tel.getText()),Integer.parseInt(budget.getText()),alcool.getText(), Integer.parseInt(menu.getText()), Integer.parseInt(restorateur.getText()),mail.getText());
            dao.insertRestaurant(res);
            this.setVisible(false);
            new GestionRestaurant().setVisible(true);
        }
        else
        {
            if(nom.getText().equals("") ==true || f!=0)
            {
                et1.setForeground(Color.red);
                //nom.setBackground(Color.red);
            }
            if(adresse.getText().equals("") ==true || g!=0)
            {
                et2.setForeground(Color.red);
                //adresse.setBackground(Color.red);
            }
            if(theme.getText().equals("") ==true || h!=0)
            {
                et3.setForeground(Color.red);
                //theme.setBackground(Color.red);
            }
            if(specialite.getText().equals("") ==true || i!=0)
            {
                et4.setForeground(Color.red);
                //specialite.setBackground(Color.red);
            }
            if(tel.getText().equals("") ==true || b==0)
            {
                et5.setForeground(Color.red);
                //tel.setBackground(Color.red);
            }
            
             if(budget.getText().equals("") ==true || c==0)
             {
                 et6.setForeground(Color.red);
                 //budget.setBackground(Color.red);
             }
             
             if(alcool.getText().equals("") ==true || j!=0)
             {
                 et7.setForeground(Color.red);
                 //alcool.setBackground(Color.red);
             }
            if(menu.getText().equals("") ==true || d==0)
            {
                et9.setForeground(Color.red);
                //menu.setBackground(Color.red);
            }
            if(restorateur.getText().equals("") ==true || e==0) 
            {
                jLabel9.setForeground(Color.red);
                //restorateur.setBackground(Color.red);
            }
            if(controler.matches()!=true)
            {
                et8.setForeground(Color.red);
                //mail.setBackground(Color.red);
            }
            
        }
        
    }//GEN-LAST:event_ajouterActionPerformed


    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        nom.setText("");
        adresse.setText("");
        specialite.setText("");
        theme.setText("");
        tel.setText("");
        budget.setText("");
        alcool.setText("");
        menu.setText("");
        restorateur.setText("");
        mail.setText("");
        this.setVisible(false);
        new GestionRestaurant().setVisible(true);
    }//GEN-LAST:event_annulerActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, "Voulez vous supprimer les Clients selectionnés?", "Warning", dialogButton);

        if (dialogButton == JOptionPane.YES_OPTION) { //The ISSUE is here

            RestaurantDAO clientDAO = new RestaurantDAO();
            
           int userId = Integer.parseInt(tab.getValueAt(tab.getSelectedRow(), 0).toString());
           clientDAO.deleteRestaurant(userId);
            
            ModelTable model = new ModelTable();
            tab.setModel(model);
        }
        this.setVisible(false);
        new GestionRestaurant().setVisible(true);
    }//GEN-LAST:event_supprimerActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifActionPerformed
        if(tab.getSelectedRow()!=-1){
            Restaurant c=new Restaurant();
            RestaurantDAO rdao=new RestaurantDAO();
            c= rdao.findRestoByID((Integer) tab.getValueAt(tab.getSelectedRow(), 0));
            z=(Integer) tab.getValueAt(tab.getSelectedRow(), 0);
             
          titre.setText("Modifier restaurateur");
          modif1.setVisible(true);
          ajouter.setVisible(false);
          
          nom.setText(c.getNom());
        adresse.setText(c.getAdresse());
        theme.setText(c.getTheme());
        specialite.setText(c.getSpecialite());
        tel.setText(Integer.toString(c.getTel()));
        budget.setText(Integer.toString(c.getBudget()));
        alcool.setText(c.getAlcool());
        menu.setText(Integer.toString(c.getId_menu_fk()));
        restorateur.setText(Integer.toString(c.getId_restaurateur_fk()));
        mail.setText(c.getMail());
            
            
        

            System.out.println(c);
         this.setVisible(true);
         
        
           
        }else
        {
            int d=JOptionPane.OK_CANCEL_OPTION;
            JOptionPane.showConfirmDialog(null, "Vous n'avez pas sélectionnez un restaurateur","erreur",d);
                    
        }
      
    }//GEN-LAST:event_modifActionPerformed

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
        int userId = Integer.parseInt(tab.getValueAt(tab.getSelectedRow(), 0).toString());
        this.setVisible(false);
        new GestionRestaurant().setVisible(true);


    }//GEN-LAST:event_rechercheActionPerformed

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseClicked
        String value = recherche.getText().toString();
    }//GEN-LAST:event_SearchBtnMouseClicked

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void rechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechercheKeyReleased
        List<Restaurant> li = new RestaurantDAO().RechercherAllClient(recherche.getText());
        ModelTable model1 = new ModelTable(li);
        tab.setModel(model1);
    }//GEN-LAST:event_rechercheKeyReleased

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked

//        res = dao.findRestoByID(Integer.parseInt(tab.getValueAt(tab.getSelectedRow(), 0).toString()));
//        nom.setText(res.getNom());
//        adresse.setText(res.getAdresse());
//        theme.setText(res.getTheme());
//        specialite.setText(res.getSpecialite());
//        tel.setText(Integer.toString(res.getTel()));
//        budget.setText(Integer.toString(res.getBudget()));
//        alcool.setText(res.getAlcool());
//        menu.setText(Integer.toString(res.getId_menu_fk()));
//        restorateur.setText(Integer.toString(res.getId_restaurateur_fk()));
//        mail.setText(res.getMail());
    }//GEN-LAST:event_tabMouseClicked

    private void restorateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restorateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restorateurActionPerformed

    private void modif1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modif1ActionPerformed
        String masque = "^[a-zA-Z]+[a-zA-Z0-9\\._-]*[a-zA-Z0-9]@[a-zA-Z]+"+ "[a-zA-Z0-9\\._-]*[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}$";
        Pattern pattern = Pattern.compile(masque);
        Matcher controler = pattern.matcher(mail.getText());
        int b=0;
        int c=0;
        int d=0;
        int e =0;
        int f=0;
        int g=0;
        int h=0;
        int i=0;
        int j=0;
        try 
        {
            j = Integer.parseInt(alcool.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            i = Integer.parseInt(specialite.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            h = Integer.parseInt(theme.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            g = Integer.parseInt(adresse.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            f = Integer.parseInt(nom.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            e = Integer.parseInt(restorateur.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            d = Integer.parseInt(menu.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            c = Integer.parseInt(budget.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        try 
        {
            b = Integer.parseInt(tel.getText()); 

        } 
        catch (NumberFormatException ex) 
        { 
        }
        
        
        if(nom.getText().equals("") ==false && f==0 && adresse.getText().equals("") ==false && g==0 && theme.getText().equals("") == false && h==0 && specialite.getText().equals("") == false && i==0 && tel.getText().equals("") ==false && b!=0 && budget.getText().equals("") ==false && c!=0 && alcool.getText().equals("") == false && j==0 && menu.getText().equals("") ==false && d!=0 && restorateur.getText().equals("") == false && e!=0 && controler.matches()==true)
        {

        res.setId_resto_pk(z);
        res.setNom(nom.getText());
        res.setAdresse(adresse.getText());
        res.setTheme(theme.getText());
        res.setSpecialite(specialite.getText());
        res.setTel(Integer.parseInt(tel.getText()));
        res.setBudget(Integer.parseInt(budget.getText()));
        res.setAlcool(alcool.getText());
        res.setId_menu_fk(Integer.parseInt(menu.getText()));
        res.setId_restaurateur_fk(Integer.parseInt(restorateur.getText()));
        res.setMail(mail.getText());
        
        dao.updateRestaurant(res);
        titre.setText("Ajouter restaurant");
          modif1.setVisible(false);
          ajouter.setVisible(true);
        
        JOptionPane.showConfirmDialog(this, "confirmation");
        System.out.println(res);
        this.setVisible(false);
        new GestionRestaurant().setVisible(true);
        }
        else
        {
            if(nom.getText().equals("") ==true || f!=0)
            {
                et1.setForeground(Color.red);
                //nom.setBackground(Color.red);
            }
            if(adresse.getText().equals("") ==true || g!=0)
            {
                et2.setForeground(Color.red);
                //adresse.setBackground(Color.red);
            }
            if(theme.getText().equals("") ==true || h!=0)
            {
                et3.setForeground(Color.red);
                //theme.setBackground(Color.red);
            }
            if(specialite.getText().equals("") ==true || i!=0)
            {
                et4.setForeground(Color.red);
                //specialite.setBackground(Color.red);
            }
            if(tel.getText().equals("") ==true || b==0)
            {
                et5.setForeground(Color.red);
                //tel.setBackground(Color.red);
            }
            
             if(budget.getText().equals("") ==true || c==0)
             {
                 et6.setForeground(Color.red);
                 //budget.setBackground(Color.red);
             }
             
             if(alcool.getText().equals("") ==true || j!=0)
             {
                 et7.setForeground(Color.red);
                 //alcool.setBackground(Color.red);
             }
            if(menu.getText().equals("") ==true || d==0)
            {
                et9.setForeground(Color.red);
                //menu.setBackground(Color.red);
            }
            if(restorateur.getText().equals("") ==true || e==0) 
            {
                jLabel9.setForeground(Color.red);
                //restorateur.setBackground(Color.red);
            }
            if(controler.matches()!=true)
            {
                et8.setForeground(Color.red);
                //mail.setBackground(Color.red);
            }
            
        }

    }//GEN-LAST:event_modif1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GestionRestaurant().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Gestionrestaurant;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField adresse;
    private javax.swing.JButton ajouter;
    private javax.swing.JTextField alcool;
    private javax.swing.JButton annuler;
    private javax.swing.JTextField budget;
    private javax.swing.JPanel et;
    private javax.swing.JLabel et1;
    private javax.swing.JLabel et10;
    private javax.swing.JLabel et2;
    private javax.swing.JLabel et3;
    private javax.swing.JLabel et4;
    private javax.swing.JLabel et5;
    private javax.swing.JLabel et6;
    private javax.swing.JLabel et7;
    private javax.swing.JLabel et8;
    private javax.swing.JLabel et9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField menu;
    private javax.swing.JButton modif;
    private javax.swing.JButton modif1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField recherche;
    private javax.swing.JTextField restorateur;
    private javax.swing.JTextField specialite;
    private javax.swing.JButton supprimer;
    private javax.swing.JTable tab;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField theme;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
