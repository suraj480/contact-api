package com.suraj.contactform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.suraj.contactform.model.ContactMessage;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/contact")
public class ContactMessageController {

    @Autowired
    private ContactMessageService service;

    @PostMapping("/send")
    public ContactMessage receiveMessage(@RequestBody ContactMessage message) {
        return service.saveMessage(message);
    }
}