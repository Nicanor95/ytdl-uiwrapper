/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.QualityInfo;

import java.nio.file.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author nicanor
 */
public class YoutubeDl
{
    private static String getYtdlPath()
    {
        String p;
        if (System.getProperty("os.name").contains("Windows"))
        {
            Path _ytDlpPath = Paths.get("./tools/yt-dlp.exe");
            if (Files.exists(_ytDlpPath))
            {
                p = _ytDlpPath.toAbsolutePath().toString();
            }
            else
            {
                p = "yt-dlp.exe";
            }
        }
        else
        {
            p = "yt-dlp";
        }
        return p;
    }
    
    public static void updateQualityList(JComboBox qualityList, String URL, JProgressBar progressBar)
    {
        progressBar.setIndeterminate(true);
        ArrayList<String> _comArray = new ArrayList<>();

        _comArray.add(getYtdlPath());
        _comArray.add("--compat-options");
        _comArray.add("list-formats");
        _comArray.add("-F");
        _comArray.add(URL);
        try
        {
            Process yt_dl = new ProcessBuilder().command(_comArray).inheritIO().redirectErrorStream(true).redirectOutput(ProcessBuilder.Redirect.PIPE).start();

            BufferedReader _reader = new BufferedReader(new InputStreamReader(yt_dl.getInputStream()));
            String line;

            ArrayList<QualityInfo> _lista_calidades = new ArrayList<>();

            while ((line = _reader.readLine()) != null)
            {
                List<String> _info = Arrays.asList(line.split(",? +,* *"));
                if (_info.contains("mp4") && !_info.toString().contains("mp4a"))
                {
                    _lista_calidades.add(new QualityInfo(_info.get(0), _info.get(3), _info.get(2), _info.get(9)));
                }
            }
            for (QualityInfo q : _lista_calidades)
            {
                qualityList.addItem(q);
            }
        } catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Error en la ejecucion de yt-dlp. ERROR: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
        progressBar.setIndeterminate(false);
    }

    public static void updateYTDL(JTextArea outputArea, JProgressBar progressBar)
    {
        progressBar.setIndeterminate(true);
        ArrayList<String> _comArray = new ArrayList<>();

        _comArray.add(getYtdlPath());
        _comArray.add("-U");

        try
        {
            Process yt_dl = new ProcessBuilder().command(_comArray).inheritIO().redirectErrorStream(true).redirectOutput(ProcessBuilder.Redirect.PIPE).start();

            BufferedReader _reader = new BufferedReader(new InputStreamReader(yt_dl.getInputStream()));
            String line;

            while ((line = _reader.readLine()) != null)
            {
                outputArea.append(line + "\n");
                //Autoscroll:
                outputArea.setCaretPosition(outputArea.getDocument().getLength() - 1);
            }

        } catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Error en la ejecucion de yt-dlp. ERROR: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
        progressBar.setIndeterminate(false);
    }

    public static void getVideo(String URL, ArrayList Options, String Output, JProgressBar progressBar, JLabel speedLabel, JTextArea outputArea, JComboBox comboBox)
    {
        ArrayList<String> _comArray = new ArrayList<>();

        _comArray.add(getYtdlPath());
        _comArray.addAll(Options);
        _comArray.add(URL);
        _comArray.add("-o");
        _comArray.add(Output);

        try
        {
            Process yt_dl = new ProcessBuilder().command(_comArray).inheritIO().redirectErrorStream(true).redirectOutput(ProcessBuilder.Redirect.PIPE).start();

            BufferedReader _reader = new BufferedReader(new InputStreamReader(yt_dl.getInputStream()));
            String line;

            progressBar.setMinimum(0);
            progressBar.setMaximum(100);
            Float value;

            while ((line = _reader.readLine()) != null)
            {
                outputArea.append(line + "\n");
                //Autoscroll:
                outputArea.setCaretPosition(outputArea.getDocument().getLength() - 1);

                if (line.contains("[download]") && !line.contains("Destination"))
                {
                    for (String x : line.split(" "))
                    {
                        if (x.contains("%"))
                        {
                            value = Float.parseFloat(x.trim().replaceAll("%", ""));
                            progressBar.setValue(value.intValue());
                        }
                        if (x.contains("/s"))
                        {
                            speedLabel.setText(x.trim());
                        }
                    }
                }
            }
            speedLabel.setText("Listo!");
        } catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Error en la ejecucion de yt-dlp. ERROR: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
