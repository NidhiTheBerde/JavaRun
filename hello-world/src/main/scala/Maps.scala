
import scala.io.StdIn.readLine
import scala.collection.immutable._
import scala.collection.mutable.Map
import scala.annotation.newMap

object Maps{
    def main(args : Array[String]) : Unit ={
        var x = readLine("Enter no. of words: ")
        var noOfWords = x.toInt

        var newMap = Map[String,Int]()


        for(w <- 1 to noOfWords){
             var y = readLine("Enter word: ");
             if (newMap.contains(y))
             {
                newMap(y) = newMap(y) + 1
                println(newMap)
             }
             else{
             newMap += (y -> 1)
             println(newMap)
             }
        }
        
        while ({
            var word  = readLine("Enter the word: ")
            if (newMap.contains(word)){
                println(newMap(word))
            }
            else{
                println("Word not present")
            }
            
            
            ; word != "Quit"}) ()


    }
}