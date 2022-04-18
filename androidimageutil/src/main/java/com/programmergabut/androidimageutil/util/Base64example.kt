package com.programmergabut.androidimageutil.util

object Base64example {
    fun base64() = "data:image/png;base64,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"
}