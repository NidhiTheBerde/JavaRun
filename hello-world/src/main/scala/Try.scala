
import scala.io.StdIn.readLine
import scala.util.control.Breaks._
object Main extends App {


val r = scala.util.Random
var number = r.nextInt(100)
var status = "Lost"
var turns = 5

breakable{
for(x <-  1 to 5){
    var y = readLine("Guess a number: ")
    var guess = y.toInt

    if(guess == number){
        println("Correct guess, game won")
        println("Number of tries: "+x)
        status = "won"
        break;
    }
    else if(guess<number){
        println("Guess is less than the number")
        turns = turns - 1
        println("Turns Left: "+turns)
    }
    else if(guess>number){
        println("Guess is more than the number")
        turns = turns - 1
        println("Turns Left: "+turns)
    }
    
}
}
if (status=="Lost"){
    println("Game lost")
    println(number)
}

}


