package ex_12_Arrays;

public class Arrays_001_practise {
    public static void main(String[] args) {
        int a = 10;
        int[] array = { 10,30,50,40,20};
        System.out.println(array);
        boolean[] values = { true, false, true};

        String[] input = {"prmaod", "sahoo", "hainna"} ;
        System.out.println(input);

        float[] item = new float[3];
        item [0] = 3.09f;
        item [1] = 5.09f;
        item [2] = 9.02f;
        System.out.println(item[1]);

        for ( String name: input){
            System.out.println(name);
        }
    }
}
