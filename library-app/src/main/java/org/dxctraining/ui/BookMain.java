package org.dxctraining.ui;

import java.util.*;
import org.dxctraining.dao.*;
import org.dxctraining.entities.*;
import org.dxctraining.exceptions.*;
import org.dxctraining.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
		
	}
}
