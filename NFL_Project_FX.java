/*
 * Program: NFL Draft
 * File: NFL_Project_FX
 * Summary: the javafx for my application.
 * Author: Nicholas Thomas
 * Date: January 14, 2017
 * This is my own work
 */

package NFL_Final_Project;

import java.util.Collection;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class NFL_Project_FX extends Application {

    @SuppressWarnings("unchecked")
	@Override
    public void start(Stage primaryStage) {

        //instantiate Manager createPlayers method
        Player_Manager manager = new Player_Manager();
        manager.createPlayers(20);

        //create listView nodes
        @SuppressWarnings("rawtypes")
		ListView<String> draftedPlayers = new ListView();
        ListView<String> statsListView = new ListView();
        ListView<String> availablePlayers = new ListView();
        
        //populate availablePlayers with player names and positions only
        for (String playerName : manager.playerNames) {
            availablePlayers.getItems().add(playerName);
        }

        //create button nodes and actions
        Button stats = new Button();
        stats.setText("VIEW STATS");
        stats.setOnAction(e -> {
            if (!statsListView.getItems().isEmpty()) {
                statsListView.getItems().remove(0);
            }
            statsListView.getItems().add(((List<String>) manager.availablePlayers).get(indexToInt(index1)).toString());
        });

        Button draft = new Button();
        draft.setText("DRAFT");
        draft.setOnAction(e -> {
            if (!statsListView.getItems().isEmpty()) {
                statsListView.getItems().remove(0);
            }
            draftedPlayers.getItems().add(availablePlayers.getSelectionModel().getSelectedItem());
            availablePlayers.getItems().remove(availablePlayers.getSelectionModel().getSelectedItem());
            ((Collection<Node>) manager.availablePlayers).remove(availablePlayers.getSelectionModel().getSelectedIndex());
        });

        Button quit = new Button();
        quit.setText("QUIT");
        quit.setOnAction(e -> primaryStage.close());

        //create labels
        Label statsLabel = new Label("Player Stats");
        statsLabel.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));

        Label drafted = new Label("Drafted Players");
        drafted.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));
        
        Label available = new Label("Available Players");
        available.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));

        //root BorderPane
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10, 10, 10, 10));

        //Vbox for left
        VBox left = new VBox(20);        
        left.getChildren().addAll(available, availablePlayers);

        //BorderPane for center
        BorderPane center = new BorderPane();

        //stats
        VBox centerLeft = new VBox(20);
        centerLeft.getChildren().addAll(statsLabel, statsListView);

       // buttons
        VBox centerButtons = new VBox(40);
        centerButtons.setAlignment(Pos.CENTER);
        center.setPadding(new Insets(40));
        center.setCenter(centerButtons);

        center.setPadding(new Insets(20, 20, 20, 20));
        center.setLeft(centerLeft);
//        center.setRight(centerRight);

        //VBox for right of BorderPane
        VBox right = new VBox(20);
        right.getChildren().addAll(drafted, draftedPlayers);

        //HBox for NFL draft image
        HBox top = new HBox();
        Image NFLImage = new Image("image/nfl draft.png");
        ImageView NFLImageView = new ImageView(NFLImage);
        top.setAlignment(Pos.CENTER);
        top.getChildren().add(NFLImageView);

        //sets layouts on the root pane
        root.setLeft(left);
        root.setTop(top);
        root.setCenter(center);
        root.setRight(right);

        //creates the scene
        Scene scene = new Scene(root);

        //displays primaryStage maximized to the user
        primaryStage.setMaximized(true);
        primaryStage.setTitle("NFL Draft 2018");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

	public static void main(String[] args) {
        launch(args);
    }
}