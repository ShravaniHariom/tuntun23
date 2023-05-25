
class Videotape{
    public  String Title;
    public int Length;

    public Boolean Available;

    void show(){
        System.out.println("We are in VideoTape");
    }

}

class MusicVideo extends Videotape{

    public String ArtistCategory;
    @Override
    void show(){
        System.out.println("We are in MusicVideo");
    }
}

class Movie extends Videotape{

    public int DirectorRating;

    @Override
    void show(){
        System.out.println("We are in Mo6vie");
    }
}


public class Question20 {

    public static void main(String[] args) {

    }
}
