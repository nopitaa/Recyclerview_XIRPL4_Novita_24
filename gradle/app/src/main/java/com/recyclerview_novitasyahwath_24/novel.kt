package com.recyclerview_novitasyahwath_24
//data class novel
import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView

data class novel(val foto: Int, val nama: String?, val deskripsi: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(foto)
        parcel.writeString(nama)
        parcel.writeString(deskripsi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<novel> {
        override fun createFromParcel(parcel: Parcel): novel {
            return novel(parcel)
        }

        override fun newArray(size: Int): Array<novel?> {
            return arrayOfNulls(size)
        }
    }
}
