// Calculate fibonacci number for a provided value n

object CalculateFibonacci extends App {
    def calculateFibonacci(myNumber: Int): Int = {
      // 0 = 0
      if (myNumber.equals(0)) 0
      // 1 = 1
      // 2 = 1
      if (myNumber.<(3)) 1
      else calculateFibonacci(myNumber - 1) + calculateFibonacci(myNumber - 2)
    }
}
