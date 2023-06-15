package me.tanyakemkar.customlistener

import android.widget.TextView
import java.lang.ref.WeakReference

class VideoPlayer(var textView: TextView) {

    private var listener = WeakReference<VideoPlayerListener>(null)

    fun start() {
        println("Video started")
    }

    fun stop() {
        println("Video stopped")
    }

    fun pause() {
        println("Video paused")
    }

    fun release() {
        textView.text = "Learn Android Development using Kotlin"
        println("Starting of releasing the resources")
        listener.get()?.onResourcesReleased()
    }

    fun addListener(listener: Demo) {
        this.listener = WeakReference(listener)
    }
}