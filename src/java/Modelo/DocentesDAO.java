/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DTYS
 */
public class DocentesDAO extends DAO {
    
    
    
       
    public List<Docentes> mostrarDatosGenerales(String folioDocente) throws Exception {
        
        List<Docentes> lista;
        ResultSet rs;        
        String folioDocente2 = folioDocente;
        
        try {
            
            this.conectarDocentes();
            PreparedStatement st = this.getCn().prepareCall("select * from Generales where Nup=?");
            st.setString(1,folioDocente2);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Docentes dec = new Docentes();
                dec.setNombre(rs.getString("nombreDocente"));
                dec.setAp_pat(rs.getString("ap_pat"));
                dec.setAp_mat(rs.getString("ap_mat"));
                dec.setDireccion(rs.getString("calle")+rs.getString("colonia")); 
                dec.setNivelEstudios(rs.getString("NivelEstudios"));
                dec.setNup(rs.getString("Nup"));
                lista.add(dec);
            }
        } catch (Exception ex) {
            throw ex;
            
        } finally {
            
        }
        return lista;
    }
    
    public List<Docentes> mostrarDatosEscolaridad(String folioDocente) throws Exception {
        
        List<Docentes> lista2;
        ResultSet rs;
        
        String nivelEstudios="";
        String folioDocente2 = folioDocente;
        try {
            
            this.conectarDocentes();
            PreparedStatement st = this.getCn().prepareCall("select * from Generales where Nup=?");
            st.setString(1,folioDocente2);
            rs = st.executeQuery();
            lista2 = new ArrayList();
            while (rs.next()) {
                Docentes dec = new Docentes();                                
                dec.setNivelEstudios(rs.getString("NivelEstudios"));
                dec.setGradoEstudios(rs.getString("grado"));
                dec.setInstitucionEgreso(rs.getString("institucion"));
                dec.setCedula(rs.getString("cedula"));
                
                dec.setGradoEstudios2(rs.getString("grado2"));
                dec.setInstitucionEgreso2(rs.getString("institucion2"));
                dec.setCedula2(rs.getString("cedula2"));
                
                
                dec.setGradoEstudios3(rs.getString("grado3"));
                dec.setInstitucionEgreso3(rs.getString("institucion3"));
                dec.setCedula3(rs.getString("cedula3"));
                
                
                lista2.add(dec);
            }
        } catch (Exception ex) {
            throw ex;
            
        } finally {
            
        }
        return lista2;
    }
    
    public List<Docentes> mostrarDatosLaborales(String folioDocente) throws Exception {
        
        List<Docentes> lista3;
        ResultSet rs;
        
        String folioDocente2 = folioDocente;
        
        try {
            
            this.conectarDocentes();
            PreparedStatement st = this.getCn().prepareCall("select * from Generales where Nup=?");
            rs = st.executeQuery();
            lista3 = new ArrayList();
            while (rs.next()) {
                Docentes dec = new Docentes();
                dec.setFecha1(rs.getDate("fecha1"));
                dec.setPuesto1(rs.getString("puesto1"));
                dec.setEmpresa1(rs.getString("empresa1"));
                dec.setFecha2(rs.getDate("fecha2"));
                dec.setPuesto2(rs.getString("puesto2"));
                dec.setEmpresa2(rs.getString("empesa2"));                
                dec.setFecha3(rs.getDate("fecha3"));
                dec.setPuesto3(rs.getString("puesto3"));
                dec.setEmpresa3(rs.getString("empresa3"));
                lista3.add(dec);
            }
        } catch (Exception ex) {
            throw ex;
            
        } finally {
            
        }
        return lista3;
    }
    
    public List<Docentes> mostrarDatosExperienciaDocente(String folioDocente) throws Exception {
        
        List<Docentes> lista4;
        ResultSet rs;
        String folioDocente2 = folioDocente;
        
        //periodo1
        //materia1
        //institucion1
        try {
            
            this.conectarDocentes();
            PreparedStatement st = this.getCn().prepareCall("select * from Generales where Nup=?");
            rs = st.executeQuery();
            lista4 = new ArrayList();
            while (rs.next()) {
                Docentes dec = new Docentes();
                dec.setPeriodo1(rs.getString("periodo1"));
                dec.setMateria1(rs.getString("materia1"));
                dec.setInstitucion1(rs.getString("institucionmateria1"));
                
                dec.setPeriodo2(rs.getString("periodo2"));
                dec.setMateria2(rs.getString("materia2"));
                dec.setInstitucion2(rs.getString("institucionmateria2"));
                
                dec.setPeriodo3(rs.getString("periodo3"));
                dec.setMateria3(rs.getString("materia3"));
                dec.setInstitucion3(rs.getString("institucionmateria3"));
                
                lista4.add(dec);
            }
        } catch (Exception ex) {
            throw ex;
            
        } finally {
            
        }
        return lista4;
    }
    
    
    
}
