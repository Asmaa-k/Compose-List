package asmaa.khb.mycompose.viewModel

import androidx.lifecycle.ViewModel
import asmaa.khb.mycompose.data.PostItem
import asmaa.khb.mycompose.data.postsList

class InstagramCellViewModel : ViewModel() {
    val items: List<PostItem> = postsList

}