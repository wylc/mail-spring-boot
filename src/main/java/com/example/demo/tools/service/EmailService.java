package com.example.demo.tools.service;

import org.springframework.web.multipart.MultipartFile;

public interface EmailService {
    void sendSimpleMail(String receiver,String subject,String text);
    void sendHtmlMail(String receiver,String subject,String text);
    void sendAttachMail(String receiver,String subject,String text,String filePath,MultipartFile[] multipartFile);
}
