import scala.io.StdIn.readLine
import scala.collection.immutable._
import scala.collection.mutable.ListBuffer

object Lists{
    def main(args: Array[String]): Unit = {

        val list1 = List(List(1,2,3,"Hello","World"),List(3,4,5),List(4,6,"Hi"));
        println(list1);

        var l1 = 13 +: list1
        var l2 = list1 :+ 14

        println(list1)
        println(l1)
        println(l2)

        var l3 = list1(0).take(2)
        for (w <- l3){
            println(w)
        }

        var listBuffer = ListBuffer(1,2,3,4,5,6)

       


        for( v <- listBuffer){
            println(v)
        }
    }
}
