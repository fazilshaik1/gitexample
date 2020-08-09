package org.dxctraining.service;

import java.util.List;

import org.dxctraining.dao.*;
import org.dxctraining.entities.Guest;
import org.dxctraining.exceptions.InvalidGuestException;

public class GuestServiceImpl implements IGuestService {
	private IGuestDao dao = new GuestDaoImpl();

	@Override
	public List<Guest> display() {
		List<Guest>list = dao.guestlist();
		return list;
	}

	@Override
	public Guest findById(String id) {
		checkId(id);
		return null;
	}

	private void checkId(String id) {
		if(id == null || id.isEmpty()) {
			throw new InvalidGuestException("Guest Id is null");
		}
		
	}

	@Override
	public void registerGuest(Guest guest) {
		dao.registerGuest(guest);
		
	}

	@Override
	public void deleteGuest(Guest guest) {
		dao.deleteGuest(guest);
		
	}

}
