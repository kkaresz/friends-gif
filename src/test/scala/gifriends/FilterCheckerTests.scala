package gifriends

import org.scalatest.FlatSpec
import java.io.File

class FilterCheckerTests extends FlatSpec {
  
  "FilterChecker passed a list where one file matches the filer" should
  "return a list with that file" in {
    val listOfFiles = List(FileObject(new File("random")), FileObject(new File("match")))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
    
    assert(matchedFiles == List(FileObject(new File("match"))))
  }
  
  "FilterChecker passed a list with a directory that matches the filer" should
  "should not return the directory" in {
    val listOfIOObjects = List[IOObject](FileObject(new File("random")), DirectoryObject(new File("match")))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfIOObjects
    
    assert(matchedFiles.length == 0)
  }

}