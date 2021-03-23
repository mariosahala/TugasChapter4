package com.example.mariocodechallange

class LogikaSuit(private val callback: Callback) {
    fun rumusSuit(pemain: Int, lawan: Int) {
        val status = when {
            pemain == 0 && lawan == 1 || pemain == 1 && lawan == 2 || pemain == 2 && lawan == 0 -> "W"
            pemain == 0 && lawan == 2 || pemain == 1 && lawan == 0 || pemain == 2 && lawan == 1 -> "L"
            else -> "D"
        }

        callback.kirimStatus(status)
    }
}