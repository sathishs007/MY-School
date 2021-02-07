/**
 * 
 */
package com.school.dataserv.api.rest;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author sathi
 *
 */
@Configuration
@EnableScheduling
public class Schudler {

	
	/*@Scheduled(fixedRate=5000)
    public void printMessage() {
        System.out.println("I am called by Spring scheduler"+new Date());
    }*/
}
