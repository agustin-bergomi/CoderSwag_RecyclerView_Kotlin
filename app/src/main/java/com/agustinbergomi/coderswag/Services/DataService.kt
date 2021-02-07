package com.agustinbergomi.coderswag.Services

import com.agustinbergomi.coderswag.Model.Category
import com.agustinbergomi.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat01"),
        Product("Devslopes Hat Black","$20","hat02"),
        Product("Devslopes Hat White","$18","hat03"),
        Product("Devslopes Hat Snapback","$22","hat04"),
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "$28", "hodie01"),
        Product("Devslopes Hoodie Red", "$32", "hodie02"),
        Product("Devslopes Grey Hoodie", "$28", "hodie03"),
        Product("Devslopes Black Hoodie", "$32", "hodie04"),
    )

    val shirts = listOf(
        Product("Shirt Black", "$18", "shirt01"),
        Product("Devslopes Badge Light Grey", "$20", "shirt02"),
        Product("Devslopes Logo Shirt Grey", "$22", "shirt03"),
        Product("Devslopes Hustle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05"),
    )
}