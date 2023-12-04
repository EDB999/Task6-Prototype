package com.example.task6_prototype;

import Forms.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Task6Controller implements Initializable {
    public BorderPane borderPane;
    public Canvas canv;
    public Button clearCanvasButton;
    public ListView<Shape> listView;

    public ObservableList<Shape> content;

    private void drawShapeHandler(MouseEvent event) {
        if(listView.getSelectionModel().getSelectedIndex() == -1) {
            displayWarningMessage("Choose shape from list");
            return;
        }
        GraphicsContext gr = canv.getGraphicsContext2D();
        int a = listView.getSelectionModel().getSelectedIndex();
        Shape newShape = (Shape) content.get(a).clone();
        newShape.draw(gr, event.getX(), event.getY());
    }

    private void clearCanvas(MouseEvent event) {
        GraphicsContext gr = canv.getGraphicsContext2D();
        gr.clearRect(0, 0, borderPane.getPrefWidth(), borderPane.getPrefHeight());
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        content = FXCollections.observableArrayList(new Rectangle(), new Square(), new Circle(), new Triangle());
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listView.setItems(content);

        this.canv.setOnMouseClicked(this::drawShapeHandler);
        this.clearCanvasButton.setOnMouseClicked(this::clearCanvas);

    }

    private void displayWarningMessage(String txt) {
        var alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Message");
        alert.setHeaderText("Warning");
        alert.setContentText(txt);
        alert.showAndWait();
    }

}