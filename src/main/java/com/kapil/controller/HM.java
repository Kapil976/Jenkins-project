/**
 * 
 */
package com.kapil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HOME PC
 *
 */
@RestController
@RequestMapping("/v1")
public class HM {
	
	public String check() {
		return"Testing...";
	}

}
