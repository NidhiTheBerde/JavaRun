import scala.io.StdIn.readLine
import scala.util.control.Breaks._

object Main extends App {
  //println("Hello, World!")
  // var a = 10;
  // val b = 30;
  // var c = 25;
  // var st = "Nidhi"
  // var sn = "234"
  var courses = readLine("Enter no. of courses: ");
  // var y = readLine("Enter number 2: ");
  // println(x.getClass.getName())
  // println(y.getClass.getName())
  var intcourses = courses.toInt
  var sum = 0
  breakable{
  for(j <- 1 to intcourses){
    var marks = readLine("Enter marks for course: ")
    var intmarks = marks.toInt
    if(intmarks == 0){
      println("About to break")
      break;
    }
    sum = sum+intmarks
    
  }
}

  println(sum)
  println(sum/intcourses);



  // if (a > 13 && h>15){
  //   var answer = readLine("SPecial Card? Yes/No?")
  //   if(answer == "Yes" || answer == "yes"){
  //     println("Welcome, special card granted")
  //   }
  //   else{
  //     println("Welcome")
  //   }
  // }
  // else{
  //   println("Not Permissable")
  // }
  // var b = y.toInt
  // println(a+b);

  // println(((a+b)/c)*a)
  // println(a+b);
  // println(b/a)
  //println(st.length()+sn.length())
  // println(sn.getClass.getName())
  // var sn_int = sn.toInt; 
  // println(sn_int.getClass.getName())
  // var d = c.toFloat
  // println(d.getClass.getName())

}