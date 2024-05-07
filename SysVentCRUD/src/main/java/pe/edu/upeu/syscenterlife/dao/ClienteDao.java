package pe.edu.upeu.syscenterlife.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.syscenterlife.connx.ConnS;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

public class ClienteDao {

    ConnS instance = ConnS.getInstance();
    Connection connection = instance.getConnection();
    PreparedStatement ps;
    ResultSet rs = null;
    
   

    public List<Cliente> listarCliente(){
    
    public void guardarCliente (Cliente c) {
        try {
            ps= connection.prepareStatement("");
            ps=execute();
        }catch (Exception e) {
            System.err.println("Error:"+e.getMessage());
        }
    
            
        
    }    
        List<Cliente> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement("SELECT * from cliente");
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(Cliente.builder()
                        .dniruc(rs.getString("deniruc"))
                        .nombre(rs.getString("nombre"))
                        .documento(rs.getString("documento"))
                        .build());
                

            }
        } catch (Exception e) { }
        return lista;
            
        }

    }


   
