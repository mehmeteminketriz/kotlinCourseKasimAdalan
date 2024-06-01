package com.ketrizsoftware.navigationcompenentkullanimi

import java.io.Serializable

data class Urunler(var model:Int, var isim:String) : Serializable { // serializable olmazsa veri transferi yapamyız
}