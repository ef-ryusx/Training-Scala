var s = "Hello, World!"
println(s)
/********/
//https://dwango.github.io/scala_text/basic.html
val debt = 3950000
val rate = 2.3 * 0.01
val total = ((debt * rate / 12) * 8).asInstanceOf[Int]
/*********/
val price = 1980000 // 定価
val lossAmount = 26400 // 1.6%
val costPrice = lossAmount / 0.016 // 原価
val sellPrice = costPrice - lossAmount // 売値
var ans = 100 - (sellPrice / price * 100) // 18%
/*********/
val age = 5
var isSchoolStarted = false
if(1 <= age && age <= 6 && !isSchoolStarted){
  println("幼児です")
}else{
  println("幼児ではありません")
}
/*********/
def loopFrom0To9(): Unit = {
  var i = 0
  do {
    println(i)
    i = i + 1
  } while(i < 10)
}
loopFrom0To9()