import java.util.*
  fun main(args: Array<String>) {

      val sc = Scanner(System.`in`)

      val n = sc.nextInt()
      var sum = 1
      for(i in 1..n) sum *= i
      print(sum)
  }