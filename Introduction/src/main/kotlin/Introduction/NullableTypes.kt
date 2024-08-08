package Introduction

//https://stepik.org/lesson/46352/step/1?unit=24392
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    client?.personalInfo?.email?.let {
        if (!message.isNullOrEmpty())
            mailer.sendMessage(it, message)
    }
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}