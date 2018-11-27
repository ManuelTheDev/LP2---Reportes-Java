
package formularios_reportes;

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbTiposReporte = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        cbAnho = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REPORTES");

        jLabel2.setText("Seleccione el tipo de Reporte que desea generar:");

        cbTiposReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes Frecuentes", "Ganancias Mensuales", "Tratamientos más solicitados", "Paquetes más solicitados", "Rendimiento de las terapistas" }));
        cbTiposReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTiposReporteActionPerformed(evt);
            }
        });

        jLabel3.setText("Mes:");

        jLabel4.setText("Año:");

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cbAnho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018" }));

        jButton1.setText("Generar Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Descargar en PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(62, 62, 62)
                        .addComponent(jButton2))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(cbTiposReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(cbAnho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTiposReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbAnho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(138, Short.MAX_VALUE))
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
            if(mesString == "Enero") numMes = 1;
            if(mesString == "Febrero") numMes = 2;
            if(mesString == "Marzo") numMes = 3;
            if(mesString == "Abril") numMes = 4;
            if(mesString == "Mayo") numMes = 5;
            if(mesString == "Junio") numMes = 6;
            if(mesString == "Julio") numMes = 7;
            if(mesString == "Agosto") numMes = 8;
            if(mesString == "Septiembre") numMes = 9;
            if(mesString == "Octubre") numMes = 10;
            if(mesString == "Noviembre") numMes = 11;
            if(mesString == "Diciembre") numMes = 12;
            
            Integer anho = Integer.parseInt(cbAnho.getSelectedItem().toString());
            
            HashMap para = new HashMap();
            
            
            InputStream in = new InputStream() {
                @Override
                public int read() throws IOException {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            if(cbTiposReporte.getSelectedItem().toString() == "Tratamientos más solicitados"){
                in = new FileInputStream(new File("./src/reportes/tratamientosMasVendidos.jrxml"));
                para.put("mes",numMes);
                para.put("año",anho);
            }
                
            else if(cbTiposReporte.getSelectedItem().toString() == "Paquetes más solicitados"){
                in = new FileInputStream(new File("./src/reportes/paquetesMasVendidos.jrxml"));
                para.put("mes",numMes);
                para.put("año",anho);
            }                 
            else if(cbTiposReporte.getSelectedItem().toString() == "Ganancias Mensuales")
                 in = new FileInputStream(new File("./src/reportes/gananciasMensuales.jrxml"));
            else if(cbTiposReporte.getSelectedItem().toString() == "Clientes Frecuentes"){
                in = new FileInputStream(new File("./src/reportes/clientesFrecuentes.jrxml"));
            }
            
            
            JasperDesign jd = JRXmlLoader.load(in);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            
            JasperPrint j = JasperFillManager.fillReport(jr,para,con);
            JasperViewer.viewReport(j,false);
            //OutputStream os = new FileOutputStream (new File("C:\\Users\\Manutooth\\Desktop\\reportes\\trat1.pdf"));
            //JasperExportManager.exportReportToPdfStream(j,os);
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
            
            String mesString = cbMes.getSelectedItem().toString();
            Integer numMes = 1;
            if(mesString == "Enero") numMes = 1;
            if(mesString == "Febrero") numMes = 2;
            if(mesString == "Marzo") numMes = 3;
            if(mesString == "Abril") numMes = 4;
            if(mesString == "Mayo") numMes = 5;
            if(mesString == "Junio") numMes = 6;
            if(mesString == "Julio") numMes = 7;
            if(mesString == "Agosto") numMes = 8;
            if(mesString == "Septiembre") numMes = 9;
            if(mesString == "Octubre") numMes = 10;
            if(mesString == "Noviembre") numMes = 11;
            if(mesString == "Diciembre") numMes = 12;
            
            Integer anho = Integer.parseInt(cbAnho.getSelectedItem().toString());
            
            HashMap para = new HashMap();
            
            
            InputStream in = new InputStream() {
                @Override
                public int read() throws IOException {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            if(cbTiposReporte.getSelectedItem().toString() == "Tratamientos más solicitados"){
                in = new FileInputStream(new File("./src/reportes/tratamientosMasVendidos.jrxml"));
                
                JasperDesign jd = JRXmlLoader.load(in);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                para.put("mes",numMes);
                para.put("año",anho);
                JasperPrint j = JasperFillManager.fillReport(jr,para,con);
                //OutputStream os = new FileOutputStream (new File("C:\\Users\\Manutooth\\Desktop\\reportes\\tratamientos.pdf"));
                OutputStream os = new FileOutputStream (new File("./dist/Reportes pdf/tratamientos.pdf"));
                JasperExportManager.exportReportToPdfStream(j,os);
            }
            else if(cbTiposReporte.getSelectedItem().toString() == "Paquetes más solicitados"){
                in = new FileInputStream(new File("./src/reportes/paquetesMasVendidos.jrxml"));
                
                JasperDesign jd = JRXmlLoader.load(in);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                para.put("mes",numMes);
                para.put("año",anho);
                JasperPrint j = JasperFillManager.fillReport(jr,para,con);
                //OutputStream os = new FileOutputStream (new File("C:\\Users\\Manutooth\\Desktop\\reportes\\paquetes.pdf"));
                OutputStream os = new FileOutputStream (new File("./dist/Reportes pdf/paquetes.pdf"));
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
    // End of variables declaration//GEN-END:variables
}
