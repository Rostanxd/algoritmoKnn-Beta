/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import archive.Reviews;
import config.FrmColumns;
import entities.Columns;
import entities.Data;
import entities.DataReview;
import entities.Feature;
import entities.FeaturesString;
import entities.FeaturesValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class FrmAlgorith extends javax.swing.JFrame {
    ArrayList<Data> data = new ArrayList<Data>();
    ArrayList<Data> data2 = new ArrayList<Data>();
    ArrayList<Columns> col = new ArrayList<Columns>();
    ArrayList<DataReview> dataRvw = new ArrayList<DataReview>();
    Scanner sc = null;
    
    /**
     * Creates new form FrmAlgorith
     */
    public FrmAlgorith() {
        initComponents();
        try{
            Reviews r = new Reviews();
            col = r.readColFile();
            colTableReview(col);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        //  Variables Frm
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jTxtArchiveAddress.setEnabled(false);
        jTxtArchiveAddress.setText("");
    }
    
    //  SetUp the Review's Table with the configuration from the file Feature
    public void colTableReview(ArrayList<Columns> col){
        DefaultTableModel dtm  = (DefaultTableModel)jtReview.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < col.size(); i++) {
            Columns c = col.get(i);
            String colName = c.getColumnName();
            dtm.addColumn(colName);
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

        jbArchive = new javax.swing.JButton();
        jTxtArchiveAddress = new javax.swing.JTextField();
        jlArcName = new javax.swing.JLabel();
        jlSize = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReview = new javax.swing.JTable();
        btFeatures = new javax.swing.JButton();
        btAcp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDataReview = new javax.swing.JTable();
        btAverage = new javax.swing.JButton();
        jb_KnnFrm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbArchive.setText("Archive");
        jbArchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArchiveActionPerformed(evt);
            }
        });

        jTxtArchiveAddress.setEnabled(false);

        jlArcName.setText("Name");

        jlSize.setText("Size");

        jtReview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtReview);

        btFeatures.setText("Features...");
        btFeatures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFeaturesActionPerformed(evt);
            }
        });

        btAcp.setText("Accept");
        btAcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcpActionPerformed(evt);
            }
        });

        jtDataReview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Features", "Average", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(jtDataReview);

        btAverage.setText("Average");
        btAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAverageActionPerformed(evt);
            }
        });

        jb_KnnFrm.setText("Knn...");
        jb_KnnFrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_KnnFrmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbArchive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jlArcName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlSize, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtArchiveAddress, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFeatures, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAcp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_KnnFrm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbArchive)
                    .addComponent(jlArcName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtArchiveAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btFeatures)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAverage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_KnnFrm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAcp))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbArchiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArchiveActionPerformed
        JFileChooser dialogo = new JFileChooser();
        dialogo.setDialogTitle("Archivo");
        //Aquí se está filtrando el tipo de archive a mostrar en la ventana
        //en este caso se hace para que sólo muestre archivos txt
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos txt","txt");
        dialogo.setFileFilter(filtro);
        //condición para verificar si selecciona algún archive
        if(dialogo.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
        {
            String pathArchivo = dialogo.getSelectedFile().getPath();
            jTxtArchiveAddress.setText(pathArchivo);
            
            //  Instantiate the file
            File archive = new File(pathArchivo);
            
            //  Set archive's name
            jlArcName.setText(archive.getName());
            //  Set archive's length
            jlSize.setText(String.valueOf(archive.length())+" bit");
            
            try{
                //  Reading the file 
                System.out.println("Reading the file"+jlArcName.getText());
                sc = new Scanner(archive);
                //  Getting the Data from the file
                while(sc.hasNextLine()){
                    ArrayList<Feature> fea = new ArrayList<Feature>();  //  new ArrayList<Feature>
                    
                    String line = sc.nextLine(); // Getting a line from the file
                    String[] cutString = line.split("::"); //   Getting Data
                    
//                    feaData.clear();        //  Clear ArrayList Feature
                    
                    for (int i = 0; i < (cutString.length - 1); i++) {
                        Feature fObject = new Feature(); // Create a Object from the "Feature" class
                        fObject.setFtr(Integer.parseInt(cutString[i]));
                        fea.add(fObject);   //  Add to the ArrayList Feature
                    }
                    
                    //  Create a object from the "Data" class
                    Data dObject = new Data();
                    //  Storing Code and Value of the DATA Object
                    dObject.setCode(fea);   //  Setting the code (ArrayList)
                    dObject.setValue(Integer.parseInt(cutString[6]));   //  Settig the value
                    //  Adding the DATA object to the ArrayList
                    this.data.add(dObject);  //  Add to the ArrayList
                    
//                    Iterator<Feature> itrFea = feaData.iterator();
//                    while(itrFea.hasNext()){
//                        Feature f = itrFea.next();
//                        System.out.print(f.getFtr()); 
//                    }
//                    System.out.println("");
                    
                }
            }catch(FileNotFoundException | NumberFormatException e){
                System.out.println(e.toString());
            }
            this.data2 = (ArrayList) data.clone();  // Copy the array
            
            
            //  Verify that the copy is done.
//            Iterator<Data> itrData = data2.iterator();
//            while(itrData.hasNext()){
//                Data d = itrData.next();
//                ArrayList<Feature> ftr = new ArrayList<Feature>();
//                ftr = d.getCode();
//                Iterator<Feature> itFtr = ftr.iterator();
//                while(itFtr.hasNext()){
//                    Feature f = itFtr.next();
//                    System.out.print(f.getFtr());
//                }
//                System.out.print(" ");
//                System.out.print(d.getValue());
//                System.out.println("");
//            }
            
            table(data);    // Add the data in the table
        }
    }//GEN-LAST:event_jbArchiveActionPerformed

    private void btFeaturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFeaturesActionPerformed
        // TODO add your handling code here:
        FrmColumns frmCol = new FrmColumns();
        frmCol.setLocationRelativeTo(null);
        frmCol.setVisible(true);
    }//GEN-LAST:event_btFeaturesActionPerformed

    private void btAcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcpActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btAcpActionPerformed

    private void btAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAverageActionPerformed
        // TODO add your handling code here:
        ArrayList<FeaturesString> feaStrArray = stringData(data);   //  Create an ArrayList<FeatureString> to save the code like a String to compare.
        ArrayList<FeaturesValue> feaValArray = stringValue(data);   //  Create an ArrayList<FeaturesValue> to save the data in String/Int form to compare.
        
        // Verificando StringData
