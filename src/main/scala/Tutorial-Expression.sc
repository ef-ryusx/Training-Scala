for (x <- 1 to 5; y <- 1 until 5 if x == y){
  println("x = " + x + " y = " + y)
}
for(e <- List("A", "B", "C", "D", "E")) yield {
  "Pre" + e
}

//for (a <- 1 to 100; b <- 1 to 100; c <- 1 to 100 if (a * a) == (b * b + c * c)){
//  println("A:" + a + ":, B:" + b + ", C:" + c)
//}
/*****/
val ten : Int = 10
ten match {
  case 1 => "one"
  case 2 => "two"
  case _ => "other"
}
"abc" match {
  case "abc" | "def" =>
    println("first")
    println("second")
}

//val _list = List("A", "B", "C", "D", "E")
List("A", "B", "C", "D", "E") match {
  case List(_a, _b, "C", d, e) if _a != "A" =>
    println("b = " + _b)
    println("a = " + _a)
    println("d = " + d)
    println("e = " + e)
  case _ =>
    println("nothing")
}

val lst = List(List("A"), List("B", "C", "D", "E"))
lst match {
  case List(__ @List("A"), x) =>
    println(x)
    println(__)
  case _ =>
    println("no")
}
/*****/
for (x <- 1 to 1000){
  val _list = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
  val str = _list match {
    case List(_1, _2, _3, _4, _x) =>
      List(_1, _2, _3, _4, _1).mkString
  }
  println(str)
}
