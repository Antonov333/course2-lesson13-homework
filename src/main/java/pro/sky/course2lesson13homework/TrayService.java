package pro.sky.course2lesson13homework;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service

public class TrayService {

    private List<Integer> tray = new ArrayList<>();

    public TrayService() {
        System.out.println("TrayService constructor is dialed");
    }

    public String welcome() {
        String welcomeString =
                "<br> Hi! <br> <br> Course 2 Lesson 13 Homework<br><br>" +
                        "<a href=\"\"> [ Store ] </a> " +
                        "<a href=\"http://localhost:8080/store/get\"> [ Get ] </a>" +
                        "<a href=\"http://localhost:8080/store/add\"> [ Add ] </a>" +
                        "<a href=\"http://localhost:8080/store/add?id=1,2,3,4,5\"> [ Add 1,2,3,4,5 ] </a>";
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
