import java.util.Scanner

fun main(){
    val Scanner = Scanner(System.`in`)
    println("Enter the height of the pyramid")
    val h = Scanner.nextInt()
    val star = "*"
    for(i in 1..h){
        val res = star.repeat(i)
        println(res)
    }
}