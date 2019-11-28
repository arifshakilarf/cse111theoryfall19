package week11.thursday;

public class Driver {
    public static void main(String[] args){
        try {
            Node node = new Node("lol");
            isItAnime(node);
            System.out.println();
            System.out.println(Math.PI);
        }
        catch(Exception error) {
            System.out.println("Eita Anime na");
            System.out.println(error);
        }
    }
    public static boolean isItAnime(Node n) throws EitaAnimeNa {
        if(n.type.equals("Anime")) {
            return true;
        }
        else {
            throw new EitaAnimeNa();
        }
    }
}
