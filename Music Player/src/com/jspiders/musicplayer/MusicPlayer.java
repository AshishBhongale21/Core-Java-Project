package com.jspiders.musicplayer;

import com.jspiders.musicplayer.operation.SongOperation;
import java.util.Scanner;

public class MusicPlayer {

	SongOperation songOperation = new SongOperation();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MusicPlayer music = new MusicPlayer();
		boolean loop = true;
		while (loop) {
			music.musicPlayer();
			loop = false;
		}
	}

	public void musicPlayer() {
		System.out.println("Select Options : \n1.Play \n2.Add/remove \n3.Edit \n4.Exit");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Choose option to play song : \n1.Choose to play \n2.Play all songs \n3.Play Random");
			int choose1 = sc.nextInt();
			switch (choose1) {
			case 1:


				break;
			case 2:
				songOperation.playAllSongs();
				break;
			case  3 :
				songOperation.playRandomSong();
				break;
			case 4:
				System.out.println("Wait..Exiting...");
				return;
			default:
				System.out.println("Invalid choice");
				break;
			}
			break;

		case 2:
			System.out.println("Choose option to Add or Remove songs\n 1.Add a Songs \n 2.Remove a Song");
			switch (sc.nextInt()) {
			case 1:
				songOperation.addSong();
				break;
			case 2:
				songOperation.removeSong();
				break;
			default:
				System.out.println("NO Song Id Found");
				break;
			}
			break;

		case  3 :
			songOperation.updateSong();
			break;

		default:
			System.out.println("No Song Id Found");
			break;

		}
		musicPlayer();
	}
}