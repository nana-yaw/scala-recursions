object StringLength extends App {
  def getLengthOfString(myString: String, strLength: Int = 1): Int = {
    val newStr = if(myString.isBlank) "" else myString.substring(1)
    if (newStr.isEmpty) strLength
    else getLengthOfString(newStr, strLength + 1)
  }
}
