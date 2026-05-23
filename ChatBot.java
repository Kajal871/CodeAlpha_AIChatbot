// ChatBot.java
// This class runs the actual conversation
// It keeps the chat going until the user says bye
// Think of it as the face of our chatbot
// Author: Kajal Kurmi

import java.util.Scanner;

public class ChatBot {

    // This is the name of our chatbot
    private String botName = "Buddy";

    // We need the response engine to get replies
    private ResponseEngine engine = new ResponseEngine();

    // Scanner to read whatever the user types
    private Scanner scanner = new Scanner(System.in);

    // This method starts the chat
    // It keeps running until the user says bye or goodbye
    public void startChat() {

        // Welcome message when chat starts
        System.out.println("+------------------------------------+");
        System.out.println("|        Welcome to Buddy AI        |");
        System.out.println("|     Your Personal AI Assistant    |");
        System.out.println("+------------------------------------+");
        System.out.println(botName + ": Hello! I am Buddy. Type anything to start chatting!");
        System.out.println(botName + ": Type 'bye' anytime to exit the chat.");
        System.out.println("------------------------------------");

        // Keep the chat going in a loop
        boolean chatting = true;

        while (chatting) {

            // Show "You:" so user knows it's their turn to type
            System.out.print("You: ");
            String userMessage = scanner.nextLine();

            // If user typed nothing, ask them to type something
            if (userMessage.trim().isEmpty()) {
                System.out.println(botName + ": Please type something! I am listening 😊");
                continue;
            }

            // Get the response from our response engine
            String response = engine.getResponse(userMessage);

            // Print the chatbot response
            System.out.println(botName + ": " + response);

            // If user said bye, stop the chat
            if (userMessage.toLowerCase().contains("bye") ||
                userMessage.toLowerCase().contains("goodbye")) {
                chatting = false;
            }

            System.out.println();
        }

        scanner.close();
    }
}