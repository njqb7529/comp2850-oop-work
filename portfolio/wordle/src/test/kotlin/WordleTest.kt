import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

@Suppress("unused")
class WordleTest : StringSpec({
    "checks if word entered is valid meaning it equals to 5 characters"{
        isValid("at") shouldBe false
        isValid("four") shouldBe false
        isValid("plays") shouldBe true
        isValid("thing") shouldBe true
    }

    "checks what is returned if an empty text file is entered"{
        var words = File("wordfile.txt")
        words.writeText("")
        readWordList("wordfile.txt") shouldBe mutableListOf()

    }

    "checks if it actually creates a list of strings"{
        var words = File("wordfile.txt")
        words.writeText("spanish\nfrench\nitalian\ngerman\npolish\nrussian\n")
        readWordList("wordfile.txt") shouldBe mutableListOf("spanish", "french", "italian", "german", "polish", "russian")

    }




    "checks if random word picker actually picks a word in the list"{
        var words = mutableListOf("spanish", "french", "italian", "german", "polish", "russian")
        var originalsize= words.size
        var copy = words.toList()
        var theword = pickRandomWord(words)
        var contains = theword in copy
        contains shouldBe true
        words.size shouldBe originalsize - 1 
    }



})
