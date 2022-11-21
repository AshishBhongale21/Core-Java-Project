package com.jspider.musicplayer.operations;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.musicplayer.entity.Songs;

public class SongsOperations {

	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Songs> list = new ArrayList<Songs>();
     static Songs songs = new Songs();

	public void addSongs() {

		System.out.println(" How Many Songs you want to Add ");
		int addCount = scanner.nextInt();

		for (int i = 0; i < addCount; i++) {
			Songs songs = new Songs();

			System.out.println(" Enter the Id Number for Song : ");
			songs.setId(scanner.nextInt());

			System.out.println(" Enter the Name of Song : ");
			songs.setName(scanner.next());

			System.out.println("Enter the Singer Name : ");
			songs.setSinger(scanner.next());

			System.out.println(" Enter the Name of the Lyrist : ");
			songs.setLyricist(scanner.next());

			System.out.println(" Enter the Duration time of te song : ");
			double duration = scanner.nextDouble();
			songs.setDuration(duration);

			list.add(songs);
			System.out.println("Added " + songs.getName() + " Song Successfully");

		}
	}

	public void displayAllSongs() {

		if (list.isEmpty()) {
			System.out.println(" Add song then you will get SongsList....");
			addSongs();
		}
		for (Songs songs : list) {
			System.out.println(songs.getName());
		}
	}

	public void removeSong() {
		if (list.isEmpty()) {
			System.out.println(" Add Song then Remove....");
			addSongs();
		}

		System.out.println(" Select Song to Remove");
		displayAllSongs();

		int removeId = scanner.nextInt();
		System.out.println(list.get(removeId - 1).getName() + " Removed Successfully...");
		list.remove(removeId - 1);
		displayAllSongs();
	}

	public void updateSong() {
		if (list.isEmpty()) {
			System.out.println(" Add songs then Update..");
			addSongs();

			System.out.println(" Select song to Update ");
			displayAllSongs();
			int update = scanner.nextInt();
			list.remove(update - 1);
			Songs songs = new Songs();

			System.out.println(" Enter the Id for Song : ");
			songs.setId(scanner.nextInt());

			System.out.println(" Enter the Name of Song : ");
			songs.setName(scanner.next());

			System.out.println("Enter the Singer Name : ");
			songs.setSinger(scanner.next());

			System.out.println(" Enter the Name of the Lyrist : ");
			songs.setLyricist(scanner.next());

			System.out.println(" Enter the Duration time of te song : ");
			double duration = scanner.nextDouble();
			songs.setDuration(duration);

			list.add(update - 1, songs);
			System.out.println(list.get(update - 1).getName() + " Updated Song details Successfully");

		}
	}

	public void playAllSongs() {
		if (list.isEmpty()) {
			System.out.println(" Add songs then play..");
			addSongs();
		}
		System.out.println(" Playing All songs ");
		for (Songs songs : list) {
			System.out.println(songs.getName());
		}
	}
	
	public void playRandomSongs() {
		if (list.isEmpty()) {
			System.out.println(" Add songs then play..");
			addSongs();
		}
		System.out.println(" Playing Random songs ");
		double number = Math.random();
		int random = (int) (number * 10) + 1;
		if (random > list.size()) {
			random = 0;
		}
		System.out.println("Playing song " + list.get(random).getName());
	}
}
