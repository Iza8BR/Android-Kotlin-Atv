fun main() {
    val numeros = arrayOfNulls<Int>(5)
    var soma = 0
    
    for ( i in numeros.indices) {
    print("DIGITE O ${i+1}º numeros inteiro: ")
    
    numeros [i] =  readLine()!!.toInt()
    
    soma += numeros [i]!!
    } 
    println("A soma de todos os numeros é $soma.")
    
    }
    