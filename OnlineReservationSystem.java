import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class OnlineReservationSystem extends Application {
    private Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Online Reservation System");

        // Show login form
        showLoginForm();
    }

    private void showLoginForm() {
        Label label = new Label("Login");
        TextField usernameInput = new TextField();
        usernameInput.setPromptText("Username");
        PasswordField passwordInput = new PasswordField();
        passwordInput.setPromptText("Password");
        Button loginButton = new Button("Login");
        Button cancelButton = new Button("Cancel Reservation");

        loginButton.setOnAction(e -> {
            // Here you would typically validate the login
            showReservationForm();
        });

        cancelButton.setOnAction(e -> {
            showCancellationForm();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, usernameInput, passwordInput, loginButton, cancelButton);
        layout.setPrefSize(300, 200);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    private void showReservationForm() {
        Label label = new Label("Reservation Form");
        TextField nameInput = new TextField();
        nameInput.setPromptText("Your Name");
        TextField trainNumberInput = new TextField();
        trainNumberInput.setPromptText("Train Number");
        TextField trainNameInput = new TextField();
        trainNameInput.setPromptText("Train Name");
        TextField classTypeInput = new TextField();
        classTypeInput.setPromptText("Class Type");
        DatePicker datePicker = new DatePicker();
        TextField fromInput = new TextField();
        fromInput.setPromptText("From");
        TextField toInput = new TextField();
        toInput.setPromptText("To");
        Button submitButton = new Button("Submit");
        Button backButton = new Button("Back to Login");

        submitButton.setOnAction(e -> {
            // Here you would typically handle the reservation logic
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Reservation Successful!");
            alert.showAndWait();
        });

        backButton.setOnAction(e -> showLoginForm());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, nameInput, trainNumberInput, trainNameInput, classTypeInput, datePicker, fromInput, toInput, submitButton, backButton);
        layout.setPrefSize(400, 400);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(layout);
        window.setScene(scene);
    }

    private void showCancellationForm() {
        Label label = new Label("Cancellation Form");
        TextField pnrInput = new TextField();
        pnrInput.setPromptText("PNR Number");
        Button cancelButton = new Button("Cancel Ticket");
        Button backButton = new Button("Back to Login");

        cancelButton.setOnAction(e -> {
            // Here you would typically handle the cancellation logic
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Cancellation Successful!");
            alert.showAndWait();
        });

        backButton.setOnAction(e -> showLoginForm());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, pnrInput, cancelButton, backButton);
        layout.setPrefSize(300, 200);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(layout);
        window.setScene(scene);
    }
}
