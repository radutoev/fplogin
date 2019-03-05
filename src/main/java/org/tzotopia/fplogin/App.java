package org.tzotopia.fplogin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.util.Objects;

@Log4j2
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        log.info("Starting application");

        final Scene scene = new Scene(loadByName("/view/login.fxml"));

        stage.setScene(scene);
        stage.initStyle(StageStyle.DECORATED);
        stage.setResizable(false);
        stage.show();
    }

    private static Pane loadByName(final String view) {
        try {
            return FXMLLoader.load(Objects.requireNonNull(App.class.getResource(view)));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
