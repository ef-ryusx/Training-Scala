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
