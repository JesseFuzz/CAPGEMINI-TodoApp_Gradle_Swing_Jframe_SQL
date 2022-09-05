
package TodoApp;

import util.ConnectionFactory;

import java.sql.Connection;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        Connection c = ConnectionFactory.getConnection(); //assim que eu inicio a conexão

        ConnectionFactory.closeConnection(c); //assim eu fecho a conexão c aberta
    }
}
