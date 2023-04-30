package MainPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/campusLife";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "anime2440";

    private Connection connection;

    public Database() {
        try {
            Class.forName(DRIVER);
            this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertStudent(String rollNumber, String name, String fatherName, String address, String email, String phone, String gender, String nationality, String stream) {
        try {
            String insertQuery = "INSERT INTO stuDetails VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, rollNumber);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, fatherName);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, phone);
            preparedStatement.setString(7, gender);
            preparedStatement.setString(8, nationality);
            preparedStatement.setString(9, stream);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet searchStudent(String USERNAME) {
        ResultSet resultSet = null;
        try {
            String selectQuery = "SELECT * FROM stuDetails WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, USERNAME);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public void updateAddress(String address) {
        try {
            String updateQuery = "UPDATE stuDetails SET address = ? WHERE prn = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, address);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePhone(String phone) {
        try {
            String updateQuery = "UPDATE stuDetails SET phone = ? WHERE prn = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, phone);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStream(String stream) {
        try {
            String updateQuery = "UPDATE stuDetails SET stream = ? WHERE prn = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, stream);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deleteStudent(String rollNumber) {
        try {
            String deleteQuery = "DELETE FROM stuDetails WHERE prn = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1, rollNumber);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}