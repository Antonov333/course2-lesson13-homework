package pro.sky.course2lesson13homework;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service

public class StoreService {

    private List<Integer> tray = new ArrayList<>();

    public StoreService() {
        System.out.println("StoreService constructor is dialed");
    }

    public String welcome() {
        String welcomeString =
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Course 2 Lesson 13 Homework</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "Hi! <br> Course 2 Lesson 13 Homework\n" +
                        "\n" +
                        "<a href=\"\"> [ Store ] </a> <br>\n" +
                        "<a href=\"http://localhost:8080/store/get\"> [ Get ] </a>\n" +
                        "<a href=\"http://localhost:8080/store/add?id=1,2,3,4,5\"> [ Add 1,2,3,4,5 ] </a>" +
                        "</body>\n" +
                        "</html>";
        return welcomeString;
    }

    public List<Integer> addItem(Integer[] goodsID) {
        if (goodsID == null) {
            return tray;
        }
        Collections.addAll(tray, goodsID);
        return tray;
    }

    public List<Integer> getTray() {
        return tray;
    }

}
