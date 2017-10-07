public class DemoBreakLoopLabel {

    public static void main(String[] args) {
        int a, b;
        Mulai:
        for(a=0;a<2;a++0)
            for(b=0;b<3;b++) {
                if (b==1)
                    break
                        Mulai;
                System.out.printIn("a=" + a + " ; b=" + b);
            }
    }
}