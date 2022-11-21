package com.jspider.musicplayer.main;

import java.util.Scanner;

import com.jspider.musicplayer.entity.Songs;
import com.jspider.musicplayer.operations.SongsOperations;

public class MusicPlayer {

	private static SongsOperations songsOperations = new SongsOperations();
	private static Scanner scanner = new Scanner(System.in);
     static Songs songs = new Songs();
	public static void main(String[] args) {

		boolean loop = true;
		MusicPlayer music = new MusicPlayer();

		while (loop) {

			music.MusicPlayer();
			loop = false;
		}
	}

	 public void MusicPlayer() {

		System.out.println("================MENU================");

		System.out.println("Select Options : \n 1. Add / Remove song  \n 2. Play song  \n 3. Edit Song  \n 4. Exit ");

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("================MENU================");
			System.out.println("Choose Option to Add / Remove Song : \n 1. Add Song   \n 2. Remove Song");
			int choice1 = scanner.nextInt();

			switch (choice1) {
			case 1:
				songsOperations.addSongs();
				break;
			
			case 2:
				songsOperations.removeSong();
			default:
				System.out.println(" NO Song Id Found ");
				break;
			}
			MusicPlayer();
			break;

		case 2:
			System.out.println("Choose option to play song : \n1.Choose to play \n2.Play all songs \n3.Play Random");
			
			switch (scanner.nextInt()) {
			case 1:
				songsOperations.displayAllSongs();
				
				break;
			case 2:
				songsOperations.playAllSongs();
				break;
			case 3:
				songsOperations.playRandomSongs();
				break;
			case 4:
				System.out.println("Wait..Exiting...");
				return;
			default:
				System.out.println("Invalid choice");
				break;
			}
	//		MusicPlayer();
			break;
			
		case 3: 
			songsOperations.updateSong();
		//	MusicPlayer();
			break;
			
		case 4:
			System.out.println("Exit");
			break;
			
		default:
			System.out.println("Invalid choice");
		//	scanner.close();
			break;
		}
		MusicPlayer();
	}

}
