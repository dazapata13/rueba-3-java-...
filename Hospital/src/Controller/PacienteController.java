/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Bd.Conexion;
import com.mysql.cj.Query;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class PacienteController {
    HelperController helper = new HelperController();
    Conexion cx;
   
    
    
    
    public PacienteController() {
        cx = new Conexion();
        cx.contectar();    
    }
    
    public List<paciente> obtenerPaciente(){
        List <paciente> Paciente = new ArrayList<>();
        
        try {
            Resultset rs = cx.EjecutarQuery(Query);
            while (rs.next()){
                paciente.add(new paciente)(
                    rs.getint("rut")
                    rs.getString("nombre")
                    rs.getint("fecha_nacimiento")
                    rs.getString("direccion")
                    rs.getint("contacto")
                ));
                
            return Paciente;
            
            
            
            }
            
        } catch (Exception e) {
        }
    
    
    
    }
    
    
    
}
