
import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hari
 */
public class Items extends javax.swing.JInternalFrame {

    /**
     * Creates new form Business_info
     */
    public Items() throws SQLException {
        initComponents();
        txtname.requestFocus();
          Connect();
         showDate();
        showTime();
        Connect();
        load();
        autoID();
    }
    
     public static void Items(String args[]){
     
     
     }
       Connection con;
    PreparedStatement pst;
    DefaultTableModel df;

    void showDate() {
        Date dt = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        txtdate.setText(s.format(dt));

    }

    void showTime() {
        javax.swing.Timer t1 = new javax.swing.Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss ");
                txttime.setText(s.format(dt));

            }
        });
        t1.start();
    }
    
    public void autoID()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mobile_erp_system","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(itemid) from item");
            rs.next();
            rs.getString("MAX(itemid)");
            if(rs.getString("MAX(itemid)") == null)
            {
                txtid.setText("IT001");
            }
            else
            {
                long id = Long.parseLong(rs.getString("MAX(itemid)").substring(2,rs.getString("MAX(itemid)").length()));
                id++;
                 txtid.setText("IT" + String.format("%03d", id));
                
                
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public void load() throws SQLException {

        int a;
        try {
            pst = con.prepareStatement("select * from item");
            ResultSet rs = pst.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= a; i++) {
                    v2.add(rs.getString("itemid"));
                    v2.add(rs.getString("itemname"));
                    v2.add(rs.getString("itemimei1"));
                    v2.add(rs.getString("itemimei2"));
                    v2.add(rs.getString("itemrate"));
                 
                    v2.add(rs.getString("discount"));
                  
                           v2.add(rs.getString("quantity"));
                                  v2.add(rs.getString("brand"));
                                         v2.add(rs.getString("model"));
                                           v2.add(rs.getString("specification"));
                    
                }
                df.addRow(v2); 

            }

        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mobile_erp_system", "root", "");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtimei1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtrate = new javax.swing.JTextField();
        txtdiscount = new javax.swing.JTextField();
        txtimei2 = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        txtbrand = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtspecification = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtdate = new javax.swing.JLabel();
        txttime = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 0, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Add Items");
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtimei1.setBackground(new java.awt.Color(102, 0, 102));
        txtimei1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtimei1.setForeground(new java.awt.Color(255, 255, 255));
        txtimei1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtimei1KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item  Rate            :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Name            :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item IMEI 1          :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item IMEI 2          :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Disount                 :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity               :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Model                   :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Brand                   :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Specification       :");

        txtname.setBackground(new java.awt.Color(102, 0, 102));
        txtname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });

        txtrate.setBackground(new java.awt.Color(102, 0, 102));
        txtrate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtrate.setForeground(new java.awt.Color(255, 255, 255));
        txtrate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrateKeyPressed(evt);
            }
        });

        txtdiscount.setBackground(new java.awt.Color(102, 0, 102));
        txtdiscount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdiscount.setForeground(new java.awt.Color(255, 255, 255));
        txtdiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdiscountKeyPressed(evt);
            }
        });

        txtimei2.setBackground(new java.awt.Color(102, 0, 102));
        txtimei2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtimei2.setForeground(new java.awt.Color(255, 255, 255));
        txtimei2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtimei2KeyPressed(evt);
            }
        });

        txtqty.setBackground(new java.awt.Color(102, 0, 102));
        txtqty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtqty.setForeground(new java.awt.Color(255, 255, 255));
        txtqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtqtyKeyPressed(evt);
            }
        });

        txtmodel.setBackground(new java.awt.Color(102, 0, 102));
        txtmodel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmodel.setForeground(new java.awt.Color(255, 255, 255));
        txtmodel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmodelKeyPressed(evt);
            }
        });

        txtbrand.setBackground(new java.awt.Color(102, 0, 102));
        txtbrand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbrand.setForeground(new java.awt.Color(255, 255, 255));
        txtbrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbrandKeyPressed(evt);
            }
        });

        txtspecification.setBackground(new java.awt.Color(102, 0, 102));
        txtspecification.setColumns(20);
        txtspecification.setRows(5);
        jScrollPane1.setViewportView(txtspecification);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtimei1)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txtimei2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txtrate, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txtdiscount, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txtqty, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txtbrand, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txtmodel, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtimei1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtimei2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setText("ITEMS");

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemsID", "ItemName", "ItemIMEI1", "ItemIMEI2", "Rate", "Discount", "Quantity", "Brand", "Model", "Specification"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtdate.setText("Date");

        txttime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txttime.setText("Time");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Item ID");

        txtid.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtid.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(77, 77, 77)
                                .addComponent(txtid))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(249, 249, 249)
                                .addComponent(txtdate)
                                .addGap(78, 78, 78)
                                .addComponent(txttime))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtid)
                    .addComponent(txtdate)
                    .addComponent(txttime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
     
        
        
         df = (DefaultTableModel) jTable1.getModel();

        int selected = jTable1.getSelectedRow();

        String id =df.getValueAt(selected, 0).toString();

        txtname.setText(df.getValueAt(selected, 1).toString());
        txtimei1.setText(df.getValueAt(selected, 2).toString());
        txtimei2.setText(df.getValueAt(selected, 3).toString());
        txtrate.setText(df.getValueAt(selected, 4).toString());
        txtdiscount.setText(df.getValueAt(selected, 5).toString());
        txtqty.setText(df.getValueAt(selected, 6).toString());
        txtbrand.setText(df.getValueAt(selected, 7).toString());
        txtmodel.setText(df.getValueAt(selected, 8).toString());
        txtspecification.setText(df.getValueAt(selected, 9).toString());
      
        
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String id=txtid.getText();
        String Name = txtname.getText();
        int imei1 =Integer.parseInt(txtimei1.getText());    
        int imei2 =Integer.parseInt(txtimei2.getText()); 
        String Rate = txtrate.getText();
          String Discount=txtdiscount.getText();
            int Quantity=Integer.parseInt(txtqty.getText()); 
          String Brand=txtbrand.getText();
          String Model=txtmodel.getText();
          String Specification=txtspecification.getText();
          

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mobile_erp_system", "root", "");
            //pst = con.prepareStatement("insert into customer(Name,Number,Email,Address,Amount,Date)values(+Name+,+Number+,+Email+,+Address+,+Amount+,+Time+)");
            pst = con.prepareStatement("insert into item(itemid,itemname,itemimei1,itemimei2,itemrate,discount,quantity,brand,model,specification)values(?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, id);
            pst.setString(2, Name);
            pst.setInt(3, imei1);
            pst.setInt(4, imei2);
            pst.setString(5,Rate);
              pst.setString(6,Discount);
                pst.setInt(7,Quantity);
                   pst.setString(8,Brand);
              pst.setString(9,Model);
                pst.setString(10,Specification);
            
           
             
            //  pst.setString(6, Time);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Recorded Successfully");

            txtname.setText("");
            txtimei1.setText("");
            txtimei2.setText("");
            txtrate.setText("");
              txtdiscount.setText("");
                txtspecification.setText("");
                  txtqty.setText("");
                    txtbrand.setText("");
                      txtmodel.setText("");
             
            txtname.requestFocus();
            load();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     df = (DefaultTableModel) jTable1.getModel();
        int selected = jTable1.getSelectedRow();

        String id =df.getValueAt(selected, 0).toString();

        String Name = txtname.getText();
        int imei1 =Integer.parseInt(txtimei1.getText());
        int imei2 =Integer.parseInt(txtimei2.getText());
        String Rate=txtrate.getText();
        String Discount=txtdiscount.getText();
           int Quantity=Integer.parseInt(txtqty.getText()); 
        String Brand =txtbrand.getText();
        String Model=txtmodel.getText();
        String Specification=txtspecification.getText();
        
               

        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/mobile_erp_system", "root", "");
            //  pst = con.prepareStatement("insert into customer(Name,Number,Email,Address,Amount)values("+Name+","+Number+","+Email+","+Address+","+Amount+")");
            pst = con.prepareStatement("update item set itemname = ?,itemimei1 = ?,itemimei2 = ?,itemrate = ?,discount=?,quantity=?,brand=?,model=?,specification=? where itemid = ?");

            pst.setString(1, Name);
            pst.setInt(2, imei1);
            pst.setInt(3, imei2);
            pst.setString(4, Rate);
            pst.setString(5,Discount );
               pst.setInt(6,Quantity);
                   pst.setString(7, Brand);
                   pst.setString(8,Model);
            pst.setString(9,Specification);
            pst.setString(10,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated Successfully");

                

            txtname.setText("");
            txtimei1.setText("");
            txtimei2.setText("");
            txtrate.setText("");
              txtdiscount.setText("");
                txtspecification.setText("");
                  txtqty.setText("");
                    txtbrand.setText("");
                      txtmodel.setText("");
             
            txtname.requestFocus();
            load();
            jButton1.setEnabled(true);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            txtname.setText("");
            txtimei1.setText("");
            txtimei2.setText("");
            txtrate.setText("");
            txtdiscount.setText("");
            txtspecification.setText("");
            txtqty.setText("");
            txtbrand.setText("");
            txtmodel.setText("");
            
            txtname.requestFocus();
            load();
            jButton1.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {
            // TODO add your handling code here:
            df = (DefaultTableModel) jTable1.getModel();
            int selected = jTable1.getSelectedRow();
            String id = df.getValueAt(selected, 0).toString();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost/mobile_erp_system", "root", "");
            //  pst = con.prepareStatement("insert into customer(Name,Number,Email,Address,Amount)values("+Name+","+Number+","+Email+","+Address+","+Amount+")");
            pst = con.prepareStatement("delete from item where itemid = ?");

            pst.setString(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted");
            txtname.setText("");
            txtimei1.setText("");
            txtimei2.setText("");
            txtrate.setText("");
            txtdiscount.setText("");
            txtspecification.setText("");
            txtqty.setText("");
            txtbrand.setText("");
            txtmodel.setText("");
            
            txtname.requestFocus();
            load();
            jButton1.setEnabled(true);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtimei1.requestFocus();
        }
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtimei1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtimei1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtimei2.requestFocus();
        }
    }//GEN-LAST:event_txtimei1KeyPressed

    private void txtimei2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtimei2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           txtrate.requestFocus();
        }
    }//GEN-LAST:event_txtimei2KeyPressed

    private void txtrateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdiscount.requestFocus();
        }
    }//GEN-LAST:event_txtrateKeyPressed

    private void txtdiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiscountKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtqty.requestFocus();
        }
    }//GEN-LAST:event_txtdiscountKeyPressed

    private void txtqtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtyKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtbrand.requestFocus();
        }
    }//GEN-LAST:event_txtqtyKeyPressed

    private void txtbrandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbrandKeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtmodel.requestFocus();
        }
    }//GEN-LAST:event_txtbrandKeyPressed

    private void txtmodelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmodelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           txtspecification.requestFocus();
        }
    }//GEN-LAST:event_txtmodelKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JLabel txtdate;
    private javax.swing.JTextField txtdiscount;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtimei1;
    private javax.swing.JTextField txtimei2;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtrate;
    private javax.swing.JTextArea txtspecification;
    private javax.swing.JLabel txttime;
    // End of variables declaration//GEN-END:variables
}
