package com.gifriends

import com.gifriends.model._
import com.gifriends.search.Matcher

import java.io.File

object TestBed {
  var subFile = new File("/Users/kkaresz/Workspace/HomeProjects/gifriends/src/main/resources/subtitles/s01/s01.e01.srt")
                                                  //> subFile  : java.io.File = /Users/kkaresz/Workspace/HomeProjects/gifriends/sr
                                                  //| c/main/resources/subtitles/s01/s01.e01.srt
  
	var episode = new Episode(subFile)        //> episode  : com.gifriends.model.Episode = com.gifriends.model.Episode@2b31390
                                                  //| 6
	episode.subs(1)                           //> res0: com.gifriends.model.SubTitle = line: There's nothing to tell.
                                                  //| It's just some guy I work with.
                                                  //| start: h:0 m:0 s:49.966
                                                  //| end: h:0 m:0 s:52.76
	
	
  var matcher = new Matcher("nothing to tell", episode.subs(1))
                                                  //> matcher  : com.gifriends.search.Matcher = com.gifriends.search.Matcher@60f47
                                                  //| bf5
  
  matcher.matches                                 //> res1: Boolean = true
	
	
	
	
	
	
	
	
	
	
	
                                      
	
	
	
	
	
	
	
	
	
	
	
	
	
}