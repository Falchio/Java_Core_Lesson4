package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Controller {
    @FXML
    public TextField inputLineUserMessage;
    @FXML
    public Button userMessageSendButton;
    @FXML
    public TextArea chatTextArea;


    public void userInputPressed(ActionEvent actionEvent) {
        sendUserMessage();

    }

    @FXML
    private void enterPressed(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER) {
            sendUserMessage();
        }
    }


    public void sendUserMessage() {
        String userMessage = "";

        if (!inputLineUserMessage.getText().isEmpty()) {
            userMessage = inputLineUserMessage.getText();
            inputLineUserMessage.setText("");

            if (chatTextArea.getText().isEmpty()) {
                chatTextArea.setText(userMessage);
            } else {
                chatTextArea.setText(chatTextArea.getText() + "\n" + userMessage);
            }
        }
    }

}
