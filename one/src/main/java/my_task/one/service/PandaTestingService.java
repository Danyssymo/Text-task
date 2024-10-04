package my_task.one.service;

import my_task.one.bean.Panda;
import my_task.one.dao.PandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PandaTestingService {

    @Autowired
    private PandaTestingDAO pandaDao;

    @Autowired
    private PandaRepository pandaRepository;

    public void addPanda(Panda panda){
        System.out.println("Service+");
            pandaRepository.save(panda);
    }


}
