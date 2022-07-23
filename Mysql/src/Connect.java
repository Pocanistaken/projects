import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class Connect {

    private String username = "root";
    private String password = "";
    private String database = "demo";
    private String host = "localhost";
    private int port = 3306;

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;


    public void CommitAndRollback() {
        try {
            Scanner scanner = new Scanner(System.in);
            con.setAutoCommit(false); // All permissions are manuel right now
            String get1 = "DELETE FROM workers WHERE ID = 3";
            String get2 = "UPDATE workers set email = 'test@pocan.net' where id = 1";
            System.out.println("Before the update");
            getWorkers();
            Statement statement = con.createStatement();
            statement.executeUpdate(get1);
            statement.executeUpdate(get2);

            System.out.println("İşlemleriniz kayıt edilsin mi? (yes/no)");
            String result  = scanner.nextLine();
            if (result.equals("yes")) {
                con.commit();
                getWorkers();
                System.out.println("SQL Updated");
            }
            else {
                con.rollback();
                System.out.println("SQL Update Canceled");
                getWorkers();
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void getWorkers2PreparedStatement(int id) {
        String get = "SELECT * FROM workers WHERE id > ? and name like ?";
        try {
            preparedStatement = con.prepareStatement(get);
            preparedStatement.setInt(1, id); // 1. soru işaretinin yerine gelecek olan değer
            preparedStatement.setString(2,"B%"); // 2. soru işaretinin yerine gelecek olan değer
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");

                System.out.println("Name " + name + "Surname " + surname + "Email " + email);


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void getWorkersPreparedStatment() {
        try {
            statement = con.createStatement();
            String get = "SELECT * FROM workers WHERE name like 'B%'";
            ResultSet resultSet = statement.executeQuery(get);

            while (resultSet.next()) {
                System.out.println("Name : " + resultSet.getString("name"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void removeWorkers() {
        try {
            statement = con.createStatement();
            String get = "Delete from workers where id > 2";
            int val = statement.executeUpdate(get);

            System.out.println("Deleted values " + val);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updateWorkers() {
        try {
            statement = con.createStatement();
            String get = "Update workers Set email = 'Test@gmail.com' where id = 1";
            statement.executeUpdate(get);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void addWorkers() {
        try {
            statement = con.createStatement();
            String name = "Fatih";
            String surname = "Yasin";
            String email = "fatihyasin@hotmail.com";
            // INSERT INTO workers (name,surname,email) VALUES('Pocan', "Pocan", "Pocan@gmail.com")
            String get = "INSERT INTO workers (name,surname,email) VALUES(" + "'" + name + "'" + "," + "'" + surname + "'" + "," + "'" + email + "')";
            statement.executeUpdate(get);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void getWorkers() {
        String get = "Select * From workers";
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(get);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");

                System.out.println("Id -> " + id + " Name -> " + name + " Surname -> " + surname + " Email -> " + email);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




    }
    public Connect() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found");
        }
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Succesfully connected the system.");
        } catch (SQLException e) {
            System.out.println("Connection is failed.");
        }


    }



    public static void main(String[] args) {
        //Connect connect = new Connect();

    }

}


