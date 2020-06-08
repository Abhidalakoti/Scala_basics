object Lists {

  def main(args: Array[String]): Unit = {

    val fruit: List[String] = List("oranges", "pears", "lemons")
    val fruit1: List[String] = List("mango", "apple", "plum")
    var fruit2 = List.concat(fruit, fruit1)
    println(":" + fruit2);
    val nums: List[Int] = List(1, 2, 3, 4)

    val empty: List[Nothing] = List()

    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
    val multidimen = List.tabulate(3,4)(_*_)
    println("multidimen" +multidimen)
    println("After reverse"+multidimen.reverse)
  }
}