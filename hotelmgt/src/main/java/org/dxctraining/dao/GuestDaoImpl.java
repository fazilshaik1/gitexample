package org.dxctraining.dao;

import java.util.*;

import org.dxctraining.entities.Guest;
import org.dxctraining.exceptions.GuestNotFoundException;

public class GuestDaoImpl implements IGuestDao {
	private Map<String, Guest> store = new HashMap<>();

	@Override
	public Guest findById(String id) {
		Guest guestId = store.get(id);
		if(guestId == null) {
			throw new GuestNotFoundException("Guest id is empty");
		}
		return guestId;
	}

	@Override
	public void registerGuest(Guest guest) {
		String id = guest.getId();
		String name = guest.getName();
		store.put(id, guest);
		guest.setId(id);
		guest.setName(name);
		
	}

	@Override
	public void deleteGuest(Guest guest) {
		store.remove(guest);
		
	}

	@Override
	public List<Guest> guestlist() {
		Collection<Guest>collection = store.values();
		List<Guest>list = new ArrayList<>();
		for(Guest guest: collection) {
			list.add(guest);
		}
		return list;
	}
	

}
