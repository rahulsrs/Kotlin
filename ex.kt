import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    println("Enter the a number corresponding to the day you want")
    val num = sc.nextInt()
    var day = "Unassigned"
    when(num){
        1->{day = "Monday"}
        2->{day = "Tuesday"}
        3->{day = "Wednesday"}
        4->{day = "Thursday"}
        5->{day = "Friday"}
        6->{day = "Saturday"}
        7->{day = "Sunday"}
        else ->{day = "Invalid"}
    }
    print("The day is $day")

}