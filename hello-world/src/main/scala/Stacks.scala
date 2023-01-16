
import scala.io.StdIn.readLine
import scala.collection.mutable.Stack
import scala.util.control.Breaks._

object Stacks{

    def main(args: Array[String]): Unit ={

        var str = readLine("Enter an expression: ")
        var stack = Stack[Char]();
        var validation = "valid"
        breakable{
        for (w <- str){

            if (w == '('){
                stack.push('(')
            }
            if (w == ')'){
                if (stack.isEmpty){
            println("Invalid Expression")
            validation = "invalid"
            }
            else{
            stack.pop()
             }
            }
        }
        }
        if(validation == "valid"){
        if(!stack.isEmpty){
            println("InValid Expression")
        }
        else{
            println("Valid Expression")
        }
    }

        

    }
}