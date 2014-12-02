/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Date;

/**
 *
 * @author Compaq
 */
public class Docentes {

        
    private String folioDocente;
    private String ap_mat;
    private String ap_pat;
    private String colonia;
    private String categoriaDocente;
    
    private String correo;
    private String direccion;
    private String estado;
    private String nacionalidad;
    private String nombre;
    private String Nup;
    private String sexo;
    private String tabuladorA;
    private String tabuladorB;
    private String TabuladorC;
    private String tabuladorD;
    private String tabuladorE;
    private int telefono_fijo;
    private int telefono_movil;

    //Datos escolaridad
    private String nivelEstudios;
    private String gradoEstudios;
    private String institucionEgreso;
    private String cedula;
    private String gradoEstudios2;
    private String institucionEgreso2;
    private String cedula2;
    private String gradoEstudios3;
    private String institucionEgreso3;
    private String cedula3;

    //Datos Empresas donde trabajo el docente 
    private Date fecha1;
    private String puesto1;
    private String empresa1;

    private Date fecha2;
    private String puesto2;
    private String empresa2;

    private Date fecha3;
    private String puesto3;
    private String empresa3;

    //Datos de las materias que ha impartido
    private String periodo1;
    private String materia1;
    private String institucion1;

    private String periodo2;
    private String materia2;
    private String institucion2;

    private String periodo3;
    private String materia3;
    private String institucion3;

    public Descuentos m_Descuentos;
    public Asistencias m_Asistencias;
    public CargaAcademica m_CargaAcademica;
    public Justificaciones m_Justificaciones;
    public Faltas m_Faltas;
    public Retardos m_Retardos;
    private int antiguedad1;

    private String Idiomas;
    private String infonavit;
    private String motivo1;
    private int seguridadSocial;

    public String getPeriodo2() {
        return periodo2;
    }

    public void setPeriodo2(String periodo2) {
        this.periodo2 = periodo2;
    }

