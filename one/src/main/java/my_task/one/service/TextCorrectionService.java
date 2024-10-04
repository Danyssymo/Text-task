//package my_task.one.service;
//
//import my_task.one.bean.TaskStatus;
//import my_task.one.bean.TextFix;
//import my_task.one.dao.TextCorrectionTaskRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import java.util.UUID;
//
//@Service
//public class TextCorrectionService {

//    @Autowired
//    private TextCorrectionTaskRepository textRepo;
//
//    public UUID createTask(String text, String language) {
//        TextFix task = new TextFix();
//        task.setText(text);
//        task.setLanguage(language);
//        task.setStatus(TaskStatus.NEW);
//        textRepo.save(task);
//        return task.getId();
//    }
//
//    public TextFix getTask(UUID id) {
//        return textRepo.findById(id).orElse(null);
//    }

//}
//