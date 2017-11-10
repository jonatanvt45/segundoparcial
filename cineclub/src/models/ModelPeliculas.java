/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.Time;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author JonatanVT
 */
public class ModelPeliculas {
     private final ModelPrincipal model_principal;
    
    private String id_pelicula;
    private String nombre;
    private String formato;
    private String duracion;
    private String descripcion;
  
    
    public ModelPeliculas(ModelPrincipal model_principal){
        this.model_principal = model_principal;
    }
       
    public void Actualizar_Datos(){
        model_principal.setSQL_String("SELECT * FROM Película ORDER BY Id_peliculas ASC;");
        model_principal.Ejecutar_Consulta();
        model_principal.Mover_Primero();
        Asignar_Datos();
    }
    
    public void Asignar_Datos() {
        try {
            id_pelicula = model_principal.getSQL_Result_Set().getString("Id_pelicula");
            nombre = model_principal.getSQL_Result_Set().getString("Nombre");
            formato = model_principal.getSQL_Result_Set().getString("Formato");
            duracion = model_principal.getSQL_Result_Set().getString("Duración");
            descripcion = model_principal.getSQL_Result_Set().getString("Descripción");
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al asignar datos: " + e);
        }
    }
    
    public void Insertar_Pelicula(){
        try{
            model_principal.setSQL_String("INSERT INTO Películas(Nombre, Formato, Duración, Descripción) VALUES(?, ?, ?, ?);");
            model_principal.Preparar_Statement();
            model_principal.getSQL_Prepared_Statement().setString(1, nombre);
            model_principal.getSQL_Prepared_Statement().setString(2, formato);
            model_principal.getSQL_Prepared_Statement().setTime(3, Time.valueOf(duracion));
            model_principal.getSQL_Prepared_Statement().setString(4, descripcion);
            model_principal.Ejecutar_Actualizacion();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e);
        }
    }
    
    public void Modificar_Pelicula(){
        try{
            model_principal.setSQL_String("UPDATE Películas SET Nombre = ?, Formato = ?, Duración = ?, Descripción = ? WHERE Id_pelicula = ?;");
            model_principal.Preparar_Statement();
            model_principal.getSQL_Prepared_Statement().setString(1, nombre);
            model_principal.getSQL_Prepared_Statement().setString(2, formato);
            model_principal.getSQL_Prepared_Statement().setTime(3, Time.valueOf(duracion));
            model_principal.getSQL_Prepared_Statement().setString(4, descripcion);
            model_principal.getSQL_Prepared_Statement().setInt(5, Integer.parseInt(id_pelicula));
            model_principal.Ejecutar_Actualizacion();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar registro: " + e);
        }
    }
    
    public void Eliminar_Pelicula(){
        try{
            model_principal.setSQL_String("DELETE FROM Películas WHERE Id_pelicula = ? ;");
            model_principal.Preparar_Statement();
            model_principal.getSQL_Prepared_Statement().setInt(1, Integer.parseInt(id_pelicula));
            model_principal.Ejecutar_Actualizacion();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar registro: " + e);
        }
    }
    
    public String getId_pelicula(){
        return id_pelicula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public String getDuracion(){
        return duracion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setId_pelicula(String id_pelicula){
        this.id_pelicula = id_pelicula;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public void setFormato(String formato){
        this.formato = formato;
    }
    
    public void setDuracion(String duracion){
        this.duracion = duracion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}


