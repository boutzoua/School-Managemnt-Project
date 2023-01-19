package ecole.gestionecole.controller;

import ecole.gestionecole.db.DBConnection;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.view.JasperViewer;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

public class ReportViewController {
    public void viewReport(JasperDesign report){

        try {
            HashMap<String,Object> Logo = new HashMap<String, Object>();

            URL url = new URL("https://upload.wikimedia.org/wikipedia/commons/a/ac/Universite_Cadi_Ayyad.png");
//            System.out.println(url);
            Logo.put("Logo", url);

            //Above Code for Getting Logo in Report

            Connection conn = DBConnection.getDBConnection().getConnection();
            JasperReport jr = JasperCompileManager.compileReport(report);
            //JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperPrint jp = JasperFillManager.fillReport(jr,Logo,conn);
            JasperViewer.viewReport(jp,false);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (JRException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
