class Cakes {
    var name:String=""
    var testo:String=""
    var cream:String=""
    var ves:Double=0.0
    var calor:Double=0.0
    var price:Double=0.0

    constructor(name:String,testo:String,cream:String,ves:Double,calor:Double,price:Double){
        this.name=name
        this.testo=testo
        this.cream=cream
        this.ves=ves
        this.calor=calor
        this.price=price
    }
    fun Cake(){
        println("Название: ${this.name}   Тесто: ${this.testo}  Крем: ${this.cream} \n" +
                " Вес: ${this.ves}  Калорийность: ${this.calor}  Цена: ${this.price} ")
    }

    fun Calorii(){
        var time:Double
        time=this.calor/10
        println("Чтобы сжечь съеденные калории нужно $time минут на велотренажере")
    }

    fun Skidka(){
        println("Введите который сейчас час")
        var time:Int = readln().toInt()
        when(time){
            20->println("Можно купить пирожное по скидке в 30% если успеете до закрытия пекарни!!")
            in 0..24-> println("Сейчас скидки нет")
            else-> println("Неверный ввод")
        }
    }

   /* fun Price_za_Ves(){
        var pzv:Double
        pzv=price/ves*1000
        pzv=String.format("%.2f",pzv).toDouble()
        println("Цена пирожка за килограмм: $pzv")
    }*/


}