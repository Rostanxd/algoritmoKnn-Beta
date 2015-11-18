/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entities.Data;
import entities.DataReview;
import entities.Feature;
import entities.Results;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class FrmResult extends javax.swing.JFrame {
    
    private ArrayList<DataReview> dataRvw = new ArrayList<DataReview>();
    private ArrayList<Results> arrResFinal = new ArrayList<Results>();
    
    
    /**
     * Creates new form NewJFrame
     */
    public FrmResult(ArrayList<DataReview> dataRvw) {
        this.dataRvw = dataRvw;
        ArrayList<Results> arrRes = new ArrayList<Results>();
        // ArrayList<Results> arrResFinal = new ArrayList<Results>();
        Results resLower = null;
        initComponents();
        
        Iterator<DataReview> itrDr = this.dataRvw.iterator();
        while(itrDr.hasNext()){
            DataReview dr = itrDr.next();
            String code = dr.getCode();
            float ave = dr.getAverage();
            
            //  Data
            Results r = new Results();
            ArrayList<Feature> arrFea = new ArrayList<Feature>(); //Array de Features
            
            // System.out.println("code: "+code+" ave: "+ave);
            
            int limit = 1; // Cut String limite
            for (int i = 0; i < code.length()-1; i++) {
                Feature f = new Feature();
                f.setFtr(Integer.parseInt(code.substring(i,limit)));
                limit += 1;
                
                arrFea.add(f);
            }
            
            r.setCode(arrFea);
            r.setAve(ave);
            
            arrRes.add(r);
        }
        
//        Iterator<Results> itrRes = arrRes.iterator();
//        while (itrRes.hasNext()){
//            Results res = itrRes.next();
//            ArrayList<Feature> arrFea2 = res.getCode();
//            float ave = res.getAve();
//            
//            System.out.print("ArrayFeatures: ");
//            Iterator<Feature> itrFea = arrFea2.iterator();
//            while (itrFea.hasNext()) {
//                Feature f = itrFea.next();
//                System.out.print(f.getFtr());
//            }
//            System.out.println(" Average: "+res.getAve());
//        }
        
        resLower = arrRes.get(0);    //  Take teh lower result to get the neighbors.
        
        Iterator<Results> itrRes = arrRes.iterator();
        while (itrRes.hasNext()){
            Results res = itrRes.next();
            ArrayList<Feature> arrFeaRes = res.getCode();
            float ave = res.getAve();
            
            ArrayList<Feature> arrFeaRLower = resLower.getCode();
            
            int cont = 0;
            
            for (int i = 0; i < arrFeaRes.size(); i++) {
                if (arrFeaRes.get(i).getFtr()!=arrFeaRLower.get(i).getFtr()) {
                    // System.out.println("AR: "+arrFeaRes.get(i).getFtr()+" >> "+arrFeaRLower.get(i).getFtr());
                    cont += 1;
                }
            }
            
            // System.out.println("");
            
            //  Create de Result Final
            Results resFinal = new Results();
            resFinal.setCode(arrFeaRes);
            resFinal.setAve(ave);
            resFinal.setDist(cont);
            
            if(cont!=0){
                this.arrResFinal.add(resFinal);
            }
        }
        

        System.out.println("<< RESULTS >>");
        System.out.print("Lower Node: ");
        Iterator<Feature> itrFeaResLow = resLower.getCode().iterator();
        while (itrFeaResLow.hasNext()) {
            System.out.print(itrFeaResLow.next().getFtr()); 
        }
        System.out.println("");
        
        Iterator<Results> itrResFinal = this.arrResFinal.iterator();
        while (itrResFinal.hasNext()) {
            Results r = itrResFinal.next();
            ArrayList<Feature> arrFea = r.getCode();
            float ave = r.getAve();
            int dist = r.getDist();
            
            System.out.print("Features: ");
            Iterator<Feature> itrArrFea = arrFea.iterator();
            while (itrArrFea.hasNext()) {
                Feature f = itrArrFea.next();
                System.out.print(f.getFtr());
            }
            System.out.println(" Average: "+ave+" Distance: "+dist);
        }
        
        //  take the first object DataReview cause it's lower.
        for (int i = 0; i < 1; i++) {
            DataReview dr = this.dataRvw.get(i);
            KnnId.setText(dr.getCode());
            KnnAve.setText(String.valueOf(dr.getAverage()));
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        KnnId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        KnnNo = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResults = new javax.swing.JTable();
        KnnAve = new javax.swing.JTextField();

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Acept");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        KnnId.setEnabled(false);

        jLabel1.setText("Knn:");

        jLabel2.setText("No. Neighbors:");

        KnnNo.setText("###");

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jTResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Average", "Distance", "Coefficient Proximity"
            }
        ));
        jScrollPane1.setViewportView(jTResults);

        KnnAve.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(KnnId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(KnnAve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(KnnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(KnnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KnnAve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(KnnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)jTResults.getModel();
        dtm.setRowCount(0);
        
        if (!KnnNo.getText().equals("")){
            try{
                for (int i = 0; i <= Integer.parseInt(KnnNo.getText()); i++) {
                    Results r = this.arrResFinal.get(i);
                    Vector fila = new Vector();

                    String code = "";
                    
                    ArrayList<Feature> arrFea = r.getCode();
                    Iterator<Feature> itrFea = arrFea.iterator();
                    while (itrFea.hasNext()) {
                        code += itrFea.next().getFtr();
                    }
                    
                    fila.add(code);
                    fila.add(r.getAve());
                    fila.add(r.getDist());
                    fila.add(r.getCoffPro());

                    dtm.addRow(fila);
                    
                    code = "";
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, 
                "Please enter a valid Number", 
                "Error",
                JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, 
            "Please enter a Knn Neighbor(s)", 
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_calculateActionPerformed

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
            java.util.logging.Logger.getLogger(FrmResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmResult().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField KnnAve;
    private javax.swing.JTextField KnnId;
    private javax.swing.JTextField KnnNo;
    private javax.swing.JButton calculate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTResults;
    // End of variables declaration//GEN-END:variables
}
