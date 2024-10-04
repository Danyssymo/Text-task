//package my_task.one.controller;
//
//import my_task.one.bean.CreateTaskRequest;
//import my_task.one.bean.CreateTaskResponse;
//import my_task.one.bean.ErrorResponse;
//import my_task.one.bean.TextFix;
//import my_task.one.service.TextCorrectionService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.UUID;
//
//@RestController
//@RequestMapping("/tasks")
//public class TextFixController {
//
//    @Autowired
//    private TextCorrectionService textCorrectionService;
//
//    @PostMapping
//    public ResponseEntity<?> createTask(@RequestBody CreateTaskRequest request) {
//        UUID taskId = textCorrectionService.createTask(request.getText(), request.getLanguage());
//        return ResponseEntity.status(HttpStatus.CREATED).body(new CreateTaskResponse(taskId));
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getTask(@PathVariable UUID id) {
//        TextFix task = textCorrectionService.getTask(id);
//        if (task == null) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                    .body(new ErrorResponse("Task with id: " + id + " not found", 40401));
//        }
//        return ResponseEntity.ok(task);
//    }



//}
