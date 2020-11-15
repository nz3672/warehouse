package sample;

import Connection.ConnectionHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {
    @FXML
    public TextField username, password;
    public Label textTest;

    public void btnhandler(ActionEvent actionEvent) throws SQLException {
        ConnectionHandler connectionHandler = new ConnectionHandler();
        Connection connection = connectionHandler.getConnection();

        String sql = "INSERT INTO employee (Em_id, Em_name)" +
                "VALUES (1243, 'you suck') ";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
    }
}
