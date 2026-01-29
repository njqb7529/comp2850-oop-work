// Implement the six required functions here
// Implement the six required functions here
import java.io.File
fun isValid(word: String): Boolean {
    if (word.length == 5 ){
        return true
    }
    else{
        return false
    }
}

fun readWordList(filename: String): MutableList<String>{
    return File(filename).readLines().toMutableList()
}

fun pickRandomWord(words: MutableList<String>): String{
        val random = words.random()
        words.remove(random)
        return random
    }



fun obtainGuess(attempt: Int): String{
    for(i in 1..5){
        print("Attempt $attempt:")
        val trial = readLine()
        if(trial!=null && isValid(trial)){
            return trial
        }
        else{
            println ("try again")
        }
    }
    
    return ""

}

    fun evaluateGuess(guess: String, target: String): List<Int>{
        var result = mutableListOf<Int>()
        var comparable = guess.lowercase()
        var equatable= target.lowercase()
        for(i in 0..4){
            if (comparable[i]==equatable[i]){
                result.add(1)
            }
            else{
                result.add(0)
            }
        }
        return result
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
    print("\n")
}




