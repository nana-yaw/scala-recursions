object SumBetweenNumbers extends App {
  def sumNumbers(firstNumber: Int, secondNumber: Int): Int = {
    if (firstNumber.equals(secondNumber)) throw IllegalArgumentException("integers args should not have the same value")
    val biggerNumber = if (firstNumber < secondNumber)  secondNumber else firstNumber
    val smallerNumber = if (secondNumber < firstNumber)  firstNumber else secondNumber
    val currentSum = biggerNumber - 1
    if (currentSum.equals(smallerNumber)) currentSum + 1
    else currentSum + sumNumbers(smallerNumber, biggerNumber)
  }
}
