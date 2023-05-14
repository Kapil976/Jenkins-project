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
public class HM {
	
	@RequestMapping("/v1")
	public String check() {
		return"Testing...";
	}

}
