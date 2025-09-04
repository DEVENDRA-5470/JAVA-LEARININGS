// Base class
class User{
    void login(){
        System.out.println("User logged in");
    }

}

// Admin User
class AdminUser extends User{
    @Override
    void login(){
        System.out.println("Admin logged in with full access");
    }
}

// Guest User
class GuestUser extends User{
    @Override
    void login(){
        System.out.println("Guest logged in with limited access");

    }
}

public class Overriding {
    public static void main(String[] args){
        User u1 = new AdminUser();
        User u2 = new GuestUser();

        u1.login();
        u2.login();
    }
}

