package com.example.reportezapp

data class User(
    var name: String? = null,

    @get:com.google.firebase.firestore.PropertyName("nearest police station")
    @set:com.google.firebase.firestore.PropertyName("nearest police station")
    var ps: String? = null,

    @get:com.google.firebase.firestore.PropertyName("mobile")
    @set:com.google.firebase.firestore.PropertyName("mobile")
    var pnumber: String? = null,

    @get:com.google.firebase.firestore.PropertyName("crime type")
    @set:com.google.firebase.firestore.PropertyName("crime type")
    var crime: String? = null,

    @get:com.google.firebase.firestore.PropertyName("crime description")
    @set:com.google.firebase.firestore.PropertyName("crime description")
    var brief: String? = null
)
