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


fun main() {
    println("Criador de arrays!!!!")
    var nomes = arrayOfNulls<String>(5)
   
    for (i in nomes.indices) {
        println("Por favor, digite o ${i+1}º nome!!")
        nomes[i] = readLine()
    }
   
    nomes.sort()
   
    println("Organizamos seus nomes :D")
    for (nome in nomes) {
        println(nome)
    }
} */ codigo pra criar umas lista de nomes em ordem crescente.
    
