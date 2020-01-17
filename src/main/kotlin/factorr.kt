fun factor(num:Int):String{
    var num1 = num
    val out = mutableListOf(1)
    var k =2
    while(num1 != 1){
        while (num1 % k == 0){
            out.add(k)
            num1 /= k
        }
        k++;
    }
    return out.toString()
}