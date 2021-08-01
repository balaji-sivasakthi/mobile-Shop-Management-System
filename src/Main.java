
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Hari
 */
public class Main extends javax.swing.JFrame {

    /** Creates new form Main */
    public Main() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        Master = new javax.swing.JMenu();
        Business_info = new javax.swing.JMenuItem();
        Add_stock = new javax.swing.JMenuItem();
        Add_items = new javax.swing.JMenuItem();
        Add_vendors = new javax.swing.JMenuItem();
        Add_users = new javax.swing.JMenuItem();
        Sales = new javax.swing.JMenu();
        Sale = new javax.swing.JMenuItem();
        Return_item = new javax.swing.JMenu();
        Return = new javax.swing.JMenuItem();
        Report = new javax.swing.JMenu();
        Stock_report = new javax.swing.JMenuItem();
        Sales_report = new javax.swing.JMenuItem();
        Phone = new javax.swing.JMenu();
        Details = new javax.swing.JMenuItem();
        Analytics = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Master.setText("Master");
        Master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasterActionPerformed(evt);
            }
        });

        Business_info.setText("Business info");
        Business_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Business_infoActionPerformed(evt);
            }
        });
        Master.add(Business_info);

        Add_stock.setText("Add stock");
        Add_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_stockActionPerformed(evt);
            }
        });
        Master.add(Add_stock);

        Add_items.setText("Add items");
        Add_items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_itemsActionPerformed(evt);
            }
        });
        Master.add(Add_items);

        Add_vendors.setText("Add vendors");
        Add_vendors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_vendorsActionPerformed(evt);
            }
        });
        Master.add(Add_vendors);

        Add_users.setText("Add users");
        Add_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_usersActionPerformed(evt);
            }
        });
        Master.add(Add_users);

        jMenuBar1.add(Master);

        Sales.setText("Sales");
        Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesActionPerformed(evt);
            }
        });

        Sale.setText("Sale");
        Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaleActionPerformed(evt);
            }
        });
        Sales.add(Sale);

        jMenuBar1.add(Sales);

        Return_item.setText("Return item");
        Return_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_itemActionPerformed(evt);
            }
        });

        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        Return_item.add(Return);

        jMenuBar1.add(Return_item);

        Report.setText("Report");
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });

        Stock_report.setText("Stock report");
        Stock_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_reportActionPerformed(evt);
            }
        });
        Report.add(Stock_report);

        Sales_report.setText("Sales report");
        Sales_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sales_reportActionPerformed(evt);
            }
        });
        Report.add(Sales_report);

        jMenuBar1.add(Report);

        Phone.setText("Phone details");
        Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneActionPerformed(evt);
            }
        });

        Details.setText("Details");
        Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsActionPerformed(evt);
            }
        });
        Phone.add(Details);

        jMenuBar1.add(Phone);

        Analytics.setText("Analytics");
        Analytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyticsActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Analytics");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Analytics.add(jMenuItem3);

        jMenuBar1.add(Analytics);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1368, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Stock_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_reportActionPerformed
       StockReport streport = new  StockReport();
       this.add( streport);
       streport.setVisible(true);
    }//GEN-LAST:event_Stock_reportActionPerformed

    private void Business_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Business_infoActionPerformed
       Businessinfo binfo = new  Businessinfo();
       this.add(binfo);
       binfo.setVisible(true);
    }//GEN-LAST:event_Business_infoActionPerformed

    private void Add_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_stockActionPerformed
       Stocks st = new Stocks();
       this.add(st);
       st.setVisible(true);
    }//GEN-LAST:event_Add_stockActionPerformed

    private void MasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasterActionPerformed
     
    }//GEN-LAST:event_MasterActionPerformed

    private void Add_itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_itemsActionPerformed
        try {
            Items it = new Items();
            this.add(it);
            it.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Add_itemsActionPerformed

    private void Add_vendorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_vendorsActionPerformed
        Vendors vn;
        try {
            vn = new  Vendors();
                this.add(vn);
       vn.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_Add_vendorsActionPerformed

    private void Add_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_usersActionPerformed
       Users ur = new   Users();
       this.add(ur);
       ur.setVisible(true);
    }//GEN-LAST:event_Add_usersActionPerformed

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
       
    }//GEN-LAST:event_ReportActionPerformed

    private void Sales_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sales_reportActionPerformed
        Analytics slreport = new  Analytics();
       this.add( slreport);
       slreport.setVisible(true);
    }//GEN-LAST:event_Sales_reportActionPerformed

    private void SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesActionPerformed
         
    }//GEN-LAST:event_SalesActionPerformed

    private void Return_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_itemActionPerformed
       
    }//GEN-LAST:event_Return_itemActionPerformed

    private void PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneActionPerformed
      
    }//GEN-LAST:event_PhoneActionPerformed

    private void AnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyticsActionPerformed
     
    }//GEN-LAST:event_AnalyticsActionPerformed

    private void SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaleActionPerformed
           Sales sl = new  Sales();
           this.add( sl);
           sl.setVisible(true);
    }//GEN-LAST:event_SaleActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
         ReturnItems ri = new   ReturnItems();
       this.add( ri);
       ri.setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    private void DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsActionPerformed
    PhoneDetails pd = new PhoneDetails();
       this.add( pd);
       pd.setVisible(true);
    }//GEN-LAST:event_DetailsActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       Analytics al = new Analytics();
       this.add( al);
       al.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

     public static void Main(String args[]){
     
     
     }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Add_items;
    private javax.swing.JMenuItem Add_stock;
    private javax.swing.JMenuItem Add_users;
    private javax.swing.JMenuItem Add_vendors;
    private javax.swing.JMenu Analytics;
    private javax.swing.JMenuItem Business_info;
    private javax.swing.JMenuItem Details;
    private javax.swing.JMenu Master;
    private javax.swing.JMenu Phone;
    private javax.swing.JMenu Report;
    private javax.swing.JMenuItem Return;
    private javax.swing.JMenu Return_item;
    private javax.swing.JMenuItem Sale;
    private javax.swing.JMenu Sales;
    private javax.swing.JMenuItem Sales_report;
    private javax.swing.JMenuItem Stock_report;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables

}
