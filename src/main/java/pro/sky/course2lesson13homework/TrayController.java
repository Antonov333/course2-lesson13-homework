package pro.sky.course2lesson13homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/store")
public class TrayController {

//TrayService storeService = new TrayService();

    @Autowired
    private TrayService storeService;

    @GetMapping()
    public String welcomeToStore() {
        return storeService.welcome();
    }

    @GetMapping(path = "/add")
    public List<Integer> add(@RequestParam(required = false, name = "id") Integer[] goodsID) {
        return storeService.addItem(goodsID);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return storeService.getTray();
    }
}
