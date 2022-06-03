package com.example.proyectosistdistribuidos.clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionPG {
    Connection conexion=null;

    public Connection conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection("localhost:3000/proyecto/v1/players","root", "admin123");
        }catch (Exception er){
            System.err.println(er.getMessage());
        }
        return conexion;
    }

    protected void CerrarConexion(Connection con) throws  Exception{
        con.close();
    }
}
