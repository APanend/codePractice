package ClassLoader;

public class Account {
    public void operation() {
        System.out.println("operation...11");
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
