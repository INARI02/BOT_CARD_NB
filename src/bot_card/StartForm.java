/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bot_card;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.smartcardio.CardException;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.xml.sax.Attributes;

/**
 *
 * @author N ~ N
 */
public class StartForm extends javax.swing.JFrame {
    
    private final ConnectJavaCard card = new ConnectJavaCard();
    /**
     * Creates new form StartForm
     */
    public StartForm() {
        initComponents();
        
        // enable id = true
        jTextField1.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlbx = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAcp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlbUpLoad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("NHẬP THÔNG TIN NGƯỜI DÙNG");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/snowman.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jlbx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jlbx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbxMouseClicked(evt);
            }
        });
        jPanel1.add(jlbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("ID :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 280, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Họ tên: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 280, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Ngày sinh :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 280, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Quê quán :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 280, 40));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 280, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Biển số xe :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, -1));

        btnAcp.setBackground(new java.awt.Color(255, 102, 102));
        btnAcp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAcp.setText("Xác nhận");
        btnAcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcpActionPerformed(evt);
            }
        });
        jPanel3.add(btnAcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 120, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 400, 370));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/homehehe.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spring.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jlbUpLoad.setBackground(new java.awt.Color(204, 204, 204));
        jlbUpLoad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlbUpLoad.setOpaque(true);
        getContentPane().add(jlbUpLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 150, 190));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setText("Upload ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4529084.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 840, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcpActionPerformed
        // TODO add your handling code here:
        // Bien tam de generate ID - age
        int age;
        
        card.strID = jTextField1.getText();
        card.strName = jTextField2.getText();
        card.strAddress = jTextField4.getText();
        card.strDate = jTextField3.getText();
        card.strNumberPlate = jTextField5.getText();
        
        
        
        // kiem tra anh da chon.
        /*
        if (jlbUpLoad.getIcon() == null) {
            JOptionPane.showMessageDialog(this, "Empty image");
            return;
        }
        */
        if (!isValidName(card.strName)) {
            // Notify null
            if (card.strName == null || card.strName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Trống trường tên");
                return;
            }
            if (card.strName.length() < 2) {
                JOptionPane.showMessageDialog(this, "Tên quá ngắn (< 2 kí tự)");
            } else if (card.strName.length() > 50) {
                JOptionPane.showMessageDialog(this, "Tên quá dài (> 50 kí tự)");
            } else {
                JOptionPane.showMessageDialog(this, "Trong tên có số");
            } 
            return;
        }
        /*
        if (card.strID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty field ID");
            return;
        }
        */
        if (!isValidAddress(card.strAddress)) {
            // Check address null
            if (card.strAddress == null || card.strAddress.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Trống trường địa chỉ");
                return;
            }
            
            if (card.strAddress.length() < 2) {
                JOptionPane.showMessageDialog(this, "Địa chỉ quá ngắn (< 2 kí tự)");
            } else {
                JOptionPane.showMessageDialog(this, "Địa chỉ quá dài (> 50 kí tự)");
            } 
            return;
            
        }
        
        if (!isValidDob(card.strDate)) {
            return;
        }
        
        if (!isValidNumberPlate(card.strNumberPlate)) {
            
            if (card.strNumberPlate.isEmpty()) {
                return;
            }
            
            JOptionPane.showMessageDialog(this, "Sai định dạng biển số: Eg: 30A-888.88");
            return;
        }
        
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dobDate = LocalDate.parse(card.strDate, dateTimeFormatter);
            LocalDate currentDate = LocalDate.now();
            
            age = currentDate.getYear() - dobDate.getYear();
            
            card.strID = CustomIDGenerator.generateID(age);
        } catch (Exception e) {
            System.out.println("Khong tim duoc tuoi");
        }
        
        
        
        // Set data app -> card
        String dataSend = String.join(",",card.strID, card.strName,card.strDate, card.strAddress,card.strNumberPlate);
        card.data = dataSend.getBytes(StandardCharsets.UTF_8);
         // Send request
        ResponseAPDU respond;
        respond = card.sendRequest(
                new CommandAPDU(0x00,config.BOTAPPLET.INS_SET_DATA,0x00,0x00,card.data)
        );
        
        System.out.println(respond.toString());
        String result = Integer.toHexString(respond.getSW());
        if(result.equals("9000")) {
            System.out.println("Send data to card success");
            JOptionPane.showMessageDialog(this, "Khởi tạo dữ liệu thành công.");
        } else {
            System.out.println("Error command APDU");
            return;
        }
        
        // Navigate to HomeForm
        HomeForm home = new HomeForm();
        home.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnAcpActionPerformed

    private void jlbxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbxMouseClicked
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbxMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Image data process
                byte[] originalImageBytes  = selectImage();
        if (originalImageBytes  != null) {
            JOptionPane.showMessageDialog(this, "Image selected successfully!");
            
            try {
                card.sendImage(originalImageBytes);
            } catch (CardException ex) {
                ex.printStackTrace();
                return;
            }
        }
        
        ImageIcon imageIcon = new ImageIcon(originalImageBytes );
        
        // Lay kich thuoc khung cua label
        int width = jlbUpLoad.getWidth();
        int height = jlbUpLoad.getHeight();
        
        //Scale image
        Image scaledImage;
        scaledImage = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        jlbUpLoad.setIcon(new ImageIcon(scaledImage));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    // Validate name
    public boolean isValidName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false; // Check null
        }
        String regex = "^[\\p{L}\\s]{2,50}$"; // Only alphabet, leng = 2 -> 50
        return name.matches(regex);
    }
    
    // Validate dob
    public boolean isValidDob(String dob) {
        
        if (dob == null || dob.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống trường ngày sinh");
            return false;
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Check dob is exsit (eg: 30/02/2002)
        dateFormat.setLenient(false);
        
        try {
            Date dateOfBirth = dateFormat.parse(dob);
            Date currentDate = new Date();
            
            // Kiem tra ngay sinh co lon hon hien tai
            // Eg: DoB = 30/12/2024 (Error)
            if (dateOfBirth.after(currentDate)) {
                JOptionPane.showMessageDialog(this, "Bạn chưa được sinh ra.");
                return false;
            }
            
            // Kiem tra tuoi co phu hop khong
            long ageInMillis = currentDate.getTime() - dateOfBirth.getTime();
            int age = (int) (ageInMillis / (1000L * 60 * 60 * 24 *365));
            
            if (age < 18) {
                JOptionPane.showMessageDialog(this, "Bạn chưa đủ tuổi.");
                return false;  
            } else if (age > 90) {
                JOptionPane.showMessageDialog(this, "Bạn quá tuổi");
                return false;
            } else {
                return true;
            }
            //return ((age >= 18) && (age <=90));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không tồn tại");
            return false;
        }
    }
    
    // Validate address
    public boolean isValidAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            return false; // 
        }
        // Length = 2: eg: HN, HP, BG
        return address.length() >= 2 && address.length() <= 50; // 2 <= Length <= 59
    }

    // Validate number plate
    public boolean isValidNumberPlate(String numberPlate) {
        if (numberPlate == null || numberPlate.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống trường biển số xe");
            return false; // 
        }
        //
        // format "29F-888.88"
        String regex = "^[0-9]{2}[A-Z]-[0-9]{3}\\.[0-9]{2}$";
        return numberPlate.matches(regex);
    }

    
    private byte[] selectImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg", "bmp"));
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                return Files.readAllBytes(file.toPath()); // Read image -> byte array
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error reading image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
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
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcp;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel jlbUpLoad;
    private javax.swing.JLabel jlbx;
    // End of variables declaration//GEN-END:variables
}
