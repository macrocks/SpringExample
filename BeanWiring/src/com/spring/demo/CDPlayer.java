package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//we can use @Named annotation here too
public class CDPlayer {

	@Autowired
	//we can use @Inject annotation here instead of @AutoWired.
	private CompactDisk compactDisk;
	
	public void play(){
		compactDisk.SongPlaying();
	}
	
}
