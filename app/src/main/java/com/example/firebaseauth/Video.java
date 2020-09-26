package com.example.firebaseauth;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    VideoView videoView;
   //url
    private String url="https://firebasestorage.googleapis.com/v0/b/videoview-247213.appspot.com/o/Video.mp4?alt=media&token=d049cc83-5635-487d-ac48-1a36d5b64844";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoView=findViewById(R.id.video_view);

        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri=Uri.parse(url);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();

    }
}