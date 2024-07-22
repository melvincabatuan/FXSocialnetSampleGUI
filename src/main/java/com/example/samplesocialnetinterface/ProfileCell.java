package com.example.samplesocialnetinterface;


import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ProfileCell extends ListCell<Profile> {

    final double MAX_FONT_SIZE = 16.0;
    private final HBox cell;
    private final Label nameLabel;

    private ImageView imageView;

    public ProfileCell(){
        cell = new HBox();
        cell.setSpacing(20.0);
        cell.alignmentProperty().setValue(Pos.CENTER_LEFT);
        nameLabel = new Label();
        Image picture = new Image("file:src/main/resources/images/unknown.jpg");
        imageView = new ImageView(picture);
        imageView.setFitHeight(40);
        imageView.setFitWidth(40);
        cell.getChildren().add(imageView);
        nameLabel.setFont(Font.font("Palatino Linotype", FontWeight.NORMAL, MAX_FONT_SIZE));
        cell.getChildren().add(nameLabel);
    }
    @Override
    protected void updateItem(Profile profile, boolean empty) {
        super.updateItem(profile, empty);
        if (empty || profile == null) {
            setText(null);
            setGraphic(null);
        } else {
            setGraphic(cell);
            nameLabel.setText(profile.getName());
            String filePath = "file:src/main/resources/" + profile.getImagePath();
            imageView.setImage(new Image(filePath));
//            System.out.println(filePath);
        }
    }
}