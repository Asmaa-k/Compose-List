package asmaa.khb.mycompose.data

data class PostItem(
    val ownerName: String,
    val profileUri: String,
    val postUri: String,
    val postDate: Long,
    val location: String,
    val postDesc: String,
    val isPostLiked : Boolean,
    val likesCount : Int,
    val commentsCount : Int,
)

