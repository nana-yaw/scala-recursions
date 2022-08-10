object StringConcatenate extends App {
  def concatenateString(numOfTimes: Int, result: String = ""): String = {
    if (numOfTimes <= 1) result
    else result + concatenateString(numOfTimes-1, result)
  }
}
