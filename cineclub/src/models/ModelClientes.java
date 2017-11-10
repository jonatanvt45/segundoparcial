/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author JonatanVT
 */
public class ModelClientes {
    private final ModelPrincipal model_principal;
    
    private String id_cliente;
    private String nombre;
    private String telefono;
    private String email;

    
    public ModelClientes(ModelPrincipal model_principal){
        this.model_principal = model_principal;
}
    
 public void Actualizar_Datos(){
        model_principal.setSQL_String("SELECT * FROM Clientes ORDER BY id_cliente ASC;");
        model_principal.Ejecutar_Consulta();
        model_principal.Mover_Primero();
        Asignar_Datos();
    }
    

      public void Asignar_Datos() {
        try{
            id_cliente = model_principal.getSQL_Result_Set().getString("id_cliente");
            nombre = model_principal.getSQL_Result_Set().getString("nombre");
            telefono = model_principal.getSQL_Result_Set().getString("telefono");
            email = model_principal.getSQL_Result_Set().getString("email");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al asignar datos de clientes: " + e);
        }
    }
 
public void Insertar_Cliente(){
        try{
            model_principal.setSQL_String("INSERT INTO Cliente(Nombre, Telefono, Email) VALUES(?, ?, ?);");
            model_principal.Preparar_Statement();
            model_principal.getSQL_Prepared_Statement().setString(1, nombre);
            model_principal.getSQL_Prepared_Statement().setString(2, telefono);
            model_principal.getSQL_Prepared_Statement().setString(3, email);
            model_principal.Ejecutar_Actualizacion();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al insertar cliente: " + e);
        }
    }
    
    public void Modificar_Cliente(){
        try {
            model_principal.setSQL_String("UPDATE clientes SET Nombre = ?, Telefono = ?, Email = ? WHERE Id_cliente = ?;");
            model_principal.Preparar_Statement();
            model_principal.getSQL_Prepared_Statement().setString(1, nombre);
            model_principal.getSQL_Prepared_Statement().setString(2, telefono);
            model_principal.getSQL_Prepared_Statement().setString(3, email);
            model_principal.getSQL_Prepared_Statement().setInt(5, Integer.parseInt(id_cliente));
            model_principal.Ejecutar_Actualizacion();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar cliente: " + e);
        }
    }
    
    public void Eliminar_Cliente(){
        try {
            model_principal.setSQL_String("DELETE FROM clientes WHERE id_cliente = ?;");
            model_principal.Preparar_Statement();
            model_principal.getSQL_Prepared_Statement().setInt(1, Integer.parseInt(id_cliente));
            model_principal.Ejecutar_Actualizacion();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar cliente: " + e);
        }
    }
    
    public String getId_cliente(){
        return id_cliente;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getEmail(){
        return email;
    }
    
   
    
    public void setId_cliente(String id_cliente){
        this.id_cliente = id_cliente;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
}