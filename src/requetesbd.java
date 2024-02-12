/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sabahbulant
 */
public class requetesbd {

    /**
     * Afficher toutes les informations sur tous les spectacles.
     *
     * @param conn connexion � la base de donn�es
     * @throws SQLException en cas d'erreur d'acc�s � la base de donn�es
     */
    public static void nbemp(Connection conn) throws SQLException {

        // Get a statement from the connection
        Statement stmt = conn.createStatement();

        // Execute the query
        ResultSet rs = stmt.executeQuery("SELECT count(*) FROM PATIENT");

        while (rs.next()) {
            System.out.println("Nombre de patient : " + rs.getInt(1));
        }

        // Close the result set, statement and the connection
        rs.close();
        stmt.close();
    }

    public static void patient(Connection conn) throws SQLException {

        Statement stmt = conn.createStatement();

        Scanner scanner = new Scanner(System.in);

        // Ajout d'une nouvelle ligne (avec valeurs générées à chaque nouvelle exécution)
        int id = Math.abs((int) System.currentTimeMillis()); // valeur générée à partir du temps système
        Random random = new Random();

        // nom de 10 lettres généré au hasard avec des lettre minuscules
        System.out.println("Veuillez le nom du patient :");
        String name = scanner.nextLine();

        // prénom de 10 lettres généré au hasard avec des lettre minuscules
        System.out.println("Veuillez le prénom du patient :");
        String firstName = scanner.nextLine();

        stmt.executeUpdate(
                "INSERT INTO PATIENT "
                + "values(" + id + ", '" + name + "', '" + firstName + "')");
        
        stmt.close();

    }

    public static void employes(Connection conn) throws SQLException {
        // Get a statement from the connection
        Statement stmt = conn.createStatement();
        // Execute the query
        ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");

        while (rs.next()) {
            System.out.print("empno :" + rs.getInt(1) + " ");
            System.out.print("nom : " + rs.getString(2) + " ");
            System.out.println("nom : " + rs.getString(3));
        }
        // Close the result set, statement and the connection
        rs.close();
        stmt.close();
    }
}
