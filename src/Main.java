import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> dateList = new ArrayList<>();
        dateList.add(LocalDate.of(2005, 2, 14));
        dateList.add(LocalDate.of(2005, 9, 26));
        dateList.add(LocalDate.of(2003, 5, 2));
        dateList.add(LocalDate.of(2007, 11, 8));
        dateList.add(LocalDate.of(2003, 5, 30));
        dateList.add(LocalDate.of(2005, 6, 11));
        dateList.add(LocalDate.of(2005, 8, 17));
        dateList.add(LocalDate.of(2005, 8, 19));
        dateList.add(LocalDate.of(2005, 3, 10));
        dateList.add(LocalDate.of(2005, 10, 1));


        System.out.println(dateSorter.sortDates(dateList));
    }
}
