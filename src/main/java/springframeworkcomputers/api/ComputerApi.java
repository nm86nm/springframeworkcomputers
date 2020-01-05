package springframeworkcomputers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springframeworkcomputers.model.Computer;
import springframeworkcomputers.service.ComputerService;

@RestController
public class ComputerApi {

    private ComputerService computerService;

    @Autowired
    public ComputerApi(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping("/get-computers")
    public Iterable<Computer> getComputers(){
        return computerService.getComputers();
    }
}
