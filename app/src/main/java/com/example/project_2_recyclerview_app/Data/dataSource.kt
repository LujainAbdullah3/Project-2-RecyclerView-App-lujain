package com.example.project_2_recyclerview_app.Data

import com.example.project_2_recyclerview_app.Model.Hotal
import com.example.project_2_recyclerview_app.R


class dataSource {

    fun loadHotal() : List<Hotal>{
        return listOf(
            Hotal(R.string.hotal1, R.drawable.im1,R.string.location1,R.drawable.picture1),
            Hotal(R.string.hotal2, R.drawable.im2,R.string.location1,R.drawable.picture1),
            Hotal(R.string.hotal3, R.drawable.im3,R.string.location1,R.drawable.picture1),
            Hotal(R.string.hotal4, R.drawable.im4,R.string.location2,R.drawable.picture1),
            Hotal(R.string.hotal5, R.drawable.im5,R.string.location2,R.drawable.picture1),
            Hotal(R.string.hotal6, R.drawable.im6,R.string.location2,R.drawable.picture1),
            Hotal(R.string.hotal7, R.drawable.im7,R.string.location3,R.drawable.picture1),
            Hotal(R.string.hotal8, R.drawable.im8,R.string.location3,R.drawable.picture1)
        )
    }
}
