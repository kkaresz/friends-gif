package com.gifriends.model

import java.io.File
import com.gifriends.io.SubTitleFileReader

class Episode(val subFile:File) {
  
  val fileName:String = subFile.getName()
  val season:String = fileName.split('.')(0)
  val episode:String = fileName.split('.')(1)
  
  val subs:List[SubTitle] = SubTitleFileReader collectSubs subFile
  
}