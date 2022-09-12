class Rational(x:Int,y:Int)
{
    val num = x
    val den = y

    def sub(r:Rational) = new Rational((this.num*r.den - r.num*this.den), this.den*r.den)
    def printOut = println(this.num + "/" + this.den)
}

object O2 extends App
{
    val rat1 = new Rational(3,4)
    val rat2 = new Rational(5,8)
    val rat3 = new Rational(2,7)

    val rat4 = rat1.sub(rat2).sub(rat3)
    rat4.printOut
}