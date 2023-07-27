package OOP;

public class Movie {
    private double rating;
    private String genre;
    private String title;
    private int lengthInMinutes;
    private String imageUrl;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Movie(double rating, String genre, String title, int lengthInMinutes, String imageUrl){
        this.rating = rating;
        this.genre = genre;
        this.title = title;
        this.lengthInMinutes = lengthInMinutes;
        this.imageUrl = imageUrl;
    }

    public static void main(String[] args) {
        Movie johnWick4 = new Movie(5.0, "action", "John Wick: Chapter 4", 180, "https://i.etsystatic.com/26711473/r/il/3947ab/4828024512/il_1588xN.4828024512_n3w8.jpg");
        System.out.println(johnWick4);
    }
}
