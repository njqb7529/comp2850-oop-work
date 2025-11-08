// Implement the six required functions here
fun isValid(word: String): Boolean {
    if (word.length == 5 ){
        return true
    }
    else{
        return false
    }
}

fun readWordList(filename: String): MutableList<string>{
    return File(filename).readLines().toMutableList()
}

fun pickRandomWord(words: MutableList<String>): String{
    val random = words.random()
    words.remove(random)
    return random

}

fun obtainGuess(attempt: Int): String{
    for(i in 1..5){
        print("Attempt $i:")
        val trial: readLine()
        if(trial.isValid){
            return trial
        }
        else{
            return "try again"
        }
}
fun evaluateGuess(guess: String, target: String): List<Int>{
    var result = []
    for(i in 0..4){
       if (guess[i]==target[i]){
        result.append(1)
       }
       else{
        result.append(0)
       }
    }
    return result
}
    
}
fun displayGuess(guess: String, matches: List<Int>){
    for (i in 0..4){
        if(matches[i] != 1){
            print("?")
        }
        else{
            print(guess[i])
        }
    }
    }



    
}