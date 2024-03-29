package com.mycompany.concesionaria.igu;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.logica.ControladoraLogica;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BuscarAuto extends javax.swing.JFrame {
    
    ControladoraLogica logica = null;
    Automovil auto = new Automovil();

    /**
     * Creates new form BuscarAuto
     */
    public BuscarAuto(int id_buscar) {
        logica = new ControladoraLogica();
        initComponents();
        
        cargarBusqueda(id_buscar);
        
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 0, 48)); // NOI18N
        jLabel2.setText("Consulta de Vehiculos");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaAutos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAutos);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnSalir.setText("Cerrar Ventana");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Variable de confirmacion de eliminacion
        int codigo = 0;
        //Verificar si la tabla no esta vacia
        if(tablaAutos.getRowCount() > 0){
            //Verificamos que se selecciono un fila (registro a eliminar)
            if(tablaAutos.getSelectedRow()!=-1){

                //Mensaje de confirmacion de la eliminacion
                codigo=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "Info", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (codigo==JOptionPane.YES_OPTION){

                    //obtener el id del auto a eliminar
                    //Realizamos un parseo del dato
                    int idEliminar = Integer.parseInt(
                        //realizamos un cambio a un valo String
                        String.valueOf(
                            //Obtenemos el valor de la fila especifica seleccionada
                            tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0)));

                    logica.borrarAuto(idEliminar);
                    //Cargamos el mensaje
                    mostrarMensaje("Registro Borrado Exitosamente", "info", "Eliminacion");
                   
                }
                else if(codigo==JOptionPane.NO_OPTION){
                    System.out.println("Has pulsado en NO");
                }
            }
            else{
                mostrarMensaje("No selecciono ningun registro", "Error ", "Error ");
            }
        }else{
            mostrarMensaje("La tabla esta vacia ", "Error ", "Error ");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Verificamos que la tabla no este vacia
        if(tablaAutos.getRowCount() > 0){
            //Verificamos que este seleccionado un registro
            if(tablaAutos.getSelectedRow()!=-1){

                //Obtener el id a modificar
                int id_auto = Integer.parseInt(
                    String.valueOf(
                        tablaAutos.getValueAt(
                            tablaAutos.getSelectedRow(),0)));

                //Mandamos llamar el nuevo Formulario
                ModificarAuto modif = new ModificarAuto(id_auto);
                modif.setVisible(true);
                modif.setLocationRelativeTo(null);

                //Cerramos la venta
                this.dispose();

            }else{
            mostrarMensaje("No selecciono ningun registro", "Error", "Error");
            }
        }else{
        mostrarMensaje("Error: Tabla vacia", "error", "Error");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        ConsultaFormulario consulta = new ConsultaFormulario();
        consulta.setVisible(true);
        consulta.setLocationRelativeTo(null);
        
        // Salir
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    //Mensajes Ventanas Emergentes
    //Creamos el metodo del mensaje
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
       //creamos una instancia del JoptionPane
        JOptionPane optionpane = new JOptionPane(mensaje);
        //El if controla el tipo de icono para la ventana
        if(tipo.equalsIgnoreCase("info")){
            optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if (tipo.equalsIgnoreCase("Error")) {
            optionpane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        //Una instancia de dialog
        JDialog dialog = optionpane.createDialog(titulo);
        dialog.setVisible(true);
        dialog.setAlwaysOnTop(true);
            
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAutos;
    // End of variables declaration//GEN-END:variables

    private void cargarBusqueda(int id_buscar) {
        //hacer que las filas y columnas no sean editables
        DefaultTableModel modeloTabla = new DefaultTableModel(){
       
        @Override
        public boolean isCellEditable(int row,int column) {
            return false;
        }
        
        };
        
        //Titutulos de las columnas
        String titulos[] = {
              "id_automovil",
               "modelo",
               "marca",
               "motor",
               "color",
               "placa",
               "cantPuertas"
        };
        //Seteamos a la "tabla" los titulos
        modeloTabla.setColumnIdentifiers(titulos);
        
        auto = logica.buscarAuto(id_buscar);
        
        if(auto != null){
            Object[] objeto = {
                auto.getId_automovil(),
                   auto.getModelo(),
                   auto.getMarca(),
                   auto.getMotor(),
                   auto.getColor(),
                   auto.getPlaca(),
                   auto.getCantPuertas()
            };
            modeloTabla.addRow(objeto);
        }
        else{
            mostrarMensaje("No existen datos", "info", "Error");
        }
        
        tablaAutos.setModel(modeloTabla);   
        }
       
    }   

