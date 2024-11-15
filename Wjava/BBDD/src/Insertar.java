import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertar {
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://localhost:3306/bbdd";
        String user = "root";
        String pass = "";

        try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass);
             Scanner sc = new Scanner(System.in)) {

            String sql = "INSERT INTO COCHE (MARCA, MODELO, TIPO_MOTOR, KILOMETROS) VALUES (?, ?, ?, ?)";

            int opcion = 1;
            while (opcion != 2) {
                System.out.println("Introduzca la marca a introducir:");
                String marca = sc.nextLine();

                System.out.println("Introduzca el modelo a introducir:");
                String modelo = sc.nextLine();

                System.out.println("Introduzca el tipo de motor a introducir:");
                String motor = sc.nextLine();

                System.out.println("Introduzca los kilómetros a introducir");
                Integer kilometros = null;
                String kilometrosInput = sc.nextLine();

                if (!kilometrosInput.isEmpty()) {
                    try {
                        kilometros = Integer.parseInt(kilometrosInput);
                    } catch (NumberFormatException e) {
                        System.out.println("Número inválido para kilómetros, debe ser un número entero. Inténtelo de nuevo.");
                        continue;
                    }
                }

                
                if (modelo.isEmpty() || marca.isEmpty() || motor.isEmpty() || (kilometros != null && kilometros == 0)) {
                    System.out.println("No se pueden guardar datos vacíos.");
                    continue;
                }

                System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
                System.out.println(sql);

                try (PreparedStatement sentencia = con.prepareStatement(sql)) {
                    sentencia.setString(1, marca);
                    sentencia.setString(2, modelo);
                    sentencia.setString(3, motor);
                    if (kilometros != null) {
                        sentencia.setInt(4, kilometros);
                    }         

                    int afectados = sentencia.executeUpdate();
                    System.out.println("Sentencia SQL ejecutada con éxito.");
                    System.out.println("Registros afectados: " + afectados);
                }

                System.out.println("¿Quieres volver a introducir datos? 1. SI / 2. NO");
                opcion = sc.nextInt();
                sc.nextLine(); 
            }

        } catch (SQLException e) {
            System.out.println("Error al añadir un nuevo coche.");
            System.out.println(e.getMessage());
        }
    }
}
