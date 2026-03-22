public class MovieContent extends Content {
    String director;
    int releaseYear;

    public MovieContent(String t, int d, String dir, int rel) {
        super(t, d);
        director = dir;
        releaseYear = rel;
    }

    public void display_info() {
        System.out.println("Title of the Movie: " + title);
        System.out.println("Duration of the Movie: " + duration);
        System.out.println("Director of the Movie: " + director);
        System.out.println("Release Year of the Movie: " + releaseYear);
    }
}