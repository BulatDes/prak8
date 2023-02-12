fun main(){
    try {
        var marka:String
        println("Введите марку авто")
        marka = readln().toString()
        if(marka=="") throw Exception("Неверный ввод")
        println("Введите мощность авто")
        var mosh:Int
        mosh= readln().toInt()
        when{
            (mosh<1)->throw Exception("Неверный ввод")
            (mosh >2028)->throw Exception ("Таких машин не существует")

        }
        var price:Double
        println("Введите цену авто ( в рублях)")
        price= readln().toDouble()
        when{
            (price<1)->throw Exception("Неверный ввод")
        }
        val au=Auto(marka,mosh,price)
        //1fun
        println(au.Autohar())
        //2fun
        println(au.Dollar())
    }catch (ex:Exception){
        println("Неверный ввод")
    }

}