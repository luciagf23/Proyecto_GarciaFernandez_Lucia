package com.luisdbb.tarea3AD2024base;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.luisdbb.tarea3AD2024base.config.AppJavaConfig;
import com.luisdbb.tarea3AD2024base.config.StageManager;
import com.luisdbb.tarea3AD2024base.view.FxmlView;

import javafx.application.Application;
import javafx.stage.Stage;

public class Tarea3Ad2024baseApplication extends Application {

    private ConfigurableApplicationContext springContext;
    private StageManager stageManager;

    public static void main(String[] args) { 
    	launch(args); // JavaFX arranca aquí 
    	}
    
    @Override
    public void init() throws Exception {
        // Inicializa Spring antes de arrancar JavaFX
        springContext = new SpringApplicationBuilder(AppJavaConfig.class)
                .run(getParameters().getRaw().toArray(new String[0]));
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Obtiene StageManager como bean de Spring
        stageManager = springContext.getBean(StageManager.class, primaryStage);
        displayInitialScene();
    }

    @Override
    public void stop() throws Exception {
        springContext.close();
    }

    protected void displayInitialScene() {

        stageManager.switchScene(FxmlView.LOGIN); // Pantalla de login inicial
    
    

        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ignored) {}

            javafx.application.Platform.runLater(() ->
                stageManager.switchScene(FxmlView.INICIO)
            );
        }).start();

    }
}
