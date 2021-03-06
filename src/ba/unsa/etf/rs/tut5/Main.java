package ba.unsa.etf.rs.tut5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ba.unsa.etf.rs.tut5.KorisniciModel model = new ba.unsa.etf.rs.tut5.KorisniciModel();
        model.napuni();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(new ba.unsa.etf.rs.tut5.KorisnikController(model));
        Parent root = loader.load();

        primaryStage.setTitle("Korisnici");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /*
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Korisnici");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }*/

    public static void main(String[] args) {
        launch(args);
    }
}