package advanced;

public class TryFinallyTest {

    private static int doA() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            return 0;
        } finally {
            return 1;
        }
    }

    private static int doB() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw e;
        } finally {
            return 1;
        }
    }

    private static void doC() throws Exception {
        int i = 0;

        do {
            i++;
            try {
                if (i == 5) {
                    throw new Exception();
                }
            } finally {
                //continue;
                System.out.println(i);
            }
        } while (i < 10);
        System.out.println(i);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(doA());
        System.out.println(doB());
        doC();
    }

}
