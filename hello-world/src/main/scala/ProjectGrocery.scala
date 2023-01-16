import scala.io.StdIn.readLine
import scala.collection.immutable._
import scala.collection.mutable.ListBuffer

class Data(var itemName : String,var price : Int,var countOfItem : Int) {

    def printdata():Unit={
        println(itemName)
        println(price)
        println(countOfItem)
         
    }

    def total(): Int ={
        return (price*countOfItem)
    }
}

object ProjectGrocery{

    def main(args : Array[String]) : Unit ={

        var listB = ListBuffer[Data]()
        var userOption = ""

        
        while ({ var userOption = readLine("1 : Enter new product \n2. Quit")
            if(userOption == "1"){
            var item1 = readLine("Enter Item: ")
            var x = readLine("Enter the price: ")
            var item2 = x.toInt
            var y = readLine("Enter the count: ")
            var item3 = y.toInt

            var d = new Data(item1,item2,item3)
            listB += d;
            } ; userOption != "2" }) ()

            
        
            
        

        var totalbill = 0

        for (w <- listB){
            w.printdata()
            totalbill += w.total()
        }
        println(totalbill)



    }
}
