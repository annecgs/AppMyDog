package com.example.appmeudog.model

data class Dog(
    val bred_for: String,
    val breed_group: String,
    val height: com.example.appmeudog.model.Measure,
    val id: Int,
    val image: Image,
    val life_span: String,
    val name: String,
    val origin: String,
    val reference_image_id: String,
    val temperament: String,
    val weight: Measure,
    val country_code:String?
)

fun mockDogs() = listOf (
   Dog(
       id = 1,
       name = "Affenpinscher",
       bred_for = "Small rodent hunting, lapdog",
       breed_group = "Toy",
       life_span = "10 - 12 years",
       temperament = "Stubbon, Curious, Playful, Adventurous, Active, Fun-loving",
       origin = "Germany, France",
       country_code = null,
       reference_image_id = "BJa4kxc4X",
       image = Image(
           id = "BJa4kxc4X",
           width = 1600,
           height = 1199,
           url = "https://cdn2.thedogapi.com/images/BJa4kxc4X.jpg"
       ),
       weight = Measure(
           imperial = "6 - 13",
           metric = "3 - 6"
       ),

       height = Measure(
           imperial = "9 - 11.5",
           metric = "23 - 29"
       )
   )

)