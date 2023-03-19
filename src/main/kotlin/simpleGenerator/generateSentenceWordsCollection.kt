import simpleGenerator.resource.adjectiveWords
import simpleGenerator.resource.subjectWords
import simpleGenerator.resource.substantiveWords
import simpleGenerator.resource.verbWords

fun generateSentenceWordsCollection(size: Int): List<SentenceWords>{
    val list:MutableList<SentenceWords> = ArrayList<SentenceWords>()
    for (i in 1..size) {
        val sentenceWords = generateRandomSentenceWords()
        list.add(sentenceWords)
    }
    return list
}

fun generateRandomSentenceWords(): SentenceWords{
       val substantive = substantiveWords.random()
       val verb = verbWords.random()
       val adjective = adjectiveWords.random()
       val subject = subjectWords.random()
       return SentenceWords(substantive, verb, adjective, subject)

}