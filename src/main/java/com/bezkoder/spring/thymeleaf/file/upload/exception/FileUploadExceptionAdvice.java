package com.bezkoder.spring.thymeleaf.file.upload.exception;

import org.springframework.web.multipart.MaxUploadSizeExceededException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FileUploadExceptionAdvice {

  @ExceptionHandler(MaxUploadSizeExceededException.class)
  public String handleMaxSizeException(Model model, MaxUploadSizeExceededException e) {
    List<String> messages = new ArrayList<>();
    messages.add("One of selected files is too large!");

    model.addAttribute("messages", messages);

    return "upload_form";
  }
}
