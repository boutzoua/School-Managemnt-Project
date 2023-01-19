package ecole.gestionecole.dbController;

import ecole.gestionecole.db.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GradeController {
    public static ArrayList<String> getGrades() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("SELECT grade from grades");

        ArrayList<String> gradeList = new ArrayList<>();

        while (rst.next()){
            gradeList.add(rst.getString("grade"));
        }
        return gradeList;
    }

    public static ArrayList<String> getYears()throws ClassNotFoundException,SQLException{
        Connection conn= DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("SELECT distinct year from paststudents");

        ArrayList<String> yearList = new ArrayList<>();

        while (rst.next()){
            yearList.add(rst.getString("year"));
        }
        return yearList;
    }
}
