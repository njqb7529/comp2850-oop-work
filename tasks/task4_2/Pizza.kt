fun main(){
println("PIZZA MENU")
println("(a) Margherita")
println("(b) Pepperoni")
println("(c) Seafood")
println("(d) Hawaiian")

print("choose a pizza (a-d): ")
val pizza = readLine()?.lowercase()

if(pizza != null && pizza.length == 1 && pizza[0] in 'a'..'d'){
    println("Order Accepted")
}
else{
    print("Invalid Choice")
}
}