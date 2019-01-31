package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void csvToString() throws Exception {
        BufferedReader rd = new BufferedReader( new FileReader("C:/Users/user/Documents/running-example.csv"));
        String line = null;
        ArrayList lista = new ArrayList();
        String[] linea;
        while ((line = rd.readLine()) != null) {
            line = rd.readLine();
            System.out.println(line);
            linea = line.split(";");
            lista.add(linea[3]);
        }
    }
}
