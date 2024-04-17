import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val vow = arrayOf('a','e','i','o','u')
    println("Enter a lowercase English letter")
    val x = sc.next().single()
    if(x in vow){
        println("It is a vowel")
    }
    else{
        println("It is a consonant")
    }
}