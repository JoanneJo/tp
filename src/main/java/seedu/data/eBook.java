package seedu.data;

public class eBook extends Book{
    public static final String EBOOK_TAG = "EB";
    private String link;

    public eBook(String title, String isbn, String author, String[] genres, int id, Status status, String link) {
        super(title, isbn, author, genres, id, status);
        setTag(EBOOK_TAG);
        setLink(link);
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        StringBuilder genreString = new StringBuilder();
        if (getGenre()[0] == null) {
            genreString.append("-");
        } else {
            genreString.append(java.util.Arrays.toString(getGenre()).replace("[", "").replace("]", ""));
        }

        return "[" + getTag() + "] " + " ID: " + getId() + " Title: " + getTitle() + " ISBN: " + getISBN() + " Author: "
                + getAuthor() + " Genre: " + genreString + " Link: " + getLink();
    }
}
