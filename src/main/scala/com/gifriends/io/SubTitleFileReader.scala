package com.gifriends.io

import java.io.File
import com.gifriends.model.SubTitle
import scala.io.Source
import java.util.Scanner
import java.util.regex.Pattern
import com.gifriends.model.Time
import scala.util.control.NonFatal

object SubTitleFileReader {
  def collectSubs(file:File):List[SubTitle] = { 
    var subList:List[SubTitle] = List()
    
    try {
    	val scanner = new Scanner(file).useDelimiter("\r\n\r\n")
		try {
			while (scanner.hasNext()) {
			  val lines = scanner.next().split("\\n")  
			  subList :+= new SubTitle( lines.slice(2, lines.length).mkString("\n"), 
					  					new Time(lines(1).split(" --> ")(0)), 
					  					new Time(lines(1).split(" --> ")(1)))
			}
		}
    	catch {
    	  	case NonFatal(_) => List()
    	}
    	finally {
    		scanner.close()
    	}
    }
    catch {
	  	case NonFatal(_) => List()
	}
    
    
    subList
  }
}