package src.OOPS_10.Abstraction.Interfaces.AskInterviewQuestions;

public class II1 {
    public static void main(String[] args) {
        hello h = new hello();
        h.say();
        h.hello();
    }
}

interface II{
    void say();

    default  void hello()
    {
        System.out.println(" Hello Default");
    }

}

interface o {}

class hello implements II{

    @Override
    public void say() {
        System.out.println(" say");
    }

    @Override
    public void hello() {
        System.out.println(" hello of hello");
    }
}

