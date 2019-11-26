package assignment05;

public class MyString {
    char[] c;

    public MyString(String s) {
        c = s.toCharArray();
    }

    public int length(){
        return c.length;
    }

    public char charAt(int x) {
        return c[x];
    }

    public char startsWith() {
        return c[0];
    }

    public char endsWith() {
        return c[c.length - 1];
    }

    public char[] replaceFirst(char x, char y) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == x) {
                c[i] = y;
                break;
            }
        }
        return c;
    }

    public char[] replaceAll(char x, char y) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == x) {
                c[i] = y;
            }
        }
        return c;
    }

    public char[] replaceLast(char x, char y) {
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] == x) {
                c[i] = y;
                break;
            }
        }
        return c;
    }

    public char[] toLowerCase() {
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 91 && c[i] > 64) {
                c[i] = (char) (c[i] + 32);
            }
        }
        return c;
    }

    public char[] toUpperCase() {
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 123 && c[i] > 96) {
                c[i] = (char) (c[i] - 32);
            }
        }
        return c;
    }


    public boolean equals(String s) {
        boolean b=true;
        char d[]=s.toCharArray();
        for(int i=0; i<c.length;i++) {
            if (c[i] == d[i]) {
                b=true;
            }
            else {
                b=false;
                break;
            }
        }
        return b;
    }

    public boolean contains(String s){
        boolean b=true;
        char d[]=s.toCharArray();
        int count=0;
        int k=0;
        for(int i=0; i<d.length;i++){
            for(int j=k+1;j<c.length;j++){
                if(d[i]==c[j]){
                    count++;
                    k=j;
                    j=c.length;
                }
                else if(j!=k && count>0){
                        count=0;
                        i=-1;
                        break;
                }
            }
        }
        if(count==0){
            b=false;
        }
        else if(count==d.length){
            b=true;
        }
        return b;
    }

    public char[] trim(){
        int count=0;
        int arrayCount=0;
        String s=" ";
        int spaceCount=0;
        char space[]=s.toCharArray();
        char d[]=new char[c.length];
        for(int i=0; ; ){
            for(int j=0;j<c.length;j++){
                if(c[j]==space[0]) {
                    spaceCount++;
                }
                else{
                    if(count>0 && c[j-spaceCount]==space[0]){
                        for(int k=spaceCount;k>0;k--) {
                            d[i]=space[0];
                            i++;
                            arrayCount++;
                        }
                    }
                    spaceCount=0;
                    d[i]=c[j];
                    count++;
                    i++;
                    arrayCount++;
                }
            }
            break;
        }
        char []finalArray=new char[arrayCount];
        for(int i=0;i<arrayCount;i++){
            finalArray[i]=d[i];
        }
        return finalArray;
    }

    public boolean equalsIgnoreCase(String s) {
        boolean b=true;
        char d[]=s.toCharArray();
        for(int i=0; i<c.length;i++) {
            if (c[i] == d[i] || c[i]+32==d[i] || c[i]-32==d[i]) {
                b=true;
            }
            else {
                b=false;
                break;
            }
        }
        return b;
    }

    public int compareTo(String s){
        int x=0;
        char d[]=s.toCharArray();
        if(c.length==d.length){
            for(int i=0;i<c.length;i++) {
                if (c[i]!=d[i]){
                    x=c[i]-d[i];
                    break;
                }
            }
        }
        else{
            x=c.length-d.length;
        }
        return x;
    }

    public int compareToIgnoreCase(String s){
        int x=0;
        char d[]=s.toCharArray();
        if(c.length==d.length){
            for(int i=0;i<c.length;i++) {
                if (c[i]==d[i] || c[i]+32==d[i] || c[i]-32==d[i]){
                }
                else{
                    x=c[i]-d[i];
                    break;
                }
            }
        }
        else{
            x=c.length-d.length;
        }
        return x;
    }

    public char[] substring(int x){
        char d[]=new char[c.length-x];
        for(int i=0;i<d.length; ){
            for(int j=x;j<c.length;j++) {
                d[i]=c[j];
                i++;
            }
        }
        return d;
    }

    public char[] substring(int x, int y){
        char d[]=new char[y-x];
        for(int i=0;i<d.length; ){
            for(int j=x;j<y;j++) {
                d[i]=c[j];
                i++;
            }
        }
        return d;
    }

    public int indexOf(char x){
        int p=-1;
        int k=0;
        for(int i=0;i<c.length;i++){
            p++;
            if(c[i]==x){
                k=0;
                break;
            }
            else{
                k=-1;
            }
        }
        if(k==-1 && p==c.length-1){
            p=-1;
        }
        return p;
    }

    public int lastIndexOf(char x){
        int p=-1;
        int k=0;
        for(int i=0;i<c.length;i++){
            p++;
            if(c[i]==x){
                k=0;
                break;
            }
            else{
                k=-1;
            }
        }
        if(k==-1 && p==c.length-1) {
            p = 0;
        }
        return p-1;
    }

    public int indexOf(char x, int y){
        int p=y;
        int k=0;
        for(int i=y+1;i<c.length;i++){
            p++;
            if(c[i]==x){
                k=0;
                break;
            }
            else{
                k=-1;
            }
        }
        if((k==-1 && p==c.length-1) || (p==c.length-1 && k==0)){
            p=-1;
        }
        return p;
    }

    public int lastIndexOf(char x, int y){
        int p=y;
        int k=0;
        for(int i=y+1;i<c.length;i++){
            p++;
            if(c[i]==x){
                k=0;
                break;
            }
            else{
                k=-1;
            }
        }
        if((k==-1 && p==c.length-1) || (p==c.length-1 && k==0)){
            p = 0;
        }
        return p-1;
    }

    public char[] concat(String s){
        char d[]=s.toCharArray();
        char combine[]=new char[c.length+d.length];
        for(int i=0;i<c.length;i++){
            combine[i]=c[i];
        }
        for(int i=c.length;i<c.length+d.length;i++){
            combine[i]=d[i-c.length];
        }
        return combine;
    }

    public boolean isEmpty(){
        boolean b=false;
        if(c.length==0) {
            b = true;
        }
        return b;
    }

    public String toString(){
        return new  String(c);
    }
}





