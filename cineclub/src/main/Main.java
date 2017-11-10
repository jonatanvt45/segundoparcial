/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.*;
import views.*;
import controllers.*;

/**
 *
 * @author JonatanVT
 */
public class Main {
     public static void main (String oamg[]){
        ModelPrincipal model_main = new ModelPrincipal();
        ModelPeliculas model_peliculas = new ModelPeliculas(model_main);
        ModelClientes model_clientes = new ModelClientes(model_main);
        
        ViewPrincipal view_main = new ViewPrincipal();
        ViewPeliculas view_peliculas = new ViewPeliculas();
        ViewClientes view_clientes= new ViewClientes();
        
        Object[] models = new Object[3];
        Object[] views = new Object[3];
        Object[] controllers = new Object[3];
        
        models[0] = model_main;
        models[1] = model_peliculas;
        models[2] = model_clientes;
        
        views[0] = view_main;
        views[1] = view_peliculas;
        views[2] = view_clientes;
        
        ControllerClientes controller_clientes = new ControllerClientes(models, views, controllers);
        controllers[0] = controller_clientes;
        
        ControllerPeliculas controller_peliculas = new ControllerPeliculas(models, views, controllers);
        controllers[1] = controller_peliculas;
        
        ControllerPrincipal controller_main = new ControllerPrincipal(models, views, controllers);
        controllers[2] = controller_main;
    }
}

