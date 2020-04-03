/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kutuphaneotomasyonu;

import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author asus
 */
public class uyeBilgileri extends javax.swing.JDialog {
DefaultTableModel model;
islemler isslem=new islemler();



    public uyeBilgileri(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         model=(DefaultTableModel)uye_tablosu.getModel();//tabloyu bir modele atadık
        uyeGoruntule();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        uye_tablosu = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        yazar = new javax.swing.JTextField();
        tarih = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        guncelle = new javax.swing.JButton();
        calisanEkle = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        kitabialan = new javax.swing.JTextField();
        arama_cubugu = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        uye_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ad", "yazar", "tarih", "kitabialan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        uye_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uye_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uye_tablosu);

        jLabel6.setText("Kayıt Tarihi:");

        tarih.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1584966241891L), null, null, java.util.Calendar.DAY_OF_MONTH));

        jLabel7.setText("Kitap Adı:");

        jLabel8.setText("Yazar:");

        jLabel9.setText("Alınan Kitap Bilgileri");

        guncelle.setText("Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        calisanEkle.setText("Ekle");
        calisanEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calisanEkleActionPerformed(evt);
            }
        });

        sil.setText("Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        jLabel4.setText("Kitabı Alan:");

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ad)
                            .addComponent(yazar)
                            .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calisanEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kitabialan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(guncelle)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(calisanEkle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(kitabialan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sil))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
         String ad=this.ad.getText();
         String yazar=this.yazar.getText();
         Date tarih=new Date();
         String kitabialan=this.kitabialan.getText();
         int selectedrow=uye_tablosu.getSelectedRow();
             if(selectedrow==-1)
        {
            if(model.getRowCount()==0)//tablo boşmu
            {
                
               mesaj_yazisi.setText("KitapKayıt tablosu boş şuan");
            }
            else{
                mesaj_yazisi.setText("lütfen güncellenecek bir sütun seçin");
               }
        }
            else{
                  int id= (int)model.getValueAt(selectedrow, 0);
                  isslem.guncelle(id, ad, yazar, tarih,kitabialan);
                  uyeGoruntule();
                  
               }
    
    }//GEN-LAST:event_guncelleActionPerformed

    private void calisanEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calisanEkleActionPerformed

      
          String ad=this.ad.getText();
          String yazar=this.yazar.getText();
          Date tarih=new Date();
          String kitabialan=this.kitabialan.getText();
          isslem.Ekle( ad, yazar, tarih,kitabialan);
          uyeGoruntule();
       
    }//GEN-LAST:event_calisanEkleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed

        String ad=this.ad.getText();
        String yazar=this.yazar.getText();
         Date tarih=new Date();
          String kitabialan=this.kitabialan.getText();
      
        int selectedrow=uye_tablosu.getSelectedRow();
   
        if(selectedrow==-1)
        {
            if(model.getRowCount()==0)//tablo boşmu
            {
            
                mesaj_yazisi.setText("KitapKayıt tablosu boş şuan");
            }
            else{
                mesaj_yazisi.setText("lütfen silinecek bir sütun seçin");
               }
        }
         
       
        else{
                  int id= (int)model.getValueAt(selectedrow, 0);
                  
                  isslem.sil(id, ad, yazar, tarih,kitabialan);
                  uyeGoruntule();
                  
               }
          
       
    }//GEN-LAST:event_silActionPerformed

    private void uye_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uye_tablosuMouseClicked
        // TODO add your handling code here:
      
        int selectedRow=uye_tablosu.getSelectedRow();
        ad.setText(model.getValueAt(selectedRow, 1).toString());
        yazar.setText(model.getValueAt(selectedRow, 2).toString());
        tarih.setValue(model.getValueAt(selectedRow, 3));
         kitabialan.setText(model.getValueAt(selectedRow, 4).toString());
              
     
    }//GEN-LAST:event_uye_tablosuMouseClicked
public void dinamikAra(String ara)
{
    TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
    
    uye_tablosu.setRowSorter(tr);

    tr.setRowFilter(RowFilter.regexFilter(ara));
}
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        // TODO add your handling code here:
         String ara=arama_cubugu.getText();//klavyeden gelen değeri alıyor
        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguKeyReleased

     public  void uyeGoruntule()
             
     {    
          model.setRowCount(0);//tablomuzu her seferinde boşlatmış oluyruz.
        ArrayList<Kitappkayitt> bilgi= new ArrayList<Kitappkayitt>();
   
         bilgi= isslem.kitapbilgileriniGetir();//veritabanından bilgileri alıp tabloya dolduruyorzu
        if(bilgi!=null  )
        {  
            
            
            for(Kitappkayitt kitappkayitt: bilgi)
            {
           
                Object[] eklenecek={ kitappkayitt.getId()  ,kitappkayitt.getAd(),kitappkayitt.getYazar(),kitappkayitt.getTarih(),kitappkayitt.getKitabialan()};
                model.addRow(eklenecek);
           
            }
            
        }
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
            java.util.logging.Logger.getLogger(uyeBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uyeBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uyeBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uyeBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                uyeBilgileri dialog = new uyeBilgileri(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton calisanEkle;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kitabialan;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sil;
    private javax.swing.JSpinner tarih;
    private javax.swing.JTable uye_tablosu;
    private javax.swing.JTextField yazar;
    // End of variables declaration//GEN-END:variables
}
