/** Test code by Xceon/JC Peleo, No need to add licence lol */
/** Built October 25, 2017, 3:55am. */

package ph.xceon.testapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.animation.*;
import android.view.View.*;
import android.widget.*;
import javax.xml.datatype.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	/** Terminate button literally exits app */
    public void onProceedButtonClick(View view) 
    {
        finish();
	}
	
	/** Dat fancy Button lol */
    public void onDropButtonClick(View view) 
    {
		Toast.makeText(this, "This button uses TranslateAnimation via android.view.animation", Toast.LENGTH_LONG).show();
    	// animation
        TranslateAnimation animation = new TranslateAnimation(0, 0, 0, 5000);
		animation.setDuration(5000);
		view.startAnimation(animation);
	}
	
	public void onNoticeMeButtonClick(View view) 
    {
    	Toast.makeText(this, "Test App by Xceon, GigaNigga and I-401 Iona of Group 2 (Amanojaku Satellite), G-11 Senior High, BS Game Development Specialized in Game Design and Programming. Timestamp 10/25/2017:4:57PM", Toast.LENGTH_LONG).show();

		MyDialogFragment f = new MyDialogFragment();
		f.show(getFragmentManager(), "mydialog");
		
		}
		
	public void onCircleSpinnerClick(View view)
	 {
		 Toast.makeText(this, "Spinner with Toast using the syscall [public void onCircleSpinnerClick(View view)].", Toast.LENGTH_LONG).show();
	 }
	 
	public void onHoshiImgClick(View view)
	{
		Toast.makeText(this, "Team Amanojaku Satellite's Star of Hope LOL", Toast.LENGTH_LONG).show();
	}
}
class MyDialogFragment extends DialogFragment
{
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState)
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setIcon(R.drawable.ic_launcher);
		builder.setTitle("Notice our petmalu lodi Senpai's at Group 2, Amanojaku Satellite");
		builder.setMessage("Built using AIDE (Gradle). Created by Xceon (Me, for designing and coding the whole project for a grade lol), GigaNigga (for implementing DialogFragment), I-401 Iona (Background images, Radio buttons.) and our boss Lando fakyu ka wala lang ginawa hahaha");
		builder.setPositiveButton("Great, Onii-chan!!", new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface p1, int p2)
				{
				}
			});
		return builder.create();
		}
		
	}
