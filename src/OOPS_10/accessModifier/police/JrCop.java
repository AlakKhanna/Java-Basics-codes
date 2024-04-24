package src.OOPS_10.accessModifier.police;

public class JrCop {
    public static void main(String[] args) {

        cop c = new cop(10);
        System.out.println(c.gun);
        c.canIShoot();

    }
}
