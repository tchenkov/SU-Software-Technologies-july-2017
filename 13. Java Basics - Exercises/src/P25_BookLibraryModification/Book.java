package P25_BookLibraryModification;

import java.time.LocalDate;

/**
 * Created by todor on 13.08.2017 г..
 */
public class Book{
    private String title;
    private LocalDate releaseDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}