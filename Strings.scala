object Strings{
  def main(args: Array[String]): Unit ={
    val greeting: String ="Hello World"
    println(greeting)
    var palindrome = "Dot is Tod"
    var len = palindrome.length()

    println("String Length is :" + len)
    var str1 = "Tod"
    var str2 = "Dot"
    println("Sachin" +str1 + str2)
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "Hello, Scala!"

    var fs = printf("Value of float is" + "%f , Value of int is  %d" + "Value of string is %s \n", floatVar, intVar, stringVar)
   val name = "James"

    println(s"Hello, $name")
    println(s"1+1 = ${1+1}")
    val height = 1.9d
    val name1 = "James"
    println(f"$name1%s is $height%2.2f meters tall")
    println(raw"\n a \n b")
  }
}