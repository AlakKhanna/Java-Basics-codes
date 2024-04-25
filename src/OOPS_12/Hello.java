package src.OOPS_12;

public class Hello {

    public static void main(String[] args) throws Exception {
        h H = new h();
        H.process();

    }
}


class h {
    public int process() throws Exception
    {
        int a =10/0;
        throw new NullPointerException();
    }
}