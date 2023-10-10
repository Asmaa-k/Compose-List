package asmaa.khb.mycompose.data

import java.util.Date
import kotlin.random.Random

val postsList: List<PostItem>
    get() {

        return listOf(
            PostItem(
                ownerName = "elina-volkova",
                profileUri = "https://images.pexels.com/users/avatars/52023188/elina-volkova-227.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17815428/pexels-photo-17815428/free-photo-of-portrait-of-a-brown-border-collie-standing-in-a-meadow.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............ #happylife",
                isPostLiked = false,
                likesCount = 20000,
                commentsCount = 20
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ), PostItem(
            ownerName = "feyza-altun",
            profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Рига, Латвия",
            postDesc = "This is a sample caption............  #healthylife",
            isPostLiked = false,
            likesCount = 5500,
            commentsCount = 40
        ), PostItem(
            ownerName = "Daka",
            profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "Istanbul",
            postDesc = "This is a sample caption............ #prettylife",
            isPostLiked = true,
            likesCount = 3000,
            commentsCount = 500
        ), PostItem(
            ownerName = "lina-kivaka",
            profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
            postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            postDate = generateRandomDate().time,
            location = "London, UK",
            postDesc = "This is a sample caption............ #wildlife",
            isPostLiked = false,
            likesCount = 300,
            commentsCount = 40
        ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            ),

            PostItem(
                ownerName = "lany-jade-mondou",
                profileUri = "https://images.pexels.com/users/avatars/135943481/lany-jade-mondou-200.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16929791/pexels-photo-16929791/free-photo-of-man-flowers-model-vintage.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Montréal",
                postDesc = "This is a sample caption............  #longlife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "feyza-altun",
                profileUri = "https://images.pexels.com/users/avatars/120534393/feyza-altun-406.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17727510/pexels-photo-17727510/free-photo-of-processed-with-vsco-with-ka1-preset.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Рига, Латвия",
                postDesc = "This is a sample caption............  #healthylife",
                isPostLiked = false,
                likesCount = 5500,
                commentsCount = 40
            ),
            PostItem(
                ownerName = "Daka",
                profileUri = "https://images.pexels.com/users/avatars/176519590/daka-681.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/17813826/pexels-photo-17813826/free-photo-of-portrait-of-a-pretty-redhead-reading-a-book.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "Istanbul",
                postDesc = "This is a sample caption............ #prettylife",
                isPostLiked = true,
                likesCount = 3000,
                commentsCount = 500
            ),
            PostItem(
                ownerName = "lina-kivaka",
                profileUri = "https://images.pexels.com/users/avatars/593836/lina-kivaka-401.jpeg?auto=compress&fit=crop&h=130&w=130&dpr=2",
                postUri = "https://images.pexels.com/photos/16550526/pexels-photo-16550526/free-photo-of-grassy-lakeshore-in-summer.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                postDate = generateRandomDate().time,
                location = "London, UK",
                postDesc = "This is a sample caption............ #wildlife",
                isPostLiked = false,
                likesCount = 300,
                commentsCount = 40
            )

        )
    }

fun generateRandomDate(): Date {

    val startDate = Date(859867200000) // Replace with your desired start date
    val endDate = Date()   // Replace with your desired end date (e.g., current date)

    val random = Random(System.currentTimeMillis())

    // Calculate the time range in milliseconds
    val startMillis = startDate.time
    val endMillis = endDate.time
    val range = endMillis - startMillis

    // Generate a random offset within the range
    val randomOffset = random.nextLong(range)

    // Create a new Date with the random offset
    return Date(startMillis + randomOffset)
}