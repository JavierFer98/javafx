package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;

public class Blur {
	@FXML
	private Pane pane;

	@FXML
	public void setfocus() {
		pane.setEffect(new GaussianBlur(0));
	}

	@FXML
	private void handleClose() {
		System.exit(0);
	}

	
	@FXML
	public void setblur() {
		pane.setEffect(new GaussianBlur(5));
	}

}
