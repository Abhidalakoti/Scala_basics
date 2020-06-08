object Pattern_Matching_Extractors {
  def main(args: Array[String]): Unit ={
    val x = Pattern_Matching_Extractors(25)
    println(x)
     x match{
       case Pattern_Matching_Extractors(y) => println("The VAlue is:"+y)
       case _ => println("Cannot evaluate")

     }
  }
  def apply(x: Double) = x/5

  def unapply(z: Double): Option[Double]=
    if (z % 5 ==0)
      {
        Some(z/5)
      }
    else None
}