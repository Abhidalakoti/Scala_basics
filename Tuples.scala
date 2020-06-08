object Tuples {
  def main(args:Array[String]): Unit ={
    val t = (4,3,2,1)
    val sum =  t._1 + t._2 + t._3 + t._4
    println("Sum of elements:" +sum)

    t.productIterator.foreach{ i =>println("Value =" +i)}
    val t1 = new Tuple3(1, "hello", Console)
    println("Concatenated String:" +t1.toString())
    var  t3 = new Tuple4("Scala", Console , 3 ,90)
    //println("Swapped Tuple:" + t3.swap)
  }
}