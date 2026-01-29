fun main() {
    val possible = readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt")

    if(possible.size != 0){
        
    val theWord = pickRandomWord(possible)

    var trial = 1


    while (trial <= 10){
        val guess = obtainGuess(trial)

        if(isValid(guess)){
            val result = evaluateGuess(guess, theWord)

            displayGuess(guess, result )
            var sum = 0
            for(i in 0 until 5) {
                if (result[i] == 1) {
                    sum += 1
                }
            }

            if(sum == 5){
                println("You got the wordle! $guess")
                return
            }

           
        }
        else {
            println("Give a valid guess of 5 characters")
        }

     trial++
}

  println(" You didn't get the wordle. This was the wordle : $theWord , you lost!")
}
else{
    println("Word list given is empty")
}
}
