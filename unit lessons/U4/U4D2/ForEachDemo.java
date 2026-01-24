public class ForEachDemo {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};

        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

        for (int num: x){
            System.out.println(num);
        }

        String[] names = {"bum", "levi", "ava", "boyan"};
        // for each loops cannot modify immutable data types ie string or primitive
        for(String name : names){
            name = "hello " + name;
        }

        for(String name: names){
            System.out.println(name);
        }
    }
}