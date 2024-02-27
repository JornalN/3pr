package com.example.f6.ui.prog

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.f6.databinding.FragmentProgBinding
import com.example.f6.ui.prog.ProgViewModel


class ProgFragment : Fragment() {

    private var _binding: FragmentProgBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val ProgViewModel =
            ViewModelProvider(this).get(ProgViewModel::class.java)

        _binding = FragmentProgBinding.inflate(inflater, container, false)
        val root: View = binding.root
//        textView.movementMethod = ScrollingMovementMethod()
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}