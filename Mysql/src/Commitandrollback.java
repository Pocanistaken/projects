import java.sql.*;
import java.util.Scanner;

public class Commitandrollback {
    private String username = "root";
    private String password = "";
    private String database = "demo";
    private String host = "localhost";
    private int port = 3306;

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;


    public static void main(String[] args) {
        Commitandrollback test = new Commitandrollback();
        test.Commitandrollback();
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


    public void Commitandrollback() {
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

    }

