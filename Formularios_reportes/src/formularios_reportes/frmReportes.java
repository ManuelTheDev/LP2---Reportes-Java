
package formularios_reportes;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.export.ExporterInput;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.view.JasperViewer;

public class frmReportes extends javax.swing.JFrame {


    public frmReportes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbTiposReporte = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        cbAnho = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(236, 242, 234));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("SELECCIONE EL REPORTE QUE DESEE GENERAR:");

        cbTiposReporte.setBackground(new java.awt.Color(51, 51, 51));
        cbTiposReporte.setEditable(true);
        cbTiposReporte.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbTiposReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENTES FRECUENTES", "GANANCIAS MENSUALES", "TRATAMIENTOS MÁS SOLICITADOS", "PAQUETES MÁS SOLICITADOS", "RENDIMIENTO DE LAS TERAPISTAS" }));
        cbTiposReporte.setBorder(null);
        cbTiposReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbTiposReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTiposReporteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("MES:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("AÑO:");

        cbMes.setBackground(new java.awt.Color(0, 0, 0));
        cbMes.setEditable(true);
        cbMes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        cbMes.setBorder(null);

        cbAnho.setBackground(new java.awt.Color(0, 0, 0));
        cbAnho.setEditable(true);
        cbAnho.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbAnho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018" }));
        cbAnho.setBorder(null);

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setText("GENERAR REPORTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setText("DESCARGAR EN PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(166, 228, 35));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REPORTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 214, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)))
                                    .addGap(99, 99, 99)
                                    .addComponent(cbTiposReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTiposReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTiposReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTiposReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTiposReporteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g4",
                    "inf282g4", "GvZf6p");
           
            
            String mesString = cbMes.getSelectedItem().toString();
            Integer numMes = 1;
            if(mesString == "ENERO") numMes = 1;
            if(mesString == "FEBRERO") numMes = 2;
            if(mesString == "MARZO") numMes = 3;
            if(mesString == "ABRIL") numMes = 4;
            if(mesString == "MAYO") numMes = 5;
            if(mesString == "JUNIO") numMes = 6;
            if(mesString == "JULIO") numMes = 7;
            if(mesString == "AGOSTO") numMes = 8;
            if(mesString == "SEPTIEMBRE") numMes = 9;
            if(mesString == "OCTUBRE") numMes = 10;
            if(mesString == "NOVIEMBRE") numMes = 11;
            if(mesString == "DICIEMBRE") numMes = 12;
            
            Integer anho = Integer.parseInt(cbAnho.getSelectedItem().toString());
            
            HashMap para = new HashMap();
            
            
            InputStream in = new InputStream() {
                @Override
                public int read() throws IOException {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            if(cbTiposReporte.getSelectedItem().toString() == "TRATAMIENTOS MÁS SOLICITADOS"){
                in = new FileInputStream(new File("./src/reportes/tratamientosMasVendidos.jrxml"));
                para.put("mes",numMes);
                para.put("año",anho);
            }
                
            else if(cbTiposReporte.getSelectedItem().toString() == "PAQUETES MÁS SOLICITADOS"){
                in = new FileInputStream(new File("./src/reportes/paquetesMasVendidos.jrxml"));
                para.put("mes",numMes);
                para.put("año",anho);
            }                 
            else if(cbTiposReporte.getSelectedItem().toString() == "GANACIAS MENSUALES"){
                in = new FileInputStream(new File("./src/reportes/gananciasMensuales.jrxml"));
                para.put("mes",numMes);
                para.put("año",anho);
            }
            else if(cbTiposReporte.getSelectedItem().toString() == "CLIENTES FRECUENTES"){
                in = new FileInputStream(new File("./src/reportes/clientesFrecuentes.jrxml"));
            }
            
            
            JasperDesign jd = JRXmlLoader.load(in);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            
            JasperPrint j = JasperFillManager.fillReport(jr,para,con);
            JasperViewer.viewReport(j,false);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g4",
                    "inf282g4", "GvZf6p");
            jButton2.setBackground(Color.BLACK);
            String mesString = cbMes.getSelectedItem().toString();
            Integer numMes = 1;
            if(mesString == "ENERO") numMes = 1;
            if(mesString == "FEBRERO") numMes = 2;
            if(mesString == "MARZO") numMes = 3;
            if(mesString == "ABRIL") numMes = 4;
            if(mesString == "MAYO") numMes = 5;
            if(mesString == "JUNIO") numMes = 6;
            if(mesString == "JULIO") numMes = 7;
            if(mesString == "AGOSTO") numMes = 8;
            if(mesString == "SEPTIEMBRE") numMes = 9;
            if(mesString == "OCTUBRE") numMes = 10;
            if(mesString == "NOVIEMBRE") numMes = 11;
            if(mesString == "DICIEMBRE") numMes = 12;
            
            Integer anho = Integer.parseInt(cbAnho.getSelectedItem().toString());
            
            HashMap para = new HashMap();
            
            
            InputStream in = new InputStream() {
                @Override
                public int read() throws IOException {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            if(cbTiposReporte.getSelectedItem().toString() == "TRATAMIENTOS MÁS SOLICITADOS"){
                in = new FileInputStream(new File("./src/reportes/tratamientosMasVendidos.jrxml"));
                
                JasperDesign jd = JRXmlLoader.load(in);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                para.put("mes",numMes);
                para.put("año",anho);
                JasperPrint j = JasperFillManager.fillReport(jr,para,con);
                //OutputStream os = new FileOutputStream (new File("C:\\Users\\Manutooth\\Desktop\\reportes\\tratamientos.pdf"));
                OutputStream os = new FileOutputStream (new File("./src/Reportes pdf/tratamientos.pdf"));
                JasperExportManager.exportReportToPdfStream(j,os);
            }
            else if(cbTiposReporte.getSelectedItem().toString() == "PAQUETES MÁS SOLICITADOS"){
                in = new FileInputStream(new File("./src/reportes/paquetesMasVendidos.jrxml"));
                
                JasperDesign jd = JRXmlLoader.load(in);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                para.put("mes",numMes);
                para.put("año",anho);
                JasperPrint j = JasperFillManager.fillReport(jr,para,con);
                //OutputStream os = new FileOutputStream (new File("C:\\Users\\Manutooth\\Desktop\\reportes\\paquetes.pdf"));
                OutputStream os = new FileOutputStream (new File("./src/Reportes pdf/paquetes.pdf"));
                JasperExportManager.exportReportToPdfStream(j,os);
            }
            else if(cbTiposReporte.getSelectedItem().toString() == "CLIENTES FRECUENTES"){
                in = new FileInputStream(new File("./src/reportes/clientesFrecuentes.jrxml"));
                
                JasperDesign jd = JRXmlLoader.load(in);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint j = JasperFillManager.fillReport(jr,para,con);
                OutputStream os = new FileOutputStream (new File("./src/Reportes pdf/clientes.pdf"));
                JasperExportManager.exportReportToPdfStream(j,os);
            }
            else if(cbTiposReporte.getSelectedItem().toString() == "GANANCIAS MENSUALES "){
                in = new FileInputStream(new File("./src/reportes/gananciasMensuales.jrxml"));
                
                JasperDesign jd = JRXmlLoader.load(in);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                para.put("mes",numMes);
                para.put("año",anho);
                JasperPrint j = JasperFillManager.fillReport(jr,para,con);
                OutputStream os = new FileOutputStream (new File("./src/Reportes pdf/ganancias.pdf"));
                JasperExportManager.exportReportToPdfStream(j,os);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmReportes().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAnho;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbTiposReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
