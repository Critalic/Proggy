public class Task1 {
    public static void main(String[] args) { 
        double [] array = new double[15];
        for( int i =0; i<array.length; i++) {
            array[i]  = i+1;
            System.out.println(array[i]);
            
            Calc(array[i]);
        }
    }
        
        
        
    public static void Calc(double n) {
        int a;
        double b;
        int lim = (int) Math.pow(10.0, 9.0);
        for (a = 1; a < lim; a++) {
            if (Math.pow(1 / n - 1 / a, -1.0) == (int) Math.pow(1 / n - 1 / a, -1.0)) {
                b = Math.pow(1 / n - 1 / a, -1.0);
                System.out.println("    True");
                break;
            }
            else {
                System.out.println("    False");
                break;
            }

        }

    }

}