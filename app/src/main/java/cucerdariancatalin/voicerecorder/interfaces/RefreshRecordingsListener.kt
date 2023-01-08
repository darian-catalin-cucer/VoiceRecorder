package cucerdariancatalin.voicerecorder.interfaces

import cucerdariancatalin.voicerecorder.models.Recording

interface RefreshRecordingsListener {
    fun refreshRecordings()

    fun playRecording(recording: Recording, playOnPrepared: Boolean)
}
