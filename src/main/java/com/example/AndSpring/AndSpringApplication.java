package com.example.AndSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AndSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndSpringApplication.class, args);

//		try {
//			String domain = "hanait.kro.kr";
//			InetAddress ia = InetAddress.getByName(domain);
//
//			System.out.println("inetAddr : " + ia.toString());
//			System.out.println("host ip : " + ia.getHostAddress());
//			System.out.println("host name : "+ ia.getHostName());
//			System.out.println("isReachable : "+ ia.isReachable(1000));
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		} catch (IOException e){
//			e.printStackTrace();
//		}
	}
}
