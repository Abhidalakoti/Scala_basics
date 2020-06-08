object Demo1{
  def main(args: Array[String]): Unit =
  {
    println("Returned Value: " +addInt(6, 7))
  }

  def addInt( a:Int, b:Int) : Int = {
    var sum:Int = 0
    sum = a+b
    return sum
  }
}

