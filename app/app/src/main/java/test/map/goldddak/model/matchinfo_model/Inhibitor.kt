package test.map.goldddak.model.matchinfo_model


import com.google.gson.annotations.SerializedName

data class Inhibitor(
    @SerializedName("first")
    val first: Boolean?,
    @SerializedName("kills")
    val kills: Int?
)