    public String getMateria2() {
        return materia2;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public String getInstitucion2() {
        return institucion2;
    }

    public void setInstitucion2(String institucion2) {
        this.institucion2 = institucion2;
    }

    public String getPeriodo3() {
        return periodo3;
    }

    public void setPeriodo3(String periodo3) {
        this.periodo3 = periodo3;
    }

    public String getMateria3() {
        return materia3;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }

    public String getInstitucion3() {
        return institucion3;
    }

    public void setInstitucion3(String institucion3) {
        this.institucion3 = institucion3;
    }

    public Date getFecha2() {
        return fecha2;
    }

    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    public String getPuesto2() {
        return puesto2;
    }

    public void setPuesto2(String puesto2) {
        this.puesto2 = puesto2;
    }

    public String getEmpresa2() {
        return empresa2;
    }

    public void setEmpresa2(String empresa2) {
        this.empresa2 = empresa2;
    }

    public Date getFecha3() {
        return fecha3;
    }

    public void setFecha3(Date fecha3) {
        this.fecha3 = fecha3;
    }

    public String getPuesto3() {
        return puesto3;
    }

    public void setPuesto3(String puesto3) {
        this.puesto3 = puesto3;
    }

    public String getEmpresa3() {
        return empresa3;
    }

    public void setEmpresa3(String empresa3) {
        this.empresa3 = empresa3;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public String getGradoEstudios() {
        return gradoEstudios;
    }

    public void setGradoEstudios(String gradoEstudios) {
        this.gradoEstudios = gradoEstudios;
    }

    public String getInstitucionEgreso() {
        return institucionEgreso;
    }

    public void setInstitucionEgreso(String institucionEgreso) {
        this.institucionEgreso = institucionEgreso;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGradoEstudios2() {
        return gradoEstudios2;
    }

    public void setGradoEstudios2(String gradoEstudios2) {
        this.gradoEstudios2 = gradoEstudios2;
    }

    public String getInstitucionEgreso2() {
        return institucionEgreso2;
    }

    public void setInstitucionEgreso2(String institucionEgreso2) {
        this.institucionEgreso2 = institucionEgreso2;
    }

    public String getCedula2() {
        return cedula2;
    }

    public void setCedula2(String cedula2) {
        this.cedula2 = cedula2;
    }

    public String getGradoEstudios3() {
        return gradoEstudios3;
    }

    public void setGradoEstudios3(String gradoEstudios3) {
        this.gradoEstudios3 = gradoEstudios3;
    }

    public String getInstitucionEgreso3() {
        return institucionEgreso3;
    }

    public void setInstitucionEgreso3(String institucionEgreso3) {
        this.institucionEgreso3 = institucionEgreso3;
    }

    public String getCedula3() {
        return cedula3;
    }

    public void setCedula3(String cedula3) {
        this.cedula3 = cedula3;
    }

    public String getAp_mat() {
        return ap_mat;
    }

    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }

    public String getAp_pat() {
        return ap_pat;
    }

    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    public String getCategoriaDocente() {
        return categoriaDocente;
    }

    public void setCategoriaDocente(String categoriaDocente) {
        this.categoriaDocente = categoriaDocente;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFolioDocente() {
        return folioDocente;
    }

    public void setFolioDocente(String folioDocente) {
        this.folioDocente = folioDocente;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNup() {
        return Nup;
    }

    public void setNup(String Nup) {
        this.Nup = Nup;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTabuladorA() {
        return tabuladorA;
    }

    public void setTabuladorA(String tabuladorA) {
        this.tabuladorA = tabuladorA;
    }

    public String getTabuladorB() {
        return tabuladorB;
    }

    public void setTabuladorB(String tabuladorB) {
        this.tabuladorB = tabuladorB;
    }

    public String getTabuladorC() {
        return TabuladorC;
    }

    public void setTabuladorC(String TabuladorC) {
        this.TabuladorC = TabuladorC;
    }

    public String getTabuladorD() {
        return tabuladorD;
    }

    public void setTabuladorD(String tabuladorD) {
        this.tabuladorD = tabuladorD;
    }

    public String getTabuladorE() {
        return tabuladorE;
    }

    public void setTabuladorE(String tabuladorE) {
        this.tabuladorE = tabuladorE;
    }

    public int getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(int telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public int getTelefono_movil() {
        return telefono_movil;
    }

    public void setTelefono_movil(int telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public Descuentos getM_Descuentos() {
        return m_Descuentos;
    }

    public void setM_Descuentos(Descuentos m_Descuentos) {
        this.m_Descuentos = m_Descuentos;
    }

    public Asistencias getM_Asistencias() {
        return m_Asistencias;
    }

    public void setM_Asistencias(Asistencias m_Asistencias) {
        this.m_Asistencias = m_Asistencias;
    }

    public CargaAcademica getM_CargaAcademica() {
        return m_CargaAcademica;
    }

    public void setM_CargaAcademica(CargaAcademica m_CargaAcademica) {
        this.m_CargaAcademica = m_CargaAcademica;
    }

    public Justificaciones getM_Justificaciones() {
        return m_Justificaciones;
    }

    public void setM_Justificaciones(Justificaciones m_Justificaciones) {
        this.m_Justificaciones = m_Justificaciones;
    }

    public Faltas getM_Faltas() {
        return m_Faltas;
    }

    public void setM_Faltas(Faltas m_Faltas) {
        this.m_Faltas = m_Faltas;
    }

    public Retardos getM_Retardos() {
        return m_Retardos;
    }

    public void setM_Retardos(Retardos m_Retardos) {
        this.m_Retardos = m_Retardos;
    }

    public int getAntiguedad1() {
        return antiguedad1;
    }

    public void setAntiguedad1(int antiguedad1) {
        this.antiguedad1 = antiguedad1;
    }

    public String getEmpresa1() {
        return empresa1;
    }

    public void setEmpresa1(String empresa1) {
        this.empresa1 = empresa1;
    }

    public Date getFecha1() {
        return fecha1;
    }

    public void setFecha1(Date fecha1) {
        this.fecha1 = fecha1;
    }

    public String getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(String Idiomas) {
        this.Idiomas = Idiomas;
    }

    public String getInfonavit() {
        return infonavit;
    }

    public void setInfonavit(String infonavit) {
        this.infonavit = infonavit;
    }

    public String getInstitucion1() {
        return institucion1;
    }

    public void setInstitucion1(String institucion1) {
        this.institucion1 = institucion1;
    }

    public String getMateria1() {
        return materia1;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public String getMotivo1() {
        return motivo1;
    }

    public void setMotivo1(String motivo1) {
        this.motivo1 = motivo1;
    }

    public String getPeriodo1() {
        return periodo1;
    }

    public void setPeriodo1(String periodo1) {
        this.periodo1 = periodo1;
    }

    public String getPuesto1() {
        return puesto1;
    }

    public void setPuesto1(String puesto1) {
        this.puesto1 = puesto1;
    }

    public int getSeguridadSocial() {
        return seguridadSocial;
    }

    public void setSeguridadSocial(int seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

}
