package com.dxctraining;

import java.util.*;

public class TraineeMain {
	private Map<Integer, Trainee> store = new HashMap<>();
	private Set<CseTrainee> set1 = new HashSet<>();
	private Set<EceTrainee> set2 = new HashSet<>();

	public static void main(String args[]) {
		TraineeMain demo = new TraineeMain();
		demo.runApp();
	}

	private void runApp() {
		try {
			Trainee trainee1 = new CseTrainee(001, "Fazil", 3);
			Trainee trainee2 = new EceTrainee(002, "Bubbly", "Ammeter");
			Trainee trainee3 = new CseTrainee(003, "Sravya", 4);
			Trainee trainee4 = new EceTrainee(004, "Harsha", "Diode");

			store.put(trainee1.getId(), trainee1);
			store.put(trainee2.getId(), trainee2);
			store.put(trainee3.getId(), trainee3);
			store.put(trainee4.getId(), trainee4);

			for (Trainee trainee : store.values()) {
				Trainee current = (Trainee) trainee;
				boolean isCse = current instanceof CseTrainee;
				if (isCse == true) {
					set1.add((CseTrainee) current);
				} else {
					set2.add((EceTrainee) current);
				}
			}
			display();
		} catch (Exception e) {
			System.out.println("Unknown error occured");
		}
	}

	private void display() {
		System.out.println("Cse Trainee");
		for (CseTrainee cs : set1) {
			int id = cs.getId();
			String name = cs.getName();
			int languages = cs.getLanguages();
			System.out.println("Name is " + name + " Id is " + id + " No. of languages " + languages);
		}
		System.out.println("Ece Trainee");
		for (EceTrainee ec : set2) {
			int id = ec.getId();
			String name = ec.getName();
			String device = ec.getDevice();
			System.out.println("Name is " + name + " Id is " + id + " Device is " + device);
		}

	}

}
