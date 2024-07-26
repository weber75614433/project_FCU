package com.example.ihead_beta

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class FragmentSitting : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("坐姿異常!!!").setMessage("請將背挺直，並重新調整坐姿")
            .setPositiveButton("確定") {dialog, id -> }
                .setNegativeButton("取消") {dialog, id -> }

        return builder.create()
    }
}


