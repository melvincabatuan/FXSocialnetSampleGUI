package com.example.samplesocialnetinterface;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {  // implement Initializable


    @FXML
    private TextField statusChangeLabel;

    @FXML
    private TextField pictureLabel;

    @FXML
    private TextField friendLabel;

    @FXML
    private TextField unfriendLabel;

    @FXML
    private TextField quoteLabel;

    @FXML
    private ImageView pictureView;

    @FXML
    private ListView<Profile> listView;

    @FXML
    private Label statusLabel;

    ObservableList<Profile> friendList;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.friendList = FXCollections.observableArrayList();
        Profile profile1 = new Profile("Jose Rizal");
        profile1.setImagePath("images/rizal.jpg");
        Profile profile2 = new Profile("Bill Gates");
        profile2.setImagePath("images/gates.jpg");
        this.friendList.addAll(profile1, profile2);
        listView.setItems(this.friendList);
        listView.setCellFactory(categoryList -> new ProfileCell());
    }

    public void handleStatus(ActionEvent actionEvent) {
    }

    public void handlePicture(ActionEvent actionEvent) {
    }

    public void handleAddFriend(ActionEvent actionEvent) {
    }

    public void handleUnfriend(ActionEvent actionEvent) {
    }

    public void handleQuote(ActionEvent actionEvent) {
    }

    public void handleExit(ActionEvent actionEvent) {
        Platform.exit();
    }


}