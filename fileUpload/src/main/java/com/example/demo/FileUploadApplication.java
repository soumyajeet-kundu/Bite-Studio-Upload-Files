package com.example.demo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.fileUploadController;

@SpringBootApplication
@ComponentScan({"com.example.demo", "com.example.controller"})
public class FileUploadApplication {

	public static void main(String[] args) {
		new File(fileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(FileUploadApplication.class, args);
	}

}
