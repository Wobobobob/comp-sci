public class ScopeDemo {
    private String world = "world";
    public static void main(String[] args) {
        
    }

    public String method2() {
        String hello = "hello";
        String goodbye = "";
        if (true){
            goodbye = "Goodbye";
        }
        System.out.println(goodbye);
        return hello;
    }
    public String method1(){
        return hello+ world;
    }
}
