package com.odontologia.ProyectoIntegrador.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Connection {

    //sacamos el runscript de aca porque estariamos llamando a la connection en todos los metodos.
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/proyectoIntegrador", "sa", "sa");
    }


}
