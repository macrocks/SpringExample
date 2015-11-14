package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class CompactDisk {

	private String CDTitle="Roy Music Track by Arijit Singh";
	
	private String SongTitle="Tu hai Ki Nahi";
	
	public void SongPlaying(){
		System.out.println("Song From "+ CDTitle + " Current Song: " + SongTitle);
	}
	
}
