package vista;
//librerias de conexion
import javax.swing.JOptionPane;//ventanas emergentes
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//Controlador de java a MySQL
import java.sql.Statement;//Instrucciones SQL querys de BD
import java.sql.ResultSet;//Resultado final de datos
import java.sql.SQLException;//Trabajar errors de base de datos
import java.sql.*;//Libreria general de base de datos
import java.io.*;//Entrada y salidad de datos
import javax.swing.table.DefaultTableModel;//Modelo de datos
/**
 *
 * @author Toshiba
 */
public class GestionProductos extends javax.swing.JFrame {
    //variables de conexion
        public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos

    /**
     * Creates new form GestionProductos
     */
    public GestionProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panAlta = new javax.swing.JPanel();
        lblProdcuto = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnRegistrarProducto = new javax.swing.JButton();
        txtIdProducto = new javax.swing.JTextField();
        txtMarcaProducto = new javax.swing.JTextField();
        txtModeloProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultarProducto = new javax.swing.JTable();
        btnConsultarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panAlta.setBackground(new java.awt.Color(204, 255, 204));
        panAlta.setBorder(javax.swing.BorderFactory.createTitledBorder("Alta Productos"));

        lblProdcuto.setText("Id Productos");

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        lblPrecio.setText("Precio");

        btnRegistrarProducto.setText("Registrar Producto");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });

        txtMarcaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaProductoActionPerformed(evt);
            }
        });

        txtModeloProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloProductoActionPerformed(evt);
            }
        });

        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAltaLayout = new javax.swing.GroupLayout(panAlta);
        panAlta.setLayout(panAltaLayout);
        panAltaLayout.setHorizontalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAltaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecio)
                            .addComponent(lblModelo)
                            .addComponent(lblMarca)
                            .addComponent(lblProdcuto))
                        .addGap(47, 47, 47)
                        .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdProducto)
                            .addComponent(txtMarcaProducto)
                            .addComponent(txtModeloProducto)
                            .addComponent(txtPrecioProducto)))
                    .addGroup(panAltaLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnRegistrarProducto)
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panAltaLayout.setVerticalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdcuto)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModeloProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnRegistrarProducto)
                .addContainerGap())
        );

        jtConsultarProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Marca", "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jtConsultarProducto);

        btnConsultarProducto.setText("Consultar Producto");
        btnConsultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnConsultarProducto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnConsultarProducto)))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void txtMarcaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaProductoActionPerformed

    private void txtModeloProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloProductoActionPerformed

    private void txtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProductoActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        conectarBase();//llamada a metodo conectar
        //declaracion de variables de entrada
        int idProducto=Integer.parseInt(txtIdProducto.getText());
        String marca=txtMarcaProducto.getText();
        String modelo=txtModeloProducto.getText();
        String precio=txtPrecioProducto.getText();
       
        //proceso guardar en la base de datos
  String altaProducto="INSERT INTO bdexalarais284 VALUES ('"+idProducto+"','"+marca+"','"+modelo+"','"+precio+"')";
        try {//estructura de control de tratamiento de errores
            //Ejecutar instruccion de alta
            stmt.executeUpdate(altaProducto);
            JOptionPane.showMessageDialog(null, "Se agrego producto de forma correcta\n"+marca);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD :\n"+ e);
        }//termina catch
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void btnConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProductoActionPerformed
        try{//inicia try    Estructura de control para trataminento de errores
                 conectarBase();//llamada  a la conexion a BD
                 //Objeto Model es para almacenar  y guardar los valores de la tabla
                 DefaultTableModel modeloDatos = new DefaultTableModel();
                 jtConsultarProducto.setModel(modeloDatos);
                 rs=stmt.executeQuery("Select * from bdexalarais284");
                 ResultSetMetaData rsmd=rs.getMetaData();
                 int cantidadColumnas=rsmd.getColumnCount();
                 modeloDatos.addColumn("Id producto ");
                 modeloDatos.addColumn("Marca");
                 modeloDatos.addColumn("Modelo");
                 modeloDatos.addColumn("Precio");
                 while (rs.next()) { //inicia                    
                     //arreglo objetos para imprimir filas
                     Object [] fila = new Object[cantidadColumnas];
                     for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                         fila[i]=rs.getObject(i+1);
                     }//termina for
                     modeloDatos.addRow(fila);
                 }//termina while
             }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null,"Error de BD\n"+ ex);
             }//terrmina catch
    }//GEN-LAST:event_btnConsultarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarProducto;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsultarProducto;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProdcuto;
    private javax.swing.JPanel panAlta;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtMarcaProducto;
    private javax.swing.JTextField txtModeloProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables

    private void conectarBase() {
        try{//inicia try
    //puente de conexion
    Class.forName("com.mysql.jdbc.Driver");//puente de conexion
       cn=DriverManager.getConnection("jdbc:mysql://localhost/bdexalarais284","root","");
       stmt=cn.createStatement();//genera sentencias sql
       JOptionPane.showMessageDialog(null,"CONEXION BD ESTABLECIDA \nLARA");
    }catch(SQLException ex){//inicia exeption
        JOptionPane.showMessageDialog(null, ex);
    }catch(Exception e){//inica exception errores generales
        JOptionPane.showMessageDialog(null, e);
    } 
    }
}
