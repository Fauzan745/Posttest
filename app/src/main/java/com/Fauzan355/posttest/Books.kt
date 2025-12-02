package com.Fauzan355.posttest

// If your API field names are different, you may need to add @SerializedName annotations
// import com.google.gson.annotations.SerializedName

data class Book(
    val title: String,
    val releaseDate: String?, // Nullable because you used '?: ""' in the adapter
    val cover: String?,// URL for the image
    val description: String?
)
