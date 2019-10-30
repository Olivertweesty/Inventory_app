import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }



    public void start(Stage primaryStage) {
        primaryStage.setTitle("ZakiHila");

        WebView webView = new WebView();

        webView.getEngine().load("http://178.128.78.89:4000");

        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 1080, 720);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
