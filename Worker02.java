    package assignment02;

    public class Worker02 {
        public int[] copy(int []x){
            int b[]=new int [x.length];
            for(int i=0;i<x.length;i++){
                b[i]=x[i];
            }
            return b;
        }
        public int[] join(int []x, int []y){
            int b[]=new int [x.length+y.length];
            for(int i=0;i<x.length;i++){
                b[i]=x[i];
            }
            for(int i=x.length;i<b.length;i++){
                b[i]=y[i-x.length];
            }
            return b;
        }
        public int[] copyRef(int []x){
            int d[]=x;
            return d;
        }
        public int add(int x, int y){
            int b=x+y;
            return b;
        }
    }
