package com.fizahra.restaurantreview

import com.google.gson.annotations.SerializedName

data class RestaurantResponse(
	val restaurant: Restaurant,
	val error: Boolean,
	val message: String
)

data class Restaurant(
	val customerReviews: List<CustomerReviewsItem>,
	val pictureId: String,
	val name: String,
	val rating: Any,
	val description: String,
	val id: String
)

data class CustomerReviewsItem(
	val date: String,
	val review: String,
	val name: String
)

data class PostReviewResponse(

	@field:SerializedName("customerReviews")
	val customerReviews: List<CustomerReviewsItem>,

	@field:SerializedName("error")
	val error: Boolean,

	@field:SerializedName("message")
	val message: String
)

