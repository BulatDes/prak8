fun main(){
    try {
        var (name, testo, cream) = List(3) { "" }
        println("Введите имя пирожного")
        name = readln().toString()
        if(name=="") throw Exception("Неверный ввод")
        println("Введите тесто пирожного")
        testo = readln().toString()
        if(testo=="") throw Exception("Неверный ввод")
        println("Введите крем пирожного")
        cream = readln().toString()
        if(cream=="") throw Exception("Неверный ввод")
        var(ves,calor,price) = List(3) {0.0}
        println("Введите вес пирожного (в граммах)")
        ves= readln().toDouble()
        when{
            (ves<1)->throw Exception("Неверный ввод")
            (ves >10000)->throw Exception ("С таким весом я думаю это не пирожное,а целый торт ")

        }
        println("Введите калории пирожного ( в Ккал)")
        calor= readln().toDouble()
        when{
            (calor<1)->throw Exception("Неверный ввод")
            (calor>(ves/100*calor))->throw Exception ("Неверный ввод")
        }
        println("Введите цену пирожного ( в рублях)")
        price= readln().toDouble()
        when{
            (price<1)->throw Exception("Неверный ввод")
        }
        val cake=Cakes(name,testo,cream,ves,calor,price)
         //1fun
        println(cake.Cake())
        //2fun
        println(cake.Calorii())
        //3fun
        println(cake.Skidka())


    }catch (ex:Exception){
        println("Неверный ввод")
    }

}