import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    "checks if word entered is valid meaning it equals to 5 characters"{
        isValid("six") shouldBe false
        isValid("five") shouldBe false
        isValid("seven") shouldBe true
    }

    "checks what is returned if an empty text file is entered"{
        var words = File("wordfile.txt")
        words.writeText("")
        readWordList("wordfile.txt") shouldBe mutableListOf()

    }

    "checks if it actually creates a list of strings"{
        var words = File("wordfile.txt")
        words.writeText("")
    }

})
