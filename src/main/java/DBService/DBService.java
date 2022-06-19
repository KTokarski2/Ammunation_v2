package DBService;

import Models.Gun;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {

    Connection connection;
    Statement statement;
    String sqlString;
    ResultSet resultSet;

    public DBService () throws SQLException, ClassNotFoundException {

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tpo?" + "user=root&password=haslo");
        statement = connection.createStatement();

    }

    public List<Gun> getAllGuns() throws SQLException {
        List<Gun> gunList = new ArrayList<>();
        sqlString = "SELECT * FROM gun";
        resultSet = statement.executeQuery(sqlString);
        while (resultSet.next()) {
            Gun gun = new Gun(
                    Integer.parseInt(resultSet.getString("ID")),
                    resultSet.getString("Name"),
                    resultSet.getString("Type"),
                    resultSet.getString("Origin"),
                    Double.parseDouble(resultSet.getString("Mass")),
                    Double.parseDouble(resultSet.getString("Length")),
                    Double.parseDouble(resultSet.getString("Caliber")),
                    Integer.parseInt(resultSet.getString("Rounds")),
                    resultSet.getString("Photo")
            );
            gunList.add(gun);
        }
        return gunList;
    }

    public List<Gun> getGunsByOrigin(String origin) throws SQLException {
        List<Gun> gunList = new ArrayList<>();
        String sqlString = "SELECT * FROM gun WHERE Origin=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,origin);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Gun gun = new Gun(
                    Integer.parseInt(resultSet.getString("ID")),
                    resultSet.getString("Name"),
                    resultSet.getString("Type"),
                    resultSet.getString("Origin"),
                    Double.parseDouble(resultSet.getString("Mass")),
                    Double.parseDouble(resultSet.getString("Length")),
                    Double.parseDouble(resultSet.getString("Caliber")),
                    Integer.parseInt(resultSet.getString("Rounds")),
                    resultSet.getString("Photo")
            );
            gunList.add(gun);
        }
        return gunList;

    }

    public List<Gun> getGunsByName(String name) throws SQLException {
        List<Gun> gunList = new ArrayList<>();
        String sqlString = "SELECT * FROM gun WHERE Name=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,name);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Gun gun = new Gun(
                    Integer.parseInt(resultSet.getString("ID")),
                    resultSet.getString("Name"),
                    resultSet.getString("Type"),
                    resultSet.getString("Origin"),
                    Double.parseDouble(resultSet.getString("Mass")),
                    Double.parseDouble(resultSet.getString("Length")),
                    Double.parseDouble(resultSet.getString("Caliber")),
                    Integer.parseInt(resultSet.getString("Rounds")),
                    resultSet.getString("Photo")
            );
            gunList.add(gun);
        }
        return gunList;

    }

    public List<Gun> getGunsByType(String type) throws SQLException {
        List<Gun> gunList = new ArrayList<>();
        String sqlString = "SELECT * FROM gun WHERE Type=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,type);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Gun gun = new Gun(
                    Integer.parseInt(resultSet.getString("ID")),
                    resultSet.getString("Name"),
                    resultSet.getString("Type"),
                    resultSet.getString("Origin"),
                    Double.parseDouble(resultSet.getString("Mass")),
                    Double.parseDouble(resultSet.getString("Length")),
                    Double.parseDouble(resultSet.getString("Caliber")),
                    Integer.parseInt(resultSet.getString("Rounds")),
                    resultSet.getString("Photo")
            );
            gunList.add(gun);
        }
        return gunList;

    }

    public List<Gun> getGunsByNameAndType(String name,String type) throws SQLException {
        List<Gun> gunList = new ArrayList<>();
        String sqlString = "SELECT * FROM gun WHERE Name=? AND Type=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,type);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Gun gun = new Gun(
                    Integer.parseInt(resultSet.getString("ID")),
                    resultSet.getString("Name"),
                    resultSet.getString("Type"),
                    resultSet.getString("Origin"),
                    Double.parseDouble(resultSet.getString("Mass")),
                    Double.parseDouble(resultSet.getString("Length")),
                    Double.parseDouble(resultSet.getString("Caliber")),
                    Integer.parseInt(resultSet.getString("Rounds")),
                    resultSet.getString("Photo")
            );
            gunList.add(gun);
        }
        return gunList;

    }

    public List<Gun> getGunsByTypeAndOrigin(String origin,String type) throws SQLException {
        List<Gun> gunList = new ArrayList<>();
        String sqlString = "SELECT * FROM gun WHERE Origin=? AND Type=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,origin);
        preparedStatement.setString(2,type);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Gun gun = new Gun(
                    Integer.parseInt(resultSet.getString("ID")),
                    resultSet.getString("Name"),
                    resultSet.getString("Type"),
                    resultSet.getString("Origin"),
                    Double.parseDouble(resultSet.getString("Mass")),
                    Double.parseDouble(resultSet.getString("Length")),
                    Double.parseDouble(resultSet.getString("Caliber")),
                    Integer.parseInt(resultSet.getString("Rounds")),
                    resultSet.getString("Photo")
            );
            gunList.add(gun);
        }
        return gunList;

    }

    public List<Gun> getGunsByNameAndOrigin(String name,String origin) throws SQLException {
        List<Gun> gunList = new ArrayList<>();
        String sqlString = "SELECT * FROM gun WHERE Name=? AND Origin=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,origin);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Gun gun = new Gun(
                    Integer.parseInt(resultSet.getString("ID")),
                    resultSet.getString("Name"),
                    resultSet.getString("Type"),
                    resultSet.getString("Origin"),
                    Double.parseDouble(resultSet.getString("Mass")),
                    Double.parseDouble(resultSet.getString("Length")),
                    Double.parseDouble(resultSet.getString("Caliber")),
                    Integer.parseInt(resultSet.getString("Rounds")),
                    resultSet.getString("Photo")
            );
            gunList.add(gun);
        }
        return gunList;

    }

    public List<Gun> getGunsByAllParameters(String name, String type,String origin) throws SQLException {
        List<Gun> gunList = new ArrayList<>();
        String sqlString = "SELECT * FROM gun WHERE Name=? AND Origin=? AND Type=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,origin);
        preparedStatement.setString(3,type);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Gun gun = new Gun(
                    Integer.parseInt(resultSet.getString("ID")),
                    resultSet.getString("Name"),
                    resultSet.getString("Type"),
                    resultSet.getString("Origin"),
                    Double.parseDouble(resultSet.getString("Mass")),
                    Double.parseDouble(resultSet.getString("Length")),
                    Double.parseDouble(resultSet.getString("Caliber")),
                    Integer.parseInt(resultSet.getString("Rounds")),
                    resultSet.getString("Photo")
            );
            gunList.add(gun);
        }
        return gunList;

    }

}
