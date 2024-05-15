/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author lincbp
 */
public class MainMenu extends javax.swing.JFrame {
    private String loginType;
    private int loginId;    
    private Connection conn = new koneksi().connect();
    private int idPendaftaran = 0;
    private String statusPendaftaran;
    /**
     * Creates new form MainMenu
     */
    public MainMenu(String LoginType,int LoginId) {
        initComponents();
        loginType = LoginType;
        loginId = LoginId;
        setLocationRelativeTo(this);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        if(loginType.equals("siswa")){
            panelAdmin.setVisible(false);
            queryCheckPendaftaran();
            initSiswaMenu();
            
            konten.removeAll();
            konten.add(new DashboardSiswa(loginId,this));
            konten.repaint();
            konten.revalidate();
        }
        
        if(loginType.equals("admin")){
            panelSiswa.setVisible(false);
            
            konten.removeAll();
            konten.add(new DashboardAdmin(loginId));
            konten.repaint();
            konten.revalidate();
        }
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        panelAdmin = new javax.swing.JPanel();
        btnSiswa = new javax.swing.JButton();
        btnJurusan = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnEskul = new javax.swing.JButton();
        btnPendaftaran = new javax.swing.JButton();
        btnHomeAdmin = new javax.swing.JButton();
        btnPendaftaran1 = new javax.swing.JButton();
        btnPendaftaran2 = new javax.swing.JButton();
        btnPendaftaran3 = new javax.swing.JButton();
        btnPendaftaran4 = new javax.swing.JButton();
        btnPendaftaran5 = new javax.swing.JButton();
        panelSiswa = new javax.swing.JPanel();
        btnDataPendaftaran = new javax.swing.JButton();
        btnNilai = new javax.swing.JButton();
        btnTagihan = new javax.swing.JButton();
        btnHomeSiswa = new javax.swing.JButton();
        konten = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(984, 800));

        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        header.setPreferredSize(new java.awt.Dimension(1016, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo beneran-nav.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setHideActionText(true);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SMK TADIKA MESRA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Berani Berkarya, Siap Kerja Nyata");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 565, Short.MAX_VALUE)
                .addComponent(btnLogout))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.LINE_AXIS));

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sidebar.setPreferredSize(new java.awt.Dimension(250, 100));

        panelAdmin.setBackground(new java.awt.Color(255, 255, 255));

        btnSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Users.png"))); // NOI18N
        btnSiswa.setText("Siswa");
        btnSiswa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSiswa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiswaActionPerformed(evt);
            }
        });

        btnJurusan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Book_1.png"))); // NOI18N
        btnJurusan.setHideActionText(true);
        btnJurusan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnJurusan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnJurusan.setLabel("Jurusan");
        btnJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJurusanActionPerformed(evt);
            }
        });

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Customer.png"))); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnEskul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Medal First Place.png"))); // NOI18N
        btnEskul.setText("Eskul");
        btnEskul.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEskul.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEskul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEskulActionPerformed(evt);
            }
        });

        btnPendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Address Book.png"))); // NOI18N
        btnPendaftaran.setText("Pendaftaran");
        btnPendaftaran.setBorderPainted(false);
        btnPendaftaran.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPendaftaran.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendaftaranActionPerformed(evt);
            }
        });

        btnHomeAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N
        btnHomeAdmin.setText("Home");
        btnHomeAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHomeAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHomeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeAdminActionPerformed(evt);
            }
        });

        btnPendaftaran1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPendaftaran1.setText("Report Siswa");
        btnPendaftaran1.setBorderPainted(false);
        btnPendaftaran1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPendaftaran1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPendaftaran1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendaftaran1ActionPerformed(evt);
            }
        });

        btnPendaftaran2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPendaftaran2.setText("Report Tagihan");
        btnPendaftaran2.setBorderPainted(false);
        btnPendaftaran2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPendaftaran2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPendaftaran2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendaftaran2ActionPerformed(evt);
            }
        });

        btnPendaftaran3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPendaftaran3.setText("Report Pendaftaran");
        btnPendaftaran3.setBorderPainted(false);
        btnPendaftaran3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPendaftaran3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPendaftaran3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendaftaran3ActionPerformed(evt);
            }
        });

        btnPendaftaran4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPendaftaran4.setText("Report Ekstrakulikuler");
        btnPendaftaran4.setBorderPainted(false);
        btnPendaftaran4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPendaftaran4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPendaftaran4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendaftaran4ActionPerformed(evt);
            }
        });

        btnPendaftaran5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPendaftaran5.setText("Report Jurusan");
        btnPendaftaran5.setBorderPainted(false);
        btnPendaftaran5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPendaftaran5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPendaftaran5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendaftaran5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJurusan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEskul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPendaftaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHomeAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPendaftaran1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPendaftaran2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPendaftaran3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPendaftaran4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPendaftaran5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHomeAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJurusan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEskul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPendaftaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPendaftaran1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPendaftaran2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPendaftaran3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPendaftaran4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPendaftaran5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSiswa.setBackground(new java.awt.Color(255, 255, 255));

        btnDataPendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Address Book.png"))); // NOI18N
        btnDataPendaftaran.setText("Data Pendaftaran");
        btnDataPendaftaran.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDataPendaftaran.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDataPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataPendaftaranActionPerformed(evt);
            }
        });

        btnNilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Documents.png"))); // NOI18N
        btnNilai.setText("Nilai");
        btnNilai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNilai.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNilaiActionPerformed(evt);
            }
        });

        btnTagihan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cash.png"))); // NOI18N
        btnTagihan.setText("Tagihan");
        btnTagihan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTagihan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTagihanActionPerformed(evt);
            }
        });

        btnHomeSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N
        btnHomeSiswa.setText("Home");
        btnHomeSiswa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHomeSiswa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHomeSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeSiswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSiswaLayout = new javax.swing.GroupLayout(panelSiswa);
        panelSiswa.setLayout(panelSiswaLayout);
        panelSiswaLayout.setHorizontalGroup(
            panelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDataPendaftaran, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTagihan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHomeSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSiswaLayout.setVerticalGroup(
            panelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHomeSiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataPendaftaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNilai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTagihan)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addComponent(panelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(sidebar);

        konten.setBackground(new java.awt.Color(255, 255, 255));
        konten.setLayout(new java.awt.BorderLayout());
        mainPanel.add(konten);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJurusanActionPerformed
        // TODO add your handling code here:

        konten.removeAll();
        konten.add(new MasterJurusan());
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnJurusanActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        konten.removeAll();
        konten.add(new MasterAdmin());
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnEskulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEskulActionPerformed
        // TODO add your handling code here:
        konten.removeAll();
        konten.add(new masterEskul());
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnEskulActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiswaActionPerformed
        // TODO add your handling code here:
        konten.removeAll();
        konten.add(new MasterSiswa());
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnSiswaActionPerformed

    private void btnDataPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataPendaftaranActionPerformed
        // TODO add your handling code here:
        konten.removeAll();
        konten.add(new pendaftaranSiswa(loginId,this));
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnDataPendaftaranActionPerformed

    private void btnNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNilaiActionPerformed
        // TODO add your handling code here:
        konten.removeAll();
        konten.add(new NilaiSiswa(idPendaftaran,statusPendaftaran));
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnNilaiActionPerformed

    private void btnPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendaftaranActionPerformed
        // TODO add your handling code here:
        konten.removeAll();
        konten.add(new MasterPendaftaran(loginId));
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnPendaftaranActionPerformed

    private void btnHomeSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeSiswaActionPerformed
        // TODO add your handling code here:
        konten.removeAll();
        konten.add(new DashboardSiswa(loginId,this));
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnHomeSiswaActionPerformed

    private void btnTagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTagihanActionPerformed
        // TODO add your handling code here:
        konten.removeAll();
        konten.add(new TagihanSiswa(idPendaftaran,statusPendaftaran));
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnTagihanActionPerformed

    private void btnHomeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeAdminActionPerformed
        // TODO add your handling code here:
        konten.removeAll();
        konten.add(new DashboardAdmin(loginId));
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnHomeAdminActionPerformed

    private void btnPendaftaran1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendaftaran1ActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File("src/report/ReportSiswa.jasper");
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnPendaftaran1ActionPerformed

    private void btnPendaftaran2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendaftaran2ActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File("src/report/ReportTagihan.jasper");
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPendaftaran2ActionPerformed

    private void btnPendaftaran3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendaftaran3ActionPerformed
        // TODO add your handling code here:

        konten.removeAll();
        konten.add(new ReportPendaftaran());
        konten.repaint();
        konten.revalidate();
    }//GEN-LAST:event_btnPendaftaran3ActionPerformed

    private void btnPendaftaran4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendaftaran4ActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File("src/report/ReportEskul.jasper");
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPendaftaran4ActionPerformed

    private void btnPendaftaran5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendaftaran5ActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File("src/report/ReportJurusan.jasper");
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPendaftaran5ActionPerformed
    public boolean queryCheckPendaftaran(){
        System.out.println("Triggered 2");
        boolean res = false;
        String sql = "SELECT * FROM pendaftaran p WHERE id_siswa = '"+ loginId +"' limit 1";
        
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            ResultSet rs = stat.executeQuery(sql);
            if(rs.next()){
                statusPendaftaran = rs.getString("status");
                idPendaftaran = rs.getInt("id_pendaftaran");
                res = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        return res;
    }
    
    public void showTagihan(){
        konten.removeAll();
        konten.add(new TagihanSiswa(idPendaftaran,statusPendaftaran));
        konten.repaint();
        konten.revalidate();
    }
    
    public void initSiswaMenu(){
        System.out.println("Triggered 1");
        if(idPendaftaran == 0){
            btnNilai.setVisible(false);
            btnTagihan.setVisible(false);
        }else{
            btnNilai.setVisible(true);
            btnTagihan.setVisible(false);
            
            if(!statusPendaftaran.equals("Baru") && !statusPendaftaran.equals("Dikirim")){
                btnTagihan.setVisible(true);
            }
        }
    }
    public void test(){
        System.out.println("masook");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu("siswa",1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnDataPendaftaran;
    private javax.swing.JButton btnEskul;
    private javax.swing.JButton btnHomeAdmin;
    private javax.swing.JButton btnHomeSiswa;
    private javax.swing.JButton btnJurusan;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNilai;
    private javax.swing.JButton btnPendaftaran;
    private javax.swing.JButton btnPendaftaran1;
    private javax.swing.JButton btnPendaftaran2;
    private javax.swing.JButton btnPendaftaran3;
    private javax.swing.JButton btnPendaftaran4;
    private javax.swing.JButton btnPendaftaran5;
    private javax.swing.JButton btnSiswa;
    private javax.swing.JButton btnTagihan;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel konten;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelSiswa;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
