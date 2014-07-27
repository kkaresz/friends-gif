package com.gifriends

import com.gifriends.model.SubTitle
import com.gifriends.model.Time

import com.gifriends.model._

import java.io.File

object TestBed {
  var subFile = new File("/Users/kkaresz/Workspace/HomeProjects/gifriends/src/main/resources/subtitles/s01/s01.e01.srt")
                                                  //> subFile  : java.io.File = /Users/kkaresz/Workspace/HomeProjects/gifriends/sr
                                                  //| c/main/resources/subtitles/s01/s01.e01.srt
  
	var episode = new Episode(subFile)        //> episode  : com.gifriends.model.Episode = com.gifriends.model.Episode@1fd0faf
                                                  //| c
	
	episode.subs(1).toString                  //> res0: String = line: There's nothing to tell.
                                                  //| It's just some guy I work with.
                                                  //| start: h:0 m:0 s:49.966
                                                  //| end: h:0 m:0 s:52.76
	
	
	
	
	
	
	
	
	
	
                                      
	
	
	
	
	
	
	
	
	
	
	
	
	
}