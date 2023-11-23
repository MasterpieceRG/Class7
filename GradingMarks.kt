import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var result:Int = scan.nextInt()

    if(result>89){
        println("You got 'A+'")
    }else if(result>79) {
        println("You got 'A'")
    }else if(result>69) {
        println("You got 'A-'")
    }else if(result>59) {
        println("You got 'B'")
    }else if(result>49) {
        println("You got 'C'")
    }else if(result>39) {
        println("You got 'D'")
    }else {
        println("You Failed, try next time!!")
    }
}