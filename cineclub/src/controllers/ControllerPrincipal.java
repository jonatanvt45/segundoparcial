/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.*;
import views.*;

/**
 *
 * @author JonatanVT
 */
public class ControllerPrincipal {
    private final ModelPeliculas model_peliculas;
    private final ModelClientes model_clientes;
    private final ViewPrincipal view_principal;
    private final ViewPeliculas view_peliculas;
    private final ViewClientes view_clientes;
    private final ControllerClientes controller_clientes;
    private final ControllerPeliculas controller_peliculas;
    
    public ControllerPrincipal(Object models[], Object views[], Object controllers[]){
        this.model_peliculas = (ModelPeliculas)models[1];
        this.model_clientes = (ModelClientes)models[2];
        this.view_principal = (ViewPrincipal)views[0];
        this.view_peliculas = (ViewPeliculas)views[1];
        this.view_clientes = (ViewClientes)views[2];
        this.controller_clientes = (ControllerClientes)controllers[0];
        this.controller_peliculas = (ControllerPeliculas)controllers[1];
        initView();
    }
    
    public void initView(){
        view_principal.setTitle("Cineclub");
        view_principal.setLocationRelativeTo(null);
        view_principal.setVisible(true);
        view_principal.jmi_peliculas.addActionListener(e ->jmi_peliculasMouseClicked());
        view_principal.jmi_clientes.addActionListener(e -> jmi_clientesMouseClicked());
    }
    
    public void jmi_peliculasMouseClicked(){
        view_principal.setContentPane(view_peliculas);
        view_principal.revalidate();
        view_principal.repaint();
        controller_peliculas.Actualizar_Interfaz();
    }
    
    public void jmi_clientesMouseClicked(){
        view_principal.setContentPane(view_clientes);
        view_principal.revalidate();
        view_principal.repaint();
        controller_clientes.Actualizar_Interfaz();
    }
}
    

