package ecole.gestionecole.dbController;

import ecole.gestionecole.db.DBConnection;
import ecole.gestionecole.model.Exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExamController {
    public static int addExam(Exam exam)throws ClassNotFoundException, SQLException {
        String SQL="INSERT INTO exams VALUES(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, exam.getModule());
        stm.setObject(2, exam.getField());
        stm.setObject(3, exam.getGrade());
        stm.setObject(4, exam.getDate());
        stm.setObject(5, exam.getTime());
        stm.setObject(6, exam.getSalle());
        stm.setObject(7, exam.getResponsible());

        return  stm.executeUpdate();
    }



    public static Exam searchExambyModule(String module) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM exams WHERE module LIKE '%"+module+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        // stm.setObject(1, name);
        ResultSet rst=stm.executeQuery();
        if(rst.next()){
            Exam exam = new Exam(rst.getString(1),rst.getString(2),rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
            return exam;
        }
        return null;
    }

    public static int deleteExam(String module) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM exams WHERE module ='"+module+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);

        return  stm.executeUpdate();
    }

    public static int updateExam(Exam exam) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE exams SET module=?, field=?, grade=?, date=?, time=?, salle=?, responsable=? WHERE module= '" +exam.getModule()+ "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, exam.getModule());
        stm.setObject(2, exam.getField());
        stm.setObject(3, exam.getGrade());
        stm.setObject(4, exam.getDate());
        stm.setObject(5, exam.getTime());
        stm.setObject(6, exam.getSalle());
        stm.setObject(7, exam.getResponsible());

        return  stm.executeUpdate();
    }


}
