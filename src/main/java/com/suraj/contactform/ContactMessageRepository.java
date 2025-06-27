package com.suraj.contactform;
import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.contactform.model.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}