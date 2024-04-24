package src.OOPS_10.encapsulation;

public class Lab148 {

    public static void main(String[] args) {

        vwologinFixed vwo = new vwologinFixed("admin", "admin");
        boolean check = vwo.isloggedin("admin", "password");
        System.out.println(check);
        vwo.getUsername();
        String u = vwo.getUsername();
        System.out.println(u);


    }


}

class  vwologinFixed
{


    private String username;
    private String password;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    vwologinFixed (String username, String password)
    {
        this.username = username;
        this.password=password;

    }

    boolean isloggedin(String username, String password)
    {
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged in");
            return true;
        }
        else
        {
            System.out.println(" not logged in");
            return false;
        }
    }
}
