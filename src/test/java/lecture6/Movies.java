package lecture6;

import lombok.Data;

@Data
public class Movies {
    private String movieName;
    private String director;
    private String genre;
    private int year;
    private int boxOffice;
    private int budget;

}
