package com.ketrizsoftware.navigationcomponentkullanimi

import java.io.Serializable

data class Kamyon (var marka:String,var model:String ) : Serializable { // Bir class Serializable olmazsa sayfalar arası veri transferi yapılamaz

}