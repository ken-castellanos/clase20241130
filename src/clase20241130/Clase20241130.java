/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase20241130;
import DAO.conexion;
import java.sql.*;

/**
 *
 * @author kenk7
 */
public class Clase20241130  extends javax.swing.JFrame
{
    public void InsertPerson()
    {
        Conexion conn = new Conexion("proyectopoo");
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO PERSON(NAME, AGE, GENDER) VALUES(?, ?, ?)";
        
        try
        {
            con = conn.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, txtName.getText.getText().trim());
            ps.setInt(2, Integer.parseInt(txtAge.getText().trim()));
            ps.setString(3, txtGender.getText().trim());
            
            ps.executeUpdate();
            System.out.println("DATOS INSERTADOS EXITOSAMENTE");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(ps != null) ps.close();
                if(con != null) con.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
