package com.example.sepuebung04;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    public PieChart pieChart;
    @FXML
    public AreaChart<Number, Number> areaChart;
    @FXML
    private TextField textField;

    public void clear(ActionEvent event) {
        textField.setText("");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        final Random random = new Random();
        pieChart.setData(FXCollections.observableArrayList(
                new PieChart.Data("Data #1", random.nextInt(100)),
                new PieChart.Data("Data #2", random.nextInt(100))));
        final XYChart.Series<Number, Number> firstSeries = new XYChart.Series<>();
        firstSeries.setName("Aktienkurs");
        firstSeries.getData().add(new XYChart.Data<>(0, 13));
        firstSeries.getData().add(new XYChart.Data<>(1, 10));
        firstSeries.getData().add(new XYChart.Data<>(2, 12));
        firstSeries.getData().add(new XYChart.Data<>(3, 5));
        firstSeries.getData().add(new XYChart.Data<>(4, 4));
        firstSeries.getData().add(new XYChart.Data<>(5, 7));
        areaChart.getData().add(firstSeries);
    }
}
