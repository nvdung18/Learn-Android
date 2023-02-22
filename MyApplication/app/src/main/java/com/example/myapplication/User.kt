package com.example.myapplication

class User {
    private lateinit var userName: String
    private lateinit var address:String

    constructor(userName: String, address: String) {
        this.userName = userName
        this.address = address
    }

    public var UserName:String
        get(){return userName}
        set(value) {userName=value}
    public var Address:String
        get() {return address}
        set(value) {address=value}
}