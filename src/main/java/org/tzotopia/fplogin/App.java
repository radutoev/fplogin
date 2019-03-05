package org.tzotopia.fplogin;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.util.Objects;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
//        Try.of(() -> bootstrap(args))
//            .andThen(() -> launch(args))
//            .onFailure(t -> {
//                System.exit(1);
//            });
    }

    public void init(){
    }

    @Override
    public void start(Stage stage) throws Exception {
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
