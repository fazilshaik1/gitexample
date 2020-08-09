package org.dxctraining.ui;

import org.dxctraining.service.*;
import org.dxctraining.entities.*;
import java.util.*;

public class GuestUi {
	private IGuestService service = new GuestServiceImpl();
	public static void main(String args[]) {
		GuestUi demo = new GuestUi();
		demo.runApp();
	}
	private void runApp() {
		Guest guest1 = new Guest("Fazil","F1");
		service.registerGuest(guest1);
		Guest guest2 = new Guest("Bubbly","F2");
		service.registerGuest(guest2);
		Guest guest3 = new Guest("Sravya","F3");
		service.registerGuest(guest3);
		Guest guest4 = new Guest("Harsha","F4");
		service.registerGuest(guest4);
		
		System.out.println("***Displaying all the guests***");
		display();
	}
	private void display() {
		List<Guest>list = service.display();
		for(Guest guest: list) {
			displayGuest(guest);
		}
		
	}
	private void displayGuest(Guest guest) {
		String id = guest.getId();
		String name = guest.getName();
		System.out.println("Guest Name is "+name+" Guest id is "+id);
		
	}

}
