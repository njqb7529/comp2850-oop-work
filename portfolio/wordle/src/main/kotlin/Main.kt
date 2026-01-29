fun main() {
    val possible = readWordList("data/words.txt")

    if(possible.size == 0){
        println("Word list given is empty")
        return
    }

    val theWord = pickRandomWord(possible)

    var trial = 1


    while (trial <= 10){
        val guess = obtainGuess(trial)

        if(isValid(guess)){
            val result = evaluateGuess(guess, TheWord)

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

            trial++




        }
        else {
            println("Give a valid guess of 5 characters")

        }

        println(" You didn't get the wordle. This was the wordle : $TheWord , you lost!")

}
