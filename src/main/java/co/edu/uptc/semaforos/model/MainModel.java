package co.edu.uptc.semaforos.model;

import co.edu.uptc.semaforos.controllers.MainController;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class MainModel {

    private MainController mainController;

    public void init(){
        new Thread(() -> {
            while (true){ //todo: loop infinito
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                mainController.setColor();
            }
        }).start();
    }

}
