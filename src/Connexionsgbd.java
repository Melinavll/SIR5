/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author sabahbulant
 */
public class Connexionsgbd {

    private static final String configurationFile = "BD.properties.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String jdbcDriver, dbUrl, username, password;

            DatabaseAccessProperties dap = new DatabaseAccessProperties(configurationFile);
            jdbcDriver = dap.getJdbcDriver();
            dbUrl = dap.getDatabaseUrl();
            username = dap.getUsername();
            password = dap.getPassword();

            //Load the database driver
            Class.forName(jdbcDriver);

            //Get a connection to the database
            Connection conn = DriverManager.getConnection(dbUrl, username, password);

            requetesbd.nbemp(conn);
            requetesbd.patient(conn);

            //Print information about connection warnings
            SQLWarningsExceptions.printWarnings(conn);

            conn.close();

        } catch (SQLException se) {

            //Print information about SQL exceptions
            SQLWarningsExceptions.printExceptions(se);

            return;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
            return;
        }

    }

}
