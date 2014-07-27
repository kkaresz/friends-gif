package com.gifriends.model

class SubTitle(val line:String, val startTime:Time, val endTime:Time) {
  
  override def toString() = "line: " + line + "\nstart: " + startTime.toString + "\nend: " + endTime.toString
  
}