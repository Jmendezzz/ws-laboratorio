package com.example.laboratoriofinal.Services;

import javafx.event.ActionEvent;

import java.io.IOException;

public interface SceneService {
    void switchToMainMenu(ActionEvent e)  throws IOException;
    void switchToStudentsScene(ActionEvent e) throws IOException;
    void switchToMonitorsScene(ActionEvent e) throws IOException;
    void switchToPrestamosScene(ActionEvent e) throws IOException;
    void switchToInventarioScene(ActionEvent e) throws IOException;
}
