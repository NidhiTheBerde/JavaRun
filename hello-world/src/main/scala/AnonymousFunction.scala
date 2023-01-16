import scala.io.StdIn.readLine


object AnonymousFunction {
  
def main(args : Array[String]) : Unit ={

var add = (x:Int,y:Int) => x+y
var sub = (x:Int,y:Int) => x-y
var mul = (x:Int,y:Int) => x*y
var div = (x:Int,y:Int) => x/y

println(mul(div(add(10,10),10),5))

}
}