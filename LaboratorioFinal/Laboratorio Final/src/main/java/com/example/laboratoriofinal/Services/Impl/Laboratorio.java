package com.example.laboratoriofinal.Services.Impl;

import com.example.laboratoriofinal.SceneController;
import com.example.laboratoriofinal.Services.MonitorService;
import com.example.laboratoriofinal.Services.SceneService;
import javafx.scene.Scene;

import java.util.PrimitiveIterator;

public class Laboratorio {
    private final MonitorService monitorService;
    private final SceneService sceneService;

    public Laboratorio() {
        monitorService = new MonitorImpl();
        sceneService = new SceneController();

    }
    public MonitorService getMonitorService(){return monitorService;}
    public SceneService getSceneService() {return sceneService;}
}
