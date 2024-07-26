package com.example.ihead_beta

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class FragmentSafety : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())

        builder.setTitle("頭部受到攻擊!!!").setMessage("受到直拳攻擊，請立即回覆此訊息")
            .setPositiveButton("確認") {dialog, id -> }
                .setNegativeButton("取消") {dialog, id ->}

        return builder.create()
    }
}


