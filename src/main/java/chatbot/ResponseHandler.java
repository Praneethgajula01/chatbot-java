package chatbot;

public class ResponseHandler {

    public String getResponse(String input) {
        input = input.toLowerCase().trim();

        // Greeting
        if (input.matches(".*\\b(hi|hello|hey)\\b.*")) {
            return "Hello! How can I help you today?";
        }
        // Asking name
        else if (input.contains("your name")) {
            return "I’m a simple Java ChatBot 🤖.";
        }
        // Asking about weather
        else if (input.contains("weather")) {
            return "I can't check the weather yet, but it's always sunny in Java land ☀️";
        }
        // Default response
        else {
            return "Hmm, I don’t understand that. Can you try rephrasing?";
        }
    }
}


