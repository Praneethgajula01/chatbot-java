
---

## 📝 **Code Skeleton**

### `ChatBot.java`
```java
package chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResponseHandler handler = new ResponseHandler();

        System.out.println("🤖 ChatBot: Hello! Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("🤖 ChatBot: Goodbye!");
                break;
            }

            String response = handler.getResponse(input);
            System.out.println("🤖 ChatBot: " + response);
        }

        sc.close();
    }
}
