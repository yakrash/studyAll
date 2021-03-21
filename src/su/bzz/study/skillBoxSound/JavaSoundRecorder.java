/*
package su.bzz.study.skillBoxSound;

import com.dropbox.core.v2.DbxClientV2;

import javax.sound.sampled.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

*/
/**
 * A sample program is to demonstrate how to record sound in Java
 * author: www.codejava.net
 *//*

public class JavaSoundRecorder {
    private DbxClientV2 client;
    private AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
    private AudioFormat format;
    private DataLine.Info info;
    private TargetDataLine line;

    public JavaSoundRecorder(DbxClientV2 client) {
        this.client = client;
        format = getAudioFormat();
        info = new DataLine.Info(TargetDataLine.class, format);
    }

    public void recordAudio(int milliseconds) {
        //TODO: file name like 20201023_171436.wav,
        // use: SimpleDateFormat
        String fileName = new SimpleDateFormat("yyyyMMdd_HHmmss").
                format(Calendar.getInstance().getTime()) + ".wav";
        String filePath = "c:/Users/USER/Downloads/Temp/" + fileName;
        File file = new File(filePath);
        start(file);
        stop(file, milliseconds);
    }

    private void start(File file) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    if (!AudioSystem.isLineSupported(info)) {
                        System.out.println("Line not supported");
                        System.exit(0);
                    }
                    line = (TargetDataLine) AudioSystem.getLine(info);
                    line.open(format);
                    line.start();   // start capturing

                    AudioInputStream ais = new AudioInputStream(line);
                    AudioSystem.write(ais, fileType, file);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
    }

    private void stop(File file, int milliseconds) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(milliseconds);
                    line.stop();
                    line.close();
                   // recordAudio(milliseconds);
                    //TODO: upload file to Dropbox
//                    try {
//                        InputStream in = new FileInputStream(file.getPath());
//                        client.files().uploadBuilder("/" + file.getName())
//                                .uploadAndFinish(in);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(file.delete());
                    //TODO: delete file
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    private AudioFormat getAudioFormat() {
        float sampleRate = 16000;
        int sampleSizeInBits = 8;
        int channels = 2;
        boolean signed = true;
        boolean bigEndian = true;
        AudioFormat format = new AudioFormat(
                sampleRate,
                sampleSizeInBits,
                channels,
                signed,
                bigEndian
        );
        return format;
    }
}*/
