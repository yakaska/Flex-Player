package ru.valentine.flexplayer.data.vk


import com.google.gson.annotations.SerializedName

data class VkAudioGetResponse(
    @SerializedName("response")
    val response: Response = Response()
) {
    data class Response(
        @SerializedName("count")
        val count: Int = 0,
        @SerializedName("items")
        val items: List<VkAudioItem> = listOf()
    )
}