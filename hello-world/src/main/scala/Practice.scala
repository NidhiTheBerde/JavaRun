import scala.io.StdIn.readLine
//import scala.util.control.Breaks._

object Practice {


    def main(args: Array[String])  : Unit = {

    var amount = get_bill_amount()
    var discount = get_discount_amount()
    var final_amount = apply_discount(amount,discount)
    println(printbill(amount,final_amount))

    }

    def get_bill_amount(): Int ={
    var x = readLine("Enter Bill Amount: ")
    var bill_amount = x.toInt
    return bill_amount
}
    def get_discount_amount() : Int={
        var y =  readLine("Enter Discount Amount: ")
        var discount_amount = y.toInt
        return discount_amount
    }

    def apply_discount(a : Int , b : Int ) : Int ={
       var final_amount = 0
        if (b == 0){
             final_amount = a-10
        }
        else{
            final_amount = a-b
        }
        return final_amount
    }

    def printbill(c : Int, d : Int) : Unit = {
        println("Actual Bill :"+c)
        println("Discounted Bill: "+d)
        
    }



}