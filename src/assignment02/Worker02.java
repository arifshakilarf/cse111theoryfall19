public class Worker02 {
       int a[]= new int[9];
       public int[] copy(int x[]){
           for( int i=0;i<x.length;i++){
               a[i]=x[i];
           }
           return a;
       }
       public int[] join(int x[],int y[]){
           int z[]= new int[x.length+y.length];
           int j=0;
           for(int i=0;i<x.length+y.length;i++){
               if(i<x.length){
               z[i]=x[i];
               }
               else{
                   z[i]=y[j++];
               }
           }
           return z;
       }
       public int[] copyRef(int x[]) {
           int d[]=new int[x.length];
           d=x;
           return d;
       }
       public int add(int x, int y){
           int result=x+y;
           return result;

       }
    }



