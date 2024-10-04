package my_task.one.dao;

import my_task.one.bean.Panda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PandaRepository extends JpaRepository<Panda, Long> {
}
