// Implement the six required functions here
// Implement the six required functions here
import java.io.File
fun isValid(word: String): Boolean {
    if (word.length == 5 ){     //checks if length of word inputed is 5 
        return true // if word length equals 5 returns true
    }
    else{
        return false // if word length does not equal 5 returns false
    }
}

fun readWordList(filename: String): MutableList<String>{
    return File(filename).readLines().toMutableList() // reads line from inputed file and turns it into a list of strings and then returns it.
}

fun pickRandomWord(words: MutableList<String>): String{
        val random = words.random() // picks a random word from list given
        words.remove(random) // removes that word from the lsit
        return random // returns the word picked 
    }



fun obtainGuess(attempt: Int): String{
    for(i in 1..5){ // Loop stays ongoing as long as i is in the range 1 - 5
        print("Attempt $attempt:") //prints attempt number (such as attempt 1 , attempt 2 etc.)
        val trial = readLine() // reads user's input and puts in trial
        if(trial!=null && isValid(trial)){ // if trial.length isn't 0 and trial.length equals 5 characters go into if statement
            return trial // returns user's guess
        }
        else{
            println ("try again") // informs user to take another guess 
        }
    }
    
    return "" // returns empty string since a string has to be returned. 

}

    fun evaluateGuess(guess: String, target: String): List<Int>{
        var result = mutableListOf<Int>()   //creates an empty list that is able to be mutated by adding and removing intreger values. 
        var comparable = guess.lowercase() //makes guess lowercase and puts it into variable comparable
        var equatable= target.lowercase() // makes target lowercase and puts it into variable equatable 
        for(i in 0..4){      //loop stays ongoing as long as i is in the range 0 to 4 
            if (comparable[i]==equatable[i]){  //compares each letter from comparable to the same indexed letter in equatable. 
                result.add(1) // if they are the same add 1 to that index position in the empty list. 
            }
            else{
                result.add(0) // if they aren't the same add 0 to that index position in the empty lsit
            }
        }
        return result //returns comparison 
    }

fun displayGuess(guess: String, matches: List<Int>){
    for (i in 0..4){
        if(matches[i] != 1){
            print("?") // returns a "?" in all the index positions that contain 0 . 
        }
        else{
            print(guess[i]) // returns the actual letter in all index positions that contain 1.
        }
    }
    print("\n") // prints a new line after each guess 
}




