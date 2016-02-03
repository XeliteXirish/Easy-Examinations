package xelitexirish.com.easyexaminations.about;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

import xelitexirish.com.easyexaminations.MainActivity;
import xelitexirish.com.easyexaminations.SubjectEnums.SubjectEnum;
import xelitexirish.com.easyexampapers.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        TextView textViewTotalPapers = (TextView) findViewById(R.id.totalPapersText);

        Bundle intentData = getIntent().getExtras();
        if(intentData != null){
            Integer totalPapers = intentData.getInt("totalPapers");
            textViewTotalPapers.setText("Current amount of papers: " + totalPapers);
        }else{
            textViewTotalPapers.setText("Current amount of papers: ERROR");
        }


    }

    public void onClickLogo(View view){
        Uri uri = Uri.parse("http://www.xelitexirish.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void onClickTwitter(View view){
        Uri uri = Uri.parse("https://twitter.com/XeliteXirish");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void onClickRemoveDownloads(View view){
        File file =  getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        File[] children = file.listFiles();

        showAlertBox(children);

    }

    public void showAlertBox(final File[] children){
        AlertDialog.Builder alerBox = new AlertDialog.Builder(this);
        alerBox.setTitle("Remove local papers").setMessage("Do you want to delete all local papers?");

        alerBox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                for(int x = 0; x < children.length; x++){
                    children[x].delete();
                }
                dialog.dismiss();
                Toast.makeText(AboutActivity.this, "Deleted all local papers", Toast.LENGTH_SHORT).show();
            }
        });

        alerBox.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alerBox.show();
    }
}
