/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelPrincipal;
import models.ModelClientes;
import views.ViewClientes;
/**
 *
 * @author JonatanVT
 */
public class ControllerClientes {
    private final ModelPrincipal model_principal;
    private final ModelClientes model_clientes;
    private final ViewClientes view_clientes; 
    
    public ControllerClientes(Object models[], Object views[], Object controllers[]){
        this.model_principal =(ModelPrincipal)models[0];
        this.model_clientes =(ModelClientes)models[2];
        this.view_clientes =(ViewClientes)views[2];
    }
    public void initView(){
        view_clientes.jbtn_primero.addActionListener(e -> jbtn_primeroMouseClicked());
        view_clientes.jbtn_anterior.addActionListener(e -> jbtn_anteriorMouseClicked());
        view_clientes.jbtn_siguiente.addActionListener(e -> jbtn_siguienteMouseClicked());
        view_clientes.jbtn_ultimo.addActionListener(e -> jbtn_ultimoMouseClicked());
        view_clientes.jbtn_actualizar.addActionListener(e -> jbtn_actualizarMouseClicked());
        view_clientes.jbtn_agregar.addActionListener(e -> jbtn_agregarMouseClicked());
        view_clientes.jbtn_eliminar.addActionListener(e -> jbtn_eliminarMouseClicked());
        view_clientes.jbtn_nuevo.addActionListener(e -> jbtn_nuevoMouseClicked());
        view_clientes.jtf_id_cliente.setEnabled(false);
         
    }
      public void getDatos(){
        view_clientes.jtf_id_cliente.setText(model_clientes.getId_cliente());
        view_clientes.jtf_nombre.setText(model_clientes.getNombre());
        view_clientes.jtf_telefono.setText(model_clientes.getTelefono());
        view_clientes.jtf_email.setText(model_clientes.getEmail());
    }
    
    public void setDatos(){
        model_clientes.setId_cliente(view_clientes.jtf_id_cliente.getText());
        model_clientes.setNombre(view_clientes.jtf_nombre.getText());
        model_clientes.setTelefono(view_clientes.jtf_telefono.getText());
        model_clientes.setEmail(view_clientes.jtf_email.getText());
    }
    
    public void Actualizar_Interfaz() {
        model_clientes.Actualizar_Datos();
        getDatos();
    }
    
    public void jbtn_primeroMouseClicked(){
        model_principal.Mover_Primero();
        model_clientes.Asignar_Datos();
        getDatos();
    }
    
    public void jbtn_anteriorMouseClicked(){
        model_principal.Mover_Anterior();
        model_clientes.Asignar_Datos();
        getDatos();
    }
    
    public void jbtn_siguienteMouseClicked(){
        model_principal.Mover_Siguiente();
        model_clientes.Asignar_Datos();
        getDatos();
    }
    
    public void jbtn_ultimoMouseClicked(){
        model_principal.Mover_Ultimo();
        model_clientes.Asignar_Datos();
        getDatos();
    }
    
    public void jbtn_actualizarMouseClicked(){
        setDatos();
        model_clientes.Insertar_Cliente();
        Actualizar_Interfaz();
    }
    
    public void jbtn_agregarMouseClicked(){
        setDatos();
        model_clientes.Modificar_Cliente();
        Actualizar_Interfaz();
    }
    
    public void jbtn_eliminarMouseClicked(){
        model_clientes.setId_cliente(view_clientes.jtf_id_cliente.getText());
        model_clientes.Eliminar_Cliente();
        Actualizar_Interfaz();
    }
    
    public void jbtn_nuevoMouseClicked(){
        view_clientes.jtf_id_cliente.setText("");
        view_clientes.jtf_nombre.setText("");
        view_clientes.jtf_telefono.setText("");
        view_clientes.jtf_email.setText("");
       
    }


    
}


