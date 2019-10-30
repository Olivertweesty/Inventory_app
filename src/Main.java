import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }



    public void start(Stage primaryStage) {
        primaryStage.setTitle("ZakiHila");
        primaryStage.getIcons().add(new Image("file:resources/logo1.png"));

        WebView webView = new WebView();
        webView.setMaxHeight(730);
        webView.setPrefHeight(730);

        webView.getEngine().load("http://178.128.78.89:4000");

        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 1080, 720);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
