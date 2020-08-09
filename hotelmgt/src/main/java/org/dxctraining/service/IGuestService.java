package org.dxctraining.service;

import java.util.*;
import org.dxctraining.entities.*;

public interface IGuestService {
	public List<Guest>display();
	public Guest findById(String id);
	public void registerGuest(Guest guest);
	public void deleteGuest(Guest guest);

}
