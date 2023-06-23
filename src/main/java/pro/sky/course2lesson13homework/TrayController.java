package pro.sky.course2lesson13homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/store")
public class TrayController {

//    @Autowired
//    private TrayService storeService;

    private final TrayService trayService;

    public TrayController(TrayService trayService) {
        this.trayService = trayService;
    }

    @GetMapping()
    public String welcomeToStore() {
        return trayService.welcome();
    }

    @GetMapping(path = "/add")
    public List<Integer> add(@RequestParam(required = false, name = "id") Integer[] goodsID) {
        return trayService.addItem(goodsID);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return trayService.getTray();
    }
}
