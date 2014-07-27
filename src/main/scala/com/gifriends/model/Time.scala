package com.gifriends.model

class Time(time:String) {
	
  val timeSplit = time.split(":")
  
  val hour:Int = timeSplit(0).toInt
  val minute:Int = timeSplit(1).toInt
  val second:Double = timeSplit(2).replace(",", ".").toDouble
  
  override def toString():String = "h:" + hour + " m:" + minute + " s:" + second
  
}