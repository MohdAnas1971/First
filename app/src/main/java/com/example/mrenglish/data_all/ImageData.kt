package com.example.mrenglish.data_all

import com.example.mrenglish.R

class ImaDataType(val id:Int,val name:String)


fun imaData(): MutableList<ImaDataType> {

    val imaList= mutableListOf<ImaDataType>()
    imaList.add(ImaDataType(R.raw.car,"water"))
    imaList.add(ImaDataType(R.raw.mountain,"water"))
    imaList.add(ImaDataType(R.raw.car,"water"))
    imaList.add(ImaDataType(R.raw.mountain,"water"))
    imaList.add(ImaDataType(R.raw.car,"water"))
    imaList.add(ImaDataType(R.raw.mountain,"water"))
return imaList
}