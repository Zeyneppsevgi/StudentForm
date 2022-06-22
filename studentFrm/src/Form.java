
import javax.swing.DefaultListModel;


public class Form extends javax.swing.JFrame {
      DefaultListModel model;
    
    public Form() {
        initComponents();
        model = new DefaultListModel();
        lst_students.setModel(model);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst_students = new javax.swing.JList<>();
        lbl_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        btn_ekle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        lbl_mesaj = new javax.swing.JLabel();
        btn_secilisil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lst_students);

        lbl_name.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 51, 0));
        lbl_name.setText("Öğrenci adı :");

        btn_ekle.setForeground(new java.awt.Color(0, 255, 204));
        btn_ekle.setText("öğrenci ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        btn_sil.setText("öğrenci sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_secilisil.setText("seçili sil");
        btn_secilisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_secilisilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btn_ekle)
                        .addGap(61, 61, 61)
                        .addComponent(btn_sil))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbl_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_secilisil)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbl_name))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ekle)
                    .addComponent(btn_sil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_secilisil))
                .addGap(28, 28, 28)
                .addComponent(lbl_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        model.addElement(txt_name.getText());
        lbl_mesaj.setText("Eleman eklendi " + txt_name.getText());
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        model.removeElement(txt_name.getText());
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_secilisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_secilisilActionPerformed
        int index =lst_students.getSelectedIndex();
        if(index!=-1){
            model.removeElementAt(index);
        }else{
            lbl_mesaj.setText("Silinecek değer yok");
        
    }//GEN-LAST:event_btn_secilisilActionPerformed

     }
    
   public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_secilisil;
    private javax.swing.JButton btn_sil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_mesaj;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JList<String> lst_students;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
