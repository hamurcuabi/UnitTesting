package com.example.unittesting

/**
 *  Rev           1.0
 *  Author        hamurcuabi
 *  Date          5/22/2021
 *  FileName
 */
object MockData {
    fun prepareRcvItemList(): ArrayList<RcvItem> {
        val rcvItem = RcvItem(position = 1, isChecked = false, name = "test")
        val rcvItem2 = RcvItem(position = 2, isChecked = true, name = "test2")
        val rcvItem3 = RcvItem(position = 3, isChecked = false, name = "test3")
        val rcvItem4 = RcvItem(position = 4, isChecked = false, name = "test4")
        return arrayListOf(rcvItem, rcvItem2, rcvItem3, rcvItem4)
    }

}