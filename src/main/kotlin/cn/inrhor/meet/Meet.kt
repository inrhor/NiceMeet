package cn.inrhor.meet

class Meet {
    fun run() {
        val i = Person("Timid boy")

        Log().depiction("This day i met you")
        i.emotion = Emotion.SMILE

        val you = Person("Beautiful girl")

        val youEmotion =
        when {
            (youEmotion == Emotion.HAPPY) or (youEmotion == Emotion.SMILE) -> {
                i.emotion = Emotion.HAPPY
                i.sayTo(you.person, "Would you like to grab a cup of milk tea?")
            }
            youEmotion == Emotion.SAD -> {
                i.sayTo(you.person, "I can speak jocks for you.")
                i.doActionTo(you.person, Action.SPEAK_JOCKS)
            }
            else -> {
                // Excuse me
                return
            }
        }

        i.sayTo(you.person, "Nice to meet you.")
        you.sayTo(i.person, "")

    }
}