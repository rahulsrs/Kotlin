import java.util.Scanner

fun main(){
    var grades = IntArray(3){0}
    val sc = Scanner(System.`in`)
    var sum = 0;
    for(i in 0..2) {
        println("Enter grade for exam $i")
        grades[i] = sc.nextInt()
        sum += grades[i]
    }
    val avg = sum/3
    print("The Average is $avg ")
}