object Closure{
  def main(args: Array[String]): Unit ={
    var multiplier = (i:Int) => i * 10
    var factor = 3
    val multiplier1 = (i:Int) => i * factor
    println(multiplier(10));
    println(multiplier1(10));
    println(multiplier1(20));

  }
}