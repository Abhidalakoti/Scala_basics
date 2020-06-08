object Maps {
  def main(args: Array[String]): Unit ={

    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")
    val nums: Map[Int, Int] = Map()
    var colors = colors1 ++ colors2
    println("colors1 ++ colors2:" + colors)
    colors = colors1.++(colors2)
    println("colors1.++(colors2):"+colors)
    println("Keys in colors:" +colors1.keys)
    println("Values in colors:"+ colors1.values)
    println("Check if colors is empty:" +colors1.isEmpty)
    println("Check if nums is empty:" +nums.isEmpty)
    colors.keys.foreach{ i =>
      print("Key =" +i)
      println("Value ="+ colors(i))}
    if(colors.contains("red")){
      println("Red key exists with value:" + colors("red"))}
      else{
      println("Red key does not exist")

      }
    }

  }
