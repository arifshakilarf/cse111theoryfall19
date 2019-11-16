package week07.thursday;

    public class Checker{
        private int m2(int[] ordered, int p2){
            this.p2 = p2 - ordered[0];
            this.p1 = p1 - 8 + p2;
            total = total - p1 + p2;
            ordered[0] = p2 - total;
            return ordered[0];
        }
        private int m2(int total, int element){
            int p1 = 9 + element;
            p2 = p2 - this.total;
            total = total + p1 + p2;
            System.out.println(p1+" "+p2+" "+total);
            return p2 - element;
        }
        public void m1(){
            int[] ordered2 = {2};
            p2 = p2 + m2(ordered2, ordered2[0]);
            p1 = m2(p1, ordered2[0]) + p2;
            total = p1 + p2 + ordered2[0];
            System.out.println(p1+" "+p2+" "+total);
        }
        private int total, p2, p1;

        public static void main(String[] args) {
            Checker c;
            c = new Checker();
            c.m1();
        }
    }
