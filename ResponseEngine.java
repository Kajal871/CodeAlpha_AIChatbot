// ResponseEngine.java
// This is the brain of our chatbot
// It looks of it like a smart matchmaker between questions and answers
// Author : Kajal Kurmi

public class ResponseEngine {

    // This method receives whatever the user typed
    // and returns the most suitable response
    public String getResponse(String userInput) {

        // We convert everything to lowercase first
        // so it doesn't matter if user types HELLO or hello or Hello
        // they all get treated the same way
        String input = userInput.toLowerCase().trim();

        // If the user is just saying hi or greeting us
        if (input.contains("hello") || input.contains("hi") ||
            input.contains("hey")) {
            return "Hello there! Great to see you. How can I help? 😊";
        }

        // If the user wants to know how we are doing
        if (input.contains("how are you") || input.contains("how r u") ||
            input.contains("how do you do")) {
            return "I am doing really well, thanks for asking! What about you?";
        }

        // If the user is curious about who or what we are
        if (input.contains("your name") || input.contains("who are you") ||
            input.contains("what are you")) {
            return "I am Buddy! Your personal AI assistanat!";
        }

        // If someone asks how old we are
        if (input.contains("your age") || input.contains("how old")) {
            return "Age is just a number for me! I was built to help you anytime.";
        }

        // If the user needs some help or support
        if (input.contains("help") || input.contains("assist") ||
            input.contains("support")) {
            return "Of course! I am right here. Just tell me what you need!";
        }

        // If someone asks about time
        if (input.contains("time") || input.contains("what time")) {
            return "I do not have a clock built in, but your phone or laptop can tell you!";
        }

        // If someone asks about weather
        if (input.contains("weather") || input.contains("temperature") ||
            input.contains("climate")) {
            return "I cannot check live weather right now, but Google has you covered!";
        }

        // If someone wants to talk about programming or Java
        if (input.contains("java") || input.contains("programming") ||
            input.contains("code") || input.contains("coding")) {
            return "Oh I love Java! It is the language I was built with. What do you want to know?";
        }

        // If someone wants a joke to lighten the mood
        if (input.contains("joke") || input.contains("funny") ||
            input.contains("laugh")) {
            return "Why do Java developers wear glasses? Because they don't C#! 😄";
        }

        // If the user is being thankful
        if (input.contains("thank") || input.contains("thanks") ||
            input.contains("thank you")) {
            return "Aww, you are so welcome! That is what I am here for 😊";
        }

        // Morning greeting
        if (input.contains("good morning")) {
            return "Good Morning! Start your day with a smile. You have got this! ☀️";
        }

        // Night greeting
        if (input.contains("good night") || input.contains("goodnight")) {
            return "Good Night! Rest well and come back tomorrow! 🌙";
        }

        // If the user is leaving
        if (input.contains("bye") || input.contains("goodbye") ||
            input.contains("see you")) {
            return "Goodbye! It was great chatting with you. Take care! 👋";
        }

        // If the user seems sad or down
        if (input.contains("sad") || input.contains("upset") ||
            input.contains("depressed") || input.contains("unhappy")) {
            return "I am sorry you feel that way. Things will get better, I promise!";
        }

        // If the user is feeling good
        if (input.contains("happy") || input.contains("excited") ||
            input.contains("great") || input.contains("wonderful")) {
            return "That is so awesome to hear! Keep that energy going! 😊";
        }

        // If someone is talking about food
        if (input.contains("food") || input.contains("hungry") ||
            input.contains("eat")) {
            return "I wish I could eat with you! Go grab something tasty 😄";
        }

        // If someone expresses love or affection
        if (input.contains("love") || input.contains("like you") ||
            input.contains("i love you")) {
            return "That is really sweet! I enjoy our conversations too 😊";
        }

        // If nothing matched, we give a polite default reply
        // This means the chatbot did not understand the question
        return "Hmm, I did not quite get that. Could you try asking in a different way?";
    }
}