package com.example.projectandrouas

class Status private constructor() {
    var status = "pusing"
    var bem: String? = null

    companion object {
        private val ourInstance= Status()
        val instance: Status
            get() = ourInstance
    }
}