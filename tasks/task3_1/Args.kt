// Task 3.1: command line arguments
import kotlin.system.exitProcess

fun main (args: Array<String>){

    if(args.size < 2)
    exitProcess(1)


    print1(args)
    print2(args)

}


fun print1 (numbers: Array<String>){

    println(numbers[0])


}

fun print2 (numbers: Array<String>){

    println(numbers[1])
}
