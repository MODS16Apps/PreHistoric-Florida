package org.example.prehistoricflorida;


import android.app.Activity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.VideoView;

public class SeaLevel extends Activity {
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sealevel);

        final VideoView videoView = (VideoView) findViewById(R.id.videoView1);

        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sea_level_changing); //finds .mp4 file
        videoView.setVideoURI(video);
        videoView.start(); // starts .mp4

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
}