//        Iterator<FeaturesString> itrFeaStrArray = feaStrArray.iterator();
//        while (itrFeaStrArray.hasNext()) {            
//            FeaturesString feaStr = itrFeaStrArray.next();
//            System.out.println(feaStr.getFeaturesID());
//        }
        
        ArrayList<FeaturesString> feaStrArrayUnq = uniqueDatas(feaStrArray);
        
        //  Checking uniqueDatas
//        Iterator<FeaturesString> itrFeaStrArrayUnq = feaStrArrayUnq.iterator();
//        while(itrFeaStrArrayUnq.hasNext()){
//            FeaturesString fs = itrFeaStrArrayUnq.next();
//            System.out.println(fs.getFeaturesID());
//        }
        
        //  Average.
//        ArrayList<DataReview> dataRvw = averageData(feaStrArrayUnq,feaValArray);
        
        this.dataRvw = averageData(feaStrArrayUnq,feaValArray);
        tableReview(dataRvw);
    }//GEN-LAST:event_btAverageActionPerformed

    private void jb_KnnFrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_KnnFrmActionPerformed
        // TODO add your handling code here:
        Collections.sort(this.dataRvw, new Comparator<DataReview>(){
            @Override
            public int compare(DataReview dr1, DataReview dr2){
                return new Float(dr1.getAverage()).compareTo(new Float(dr2.getAverage()));
            }
        });
        FrmResult frmR = new FrmResult(this.dataRvw);
        frmR.setLocationRelativeTo(null);
        frmR.setVisible(true);
    }//GEN-LAST:event_jb_KnnFrmActionPerformed

    public void read(File archive){
        try{
            FileInputStream arch = new FileInputStream(archive);
            ObjectInputStream obj_arch = new ObjectInputStream(arch);
            data = (ArrayList<Data>) obj_arch.readObject();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void table(ArrayList<Data> data){
        
        DefaultTableModel dtm  = (DefaultTableModel)jtReview.getModel();
        dtm.setRowCount(0);
        
        for (int i = 0; i < data.size(); i++) {
            Vector fila = new Vector();
            
            Data d = data.get(i);
            
            ArrayList<Feature> fea = new ArrayList<Feature>();
            
            fea = d.getCode();
            
            Iterator<Feature> itrFea = fea.iterator();
            while(itrFea.hasNext()){
                Feature f = itrFea.next();
                fila.add(f.getFtr());
//                System.out.print(f.getFtr());
            }
//            System.out.print(" "+d.getValue());
//            System.out.println(" ");
            
            fila.add(d.getValue());
            dtm.addRow(fila);
        }
    }
    
    public ArrayList<FeaturesString>  uniqueDatas(ArrayList<FeaturesString> data){
        
        Iterator<FeaturesString> itrData = data.iterator();   //  Iterator for DATA
        
        ArrayList<FeaturesString> data2 = new ArrayList<FeaturesString>();   //  ArrayLists of features no dupicated
        
        while(itrData.hasNext()){
            int cont = 0;
            FeaturesString fs = itrData.next();
            String fId = fs.getFeaturesID();
            
            Iterator<FeaturesString> itrData2 = data2.iterator();
            while(itrData2.hasNext()){
                FeaturesString fs2 = itrData2.next();
                String fId2 = fs2.getFeaturesID();
                if(fId.equals(fId2)){
                    cont += 1;
                }
            }
            //  If the code's count is 0, it's means it's not repeated.
            if (cont==0) {
                FeaturesString fsn = new FeaturesString();
                fsn.setFeaturesID(fId);
                data2.add(fs);
            }
        }
        return data2;
    }
    
    //  Create an ArrayList with the code in String to compare
    public ArrayList<FeaturesString> stringData(ArrayList<Data> data){
        
        ArrayList<FeaturesString> feaStrArray = new ArrayList<FeaturesString>();
        Iterator<Data> itrData = data.iterator();
        while(itrData.hasNext()){
            Data d = itrData.next();
            ArrayList<Feature> fea = d.getCode();
            Iterator<Feature> itrFea = fea.iterator();
            String code = "";
            while(itrFea.hasNext()){
                Feature f = itrFea.next();
                code += String.valueOf(f.getFtr());
            }
            FeaturesString feaStr = new FeaturesString();
            feaStr.setFeaturesID(code);
            
            feaStrArray.add(feaStr);
        }        
        return feaStrArray;
    }
    
    public ArrayList<FeaturesValue> stringValue(ArrayList<Data> data){
        ArrayList<FeaturesValue> feaValArr = new ArrayList<FeaturesValue>();
        Iterator<Data> itrData = data.iterator();
        while(itrData.hasNext()){
            Data d = itrData.next();
            ArrayList<Feature> fea = d.getCode();
            Iterator<Feature> itrFea = fea.iterator();
            String code = "";
            while(itrFea.hasNext()){
                Feature f = itrFea.next();
                code += String.valueOf(f.getFtr());
            }
            //  Create a object with a code in String form and with the value.
            FeaturesValue feaVal = new FeaturesValue();
            feaVal.setFeatures(code);
            feaVal.setValue(d.getValue());
            //  Add the object at the ArrayList
            feaValArr.add(feaVal);
        }
        return feaValArr;
    }
    
    public ArrayList<DataReview> averageData(ArrayList<FeaturesString> feaStr, ArrayList<FeaturesValue> feaVal){
        ArrayList<DataReview> dtRvwArr = new ArrayList<DataReview>();
        
        Iterator<FeaturesString> itrFeaUnq = feaStr.iterator(); //  Iterator of Uniques Features.
        
        while(itrFeaUnq.hasNext()){
            FeaturesString feaStr2 = itrFeaUnq.next();
            String code1 = feaStr2.getFeaturesID();
            
            int cont = 0;   //  Count the number of time that the Features is repeated
            int val = 0;    //  Get a sum of the Values from the Features repeated.
            float ave = 0f;    //  Get the Average = SumVal/Count
            float ave2 = 0f;
            
            Iterator<FeaturesValue> itrFeaVal = feaVal.iterator();  //  Iterator of Features with Values.
            while(itrFeaVal.hasNext()){
                FeaturesValue feaVal2 = itrFeaVal.next();
                String code2 = feaVal2.getFeatures();
                if(code1.equals(code2)){
                    cont += 1;                  //  Count
                    val += feaVal2.getValue();  //  SumVale
                }
            }
            try{
                DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
                simbolo.setDecimalSeparator('.');
                DecimalFormat formateador = new DecimalFormat("#.#",simbolo);
                ave = (float)val/(float)cont;
                
                ave2 = Float.valueOf(formateador.format(ave));
            }catch(Exception e){
                System.out.println("Math Exception... "+e.toString());
            }
            DataReview dr = new DataReview();
            dr.setCode(code1);
            dr.setAverage(ave2);
            dr.setQuantity(cont);
            
            dtRvwArr.add(dr);
        }
        return dtRvwArr;
    } 
    
    public void tableReview(ArrayList<DataReview> dtRvwArr){
        DefaultTableModel dtm  = (DefaultTableModel)jtDataReview.getModel();
        dtm.setRowCount(0);
        
        for (int i = 0; i < dtRvwArr.size(); i++) {
            Vector fila = new Vector();
            
            DataReview dr = dtRvwArr.get(i);
            fila.add(dr.getCode());
            fila.add(dr.getAverage());
            fila.add(dr.getQuantity());
            
            dtm.addRow(fila);
        }
    }
    
    public void sortColumn(ArrayList<DataReview> dtReview){
        
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
            java.util.logging.Logger.getLogger(FrmAlgorith.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlgorith.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlgorith.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlgorith.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlgorith().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcp;
    private javax.swing.JButton btAverage;
    private javax.swing.JButton btFeatures;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtArchiveAddress;
    private javax.swing.JButton jbArchive;
    private javax.swing.JButton jb_KnnFrm;
    private javax.swing.JLabel jlArcName;
    private javax.swing.JLabel jlSize;
    private javax.swing.JTable jtDataReview;
    private javax.swing.JTable jtReview;
    // End of variables declaration//GEN-END:variables

}
