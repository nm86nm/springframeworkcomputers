package springframeworkcomputers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springframeworkcomputers.model.Computer;
import springframeworkcomputers.repo.ComputerRepo;

@Service
public class ComputerService {

    private ComputerRepo computerRepo;

    @Autowired
    public ComputerService(ComputerRepo computerRepo) {
        this.computerRepo = computerRepo;
    }

    public Iterable<Computer> getComputers(){
        return computerRepo.findAll();
    }
}
