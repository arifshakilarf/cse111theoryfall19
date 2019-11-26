package assignment05;

public class Tester {
    public static void main(String [] args){
        MyString s1=new MyString("farhan hossen");
        System.out.println(s1.length());

        MyString s2=new MyString("farhan hossen");
        System.out.println(s2.charAt(3));

        MyString s3=new MyString("farhan hossen");
        System.out.println(s3.startsWith());

        MyString s4=new MyString("farhan hossen");
        System.out.println(s4.endsWith());

        MyString s5=new MyString("farhan hossen");
        System.out.println(s5.replaceFirst('h','m'));

        MyString s6=new MyString("farhan hossen");
        System.out.println(s6.replaceAll('h','m'));

        MyString s7=new MyString("farhan hossen");
        System.out.println(s7.replaceLast('h','m'));

        MyString s8=new MyString("FaRhAn hOsSeN");
        System.out.println(s8.toLowerCase());

        MyString s9=new MyString("fArHaN hOsSeN");
        System.out.println(s9.toUpperCase());

        MyString s10=new MyString("farhan hossen");
        System.out.println(s10.equals("fARhan hoSSen"));
        System.out.println(s10.equals("farhan hossen"));
        System.out.println(s10.equals("sajidul islam"));

        MyString s11=new MyString("farhan hossen");
        System.out.println(s11.contains("hoss"));
        System.out.println(s11.contains("host"));

        MyString s12=new MyString("      farhan  hossen  ");
        System.out.println(s12.trim());

        MyString s13=new MyString("farhan hossen");
        System.out.println(s13.equalsIgnoreCase("FaRhAn hOsSeN"));
        System.out.println(s13.equalsIgnoreCase("farhan hossen"));
        System.out.println(s13.equalsIgnoreCase("FARHAN HOSSEN"));
        System.out.println(s13.equalsIgnoreCase("sajidul islam"));

        MyString s14=new MyString("farhan");
        System.out.println(s14.compareTo("farhan"));
        System.out.println(s14.compareTo("FARHAN"));
        System.out.println(s14.compareTo("farabi"));
        System.out.println(s14.compareTo("sajidul"));
        System.out.println(s14.compareTo("dihan"));
        System.out.println(s14.compareTo("alvee"));

        MyString s15=new MyString("farhan");
        System.out.println(s15.compareToIgnoreCase("farhan"));
        System.out.println(s15.compareToIgnoreCase("FARHAN"));
        System.out.println(s15.compareToIgnoreCase("fArabi"));
        System.out.println(s15.compareToIgnoreCase("FaRabi"));
        System.out.println(s15.compareToIgnoreCase("farHAN"));
        System.out.println(s15.compareToIgnoreCase("FARhan"));

        MyString s16=new MyString("farhan hossen");
        System.out.println(s16.substring(8));

        MyString s17=new MyString("farhan hossen");
        System.out.println(s17.substring(4,9));

        MyString s18=new MyString("farhan hossen");
        System.out.println(s18.indexOf('h'));
        System.out.println(s18.indexOf('m'));

        MyString s19=new MyString("farhan hossen");
        System.out.println(s19.lastIndexOf('s'));
        System.out.println(s19.lastIndexOf('m'));

        MyString s20=new MyString("farhan hossen");
        System.out.println(s20.indexOf('h',4));
        System.out.println(s20.indexOf('n',12));

        MyString s21=new MyString("farhan hossen");
        System.out.println(s21.lastIndexOf('s',9));
        System.out.println(s21.lastIndexOf('m',5));

        MyString s22=new MyString("farhan");
        System.out.println(s22.concat(" hossen"));

        MyString s23=new MyString("farhan hossen");
        System.out.println(s23.isEmpty());

        MyString s23a=new MyString("");
        System.out.println(s23a.isEmpty());

        MyString s24=new MyString("farhan hossen");
        System.out.println(s24.toString());
    }
}
