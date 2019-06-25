package javafx;

import core.Item;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Map;
import java.util.Set;

public class Main extends Application {

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage)throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/main.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Test");
        primaryStage.setScene(new Scene(root,400,300));
        primaryStage.show();
        Map<String,Integer> stats= Map.of("Attack",100);
        Set<String> parts = Set.of("Head");
        Item sword1 = new Item("Sword", "Sword");
        Item sword2 = new Item("Sword", stats, "Sword");
        Item sword3 = new Item("Sword", parts, stats);
        sword1.print();
        sword2.print();
        sword3.print();
    }
}
