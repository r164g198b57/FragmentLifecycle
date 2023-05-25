package wrw.a1ex.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.util.Date


class ContentFragment : Fragment() {


    init {
        Log.d(TAG, " init Constructor, Hello ")

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val toast = Toast.makeText(getActivity(), "Hello world!!! I`m onAttach", Toast.LENGTH_SHORT)
        toast.show()
        Log.d(TAG, "method onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "method onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        Log.d(TAG, "method onCreateView")
        return inflater.inflate(R.layout.fragment_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val updateButton = view.findViewById<Button>(R.id.updateButton)
        val updateBox = view.findViewById<TextView>(R.id.dateTextView)
        updateButton.setOnClickListener {
            val curDate = Date().toString()
            updateBox.text = curDate
        }
        Log.d(TAG, "method onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(TAG, "method onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "method onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "method onResume")
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(getActivity(), "Bye world!!! I`m onPause", Toast.LENGTH_SHORT)
        toast.show()
        Log.d(TAG, "method onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "method onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        val toast = Toast.makeText(getActivity(), "I`m onDestroyView", Toast.LENGTH_SHORT)
        toast.show()
        Log.d(TAG, "method onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "method onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        val toast = Toast.makeText(getActivity(), "Bye Bye!!! I`m onDetach", Toast.LENGTH_SHORT)
        toast.show()
        Log.d(TAG, "method onDetach")
    }

    companion object {
        private const val TAG = "TAG"
    }
}