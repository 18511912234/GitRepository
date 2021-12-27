package com.jdbc.connection;

import jdk.nashorn.api.scripting.ScriptObjectMirror;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

class ConnectionTest {
    @Test
    public void testConnection3() throws Exception {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://39.96.38.119:3306/test", "root", "123456");
        System.out.println(connection);

    }
}