/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Compaq
 */
public class AulasDAO extends DAO {

    public List<Aulas> consultaAulas() throws Exception {

        boolean rpt = false;
        List<Aulas> lista = null;
        Date horaEntrada2;
        ResultSet rs;

        try {
            this.conectarNominas();
            PreparedStatement st = this.getCn().prepareCall("select * from aulas");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Aulas c = new Aulas();
                c.setSitios(rs.getString("sitios"));
                lista.add(c);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
        }
        return lista;
    }
}
