import scala.io.StdIn.readLine
import scala.collection.immutable._

object Lists{
    def main(args: Array[String]): Unit = {

        val list1 = List(1,2,3,"Hello","World");
        println(list1(0));

        for (w <- list1){
            println(w)
        }

    }
}
