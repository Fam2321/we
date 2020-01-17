fun factor(num:Int):String{
    var num1 = num
    val out = mutableListOf(1)
    var k =2
    while(k < num1-1){
        val mod = num1 % k
        if(mod == 0) {
            out.add(k)
            num1 /= k
            //throw ArithmeticException()
        }
        ++k;
    }
    return out.toString()

    //return out;
}