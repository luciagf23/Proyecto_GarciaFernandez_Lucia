package com.luisdbb.tarea3AD2024base;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.luisdbb.tarea3AD2024base.config.AppJavaConfig;
import com.luisdbb.tarea3AD2024base.config.StageManager;
import com.luisdbb.tarea3AD2024base.view.FxmlView;

import javafx.application.Application;
import javafx.stage.Stage;

@SpringBootApplication
public class Tarea3Ad2024baseApplication extends Application {

    private ConfigurableApplicationContext springContext;
    private StageManager stageManager;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        springContext = new SpringApplicationBuilder(AppJavaConfig.class)
                .run(getParameters().getRaw().toArray(new String[0]));
    }

    @Override
    public void start(Stage stage) {
        ApplicationContext context = springContext;

        // Recuperamos el StageManager de Spring
        stageManager = context.getBean(StageManager.class);

        // Le pasamos el Stage real de JavaFX
        stageManager.setPrimaryStage(stage);

        // Mostramos la vista inicial
        stageManager.showInitialView();
    }

    @Override
    public void stop() throws Exception {
        springContext.close();
    }

	protected void displayInitialScene() {
		stageManager.switchScene(FxmlView.LOGIN);
	}

	/*
	 * protected void displayInitialScene() {
	 * 
	 * stageManager.switchScene(FxmlView.LOGIN); // Pantalla de login inicial
	 * 
	 * 
	 * 
	 * new Thread(() -> { try { Thread.sleep(3000); } catch (InterruptedException
	 * ignored) {}
	 * 
	 * javafx.application.Platform.runLater(() ->
	 * stageManager.switchScene(FxmlView.INICIO) ); }).start();
	 * 
	 * }
	 */
}
