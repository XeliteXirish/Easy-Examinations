package xelitexirish.com.easyexaminations;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.File;

import xelitexirish.com.easyexaminations.SubjectEnums.Enum2011;
import xelitexirish.com.easyexaminations.SubjectEnums.Enum2012;
import xelitexirish.com.easyexaminations.SubjectEnums.Enum2013;
import xelitexirish.com.easyexaminations.SubjectEnums.Enum2014;
import xelitexirish.com.easyexaminations.SubjectEnums.Enums2015;
import xelitexirish.com.easyexaminations.SubjectEnums.SubjectEnum;
import xelitexirish.com.easyexaminations.about.AboutActivity;
import xelitexirish.com.easyexaminations.settings.SettingsActivity;
import xelitexirish.com.easyexampapers.R;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "EasyExaminations";

    Spinner dropdownYear;
    Spinner dropdownSubject;
    Spinner dropdownLevel;

    DownloadManager manager;
    long downloadID;

    /**
     * Positions
     */
    public Integer JCOL = 0;
    public Integer JCHL = 1;
    public Integer LCOL = 2;
    public Integer LCHL = 3;

    public Integer PLACE_YEAR = 0;
    public Integer PLACE_SUBJECT = 1;
    public Integer PLACE_LEVEL = 2;

    public Integer year2015 = 0;
    public Integer year2014 = 1;
    public Integer year2013 = 2;
    public Integer year2012 = 3;
    public Integer year2011 = 4;

    public Integer ACCOUNTING = 0;
    public Integer BIOLOGY = 1;
    public Integer BUSINESS = 2;
    public Integer CHEMISTRY = 3;
    public Integer ECONOMICS = 4;
    public Integer ENGLISH = 5;
    public Integer FRENCH = 6;
    public Integer GEOGRAPHY = 7;
    public Integer GERMAN = 8;
    public Integer HOMEEC = 9;
    public Integer IRISH = 10;
    public Integer MATHS = 11;
    public Integer PHYSICS = 12;
    public Integer TECHNOLOGY = 13;
    public Integer HISTORY = 14;

    String[] years = new String[]{"2015", "2014", "2013", "2012", "2011"};
    String[] subjects = new String[]{"Accounting [LC]", "Biology", "Business", "Chemistry [LC]", "Economics [LC]", "English", "French", "Geography", "German", "Home Ec", "Irish", "Maths", "Physics [LC]", "Technology", "History"};
    String[] levels = new String[]{"Junior Cert. - Ordinary Level", "Junior Cert. - Higher Level", "Leaving Cert. - Ordinary Level", "Leaving Cert. - Higher Level"};

    // [0] = year, [1] = subject, [2] = level
    public Integer[] selectedItems = new Integer[]{0, 0 , 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);

