package simpleGenerator

class SentenceWords(
//    val sentenceType: String, //заменить на enum
//    val questionWord: String?,
    val substantive: String,
    val verb: String,
    val adjective: String,
    val subject: String
){
    override fun toString(): String {
        return substantive + ", " + verb + ", " + adjective + ", " + subject
//        return sentenceType + (if(questionWord != null) ", $questionWord" else "") + ", " + substantive + ", " + verb + ", " + adjective + ", " + subject
    }
}

//TODO сделать enum
val sentenceTypes = listOf<String>(
    "утверждение",
    "отрицание",
    "вопрос"
)