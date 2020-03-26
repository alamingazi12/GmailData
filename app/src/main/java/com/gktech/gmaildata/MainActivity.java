package com.gktech.gmaildata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.ozaydin.serkan.easy_csv.EasyCsv;
import net.ozaydin.serkan.easy_csv.FileCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static androidx.core.content.FileProvider.getUriForFile;

public class MainActivity extends AppCompatActivity {
    public final int WRITE_PERMISSON_REQUEST_CODE = 1;
    File files;
    Uri uri;
    private EditText mEditTextTo;
    private EditText mEditTextSubject;
    private EditText mEditTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextTo = findViewById(R.id.edit_text_to);
        mEditTextSubject = findViewById(R.id.edit_text_subject);
        mEditTextMessage = findViewById(R.id.edit_text_message);

        Button buttonSend = findViewById(R.id.button_send);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });


        EasyCsv easyCsv = new EasyCsv(MainActivity.this);
        List<String> headerList = new ArrayList<>();
        headerList.add("Name.Surname.Age.Adress.Location.Education-");
        List<String> dataList = new ArrayList<>();
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");
        dataList.add("Serkan.Ozaydin.23.Fatih.Turkey.University-");


        easyCsv.setSeparatorColumn(".");
        easyCsv.setSeperatorLine("-");

        final String fileName="shared";

        easyCsv.createCsvFile(fileName, headerList, dataList, WRITE_PERMISSON_REQUEST_CODE, new FileCallback() {
            @Override
            public void onSuccess(File file) {
               files=new File("storage/emulated/0/EasyCsv.csv");
              // Uri uri=Uri.parse("file:///storage/emulated/0/EasyCsv.csv");
                //File newFile = new File(file1, file.getName());
             // uri=  Uri.parse("content://storage/emulated/0/EasyCsv.csv");
              //  uri=Uri.fromFile(files);
            //  uri=Uri.fromFile(new File(String.valueOf(file)));
                File imagePath = new File(MainActivity.this.getFilesDir(), "0");
                File newFile = new File(imagePath, file.getName());
                 uri=  getUriForFile(MainActivity.this,"com.gktech.gmaildata.fileprovider",files);
               //  uri = Uri.fromFile(new File(file.getAbsolutePath()));
                Log.d("uri", String.valueOf(uri));
                Toast.makeText(MainActivity.this,"Saved file"+uri,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFail(String err) {
                Toast.makeText(MainActivity.this,"Error"+err,Toast.LENGTH_SHORT).show();

            }
        });
    }


    private void sendMail() {
        String recipientList = mEditTextTo.getText().toString();
        String[] recipients = recipientList.split(",");

        String subject = mEditTextSubject.getText().toString();
        String message = mEditTextMessage.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType("text/csv");

        if(uri!=null){
            Log.d("uri",String.valueOf(uri));
            intent.putExtra(Intent.EXTRA_STREAM,uri);
        }else {

            Toast.makeText(MainActivity.this,"Uri is null",Toast.LENGTH_LONG).show();
        }

        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }
}
