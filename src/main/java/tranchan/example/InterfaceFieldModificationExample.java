package tranchan.example;

interface Constants {
    int MAX_USERS = 100;
}

public class InterfaceFieldModificationExample {
    public static void main(String[] args) {
        Constants.MAX_USERS = 200; //
        System.out.println("MAX_USERS: " + Constants.MAX_USERS);
    }
}
