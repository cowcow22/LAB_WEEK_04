import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView
import com.example.lab_week_04.R

private const val TAB_CONTENT_RES_ID = "TAB_CONTENT_RES_ID"

class CafeDetailFragment : Fragment() {
    private var content: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            // Retrieve the resource ID and get the string from resources
            val contentResId = it.getInt(TAB_CONTENT_RES_ID)
            content = getString(contentResId)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.content_description)?.text = content
    }

    companion object {
        fun newInstance(descriptionResId: Int): CafeDetailFragment {
            return CafeDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(TAB_CONTENT_RES_ID, descriptionResId)
                }
            }
        }
    }
}
