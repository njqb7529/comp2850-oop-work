fun main() {
    val possible = readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt") //creates list from file inputed and stores it into possible.

    if(possible.size != 0){ //makes sure that file inputed isn't empty
        
    val theWord = pickRandomWord(possible) //picks a random word from the list and stores it into theWord this is the target word

    var trial = 1 // intializes variable trial as 1


    while (trial <= 10){ // loop stays ongoing as long as trial is either less than 10 or equal
        val guess = obtainGuess(trial) // stores words inputed from user into guess. 

        if(isValid(guess)){ // if guess inputted by user is less than 5 characters then the program will not enter the if statement.
            val result = evaluateGuess(guess, theWord) //compares the guess with the target word and gives back a list of 1s and 0s

            displayGuess(guess, result ) // looks at the list result and if theres a 1 in the position i it puts the letter from the guess in the same position and if theres a 0 the program puts a ? at that position.
            var sum = 0 // intializes sum to 0 
            for(i in 0 until 5) { // for loops stays ongoing until i reaches 5 
                if (result[i] == 1) { // if result[i] equals 1 it adds to the sum.
                    sum += 1 // 1 is added to sum 
                }
            }

            if(sum == 5){ //if sum equald 5 meaning the result list is all 1s you enter the if statement conditions.
                println("You got the wordle! $guess") // prints "You got the wordle ! (and the user's guess)"
                return //stops program
            }

           
        }
        else {
            println("Give a valid guess of 5 characters") //if user's inputted guess was less than 5 characters inform them about the conditions. 
        }

     trial++ //add 1 to trial and go back to the start of the loop
}

  println(" You didn't get the wordle. This was the wordle : $theWord , you lost!") //if user did not geuss theWord then inform them that they didn't get it and inform them on what the word was . 
}
else{
    println("Word list given is empty") //inform the user that the list given was empty so no word can be the target word. 
}
}