//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setLogo(R.drawable.icon);

        doDropDowns();
        doAds();
    }

    @Override
    protected void onResume() {
        super.onResume();

        registerReceiver(receiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
    }

    @Override
    protected void onPause() {
        super.onPause();

        unregisterReceiver(receiver);
    }
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            queryDownloadStatus();
        }
    };

    public void doDropDowns(){

        // Year drop down menu
        this.dropdownYear = (Spinner) findViewById(R.id.yearDropdown);
        ArrayAdapter<String> arrayAdapterYears = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, this.years);
        dropdownYear.setAdapter(arrayAdapterYears);

        // Subject dropdown menu
        this.dropdownSubject = (Spinner) findViewById(R.id.subjectDropdown);
        ArrayAdapter<String> arrayAdapterSubject = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, this.subjects);
        dropdownSubject.setAdapter(arrayAdapterSubject);

        // Subject Level dropdown menu
        this.dropdownLevel = (Spinner) findViewById(R.id.levelDropdown);
        ArrayAdapter<String> arrayAdapterLevels = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, this.levels);
        dropdownLevel.setAdapter(arrayAdapterLevels);
    }

    public void doAds(){
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void setItems(){
        this.selectedItems[0] = this.dropdownYear.getSelectedItemPosition();
        this.selectedItems[1] = this.dropdownSubject.getSelectedItemPosition();
        this.selectedItems[2] = this.dropdownLevel.getSelectedItemPosition();
    }

    public void onClickLogo(View view){
        openUrl("http://www.xelitexirish.com");
    }

    public void onClickPapersP1(View view){
        setItems();
        if(getUnum() != null) {
            SubjectEnum subjectEnum = getUnum();
            if(doesFileExist(getNameForFile())){
                showAlertBox(subjectEnum, 0);
            }else{
                downloadFile(subjectEnum.getUrlP1());
            }
        }
    }

    public void onClickPapersP2(View view){
        setItems();
        if(getUnum() != null) {
            if (getUnum().hasPaper2()) {
                SubjectEnum subjectEnum = getUnum();
                if(doesFileExist(getNameForFile())){
                    showAlertBox(subjectEnum, 1);
                }else{
                    downloadFile(subjectEnum.getUrlP2());
                }

            } else {
                Toast.makeText(MainActivity.this, "No paper 2 for this exam found.", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void onClickMarking(View view){
        setItems();
        if(getUnum() != null) {
            if (getUnum().hasMarking()) {
                SubjectEnum subjectEnum = getUnum();
                if(doesFileExist(getNameForFile())){
                    showAlertBox(subjectEnum, 2);
                }else{
                    downloadFile(subjectEnum.getUrlMarking());
                }
            } else {
                Toast.makeText(MainActivity.this, "No marking scheme for this exam found.", Toast.LENGTH_LONG).show();
            }
        }
    }

    public SubjectEnum getUnum() {
        if(this.selectedItems[PLACE_YEAR].equals(year2015)) { // 2015
            Enums2015 enums2015 = new Enums2015(this);
            return enums2015.getEnum();

        }else if (this.selectedItems[PLACE_YEAR].equals(year2014)) {
            Enum2014 enum2014 = new Enum2014();
            return enum2014.getEnum();

            // Year 2013
        }else if (this.selectedItems[PLACE_YEAR].equals(year2013)) {
            Enum2013 enum2013 = new Enum2013();
            return enum2013.getEnum();

        }else if(this.selectedItems[PLACE_YEAR].equals(year2012)) {
            Enum2012 enum2012 = new Enum2012();
            return enum2012.getEnum();

        }else if(this.selectedItems[PLACE_YEAR].equals(year2011)){
            Enum2011 enum2011 = new Enum2011();
            return enum2011.getEnum();

        }else {
            Toast.makeText(MainActivity.this, "ERORR OCCURED", Toast.LENGTH_LONG).show();
            return null;
        }
    }

    /**
     * General Urls
     */
    public void openUrl(String url){
        if(url != null) {
            Uri uri = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }

    public int getTotalPapers(){
        return this.years.length * this.subjects.length * this.levels.length;
    }

    public boolean doesFileExist(String fileName){

        File file = new File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), fileName + ".pdf");
        return file.exists();
    }

    public boolean hasConnection(){
        ConnectivityManager connectivityManager = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivityManager.getActiveNetworkInfo();
        if(info.getState() == NetworkInfo.State.CONNECTED){
            return true;
        }
        return false;
    }

    public String getNameForFile(){
        String year = this.dropdownYear.getItemAtPosition(Integer.parseInt(this.selectedItems[PLACE_YEAR].toString())).toString();
        String subject = this.dropdownSubject.getItemAtPosition(Integer.parseInt(this.selectedItems[PLACE_SUBJECT].toString())).toString();
        String level = this.dropdownLevel.getItemAtPosition(Integer.parseInt(this.selectedItems[PLACE_LEVEL].toString())).toString();

        String fileName = "" + year + "-" + subject + ":" + level;
        return fileName;
    }


    /**
     * File Utilities
     * @param url Download the file from the Url
     */
    public void downloadFile(String url){
        if(hasConnection()) {
            if (url != null) {
                if (url.startsWith("http")) {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                        request.allowScanningByMediaScanner();
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
                    }

                    request.setDestinationInExternalFilesDir(MainActivity.this, Environment.DIRECTORY_DOWNLOADS, getNameForFile() + ".pdf");
                    request.setTitle(getNameForFile()); //Notification
                    request.setVisibleInDownloadsUi(true);

                    downloadID = manager.enqueue(request);
                    Toast.makeText(this, "Downloading file...", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "No paper 1 for this exam found.", Toast.LENGTH_LONG).show();
                }
            }
        }else{
            Toast.makeText(this, "No internet connection found", Toast.LENGTH_LONG).show();
        }
    }

    private void queryDownloadStatus() {
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(downloadID, 0);
        Cursor cursor = manager.query(query);
        if(cursor.moveToFirst()) {
            int status = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS));
            switch(status) {
                case DownloadManager.STATUS_PAUSED:
                case DownloadManager.STATUS_PENDING:
                case DownloadManager.STATUS_RUNNING:
                    break;
                case DownloadManager.STATUS_SUCCESSFUL:
                    try {
                        openLocalFile(getNameForFile());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case DownloadManager.STATUS_FAILED:
                    break;
            }
        }
    }

    public void openLocalFile(String fileName){

        File file = new File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), fileName + ".pdf");
        if(file.exists()) {
            Intent target = new Intent(Intent.ACTION_VIEW);
            target.setDataAndType(Uri.fromFile(file), "application/pdf");
            target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

            Intent intent = Intent.createChooser(target, "Open File");
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, "No PDF reader found.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void showAlertBox(final SubjectEnum subjectEnum, final int fileType){
        // FileType 0 = paper 1, 1 = paper 2, 2 = marking scheme
        AlertDialog.Builder alerBox = new AlertDialog.Builder(this);
        alerBox.setTitle("Local version found").setMessage("Do you want to use local file or download a new version?");

        alerBox.setPositiveButton("Use local", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                openLocalFile(getNameForFile());
                dialog.dismiss();
            }
        });

        alerBox.setNegativeButton("Download", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                File file =  getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                File[] children = file.listFiles();

                for(int x = 0; x < children.length; x++){
                    Log.i(TAG, "Deleting paper - " + children[x].getName());
                    if(children[x].getName().equals(getNameForFile())) children[x].delete();
                }

                if (fileType == 0) {
                    downloadFile(subjectEnum.getUrlP1());
                } else if (fileType == 1) {
                    downloadFile(subjectEnum.getUrlP2());
                } else if (fileType == 2) {
                    downloadFile(subjectEnum.getUrlMarking());
                }
                dialog.dismiss();
            }
        });
        alerBox.show();
    }

    /**
     * Layout Utilities
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this, "Work in progress - Settings", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, SettingsActivity.class);
            //startActivity(intent);
            return true;
        }else if(id == R.id.action_about){
            Intent intent = new Intent(this, AboutActivity.class);
            intent.putExtra("totalPapers", getTotalPapers());
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
