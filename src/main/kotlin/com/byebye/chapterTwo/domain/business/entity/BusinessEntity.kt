package com.byebye.chapterTwo.domain.business.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class BusinessEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long? = null,

    var name: String,

    var description: String,

    var shortDescription: String,

    var ceo: String,

    var phoneNum: String
)