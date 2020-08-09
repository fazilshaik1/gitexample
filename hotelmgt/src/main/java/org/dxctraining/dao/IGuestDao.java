package org.dxctraining.dao;

import java.util.*;
import org.dxctraining.entities.*;

public interface IGuestDao {
	public Guest findById(String id);
	public void registerGuest(Guest guest);
	public void deleteGuest(Guest guest);
	public List<Guest>guestlist();

}
