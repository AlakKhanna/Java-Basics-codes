package src.OOPS_10.encapsulation;

public class BadExample {

    public static void main(String[] args) {

        vwologin vwo = new vwologin("admin", "admin");
        vwo.userName= "test";
        System.out.println(vwologin.getPassword());
        boolean check = vwo.isloggedin("admin", "admin");
        System.out.println(check);


    }
}

class vwologin {

    public String userName;
    private static String password;

    public static String getPassword() {
        return password;
    }

    public vwologin(String userName, String password) {
        this.userName = userName;
        this.password= password;
    }

    boolean isloggedin (String userName, String password)
    {
        if (this.userName.toLowerCase().equals(userName) && this.password.toLowerCase().equals(password))
        {
            System.out.println(" Logged in");
            return true;
        }
        else
        {
            System.out.println(" Not logged in");
            return false;
        }
    }


}
