fun IfElesExpression(){
    val number = -50
    val result = if (number>0){
        println("Positive number")
    }else{
        println("Negative number")
    }
}
fun IfElesExpression2(){
    val remain =1
    val result =if (remain>0)"มีสินค้า" else "สินค้าหมด"
    println(result)
}
fun IfElesExpression3() {
    val number =100
    val result =if (number<0)"Negative numder"
    else if (number in 0..9) "Single digit numder"
    else if (number in 0..99) "Double digit numder"
    else "numder has more digits"

    println(result)
}