import java.util.Scanner

fun factorial(x:Int):Int{
    var prod = 1
    for(i in 1..x){
        prod*=i
    }
    return prod
}

fun pallindrome(x:String) :Boolean{
    return x == x.reversed()
}

