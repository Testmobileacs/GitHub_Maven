package com.test;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.newpackage.Github_Baseclass;

public class github_testing extends Github_Baseclass{
	
		@Test (priority = 1)
		public void setup() throws MalformedURLException {
			login_normal();
		}

		@Test(priority = 2)
		public void update1() throws InterruptedException {
			update();
		}
	
		@Test(priority = 3)
		public void testAddTransport() throws InterruptedException {
			add_transport();
		}
		
	}


