/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author JonatanVT
 */
public class ViewClientes extends javax.swing.JPanel {

    /**
     * Creates new form ViewClientes
     */
    public ViewClientes() {
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

        jl_id_cliente = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jl_telefono = new javax.swing.JLabel();
        jl_email = new javax.swing.JLabel();
        jtf_id_cliente = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jbtn_agregar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jbtn_actualizar = new javax.swing.JButton();
        jbtn_nuevo = new javax.swing.JButton();

        jl_id_cliente.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jl_id_cliente.setText("ID_cliente");

        jl_nombre.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jl_nombre.setText("Nombre");

        jl_telefono.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jl_telefono.setText("Telefono");

        jl_email.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jl_email.setText("email");

        jbtn_agregar.setText("Agregar");

        jbtn_eliminar.setText("Eliminar");

        jbtn_primero.setText("|<");

        jbtn_anterior.setText("<<");

        jbtn_siguiente.setText(">>");

        jbtn_ultimo.setText(">|");

        jbtn_actualizar.setText("Actualizar");

        jbtn_nuevo.setText("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_id_cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_id_cliente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nombre)
                            .addComponent(jl_telefono)
                            .addComponent(jl_email))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_nombre)
                            .addComponent(jtf_telefono)
                            .addComponent(jtf_email, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jbtn_primero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_siguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_ultimo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_actualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_agregar)
                                .addGap(28, 28, 28)
                                .addComponent(jbtn_eliminar))
                            .addComponent(jbtn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_id_cliente)
                    .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telefono)
                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_email)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_primero)
                    .addComponent(jbtn_anterior)
                    .addComponent(jbtn_siguiente)
                    .addComponent(jbtn_ultimo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_actualizar)
                    .addComponent(jbtn_agregar)
                    .addComponent(jbtn_eliminar))
                .addGap(18, 18, 18)
                .addComponent(jbtn_nuevo)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_actualizar;
    public javax.swing.JButton jbtn_agregar;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_eliminar;
    public javax.swing.JButton jbtn_nuevo;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JLabel jl_email;
    public javax.swing.JLabel jl_id_cliente;
    public javax.swing.JLabel jl_nombre;
    public javax.swing.JLabel jl_telefono;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_id_cliente;
    public javax.swing.JTextField jtf_nombre;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}