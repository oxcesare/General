/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Compaq
 */
public class DAO {

    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    
    
    public void conectarNominas() throws Exception {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Conexion al Servidor 
            cn = DriverManager.getConnection("jdbc:sqlserver://siesux;databaseName=Nominas", "sa", "pxrd99wnUX2014");
            System.out.println("Conexion Exitosa a Nominas");
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    
     public void conectarDocentes() throws Exception {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Conexion al Servidor 
            cn = DriverManager.getConnection("jdbc:sqlserver://siesux;databaseName=Docentes2", "sa", "pxrd99wnUX2014");
            System.out.println("Conexion Exitosa a Docentes Registro Web");
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void conectar() throws Exception {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Conexion al Servidor 
            cn = DriverManager.getConnection("jdbc:sqlserver://siesux;databaseName=ux", "sa", "pxrd99wnUX2014");
            System.out.println("Conexion Exitosa a UX");
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void conectarUX() throws Exception {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Conexion Local
            //cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ux;integratedSecurity=True");
            //Conexion al Servidor 
            cn = DriverManager.getConnection("jdbc:sqlserver://siesux;databaseName=ux", "sa", "pxrd99wnUX2014");
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void conectarSinuxv2() throws Exception {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Conexion Local
//            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=sinuxv2;integratedSecurity=True");

            //Conexion al Servidor 192.168.1.246
            cn = DriverManager.getConnection("jdbc:sqlserver://siesux;databaseName=sinuxv2", "sa", "pxrd99wnUX2014");
            System.out.println("Conexion Exitosa a Sinux");
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void conectarMaterias() throws Exception {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Conexion Local
//            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=materias;integratedSecurity=True");

            //Conexion al Servidor 
            cn = DriverManager.getConnection("jdbc:sqlserver://siesux;databaseName=materias", "sa", "pxrd99wnUX2014");
            System.out.println("Conexion Exitosa a Materias");
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void conectarMasterUsuarios() throws Exception {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Conexion Local
//            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MASTERUSUARIOS;integratedSecurity=True");

            //Conexion al Servidor 
            cn = DriverManager.getConnection("jdbc:sqlserver://siesux;databaseName=MASTERUSUARIOS", "sa", "pxrd99wnUX2014");
            System.out.println("Conexion Exitosa a MasterUsuarios");
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void conectarReinscripciones() throws Exception {
        Connection cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Conexion Local
//            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=reinscripciones;integratedSecurity=True");

//            Conexion al Servidor 
            cn = DriverManager.getConnection("jdbc:sqlserver://siesux;databaseName=reinscripciones", "sa", "pxrd99wnUX2014");
            System.out.println("Conexion Exitosa a Reinscripciones");
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void conectarSinuxv2_Conta() throws Exception {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Conexion Local
//            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=sinuxv2_conta;integratedSecurity=True");

            //Conexion al Servidor 
            cn = DriverManager.getConnection("jdbc:sqlserver://siesux;databaseName=sinuxv2_conta", "sa", "pxrd99wnUX2014");
//
            System.out.println("Conexion Exitosa Sinux Conta");
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void cerrar() throws Exception {

        try {
            if (cn != null) {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

}
