/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelPrincipal;
import models.ModelPeliculas;
import views.ViewPeliculas;
/**
 *
 * @author JonatanVT
 */
public class ControllerPeliculas {
    private final ModelPrincipal model_principal;
    private final ModelPeliculas model_peliculas;
    private final ViewPeliculas view_peliculas;
    
    public ControllerPeliculas(Object models[], Object views[], Object controllers[]){
        this.model_principal = (ModelPrincipal)models[0];
        this.model_peliculas = (ModelPeliculas)models[1];
        this.view_peliculas = (ViewPeliculas)views[1];
        initView();
    }
    
    public void initView(){
        view_peliculas.jbtn_primero.addActionListener(e -> jbtn_primeroMouseClicked());
        view_peliculas.jbtn_anterior.addActionListener(e -> jbtn_anteriorMouseClicked());
        view_peliculas.jbtn_siguiente.addActionListener(e -> jbtn_siguienteMouseClicked());
        view_peliculas.jbtn_ultimo.addActionListener(e -> jbtn_ultimoMouseClicked());
        view_peliculas.jbtn_actualizar.addActionListener(e -> jbtn_actualizarMouseClicked());
        view_peliculas.jbtn_agregar.addActionListener(e -> jbtn_agregarMouseClicked());
        view_peliculas.jbtn_eliminar.addActionListener(e -> jbtn_eliminarMouseClicked());
        view_peliculas.jbtn_nuevo.addActionListener(e -> jbtn_nuevoMouseClicked());
        view_peliculas.jtf_id_pelicula.setEnabled(false);
    }
    
    public void getDatos(){
        view_peliculas.jtf_id_pelicula.setText(model_peliculas.getId_pelicula());
        view_peliculas.jtf_nombre.setText(model_peliculas.getNombre());
        view_peliculas.jtf_formato.setText(model_peliculas.getFormato());
        view_peliculas.jtf_duracion.setText(model_peliculas.getDuracion());
        view_peliculas.jtf_descripcion.setText(model_peliculas.getDescripcion());
    }
    
    public void setDatos(){
        model_peliculas.setId_pelicula(view_peliculas.jtf_id_pelicula.getText());
        model_peliculas.setNombre(view_peliculas.jtf_nombre.getText());
        model_peliculas.setFormato(view_peliculas.jtf_formato.getText());
        model_peliculas.setDuracion(view_peliculas.jtf_duracion.getText());
        model_peliculas.setDescripcion(view_peliculas.jtf_descripcion.getText());
    }
    
    public void Actualizar_Interfaz(){
        model_peliculas.Actualizar_Datos();
        getDatos();
    }
    
    public void jbtn_primeroMouseClicked(){
        model_principal.Mover_Primero();
        model_peliculas.Asignar_Datos();
        getDatos();
        
    }
    
    public void jbtn_anteriorMouseClicked(){
        model_principal.Mover_Anterior();
        model_peliculas.Asignar_Datos();
        getDatos();
    }
    
    public void jbtn_siguienteMouseClicked(){
        model_principal.Mover_Siguiente();
        model_peliculas.Asignar_Datos();
        getDatos();
    }
    
    public void jbtn_ultimoMouseClicked(){
        model_principal.Mover_Ultimo();
        model_peliculas.Asignar_Datos();
        getDatos();
    }
    
    public void jbtn_actualizarMouseClicked(){
        setDatos();
        model_peliculas.Insertar_Pelicula();
        Actualizar_Interfaz();
    }
    
    public void jbtn_agregarMouseClicked(){
        setDatos();
        model_peliculas.Modificar_Pelicula();
        Actualizar_Interfaz();
    }
    
    public void jbtn_eliminarMouseClicked(){
        model_peliculas.setId_pelicula(view_peliculas.jtf_id_pelicula.getText());
        model_peliculas.Eliminar_Pelicula();
        Actualizar_Interfaz();
    }
    
    public void jbtn_nuevoMouseClicked(){
        view_peliculas.jtf_id_pelicula.setText("");
        view_peliculas.jtf_nombre.setText("");
        view_peliculas.jtf_formato.setText("");
        view_peliculas.jtf_duracion.setText("");
        view_peliculas.jtf_descripcion.setText("");
    }

   
    
}


