/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DTYS
 */
public class CargaAcademicaDAO extends DAO {
    
    public void registrarCargaAcademica(CargaAcademica ca) throws Exception {
        
        try {
            this.conectarNominas();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO CargaAcademica (Nup,nombreDocente,materia,carrera,grupo,aula,horaEntrada,horaSalida,dia,fechaClase)VALUES(?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, ca.getNup());
            st.setString(2, ca.getNombreDocente());
            st.setString(3, ca.getMateria());
            st.setString(4, ca.getCarrera());
            st.setString(5, ca.getGrupo());
            st.setString(6, ca.getAula());
            st.setString(7, ca.getHoraEntrada());
            st.setString(8, ca.getHoraSalida());
            st.setString(9, ca.getDia());
            st.setString(10, ca.getFechaClase());
            st.executeUpdate();
            
        } catch (Exception ex) {
            throw ex;
            
        } finally {
            this.cerrar();
        }
    }
    
    public void registrarCargaAcademica2(String Nup, String nombreDocente, String materia, String carrera, String grupo, String aula, String horaEntrada, String horaSalida, String dia, String fechaClase) throws Exception {
        
        String Nup2 = Nup;
        String nombreDocente2 = nombreDocente;
        String materia2 = materia;
        String carrera2 = carrera;
        String grupo2 = grupo;
        String aula2 = aula;
        String horaEntrada2 = horaEntrada;
        String horaSalida2 = horaSalida;
        String dia2 = dia;

        //Para manejar las fechas con esto paso al formato que necesita sql Server
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaClase2 = fechaClase;
        Date date = null;

//        //Convierto mi variable fecha de String a tipo Date para almacenarla 
//        try {
//            date = formato.parse(fechaClase2);
//            formato.format(date);
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy - MM - dd");
        String strFecha = fechaClase;
        Date fecha = null;
        try {
            fecha = formatoDelTexto.parse(strFecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        try {
            
            this.conectarNominas();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO CargaAcademica (Nup,nombreDocente,materia,carrera,grupo,aula,horaEntrada,horaSalida,dia,fechaClase)VALUES(?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, Nup2);
            st.setString(2, nombreDocente2);
            st.setString(3, materia2);
            st.setString(4, carrera2);
            st.setString(5, grupo2);
            st.setString(6, aula2);
            st.setString(7, horaEntrada2);
            st.setString(8, horaSalida2);
            st.setString(9, dia2);
            st.setString(10, fechaClase);
            st.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.cerrar();
        }
        
    }

    /**
     * Vamos a crear el método para que busque la información del docente que se
     * le esta dando de alta su cargaAcadémica
     */
    public List<CargaAcademica> mostrarCargaAcademica(String folioDocente) throws Exception {
        
        List<CargaAcademica> lista;
        ResultSet rs;        
        String folioDocente2 = folioDocente;
        
        try {
            
            this.conectarNominas();
            PreparedStatement st = this.getCn().prepareCall("select * from CargaAcademica where Nup=?");
            st.setString(1, folioDocente2);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                CargaAcademica dec = new CargaAcademica();                
                dec.setNup(rs.getString("Nup"));
                dec.setNombreDocente(rs.getString("nombreDocente"));
                dec.setMateria(rs.getString("materia"));
                dec.setCarrera(rs.getString("carrera"));
                dec.setGrupo(rs.getString("grupo"));
                dec.setAula(rs.getString("aula"));
                dec.setHoraEntrada(rs.getString("horaEntrada"));
                dec.setHoraSalida(rs.getString("horaSalida"));
                dec.setDia(rs.getString("dia"));
                dec.setFechaClase(rs.getString("fechaClase"));
                lista.add(dec);
            }
        } catch (Exception ex) {
            throw ex;
            
        } finally {
            
        }
        return lista;
    }
    
}
