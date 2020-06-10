package com.examplevinhphutvp.firebasedatabase25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 : Gui dữ liệu dạng String
        // tạo ra 1 node
        //  myRef.child().child("").setValue();
        // Tạo ra một child
//        myRef.child("chuoi").setValue("Hello").addOnSuccessListener(new OnSuccessListener<Void>() {
//            @Override
//            public void onSuccess(Void aVoid) {
//                Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//            }
//        });
        // 2 : Object
    }
}
